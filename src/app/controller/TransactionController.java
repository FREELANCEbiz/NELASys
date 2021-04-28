/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;

import app.config.DBConn;
import app.global.FunctionFactory;
import app.model.Transaction;
import app.view.global.DefaultTableView;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Engkoi Zidac
 */
public class TransactionController extends Transaction {

    static Statement Stmt;
    DefaultTableView dtv = new DefaultTableView();

    public void PopulateTableData(JTable TableObject, String SearchParameter, boolean IsFilteredByDate, String FromDate, String ToDate) {
        Connection Conn = DBConn.getConnection();
        dtv.setTableObject(TableObject);
        dtv.InitializeTable();
        dtv.RenderTable();

        dtv.ColumnAlignRight(6);

        String createString = "";
        if (IsFilteredByDate == true) {
            createString = "SELECT * FROM transaction t "
                    + "INNER JOIN electrician e ON t.ElectricianId=e.ElectricianId "
                    + "INNER JOIN transaction_type tt ON t.TransTypeId=tt.TransTypeId "
                    + "INNER JOIN user u ON t.UserId=u.user_id "
                    + "INNER JOIN transaction_status s ON t.StatusId=s.TransStatId "
                    + "WHERE DATE(ORDate) BETWEEN '" + FromDate + "' AND '" + ToDate + "' "
                    + "AND CONCAT(ORNo, ', ' , FullName, ',', Consumer, ',', TotalAmount) LIKE '%" + SearchParameter + "%' "
                    + "ORDER BY TransDate DESC";
        } else if (IsFilteredByDate == false) {
            createString = "SELECT * FROM transaction t "
                    + "INNER JOIN electrician e ON t.ElectricianId=e.ElectricianId "
                    + "INNER JOIN transaction_type tt ON t.TransTypeId=tt.TransTypeId "
                    + "INNER JOIN user u ON t.UserId=u.user_id "
                    + "INNER JOIN transaction_status s ON t.StatusId=s.TransStatId "
                    + "WHERE CONCAT(ORNo, ', ' , FullName, ',', Consumer, ',', TotalAmount)  LIKE '%" + SearchParameter + "%' "
                    + "ORDER BY TransDate DESC";
        }

        try {

            Stmt = Conn.createStatement();
            ResultSet rs = Stmt.executeQuery(createString);

            while (rs.next()) {
                dtv.TableModel.addRow(new Object[]{rs.getInt("TransId"), rs.getDate("ORDate"), rs.getString("tt.Description"), rs.getString("ORNo"), rs.getString("FullName"), rs.getString("Consumer"), FunctionFactory.amountFormat2(rs.getString("TotalAmount")), rs.getDate("TransDate"), rs.getString("full_name"), rs.getString("s.Description")});
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
        createString = "SELECT * FROM transaction WHERE TransId=" + this.getTransId();

        try {
            Connection Conn = DBConn.getConnection();
            Stmt = Conn.createStatement();
            ResultSet rs = Stmt.executeQuery(createString);
            while (rs.next()) {
                this.setElectricianId(rs.getInt("ElectricianId"));
                this.setStatusId(rs.getInt("StatusId"));
            }
            Stmt.close();
            conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public int GetValidTransID() {
        int transId = 0;

        Connection Conn = DBConn.getConnection();

        String createString = "SELECT MAX(TransId) FROM Transaction";

        try {

            Stmt = Conn.createStatement();
            ResultSet rs = Stmt.executeQuery(createString);

            while (rs.next()) {
                transId = rs.getInt(1);
            }

            Stmt.close();
            Conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return transId;
    }

    public void Add() {
        Connection conn = DBConn.getConnection();
        String createString;
        createString = "INSERT INTO transaction (ElectricianId, TransTypeId, TotalAmount, TransStatus, UserId, Consumer, ORNo, ORDate)"
                + " VALUES (" + this.getElectricianId() + "," + this.getTransTypeId() + ",'" + this.getTotalAmount() + "', 1, " + this.getUserId() + ",'" + this.getConsumer() + "','" + this.getORNo() + "','" + this.getORDate() + "')";

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

    public void UpdateElectrician() {
        Connection conn = DBConn.getConnection();
        String createString;
        createString = "UPDATE transaction "
                + "SET ElectricianId=" + this.getElectricianId() + " "
                + "WHERE TransId=" + this.getTransId();

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

    public void UpdateStatus() {
        Connection conn = DBConn.getConnection();
        String createString;
        createString = "UPDATE transaction "
                + "SET StatusId=" + this.getStatusId() + " "
                + "WHERE TransId=" + this.getTransId();

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

    public void UpdateORDate() {
        Connection conn = DBConn.getConnection();
        String createString;
        createString = "UPDATE transaction "
                + "SET ORDate='" + this.getORDate() + "' "
                + "WHERE TransId=" + this.getTransId();

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

    public void UpdateORNo() {
        Connection conn = DBConn.getConnection();
        String createString;
        createString = "UPDATE transaction "
                + "SET ORNo='" + this.getORNo() + "' "
                + "WHERE TransId=" + this.getTransId();

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

    public void UpdateConsumer() {
        Connection conn = DBConn.getConnection();
        String createString;
        createString = "UPDATE transaction "
                + "SET Consumer='" + this.getConsumer() + "' "
                + "WHERE TransId=" + this.getTransId();

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
}
