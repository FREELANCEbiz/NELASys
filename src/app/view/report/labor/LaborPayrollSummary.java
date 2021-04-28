/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view.report.labor;

import app.controller.PayrollPeriodController;
import app.global.FunctionFactory;
import app.global.ReportFactory;
import app.model.ComboBoxItem;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Engkoi Zidac
 */
public class LaborPayrollSummary extends javax.swing.JInternalFrame {

    PayrollPeriodController Controller = new PayrollPeriodController();
    public static int month;

    public LaborPayrollSummary() {
        initComponents();
        populateCMB();
        cmbmonth.setSelectedIndex(FunctionFactory.GetSystemNowMonthId());

        PopulateCombo();
    }

    void PopulateCombo() {
        Controller.setMonthId(month);
        Controller.setYearId(yr.getYear());
        Controller.PopulateComboBoxData(cmbpp);
    }

    public void populateCMB() {
        //Populate Combo Area
        cmbmonth.addItem("--SELECT--");
        cmbmonth.addItem(new Item(1, "January".toUpperCase()));
        cmbmonth.addItem(new Item(2, "February".toUpperCase()));
        cmbmonth.addItem(new Item(3, "March".toUpperCase()));
        cmbmonth.addItem(new Item(4, "April".toUpperCase()));
        cmbmonth.addItem(new Item(5, "May".toUpperCase()));
        cmbmonth.addItem(new Item(6, "June".toUpperCase()));
        cmbmonth.addItem(new Item(7, "July".toUpperCase()));
        cmbmonth.addItem(new Item(8, "August".toUpperCase()));
        cmbmonth.addItem(new Item(9, "September".toUpperCase()));
        cmbmonth.addItem(new Item(10, "October".toUpperCase()));
        cmbmonth.addItem(new Item(11, "November".toUpperCase()));
        cmbmonth.addItem(new Item(12, "December".toUpperCase()));
    }

    class Item {

        private int id;
        private String description;

        public Item(int id, String description) {
            this.id = id;
            this.description = description;
        }

        public int getId() {
            return id;
        }

        public String getDescription() {
            return description;
        }

        public String toString() {
            return description;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbmonth = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        yr = new com.toedter.calendar.JYearChooser();
        jLabel3 = new javax.swing.JLabel();
        cmbpp = new javax.swing.JComboBox();
        cmdadd = new javax.swing.JButton();
        cmdexit = new javax.swing.JButton();
        cmdadd1 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Labor Payroll Summary Report");

        jLabel1.setText("Month");

        cmbmonth.setMaximumRowCount(20);
        cmbmonth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        cmbmonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbmonthActionPerformed(evt);
            }
        });

        jLabel2.setText("Year");

        yr.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        yr.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                yrHierarchyChanged(evt);
            }
        });
        yr.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                yrAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                yrAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        yr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yrMouseClicked(evt);
            }
        });
        yr.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                yrCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                yrInputMethodTextChanged(evt);
            }
        });
        yr.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                yrPropertyChange(evt);
            }
        });
        yr.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                yrVetoableChange(evt);
            }
        });

        jLabel3.setText("Payroll Period");

        cmbpp.setMaximumRowCount(20);
        cmbpp.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        cmbpp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbppActionPerformed(evt);
            }
        });

        cmdadd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/services.png"))); // NOI18N
        cmdadd.setMnemonic('S');
        cmdadd.setText("Summary");
        cmdadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdaddActionPerformed(evt);
            }
        });

        cmdexit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/remove.png"))); // NOI18N
        cmdexit.setMnemonic('C');
        cmdexit.setText("Cancel");
        cmdexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdexitActionPerformed(evt);
            }
        });

        cmdadd1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdadd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reports.png"))); // NOI18N
        cmdadd1.setMnemonic('D');
        cmdadd1.setText("Detailed Summary");
        cmdadd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdadd1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdadd, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdadd1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdexit, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yr, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbpp, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(cmbmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(yr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel3)
                    .addComponent(cmbpp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdadd)
                    .addComponent(cmdexit)
                    .addComponent(cmdadd1))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbmonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbmonthActionPerformed
        try {
            Item item = (Item) cmbmonth.getSelectedItem();
            month = item.getId();
            PopulateCombo();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cmbmonthActionPerformed

    private void yrHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_yrHierarchyChanged

    }//GEN-LAST:event_yrHierarchyChanged

    private void yrAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_yrAncestorMoved

    }//GEN-LAST:event_yrAncestorMoved

    private void yrAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_yrAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_yrAncestorAdded

    private void yrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yrMouseClicked

    }//GEN-LAST:event_yrMouseClicked

    private void yrInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_yrInputMethodTextChanged

    }//GEN-LAST:event_yrInputMethodTextChanged

    private void yrCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_yrCaretPositionChanged

    }//GEN-LAST:event_yrCaretPositionChanged

    private void yrPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_yrPropertyChange
        PopulateCombo();
    }//GEN-LAST:event_yrPropertyChange

    private void yrVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_yrVetoableChange

    }//GEN-LAST:event_yrVetoableChange

    private void cmbppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbppActionPerformed
        try {
            ComboBoxItem item = (ComboBoxItem) cmbpp.getSelectedItem();
            Controller.setPPId(item.getId());
           // System.out.print(Controller.getPPId());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cmbppActionPerformed

    private void cmdaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdaddActionPerformed
        if ("--SELECT--".equals(cmbpp.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Please select a payroll period!");
        } else {
            Controller.GetData();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String from = dateFormat.format(Controller.getStartDate());
                String to = dateFormat.format(Controller.getEndDate());
                
                String caption = FunctionFactory.getMonthName(month)+" "+ FunctionFactory.GetDayofDate(from)+" to "+ FunctionFactory.GetDayofDate(to)+", "+ yr.getYear();
                //System.out.println(seldate);
            ReportFactory.LaborSummary(from, to, caption);
        }
    }//GEN-LAST:event_cmdaddActionPerformed

    private void cmdexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdexitActionPerformed
        this.dispose();
    }//GEN-LAST:event_cmdexitActionPerformed

    private void cmdadd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdadd1ActionPerformed
                if ("--SELECT--".equals(cmbpp.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(null, "Please select a payroll period!");
        } else {
            Controller.GetData();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String from = dateFormat.format(Controller.getStartDate());
                String to = dateFormat.format(Controller.getEndDate());
                
                String caption = FunctionFactory.getMonthName(month)+" "+ FunctionFactory.GetDayofDate(from)+" to "+ FunctionFactory.GetDayofDate(to)+", "+ yr.getYear();
                //System.out.println(seldate);
            ReportFactory.LaborDetailedSummary(from, to, caption);
        }
    }//GEN-LAST:event_cmdadd1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbmonth;
    private javax.swing.JComboBox cmbpp;
    private javax.swing.JButton cmdadd;
    private javax.swing.JButton cmdadd1;
    private javax.swing.JButton cmdexit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private com.toedter.calendar.JYearChooser yr;
    // End of variables declaration//GEN-END:variables
}
