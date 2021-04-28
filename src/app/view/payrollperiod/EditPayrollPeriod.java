/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view.payrollperiod;

import app.controller.PayrollPeriodController;
import app.view.index.MainFrame;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Engkoi Zidac
 */
public class EditPayrollPeriod extends javax.swing.JDialog {

    public static int id;
    public static ManagePayrollPeriod frmParent;
    PayrollPeriodController Controller = new PayrollPeriodController();

    public EditPayrollPeriod(ManagePayrollPeriod parent, boolean modal) {
        this.frmParent = parent;
        this.setModal(modal);
        initComponents();
        setLocationRelativeTo(this);
        getRootPane().setDefaultButton(cmdedit);
        PopulateData();
    }


    
    void PopulateData() {
        Controller.setPPId(id);
        Controller.GetData();
        txtdesc.setText(Controller.getDescription());
        txtfrom.setDate(Controller.getStartDate());
        txtto.setDate(Controller.getEndDate());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmdedit = new javax.swing.JButton();
        cmdexit = new javax.swing.JButton();
        txtfrom = new com.toedter.calendar.JDateChooser();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        txtto = new com.toedter.calendar.JDateChooser();
        txtdesc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit Payroll Period");

        jLabel1.setText("Description");

        cmdedit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        cmdedit.setMnemonic('A');
        cmdedit.setText("Edit");
        cmdedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdeditActionPerformed(evt);
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

        txtfrom.setDateFormatString("yyyy/MM/dd ");
        txtfrom.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtfrom.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                txtfromHierarchyChanged(evt);
            }
        });
        txtfrom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtfromMouseReleased(evt);
            }
        });
        txtfrom.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtfromInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                txtfromCaretPositionChanged(evt);
            }
        });
        txtfrom.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtfromPropertyChange(evt);
            }
        });
        txtfrom.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                txtfromVetoableChange(evt);
            }
        });

        lbl1.setText("From");

        lbl2.setText("To");

        txtto.setDateFormatString("yyyy/MM/dd ");
        txtto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtto.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                txttoHierarchyChanged(evt);
            }
        });
        txtto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txttoMouseReleased(evt);
            }
        });
        txtto.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txttoInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                txttoCaretPositionChanged(evt);
            }
        });
        txtto.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txttoPropertyChange(evt);
            }
        });
        txtto.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                txttoVetoableChange(evt);
            }
        });

        txtdesc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtdesc.setForeground(new java.awt.Color(51, 51, 51));
        txtdesc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtdescFocusGained(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl1)
                            .addComponent(lbl2))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdedit, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdexit, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(txtdesc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdedit)
                    .addComponent(cmdexit))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdeditActionPerformed
        if (txtdesc.getText().isEmpty() == true) {
            JOptionPane.showMessageDialog(null, "Please fill-up the required fields!");
        } else {
            Controller.setDescription(txtdesc.getText());
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String from = dateFormat.format(txtfrom.getDate());
            String to = dateFormat.format(txtto.getDate());
            Controller.setStartDate(Date.valueOf(from));
            Controller.setEndDate(Date.valueOf(to));
            Controller.setPPId(id);
            Controller.Update();
            frmParent.PopulateDataPayrollPeriod();
            this.dispose();
            JOptionPane.showMessageDialog(null, "Updated Successfully!");
        }
    }//GEN-LAST:event_cmdeditActionPerformed

    private void cmdexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdexitActionPerformed
        this.dispose();
    }//GEN-LAST:event_cmdexitActionPerformed

    private void txtfromHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_txtfromHierarchyChanged

    }//GEN-LAST:event_txtfromHierarchyChanged

    private void txtfromMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtfromMouseReleased

    }//GEN-LAST:event_txtfromMouseReleased

    private void txtfromInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtfromInputMethodTextChanged

    }//GEN-LAST:event_txtfromInputMethodTextChanged

    private void txtfromCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtfromCaretPositionChanged

    }//GEN-LAST:event_txtfromCaretPositionChanged

    private void txtfromPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtfromPropertyChange
        //        try {
        //            PopulateDataTransCharges();
        //        } catch (Exception e) {
        //
        //        }
    }//GEN-LAST:event_txtfromPropertyChange

    private void txtfromVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_txtfromVetoableChange

    }//GEN-LAST:event_txtfromVetoableChange

    private void txttoHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_txttoHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txttoHierarchyChanged

    private void txttoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txttoMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txttoMouseReleased

    private void txttoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txttoInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txttoInputMethodTextChanged

    private void txttoCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txttoCaretPositionChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txttoCaretPositionChanged

    private void txttoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txttoPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txttoPropertyChange

    private void txttoVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_txttoVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txttoVetoableChange

    private void txtdescFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdescFocusGained

    }//GEN-LAST:event_txtdescFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditPayrollPeriod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditPayrollPeriod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditPayrollPeriod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditPayrollPeriod.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditPayrollPeriod dialog = new EditPayrollPeriod(frmParent, true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdedit;
    private javax.swing.JButton cmdexit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JTextField txtdesc;
    private com.toedter.calendar.JDateChooser txtfrom;
    private com.toedter.calendar.JDateChooser txtto;
    // End of variables declaration//GEN-END:variables
}
