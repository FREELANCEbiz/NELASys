/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.view.transaction.manage;

import app.controller.TransactionController;
import app.global.FunctionFactory;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;

/**
 *
 * @author Engkoi Zidac
 */
public class ManageTrans extends javax.swing.JInternalFrame {

    TransactionController Controller = new TransactionController();
    static String nowDate2 = FunctionFactory.getSystemNowDateTimeString();
    public static ViewDetails frmDetails;
    public static EditElectrician frmEditElectrician;
    public static EditORDate frmEditORDate;
    public static EditORNo frmEditORNo;
    public static EditConsumer frmEditConsumer;
    public static CancelTrans frmCancelTrans;
    public static RepostTrans frmRepostTrans;

    public static HistoryLogs frmHistoryLogs;

    public ManageTrans() {
        initComponents();

        TableColumn idClmn = Table.getColumn("id");
        idClmn.setMaxWidth(0);
        idClmn.setMinWidth(0);
        idClmn.setPreferredWidth(0);

        SetDates();
        PopulateDataTransCharges();
        HideFilter();

        cmdedit.addActionListener(EditPopupMenuListener);
        cmdview.addActionListener(ViewPopupMenuListener);
    }

    ActionListener EditPopupMenuListener = new ActionListener() {
        public void actionPerformed(ActionEvent ae) {

            if (Table.isRowSelected(Table.getSelectedRow()) != true) {
                JOptionPane.showMessageDialog(null, "No record selected! Please select a record from the list!");
            } else {
                ShowEditPopup(ae);
            }
        }
    };

    private void ShowEditPopup(ActionEvent ae) {
        Component b = (Component) ae.getSource();
        Point p = b.getLocationOnScreen();
        EditPopup.show(this, 0, 0);
        EditPopup.setLocation(p.x, p.y + b.getHeight());
    }

    ActionListener ViewPopupMenuListener = new ActionListener() {
        public void actionPerformed(ActionEvent ae) {

            if (Table.isRowSelected(Table.getSelectedRow()) != true) {
                JOptionPane.showMessageDialog(null, "No record selected! Please select a record from the list!");
            } else {
                ShowViewPopup(ae);
                
            }
        }
    };

    private void ShowViewPopup(ActionEvent ae) {
        Component b = (Component) ae.getSource();
        Point p = b.getLocationOnScreen();
        ViewPopup.show(this, 0, 0);
        ViewPopup.setLocation(p.x, p.y + b.getHeight());
    }

    public void ShowFrmRepostTrans() {
        frmRepostTrans = new RepostTrans(this, true);
        frmRepostTrans.setVisible(true);
    }

    public void ShowFrmCancelTrans() {
        frmCancelTrans = new CancelTrans(this, true);
        frmCancelTrans.setVisible(true);
    }

    public void ShowFrmHistoryLogs() {
        frmHistoryLogs = new HistoryLogs(this, true);
        frmHistoryLogs.setVisible(true);
    }

    public void ShowFrmDetails() {
        frmDetails = new ViewDetails(this, true);
        frmDetails.setVisible(true);
    }

    public void ShowFrmEditORDate() {
        frmEditORDate = new EditORDate(this, true);
        frmEditORDate.setVisible(true);
    }

    public void ShowFrmEditORNo() {
        frmEditORNo = new EditORNo(this, true);
        frmEditORNo.setVisible(true);
    }

    public void ShowFrmEditElectrician() {
        frmEditElectrician = new EditElectrician(this, true);
        frmEditElectrician.setVisible(true);
    }

    public void ShowFrmEditConsumer() {
        frmEditConsumer = new EditConsumer(this, true);
        frmEditConsumer.setVisible(true);
    }

    void SetDates() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date theDate = null;
        try {
            theDate = sdf.parse(nowDate2);
        } catch (ParseException e) {
        }
        //txtdate.setDateFormatString(nowDate);
        txtfrom.setDate(theDate);
        txtto.setDate(theDate);
        //  txtend.setDate(theDate);
    }

    void HideFilter() {
        lbl1.setVisible(false);
        lbl2.setVisible(false);
        txtfrom.setVisible(false);
        txtto.setVisible(false);
    }

    void ShowFilter() {
        lbl1.setVisible(true);
        lbl2.setVisible(true);
        txtfrom.setVisible(true);
        txtto.setVisible(true);
    }

    public void PopulateDataTransCharges() {
        boolean isFiltered = false;

        if (opt1.isSelected() == true) {
            isFiltered = false;
        } else if (opt2.isSelected() == true) {
            isFiltered = true;
        }

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String datefrom = dateFormat.format(txtfrom.getDate());
        String dateto = dateFormat.format(txtto.getDate());

        Controller.PopulateTableData(Table, txtsearch.getText(), isFiltered, datefrom, dateto);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        EditPopup = new javax.swing.JPopupMenu();
        mnuUpdateElectrician = new javax.swing.JMenuItem();
        mnuUpdateORDate = new javax.swing.JMenuItem();
        mnuUpdateORNoVNo = new javax.swing.JMenuItem();
        mnuUpdateConsumer = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuCancelTrans = new javax.swing.JMenuItem();
        mnuRepostTrans = new javax.swing.JMenuItem();
        ViewPopup = new javax.swing.JPopupMenu();
        mnuViewCharges = new javax.swing.JMenuItem();
        mnuViewHistory = new javax.swing.JMenuItem();
        jScrollPane3 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        txtsearch = new org.jdesktop.swingx.JXSearchField();
        opt1 = new javax.swing.JRadioButton();
        opt2 = new javax.swing.JRadioButton();
        txtfrom = new com.toedter.calendar.JDateChooser();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        txtto = new com.toedter.calendar.JDateChooser();
        cmdedit = new javax.swing.JButton();
        cmdview = new javax.swing.JButton();

        EditPopup.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                EditPopupFocusLost(evt);
            }
        });

        mnuUpdateElectrician.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ua.png"))); // NOI18N
        mnuUpdateElectrician.setText("Edit Electrician");
        mnuUpdateElectrician.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUpdateElectricianActionPerformed(evt);
            }
        });
        EditPopup.add(mnuUpdateElectrician);

        mnuUpdateORDate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/payperiod.png"))); // NOI18N
        mnuUpdateORDate.setText("Edit Voucher/OR Date");
        mnuUpdateORDate.setToolTipText("");
        mnuUpdateORDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUpdateORDateActionPerformed(evt);
            }
        });
        EditPopup.add(mnuUpdateORDate);

        mnuUpdateORNoVNo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/services.png"))); // NOI18N
        mnuUpdateORNoVNo.setText("Edit OR Number/Voucher No.");
        mnuUpdateORNoVNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUpdateORNoVNoActionPerformed(evt);
            }
        });
        EditPopup.add(mnuUpdateORNoVNo);

        mnuUpdateConsumer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/users.png"))); // NOI18N
        mnuUpdateConsumer.setText("Edit Consumer");
        mnuUpdateConsumer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuUpdateConsumerActionPerformed(evt);
            }
        });
        EditPopup.add(mnuUpdateConsumer);
        EditPopup.add(jSeparator1);

        mnuCancelTrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trash.png"))); // NOI18N
        mnuCancelTrans.setText("Cancel Transaction");
        mnuCancelTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCancelTransActionPerformed(evt);
            }
        });
        EditPopup.add(mnuCancelTrans);

        mnuRepostTrans.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/moveup.png"))); // NOI18N
        mnuRepostTrans.setText("Re-post Transaction");
        mnuRepostTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuRepostTransActionPerformed(evt);
            }
        });
        EditPopup.add(mnuRepostTrans);

        ViewPopup.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ViewPopupFocusLost(evt);
            }
        });

        mnuViewCharges.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ledger4.png"))); // NOI18N
        mnuViewCharges.setText("Charges Management");
        mnuViewCharges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuViewChargesActionPerformed(evt);
            }
        });
        ViewPopup.add(mnuViewCharges);

        mnuViewHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logs.png"))); // NOI18N
        mnuViewHistory.setText("View History Logs");
        mnuViewHistory.setToolTipText("");
        mnuViewHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuViewHistoryActionPerformed(evt);
            }
        });
        ViewPopup.add(mnuViewHistory);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Transaction Management");
        setToolTipText("");

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Date", "TransType", "ORNo/VoucherNo", "Electrician", "Consumer", "Total Amount", "TransDate", "CreatedBy", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Table.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(Table);
        Table.getColumnModel().getColumn(1).setPreferredWidth(100);
        Table.getColumnModel().getColumn(2).setPreferredWidth(130);
        Table.getColumnModel().getColumn(3).setPreferredWidth(150);
        Table.getColumnModel().getColumn(4).setPreferredWidth(300);
        Table.getColumnModel().getColumn(5).setPreferredWidth(300);
        Table.getColumnModel().getColumn(6).setPreferredWidth(100);
        Table.getColumnModel().getColumn(7).setPreferredWidth(100);
        Table.getColumnModel().getColumn(8).setPreferredWidth(150);
        Table.getColumnModel().getColumn(9).setPreferredWidth(170);

        txtsearch.setLayoutStyle(org.jdesktop.swingx.JXSearchField.LayoutStyle.MAC);
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });

        buttonGroup1.add(opt1);
        opt1.setSelected(true);
        opt1.setText("All");
        opt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(opt2);
        opt2.setText("Date Filter");
        opt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt2ActionPerformed(evt);
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
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                txtfromCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtfromInputMethodTextChanged(evt);
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

        lbl1.setText("From:");

        lbl2.setText("To:");

        txtto.setDateFormatString("yyyy/MM/dd ");
        txtto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtto.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txttoPropertyChange(evt);
            }
        });

        cmdedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/edit.png"))); // NOI18N
        cmdedit.setMnemonic('R');
        cmdedit.setToolTipText("Edit transaction");
        cmdedit.setComponentPopupMenu(EditPopup);
        cmdedit.setFocusable(false);
        cmdedit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cmdedit.setIconTextGap(8);
        cmdedit.setVerifyInputWhenFocusTarget(false);
        cmdedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdeditActionPerformed(evt);
            }
        });

        cmdview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        cmdview.setMnemonic('R');
        cmdview.setToolTipText("View details");
        cmdview.setFocusable(false);
        cmdview.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cmdview.setIconTextGap(8);
        cmdview.setVerifyInputWhenFocusTarget(false);
        cmdview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdviewActionPerformed(evt);
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
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(opt1)
                        .addGap(18, 18, 18)
                        .addComponent(opt2)
                        .addGap(29, 29, 29)
                        .addComponent(lbl1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtto, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdedit, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdview, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(opt1)
                    .addComponent(opt2)
                    .addComponent(lbl1)
                    .addComponent(txtfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl2)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmdedit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdview, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt1ActionPerformed
        if (opt1.isSelected() == true) {
            HideFilter();
        } else if (opt2.isSelected() == true) {
            ShowFilter();
        }
        SetDates();
        PopulateDataTransCharges();
    }//GEN-LAST:event_opt1ActionPerformed

    private void opt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt2ActionPerformed
        if (opt1.isSelected() == true) {
            HideFilter();
        } else if (opt2.isSelected() == true) {
            ShowFilter();
        }
        PopulateDataTransCharges();
    }//GEN-LAST:event_opt2ActionPerformed

    private void txtfromInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtfromInputMethodTextChanged

    }//GEN-LAST:event_txtfromInputMethodTextChanged

    private void txtfromVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_txtfromVetoableChange

    }//GEN-LAST:event_txtfromVetoableChange

    private void txtfromPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtfromPropertyChange
        try {
            PopulateDataTransCharges();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_txtfromPropertyChange

    private void txtfromMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtfromMouseReleased

    }//GEN-LAST:event_txtfromMouseReleased

    private void txtfromCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtfromCaretPositionChanged

    }//GEN-LAST:event_txtfromCaretPositionChanged

    private void txtfromHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_txtfromHierarchyChanged

    }//GEN-LAST:event_txtfromHierarchyChanged

    private void txttoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txttoPropertyChange
        try {
            PopulateDataTransCharges();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_txttoPropertyChange

    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        PopulateDataTransCharges();
    }//GEN-LAST:event_txtsearchActionPerformed

    private void cmdeditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdeditActionPerformed


    }//GEN-LAST:event_cmdeditActionPerformed

    private void cmdviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdviewActionPerformed

    }//GEN-LAST:event_cmdviewActionPerformed

    private void EditPopupFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EditPopupFocusLost

    }//GEN-LAST:event_EditPopupFocusLost

    private void ViewPopupFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ViewPopupFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewPopupFocusLost

    private void mnuViewChargesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuViewChargesActionPerformed
        int col = 0; //set column value to 0
        int row = Table.getSelectedRow(); //get value of selected value

        String id = Table.getValueAt(row, col).toString();

        ViewDetails.id = Integer.parseInt(id);
        ShowFrmDetails();
    }//GEN-LAST:event_mnuViewChargesActionPerformed

    private void mnuUpdateElectricianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUpdateElectricianActionPerformed
        int col = 0; //set column value to 0
        int row = Table.getSelectedRow(); //get value of selected value

        String id = Table.getValueAt(row, col).toString();
        String nym = Table.getValueAt(row, 4).toString();

        EditElectrician.id = Integer.parseInt(id);
        Controller.setTransId(Integer.parseInt(id));
        Controller.GetData();
        EditElectrician.EId = Controller.getElectricianId();
        EditElectrician.nym = nym;
        ShowFrmEditElectrician();
    }//GEN-LAST:event_mnuUpdateElectricianActionPerformed

    private void mnuUpdateORDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUpdateORDateActionPerformed
        int col = 0; //set column value to 0
        int row = Table.getSelectedRow(); //get value of selected value

        String id = Table.getValueAt(row, col).toString();
        String cdate = Table.getValueAt(row, 1).toString();

        EditORDate.id = Integer.parseInt(id);

        EditORDate.currentdate = cdate;
        ShowFrmEditORDate();
    }//GEN-LAST:event_mnuUpdateORDateActionPerformed

    private void mnuUpdateORNoVNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUpdateORNoVNoActionPerformed
        int col = 0; //set column value to 0
        int row = Table.getSelectedRow(); //get value of selected value

        String id = Table.getValueAt(row, col).toString();
        String orno = Table.getValueAt(row, 3).toString();

        EditORNo.id = Integer.parseInt(id);

        EditORNo.ref = orno;
        ShowFrmEditORNo();
    }//GEN-LAST:event_mnuUpdateORNoVNoActionPerformed

    private void mnuViewHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuViewHistoryActionPerformed
        int col = 0; //set column value to 0
        int row = Table.getSelectedRow(); //get value of selected value

        String id = Table.getValueAt(row, col).toString();

        HistoryLogs.id = Integer.parseInt(id);
        ShowFrmHistoryLogs();
    }//GEN-LAST:event_mnuViewHistoryActionPerformed

    private void mnuUpdateConsumerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuUpdateConsumerActionPerformed
        int col = 0; //set column value to 0
        int row = Table.getSelectedRow(); //get value of selected value

        String id = Table.getValueAt(row, col).toString();
        String nym = Table.getValueAt(row, 5).toString();

        EditConsumer.id = Integer.parseInt(id);
        EditConsumer.nym = nym;
        ShowFrmEditConsumer();
    }//GEN-LAST:event_mnuUpdateConsumerActionPerformed

    private void mnuCancelTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCancelTransActionPerformed
        int col = 0; //set column value to 0
        int row = Table.getSelectedRow(); //get value of selected value

        String id = Table.getValueAt(row, col).toString();

        Controller.setTransId(Integer.parseInt(id));
        Controller.GetData();

        if (Controller.getStatusId() == 2) {
            JOptionPane.showMessageDialog(null, "Transaction is already cancelled!");
        } else {
            CancelTrans.id = Integer.parseInt(id);
            ShowFrmCancelTrans();
        }
    }//GEN-LAST:event_mnuCancelTransActionPerformed

    private void mnuRepostTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuRepostTransActionPerformed
        int col = 0; //set column value to 0
        int row = Table.getSelectedRow(); //get value of selected value

        String id = Table.getValueAt(row, col).toString();

        if (Controller.getStatusId() == 4) {
            JOptionPane.showMessageDialog(null, "Transaction is not cancelled!");
        } else {
            RepostTrans.id = Integer.parseInt(id);
            ShowFrmRepostTrans();
        }
    }//GEN-LAST:event_mnuRepostTransActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu EditPopup;
    private javax.swing.JTable Table;
    private javax.swing.JPopupMenu ViewPopup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cmdedit;
    private javax.swing.JButton cmdview;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JMenuItem mnuCancelTrans;
    private javax.swing.JMenuItem mnuRepostTrans;
    private javax.swing.JMenuItem mnuUpdateConsumer;
    private javax.swing.JMenuItem mnuUpdateElectrician;
    private javax.swing.JMenuItem mnuUpdateORDate;
    private javax.swing.JMenuItem mnuUpdateORNoVNo;
    private javax.swing.JMenuItem mnuViewCharges;
    private javax.swing.JMenuItem mnuViewHistory;
    private javax.swing.JRadioButton opt1;
    private javax.swing.JRadioButton opt2;
    private com.toedter.calendar.JDateChooser txtfrom;
    private org.jdesktop.swingx.JXSearchField txtsearch;
    private com.toedter.calendar.JDateChooser txtto;
    // End of variables declaration//GEN-END:variables
}
