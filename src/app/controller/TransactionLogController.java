/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;

import app.config.DBConn;
import app.model.TransactionLog;
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
public class TransactionLogController extends TransactionLog {

    static Statement Stmt;
    DefaultTableView dtv = new DefaultTableView();

      public void PopulateTableData(JTable TableObject) {
        Connection Conn = DBConn.getConnection();
        dtv.setTableObject(TableObject);
        dtv.InitializeTable();
        dtv.RenderTable();

        String createString = "SELECT * FROM transaction_log t "
              + "INNER JOIN user u ON t.UserId=u.user_id "
                + "WHERE TransId=" + this.getTransId();

        try {

            Stmt = Conn.createStatement();
            ResultSet rs = Stmt.executeQuery(createString);

            while (rs.next()) {
                dtv.TableModel.addRow(new Object[]{rs.getInt("TransLogId"), rs.getString("Details"), rs.getString("TransDateTime"), rs.getString("full_name")});
            }

            Stmt.close();
            Conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    
    public void CreateLog() {
        Connection conn = DBConn.getConnection();
        String createString;
        createString = "INSERT INTO transaction_log (Details, TransId, UserId)"
                + " VALUES ('" + this.getDetails() + "'," + this.getTransId() + "," + this.getUserId() + ")";

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
