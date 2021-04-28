/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;

import app.config.DBConn;
import app.global.FunctionFactory;
import app.model.TransactionCharges;
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
public class TransChargesController extends TransactionCharges {

    static Statement Stmt;
    DefaultTableView dtv = new DefaultTableView();

    public void PopulateTableData(JTable TableObject, int Id) {
        Connection Conn = DBConn.getConnection();
        dtv.setTableObject(TableObject);
        dtv.InitializeTable();
        dtv.RenderTable();

        String createString = "SELECT * FROM transaction_charges tc "
                + "INNER JOIN coa c ON tc.COAId=c.COAId "
                + "INNER JOIN share_holder s ON tc.ShareHolderId=s.ShareHolderId "
                + "WHERE TransTypeId=" + Id + " GROUP BY ChargeId ";

        try {

            Stmt = Conn.createStatement();
            ResultSet rs = Stmt.executeQuery(createString);

            while (rs.next()) {
                dtv.TableModel.addRow(new Object[]{rs.getInt("tc.COAId"), rs.getString("c.AccountTitle"), FunctionFactory.amountFormat(rs.getDouble("Amount")), rs.getString("s.Description"), rs.getString("s.ShareHolderId"), rs.getInt("tc.ChargeId")});
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
        createString = "INSERT INTO transaction_charges(Amount, ShareHolderId, TransTypeId, COAId) "
                + "VALUES ('" + this.getAmount() + "'," + this.getShareHolderId() + "," + this.getTransTypeId() + "," + this.getCOAId() + ")";

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
        Connection conn = DBConn.getConnection();
        String createString;
        createString = "DELETE FROM transaction_charges WHERE ChargeId="+this.getChargeId();

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

    public boolean IsCOAIdSet(int cOAId, int transTypeId) {
        boolean isSet = false;
        Connection Conn = DBConn.getConnection();
        String createString = "SELECT * FROM transaction_charges WHERE COAId=" + cOAId + " AND TransTypeId=" + transTypeId;

        try {
            Stmt = Conn.createStatement();
            ResultSet rs = Stmt.executeQuery(createString);

            int cntr = 0;
            while (rs.next()) {
                cntr++;
            }

            if (cntr >= 1) {
                isSet = true;
            } else {
                isSet = false;
            }

            Stmt.close();
            Conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return isSet;
    }

//    public void PopulateDataOnEdit() {
//        Connection Conn = DBConn.getConnection();
//        String createString = "SELECT * FROM coa WHERE COAId=" + this.getCOAId();
//
//        try {
//
//            Stmt = Conn.createStatement();
//            ResultSet rs = Stmt.executeQuery(createString);
//
//            while (rs.next()) {
//                this.setAccountCode(rs.getString("AccountCode"));
//                this.setAccountTitle(rs.getString("AccountTitle"));
//            }
//
//            Stmt.close();
//            Conn.close();
//
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//    }
//
//    public void Update() {
//        Connection conn = DBConn.getConnection();
//        String createString;
//        createString = "UPDATE coa "
//                + "SET "
//                + "AccountCode = '" + this.getAccountCode() + "', "
//                + "AccountTitle = '" + this.getAccountTitle() + "' "
//                + "WHERE COAId=" + this.getCOAId();
//
//        try {
//            Connection Conn = DBConn.getConnection();
//            Stmt = Conn.createStatement();
//            Stmt.executeUpdate(createString);
//            Stmt.close();
//            conn.close();
//
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//    }
//
//    public void Remove() {
//        Connection Conn = DBConn.getConnection();
//        String createString;
//        createString = "DELETE FROM coa WHERE COAId=" + this.getCOAId();
//
//        try {
//            Stmt = Conn.createStatement();
//            Stmt.executeUpdate(createString);
//            Stmt.close();
//            Conn.close();
//
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//    }
}
