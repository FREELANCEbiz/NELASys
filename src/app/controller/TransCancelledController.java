/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;

import app.config.DBConn;
import app.model.TransactionCancelled;
import app.view.global.DefaultTableView;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Engkoi Zidac
 */
public class TransCancelledController extends TransactionCancelled {

    static Statement Stmt;
    DefaultTableView dtv = new DefaultTableView();

    public void Add() {
        Connection conn = DBConn.getConnection();
        String createString;
        createString = "INSERT INTO transaction_cancelled (TransId, UserId, Reason)"
                + " VALUES (" + this.getTransId() + "," + this.getUserId() + ",'" + this.getReason() + "')";

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
        createString = "DELETE FROM transaction_cancelled WHERE TransId=" + this.getTransId();

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
