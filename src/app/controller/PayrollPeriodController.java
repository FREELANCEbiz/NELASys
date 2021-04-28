/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;

import app.config.DBConn;
import app.global.FunctionFactory;
import app.model.ComboBoxItem;
import app.model.PayrollPeriod;
import app.view.global.DefaultComboBoxView;
import app.view.global.DefaultTableView;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Engkoi Zidac
 */
public class PayrollPeriodController extends PayrollPeriod {

    static Statement Stmt;
    DefaultTableView dtv = new DefaultTableView();
    DefaultComboBoxView dcv = new DefaultComboBoxView();

    public void PopulateTableData(JTable TableObject) {
        Connection Conn = DBConn.getConnection();
        dtv.setTableObject(TableObject);
        dtv.InitializeTable();
        dtv.RenderTable();

        String createString = "SELECT * FROM payroll_period WHERE MonthId=" + this.getMonthId() + " AND YearId=" + this.getYearId();

        try {

            Stmt = Conn.createStatement();
            ResultSet rs = Stmt.executeQuery(createString);

            while (rs.next()) {
                dtv.TableModel.addRow(new Object[]{rs.getInt("PPId"), rs.getString("Description"), rs.getDate("StartDate"), rs.getDate("EndDate")});
            }

            Stmt.close();
            Conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void GetData() {
        Connection conn = DBConn.getConnection();
        String createString;
        createString = "SELECT * FROM payroll_period WHERE PPId=" + this.getPPId();

        try {
            Connection Conn = DBConn.getConnection();
            Stmt = Conn.createStatement();
            ResultSet rs = Stmt.executeQuery(createString);
            while (rs.next()) {
                this.setDescription(rs.getString("Description"));
                this.setStartDate(rs.getDate("StartDate"));
                this.setEndDate(rs.getDate("EndDate"));
            }
            Stmt.close();
            conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void PopulateComboBoxData(JComboBox ComboBoxObject) {
        dcv.setComboBoxObject(ComboBoxObject);
        dcv.InitializeComboBox();
        ComboBoxObject.addItem("--SELECT--");
        Connection conn = DBConn.getConnection();
        String createString;
        createString = "SELECT * FROM payroll_period WHERE MonthId=" + this.getMonthId() + " AND YearId=" + this.getYearId();

        try {
            Stmt = conn.createStatement();
            ResultSet rs = Stmt.executeQuery(createString);

            while (rs.next()) {
                ComboBoxObject.addItem(new ComboBoxItem(rs.getInt("PPId"), rs.getString("Description") + ", " + rs.getString("StartDate") + " to " + rs.getString("EndDate")));
            }

            Stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.getStackTrace();
        }
    }

    public void Add() {
        Connection conn = DBConn.getConnection();
        String createString;
        createString = "INSERT INTO payroll_period (UserId, Description, StartDate, EndDate, MonthId, YearId)"
                + " VALUES (" + this.getUserId() + ",'" + this.getDescription() + "','" + this.getStartDate() + "','" + this.getEndDate() + "'," + this.getMonthId() + "," + this.getYearId() + ")";

        try {
            Connection Conn = DBConn.getConnection();
            Stmt = Conn.createStatement();
            Stmt.executeUpdate(createString);
            Stmt.close();
            conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void Update() {
        Connection conn = DBConn.getConnection();
        String createString;
        createString = "UPDATE payroll_period "
                + "SET "
                + "Description = '" + this.getDescription() + "', "
                + "StartDate = '" + this.getStartDate() + "', "
                + "EndDate = '" + this.getEndDate() + "' "
                + "WHERE PPId=" + this.getPPId();

        try {
            Connection Conn = DBConn.getConnection();
            Stmt = Conn.createStatement();
            Stmt.executeUpdate(createString);
            Stmt.close();
            conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void Remove() {
        Connection Conn = DBConn.getConnection();
        String createString;
        createString = "DELETE FROM payroll_period WHERE PPId=" + this.getPPId();

        try {
            Stmt = Conn.createStatement();
            Stmt.executeUpdate(createString);
            Stmt.close();
            Conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
