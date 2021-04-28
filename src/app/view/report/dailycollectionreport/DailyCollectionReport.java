/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view.report.dailycollectionreport;

import app.global.FunctionFactory;
import app.global.ReportFactory;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author JoKoiZidac
 */
public class DailyCollectionReport extends javax.swing.JInternalFrame {

static String nowDate = FunctionFactory.getSystemNowDateTimeString();
    public DailyCollectionReport() {
        initComponents();
        SetDates();
    }

    void SetDates() {
        txtdate.setDate(FunctionFactory.getSystemNowDateTime());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmdadd = new javax.swing.JButton();
        cmdadd1 = new javax.swing.JButton();
        cmdexit = new javax.swing.JButton();
        txtdate = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Daily Sales SReport");

        jLabel1.setText("Date:");

        cmdadd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/services.png"))); // NOI18N
        cmdadd.setMnemonic('S');
        cmdadd.setText("Summary");
        cmdadd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cmdadd.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cmdadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdaddActionPerformed(evt);
            }
        });

        cmdadd1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdadd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reports.png"))); // NOI18N
        cmdadd1.setMnemonic('D');
        cmdadd1.setText("Detailed Summary");
        cmdadd1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cmdadd1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cmdadd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdadd1ActionPerformed(evt);
            }
        });

        cmdexit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/remove.png"))); // NOI18N
        cmdexit.setMnemonic('C');
        cmdexit.setText("Cancel");
        cmdexit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cmdexit.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        cmdexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdexitActionPerformed(evt);
            }
        });

        txtdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 153, 0)));
        txtdate.setDateFormatString("MM/dd/yyyy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmdadd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdadd1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmdexit, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel1)
                            .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(cmdadd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdadd1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdexit)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdaddActionPerformed


            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String dte = dateFormat.format(txtdate.getDate());

            ReportFactory.DailyCollectionSummary(dte);
        
    }//GEN-LAST:event_cmdaddActionPerformed

    private void cmdadd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdadd1ActionPerformed
//        if ("--SELECT--".equals(cmbpp.getSelectedItem().toString())) {
//            JOptionPane.showMessageDialog(null, "Please select a payroll period!");
//        } else {
//            Controller.GetData();
//            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//            String from = dateFormat.format(Controller.getStartDate());
//            String to = dateFormat.format(Controller.getEndDate());
//
//            String caption = FunctionFactory.getMonthName(month)+" "+ FunctionFactory.GetDayofDate(from)+" to "+ FunctionFactory.GetDayofDate(to)+", "+ yr.getYear();
//            //System.out.println(seldate);
//            ReportFactory.LaborDetailedSummary(from, to, caption);
//        }
    }//GEN-LAST:event_cmdadd1ActionPerformed

    private void cmdexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdexitActionPerformed
        this.dispose();
    }//GEN-LAST:event_cmdexitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdadd;
    private javax.swing.JButton cmdadd1;
    private javax.swing.JButton cmdexit;
    private javax.swing.JLabel jLabel1;
    private com.toedter.calendar.JDateChooser txtdate;
    // End of variables declaration//GEN-END:variables
}
