/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view.payrollperiod;

import app.controller.PayrollPeriodController;
import app.global.FunctionFactory;
import app.view.transaction.EditCharges;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;

/**
 *
 * @author Engkoi Zidac
 */
public class ManagePayrollPeriod extends javax.swing.JInternalFrame {

    public static int month;
    PayrollPeriodController Controller = new PayrollPeriodController();
    public static AddPayrollPeriod frmAdd;
    public static EditPayrollPeriod frmEdit;

    public ManagePayrollPeriod() {
        initComponents();

        populateCMB();
        cmbmonth.setSelectedIndex(FunctionFactory.GetSystemNowMonthId());

        TableColumn idClmn = Table.getColumn("id");
        idClmn.setMaxWidth(0);
        idClmn.setMinWidth(0);
        idClmn.setPreferredWidth(0);
        PopulateDataPayrollPeriod();
    }

    public void ShowFrmAdd() {
        frmAdd = new AddPayrollPeriod(this, true);
        frmAdd.setVisible(true);
    }

    public void ShowFrmEdit() {
        frmEdit = new EditPayrollPeriod(this, true);
        frmEdit.setVisible(true);
    }

    public void PopulateDataPayrollPeriod() {
        Controller.setMonthId(month);
        Controller.setYearId(yr.getYear());
        Controller.PopulateTableData(Table);
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

        jScrollPane3 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        AddButton = new javax.swing.JButton();
        AddButton1 = new javax.swing.JButton();
        AddButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        yr = new com.toedter.calendar.JYearChooser();
        jLabel2 = new javax.swing.JLabel();
        cmbmonth = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Payroll Period Management");
        setToolTipText("");

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Description", "Start Date", "End Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(Table);
        Table.getColumnModel().getColumn(1).setPreferredWidth(400);
        Table.getColumnModel().getColumn(2).setPreferredWidth(200);
        Table.getColumnModel().getColumn(3).setPreferredWidth(200);

        AddButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        AddButton.setMnemonic('A');
        AddButton.setToolTipText("Add New Charges");
        AddButton.setFocusable(false);
        AddButton.setHideActionText(true);
        AddButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddButton.setIconTextGap(8);
        AddButton.setVerifyInputWhenFocusTarget(false);
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        AddButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        AddButton1.setMnemonic('E');
        AddButton1.setToolTipText("Edit Selected Record");
        AddButton1.setFocusable(false);
        AddButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddButton1.setIconTextGap(8);
        AddButton1.setVerifyInputWhenFocusTarget(false);
        AddButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButton1ActionPerformed(evt);
            }
        });

        AddButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/remove.png"))); // NOI18N
        AddButton2.setMnemonic('R');
        AddButton2.setToolTipText("Remove Selected Charges");
        AddButton2.setFocusable(false);
        AddButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddButton2.setIconTextGap(8);
        AddButton2.setVerifyInputWhenFocusTarget(false);
        AddButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Month");

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
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                yrInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                yrCaretPositionChanged(evt);
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

        jLabel2.setText("Year");

        cmbmonth.setMaximumRowCount(20);
        cmbmonth.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        cmbmonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbmonthActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(yr, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(cmbmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(yr, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        if ("--SELECT--".equals(cmbmonth.getSelectedItem().toString())) {
            JOptionPane.showMessageDialog(this, "Please select a month!");
        } else {
            AddPayrollPeriod.month = month;
            AddPayrollPeriod.year = yr.getYear();
            ShowFrmAdd();
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void AddButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton1ActionPerformed
        int col = 0; //set column value to 0
        int row = Table.getSelectedRow(); //get value of selected value

        //trap user incase if no row selected
        if (Table.isRowSelected(row) != true) {
            JOptionPane.showMessageDialog(this, "No record selected! Please select a record from the list!");
        } else {
            String id = Table.getValueAt(row, col).toString();
            //  EditCharges.id = Integer.parseInt(id);
            EditPayrollPeriod.id = Integer.parseInt(id);
            ShowFrmEdit();
        }

    }//GEN-LAST:event_AddButton1ActionPerformed

    private void AddButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton2ActionPerformed
        int row = Table.getSelectedRow(); //get value of selected value

        if (Table.isRowSelected(row) != true) {
            JOptionPane.showMessageDialog(this, "No record selected! Please select a record from the list!");
        } else {
            String id = Table.getValueAt(row, 0).toString();
            int i = FunctionFactory.msgboxYesNo("Are you sure you want to delete this record");
            switch (i) {
                case 0:
                    Controller.setPPId(Integer.parseInt(id));
                    Controller.Remove();
                    PopulateDataPayrollPeriod();
                    JOptionPane.showMessageDialog(null, "Successfully Removed!");
                    break;
                case 1:
                    break;
                case 2:
                    this.dispose(); //exit window
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_AddButton2ActionPerformed

    private void yrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yrMouseClicked

    }//GEN-LAST:event_yrMouseClicked

    private void yrAncestorMoved1(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_yrAncestorMoved1
        PopulateDataPayrollPeriod();
    }//GEN-LAST:event_yrAncestorMoved1

    private void yrHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_yrHierarchyChanged

    }//GEN-LAST:event_yrHierarchyChanged

    private void yrCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_yrCaretPositionChanged

    }//GEN-LAST:event_yrCaretPositionChanged

    private void yrInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_yrInputMethodTextChanged

    }//GEN-LAST:event_yrInputMethodTextChanged

    private void yrPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_yrPropertyChange
        PopulateDataPayrollPeriod();
    }//GEN-LAST:event_yrPropertyChange

    private void yrAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_yrAncestorMoved

    }//GEN-LAST:event_yrAncestorMoved

    private void yrAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_yrAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_yrAncestorAdded

    private void yrVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_yrVetoableChange

    }//GEN-LAST:event_yrVetoableChange

    private void cmbmonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbmonthActionPerformed
        try {
            Item item = (Item) cmbmonth.getSelectedItem();
            month = item.getId();
            PopulateDataPayrollPeriod();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_cmbmonthActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton AddButton1;
    private javax.swing.JButton AddButton2;
    private javax.swing.JTable Table;
    private javax.swing.JComboBox cmbmonth;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane3;
    private com.toedter.calendar.JYearChooser yr;
    // End of variables declaration//GEN-END:variables
}
