/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;

import app.config.DBConn;
import app.model.Coa;
import app.view.global.DefaultTableView;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTable;

public class CoaController extends Coa {

    static Statement Stmt;
    DefaultTableView dtv = new DefaultTableView();

    public void PopulateTableData(JTable TableObject, String SearchParameter) {
        Connection Conn = DBConn.getConnection();
        dtv.setTableObject(TableObject);
        dtv.InitializeTable();
        dtv.RenderTable();

        String createString = "SELECT * FROM coa WHERE AccountTitle LIKE '%" + SearchParameter + "%'";

        try {

            Stmt = Conn.createStatement();
            ResultSet rs = Stmt.executeQuery(createString);

            while (rs.next()) {
                dtv.TableModel.addRow(new Object[]{rs.getString("COAId"), rs.getString("AccountCode"), rs.getString("AccountTitle")});
            }

            Stmt.close();
            Conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void PopulateTableDataNotIn(JTable TableObject, String SearchParameter, int TransTypeId) {
        Connection Conn = DBConn.getConnection();
        dtv.setTableObject(TableObject);
        dtv.InitializeTable();
        dtv.RenderTable();

        String createString = "SELECT * FROM coa WHERE COAId NOT IN (SELECT COAId FROM transaction_charges WHERE TransTypeId="+TransTypeId+") AND AccountTitle LIKE '%" + SearchParameter + "%'";

        try {

            Stmt = Conn.createStatement();
            ResultSet rs = Stmt.executeQuery(createString);

            while (rs.next()) {
                dtv.TableModel.addRow(new Object[]{rs.getInt("COAId"), rs.getString("AccountCode"), rs.getString("AccountTitle")});
            }

            Stmt.close();
            Conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void Add() {
        Connection conn = DBConn.getConnection();
        String createString;
        createString = "INSERT INTO coa(AccountCode, AccountTitle) "
                + "VALUES ('" + this.getAccountCode() + "','" + this.getAccountTitle() + "')";

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

    public void PopulateDataOnEdit() {
        Connection Conn = DBConn.getConnection();
        String createString = "SELECT * FROM coa WHERE COAId=" + this.getCOAId();

        try {

            Stmt = Conn.createStatement();
            ResultSet rs = Stmt.executeQuery(createString);

            while (rs.next()) {
                this.setAccountCode(rs.getString("AccountCode"));
                this.setAccountTitle(rs.getString("AccountTitle"));
            }

            Stmt.close();
            Conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public void Update() {
        Connection conn = DBConn.getConnection();
        String createString;
        createString = "UPDATE coa "
                + "SET "
                + "AccountCode = '" + this.getAccountCode() + "', "
                + "AccountTitle = '" + this.getAccountTitle() + "' "
                + "WHERE COAId=" + this.getCOAId();

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
        createString = "DELETE FROM coa WHERE COAId=" + this.getCOAId();

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
