/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;

import app.config.DBConn;
import app.model.Electrician;
import app.view.global.DefaultTableView;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Engkoi Zidac
 */


public class ElectricianController extends Electrician {

    static Statement Stmt;
    DefaultTableView dtv = new DefaultTableView();
    

    public void PopulateTableData(JTable TableObject, String SearchParameter) {
        Connection Conn = DBConn.getConnection();
        dtv.setTableObject(TableObject);
        dtv.InitializeTable();
        dtv.RenderTable();
        
        String createString = "SELECT * FROM electrician WHERE FullName LIKE '%" + SearchParameter + "%' AND ElectricianId<>0 ORDER BY FullName";

        try {
  
            Stmt = Conn.createStatement();
            ResultSet rs = Stmt.executeQuery(createString);

            while (rs.next()) {
                dtv.TableModel.addRow(new Object[]{rs.getInt("ElectricianId"), rs.getString("FullName"), rs.getString("Address"), rs.getString("ContactNo")});
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
        createString = "INSERT INTO electrician(FullName, Address, ContactNo) "
                + "VALUES ('" + this.getFullName() + "','" + this.getAddress() + "','" + this.getContactNo() + "')";

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
        String createString = "SELECT * FROM electrician WHERE ElectricianId=" + this.getElectricianId();

        try {

            Stmt = Conn.createStatement();
            ResultSet rs = Stmt.executeQuery(createString);

            while (rs.next()) {
                this.setFullName(rs.getString("FullName"));
                this.setAddress(rs.getString("Address"));
                this.setContactNo(rs.getString("ContactNo"));
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
        createString = "UPDATE electrician "
                + "SET "
                + "FullName = '" + this.getFullName() + "', "
                + "Address = '" + this.getAddress() + "', "
                + "ContactNo = '" + this.getContactNo() + "' "
                + "WHERE ElectricianId=" + this.getElectricianId();

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
        createString = "DELETE FROM electrician WHERE ElectricianId=" + this.getElectricianId();

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
