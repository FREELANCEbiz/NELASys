/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view.transaction;

import app.controller.TransChargesController;
import app.controller.TransactionController;
import app.controller.TransactionDetailsController;
import app.controller.TransactionTypeController;
import app.global.FunctionFactory;
import app.model.ComboBoxItem;
import app.view.index.MainFrame;
import java.math.BigDecimal;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author Engkoi Zidac
 */
public class CreateTrans extends javax.swing.JInternalFrame {

    TransactionTypeController TransTypeController = new TransactionTypeController();
    TransChargesController TCController = new TransChargesController();
    TransactionController Controller = new TransactionController();
    TransactionDetailsController TDController = new TransactionDetailsController();

    private static int ComboBoxId;
    static String nowDate2 = FunctionFactory.getSystemNowDateTimeString();
    public static SelectElectrician frmSelect;
    public static AddCharges frmAdd;
    public static EditCharges frmEdit;
    public static int eId;

    public CreateTrans() {
        initComponents();

        TableColumn idClmn = Table.getColumn("id");
        idClmn.setMaxWidth(0);
        idClmn.setMinWidth(0);
        idClmn.setPreferredWidth(0);

        TableColumn idClmn2 = Table.getColumn("shid");
        idClmn2.setMaxWidth(0);
        idClmn2.setMinWidth(0);
        idClmn2.setPreferredWidth(0);

        TableColumn idClmn3 = Table.getColumn("cid");
        idClmn3.setMaxWidth(0);
        idClmn3.setMinWidth(0);
        idClmn3.setPreferredWidth(0);

        getRootPane().setDefaultButton(cmdadd);
        TransTypeController.PopulateComboBoxData(ComboTransType);
        SetDateValue();
    }

    void Reset() {
        ComboTransType.setSelectedIndex(0);
        ComboBoxId = 0;
        eId = 0;
        PopulateDataTransCharges();
        CalculateTotalPayments();

        SetDateValue();
        txtconsumer.setText("");
        txtenym.setText("");
        txtor.setText("");
        ComboTransType.requestFocus();
    }

    public void EditChargesAmount(String amnt, int r) {
        ((DefaultTableModel) Table.getModel()).setValueAt(amnt, r, 2);
        CalculateTotalPayments();
    }

    public void insertCharges(String cOAId, String title, String amount, String sHName, String shareHolderId) {
        ((DefaultTableModel) Table.getModel()).addRow(new Object[]{cOAId, title, FunctionFactory.amountFormat2(amount), sHName, shareHolderId});
        CalculateTotalPayments();
    }

    public void SelectElectrician(int eid, String nym) {
        eId = eid;
        txtenym.setText(nym);
        txtor.requestFocus();
    }

    public void ShowFrmSelect() {
        frmSelect = new SelectElectrician(this, true);
        frmSelect.setVisible(true);
    }

    public void ShowFrmAdd() {
        frmAdd = new AddCharges(this, true);
        frmAdd.setVisible(true);
    }

    public void ShowFrmEdit() {
        frmEdit = new EditCharges(this, true);
        frmEdit.setVisible(true);
    }

    void SetDateValue() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date theDate = null;
        try {
            theDate = sdf.parse(nowDate2);
        } catch (ParseException e) {
        }
        //txtdate.setDateFormatString(nowDate);
        txtdate.setDate(theDate);
        //  txtend.setDate(theDate);
    }

    public void PopulateDataTransCharges() {
        TCController.PopulateTableData(Table, Short.valueOf(String.valueOf(ComboBoxId)));
    }

    public void CalculateTotalPayments() {
        int r = Table.getRowCount();
        int c;
        c = 0;
        double totalAmnt = 0;
        while (c < r + 1) {
            try {
                String amntStr = Table.getValueAt(c, 2).toString().replace(",", "");
                double amnt = Double.parseDouble(amntStr);

                totalAmnt = totalAmnt + amnt;

            } catch (Exception e) {
                e.getStackTrace();
            }
            c++;
        }
        lblamount.setText(FunctionFactory.amountFormat(totalAmnt));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtenym = new javax.swing.JTextField();
        ComboTransType = new javax.swing.JComboBox<>();
        AddButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lblcaption = new javax.swing.JLabel();
        txtor = new javax.swing.JTextField();
        AddButton2 = new javax.swing.JButton();
        AddButton = new javax.swing.JButton();
        cmdadd = new javax.swing.JButton();
        txtconsumer = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmdadd1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lblamount = new javax.swing.JLabel();
        txtdate = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        AddButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Create New Transaction");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jLabel1.setText("Electrician:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Transaction Type:");

        ComboTransType.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ComboTransType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboTransTypeActionPerformed(evt);
            }
        });

        AddButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ua.png"))); // NOI18N
        AddButton3.setMnemonic('e');
        AddButton3.setToolTipText("View Default Charges");
        AddButton3.setFocusable(false);
        AddButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AddButton3.setIconTextGap(8);
        AddButton3.setVerifyInputWhenFocusTarget(false);
        AddButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButton3ActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Description", "Amount", "ShareHolder", "shid", "cid"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(Table);
        Table.getColumnModel().getColumn(1).setPreferredWidth(400);
        Table.getColumnModel().getColumn(2).setPreferredWidth(100);
        Table.getColumnModel().getColumn(3).setPreferredWidth(300);

        jLabel3.setText("Charges:");

        lblcaption.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcaption.setText("Voucher/OR No.");

        txtor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

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

        cmdadd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/employer.png"))); // NOI18N
        cmdadd.setMnemonic('P');
        cmdadd.setText("Process");
        cmdadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdaddActionPerformed(evt);
            }
        });

        jLabel5.setText("Consumer:");

        cmdadd1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmdadd1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
        cmdadd1.setMnemonic('P');
        cmdadd1.setText("Reset");
        cmdadd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdadd1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("TOTAL");

        lblamount.setBackground(new java.awt.Color(0, 102, 0));
        lblamount.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblamount.setForeground(new java.awt.Color(255, 255, 255));
        lblamount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblamount.setText("0.00");
        lblamount.setOpaque(true);

        txtdate.setDateFormatString("yyyy/MM/dd ");
        txtdate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N

        jLabel8.setText("Voucher/OR Date:");

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(lblcaption, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cmdadd, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdadd1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtor, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtconsumer, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblamount, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtenym, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(ComboTransType, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 836, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(230, 230, 230))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ComboTransType, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtconsumer, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(lblamount, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(AddButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtenym)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcaption))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdadd)
                    .addComponent(cmdadd1))
                .addGap(79, 79, 79))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1105, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboTransTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboTransTypeActionPerformed
        try {
            ComboBoxItem item = (ComboBoxItem) ComboTransType.getSelectedItem();
            ComboBoxId = item.getId();
            PopulateDataTransCharges();
            CalculateTotalPayments();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_ComboTransTypeActionPerformed

    private void AddButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton3ActionPerformed
        ShowFrmSelect();
    }//GEN-LAST:event_AddButton3ActionPerformed

    private void AddButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton2ActionPerformed
        int row = Table.getSelectedRow(); //get value of selected value

        //trap user incase if no row selected
        if (Table.isRowSelected(row) != true) {
            JOptionPane.showMessageDialog(this, "No record selected! Please select a record from the list!");
        } else {
            String id = Table.getValueAt(row, 0).toString();
//            boolean isSet = TCController.IsCOAIdSet(Integer.parseInt(id), ComboBoxId);
//            if (isSet == true) {
//                JOptionPane.showMessageDialog(null, "Cannot be remove account is set permanently!");
//            } else {
            int i = FunctionFactory.msgboxYesNo("Are you sure you want to delete this record");
            switch (i) {
                case 0:
                    ((DefaultTableModel) Table.getModel()).removeRow(row);
                    CalculateTotalPayments();
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
//            }
        }
    }//GEN-LAST:event_AddButton2ActionPerformed

    void CreateTrans() {
        if (ComboBoxId == 0) {
            JOptionPane.showMessageDialog(null, "Please select a type of transactions!");
        } else {
            if (txtor.getText().isEmpty() == true) {
                JOptionPane.showMessageDialog(null, "OR/Voucher No. is required!");
            } else {
                Controller.setElectricianId(eId);
                Controller.setTransTypeId(Short.valueOf(String.valueOf(ComboBoxId)));
                Controller.setTotalAmount(BigDecimal.valueOf(Double.valueOf(lblamount.getText().replace(",", ""))));
                Controller.setUserId(MainFrame.getUserID());
                Controller.setConsumer(txtconsumer.getText());
                Controller.setORNo(txtor.getText());

                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String seldate = dateFormat.format(txtdate.getDate());

                Controller.setORDate(Date.valueOf(seldate));
                Controller.Add();

                int ValidTransId = Controller.GetValidTransID();

                AddDetails(ValidTransId);
                Reset();
                JOptionPane.showMessageDialog(null, "Added Successfully!");
            }
        }
    }

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        if (ComboBoxId == 0) {
            JOptionPane.showMessageDialog(null, "Please select a type of transactions!");
        } else {
            ShowFrmAdd();
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void AddDetails(int TransId) {
        int rows = ((DefaultTableModel) Table.getModel()).getRowCount();
        for (int i = 0; i < rows; i++) {
            String COAId = (String) ((DefaultTableModel) Table.getModel()).getValueAt(i, 0).toString();
            String amount = (String) ((DefaultTableModel) Table.getModel()).getValueAt(i, 2);
            String ShareHolderId = (String) ((DefaultTableModel) Table.getModel()).getValueAt(i, 4);

            if (!"0.00".equals(amount)) {
                TDController.setTransId(TransId);
                TDController.setCOAId(Integer.parseInt(COAId));
                TDController.setShareHolderId(Integer.parseInt(ShareHolderId));
                TDController.setAmount(BigDecimal.valueOf(Double.valueOf(amount.replace(",", ""))));
                TDController.Add();
            }
        }
    }

    private void cmdaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdaddActionPerformed
        if (ComboBoxId == 2) {
            if (eId == 0) {
                JOptionPane.showMessageDialog(null, "Electrician is required on Labor Transaction!");
            } else {
                if (txtconsumer.getText().isEmpty() == true) {
                    JOptionPane.showMessageDialog(null, "Consumer Name is required on Labor Transaction!");
                } else {
                    CreateTrans();
                }
            }
        } else {
            CreateTrans();
        }
    }//GEN-LAST:event_cmdaddActionPerformed

    private void cmdadd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdadd1ActionPerformed
        Reset();
    }//GEN-LAST:event_cmdadd1ActionPerformed

    private void AddButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButton1ActionPerformed
        if (ComboBoxId == 0) {
            JOptionPane.showMessageDialog(null, "Please select a type of transactions!");
        } else {
            int col = 0; //set column value to 0
            int row = Table.getSelectedRow(); //get value of selected value

            //trap user incase if no row selected
            if (Table.isRowSelected(row) != true) {
                JOptionPane.showMessageDialog(this, "No record selected! Please select a record from the list!");
            } else {
                String id = Table.getValueAt(row, col).toString();
                String amnt = Table.getValueAt(row, 2).toString();
                //  EditCharges.id = Integer.parseInt(id);
                EditCharges.amount = amnt;
                EditCharges.r = row;
                ShowFrmEdit();
            }
        }
    }//GEN-LAST:event_AddButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton AddButton1;
    private javax.swing.JButton AddButton2;
    private javax.swing.JButton AddButton3;
    private javax.swing.JComboBox<String> ComboTransType;
    private javax.swing.JTable Table;
    private javax.swing.JButton cmdadd;
    private javax.swing.JButton cmdadd1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblamount;
    private javax.swing.JLabel lblcaption;
    private javax.swing.JTextField txtconsumer;
    private com.toedter.calendar.JDateChooser txtdate;
    private javax.swing.JTextField txtenym;
    private javax.swing.JTextField txtor;
    // End of variables declaration//GEN-END:variables
}
