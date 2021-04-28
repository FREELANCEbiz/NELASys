/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;

import app.config.DBConn;
import app.model.ComboBoxItem;
import app.model.ShareHolder;
import app.view.global.DefaultComboBoxView;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;

/**
 *
 * @author Engkoi Zidac
 */
public class ShareHolderController extends ShareHolder {

    static Statement Stmt;
    DefaultComboBoxView dcv = new DefaultComboBoxView();

    public void PopulateComboBoxData(JComboBox ComboBoxObject) {
        //ComboBoxObject.addItem("--SELECT--");
        dcv.setComboBoxObject(ComboBoxObject);
        dcv.InitializeComboBox();

        Connection conn = DBConn.getConnection();
        String createString;
        createString = "SELECT * FROM share_holder";

        try {
            Stmt = conn.createStatement();
            ResultSet rs = Stmt.executeQuery(createString);

            while (rs.next()) {
                ComboBoxObject.addItem(new ComboBoxItem(rs.getInt("ShareHolderId"), rs.getString("Description")));
            }

            Stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.getStackTrace();
        }
    }

    
}
