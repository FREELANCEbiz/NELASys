/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;

import app.config.DBConn;
import app.global.FunctionFactory;
import app.model.TransactionDetails;
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
public class TransactionDetailsController extends TransactionDetails {
    static Statement Stmt;
        DefaultTableView dtv = new DefaultTableView();

    public void PopulateTableData(JTable TableObject) {
        Connection Conn = DBConn.getConnection();
        dtv.setTableObject(TableObject);
        dtv.InitializeTable();
        dtv.RenderTable();

        String createString = "SELECT * FROM transaction_details td "
                + "INNER JOIN coa c ON td.COAId=c.COAId "
                + "INNER JOIN share_holder s ON td.ShareHolderId=s.ShareHolderId "
                + "WHERE TransId="+this.getTransId();

        try {

            Stmt = Conn.createStatement();
            ResultSet rs = Stmt.executeQuery(createString);

            while (rs.next()) {
                dtv.TableModel.addRow(new Object[]{rs.getInt("TransDetailId"), rs.getString("AccountTitle"), FunctionFactory.amountFormat2(rs.getString("Amount")), rs.getString("Description")});
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
        createString = "INSERT INTO transaction_details (TransId, COAId, ShareHolderId, Amount)"
                + " VALUES ("+this.getTransId()+","+this.getCOAId()+","+this.getShareHolderId()+",'"+this.getAmount()+"')";

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
