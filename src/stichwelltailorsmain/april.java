/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stichwelltailorsmain;
import java.awt.print.PrinterException;
import java.sql.DriverManager;

import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;


/**
 *
 * @author anike
 */
public class april extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement ps =  null;
    ResultSet res = null;

    /**
     * Creates new form april
     */
    public april() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        show_user();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        date_chooser = new com.toedter.calendar.JDateChooser();
        bill_no = new javax.swing.JTextField();
        party_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        date_chooser2 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        amount2 = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Date");

        bill_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bill_noActionPerformed(evt);
            }
        });

        party_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                party_nameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("BillNo.");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Party Name");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Amount");

        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Paid Date");

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Amount");

        amount2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amount2ActionPerformed(evt);
            }
        });

        add.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Date", "Bill No", "Party Name", "Amount", "Paid Date", "Amount Paid"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        back.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel7.setText("Search");

        print.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bill_no)
                            .addComponent(party_name)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(date_chooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(amount2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(search, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(date_chooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 646, Short.MAX_VALUE)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(search)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date_chooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bill_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(party_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amount))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(date_chooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amount2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
     public void filter(String query){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter("(?i)"+ query));
    }

    public ArrayList<User> userList(){
        ArrayList<User> usersList = new ArrayList<>();
        
        
            try {
            String sql = "select * from april";
            con=DriverManager.getConnection("jdbc:mysql://localhost/stichwelltailors","root","mypass");
            Statement st =  con.createStatement();
            res = st.executeQuery(sql);
         
            User user;
            while(res.next()){
                user = new User(res.getInt("id"),res.getString("date"),res.getInt("bill_no"),res.getString("partyname"), res.getInt("amount"),
                res.getString("paid_date"),res.getInt("amount_paid"));
                usersList.add(user);
            }
            
         
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, e);

        }
            return usersList;
    }
    
       public void show_user(){
        ArrayList<User> list = userList();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Object[] row = new Object[7];
        for(int i=0;i<list.size();i++){
            row[0]=list.get(i).getId();
            row[1]=list.get(i).getDate();
            row[2]=list.get(i).getBill_no();
            row[3]=list.get(i).getParty_name();
            row[4]=list.get(i).getAmount();
            row[5]=list.get(i).getPaid_date();
            row[6]=list.get(i).getAmount_remain();


            model.addRow(row);
        }
    }

    private void bill_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bill_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bill_noActionPerformed

    private void party_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_party_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_party_nameActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

    private void amount2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amount2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amount2ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "insert into april(date,bill_no,partyname,amount,paid_date,amount_paid)values(?,?,?,?,?,?)";
            con=DriverManager.getConnection("jdbc:mysql://localhost/stichwelltailors","root","mypass");
            ps = con.prepareStatement(sql);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(date_chooser.getDate());
            ps.setString(1,date);
            ps.setString(2,bill_no.getText());
            ps.setString(3,party_name.getText());
            ps.setString(4,amount.getText());
            String date2 = sdf.format(date_chooser2.getDate());
            ps.setString(5,date2);
            ps.setString(6,amount2.getText());
            ps.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0); //empty all the data
            show_user();
            JOptionPane.showMessageDialog(null, "inserted successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "sorry something is wrong please try again");

        }
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost/stichwelltailors","root","mypass");
            int row = jTable1.getSelectedRow();
            String value = (jTable1.getModel().getValueAt(row, 0).toString());

            String sql = "update april set date=?, bill_no=?, partyname=?, amount=?,paid_date=?,amount_paid=? where id="+value;
            ps = con.prepareStatement(sql);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date1 = sdf.format(date_chooser.getDate());
            ps.setString(1,date1);

            ps.setString(2,bill_no.getText());
            ps.setString(3,party_name.getText());
            ps.setString(4,amount.getText());
            String paid_date = sdf.format(date_chooser2.getDate());
            ps.setString(5,paid_date);
            ps.setString(6,amount2.getText());
            ps.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
            model.setRowCount(0); //empty all the data
            show_user();
            JOptionPane.showMessageDialog(null, "updated successfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        int opt = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete", "delete", JOptionPane.YES_NO_OPTION);
        if(opt==0){
            try {
                con=DriverManager.getConnection("jdbc:mysql://localhost/stichwelltailors","root","mypass");
                int row = jTable1.getSelectedRow();
                String value = (jTable1.getModel().getValueAt(row, 0).toString());
                String sql = "delete from april where id="+value;
                ps = con.prepareStatement(sql);
                ps.executeUpdate();
                DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
                model.setRowCount(0); //empty all the data
                show_user();
                JOptionPane.showMessageDialog(null, "deleted successfully");

            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);

            }
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        bill_no.setText("");
        party_name.setText("");
        amount.setText("");
        amount2.setText("");
        date_chooser.setCalendar(null);
        date_chooser2.setCalendar(null);
    }//GEN-LAST:event_resetActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        try{
            int srow = jTable1.getSelectedRow();
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(srow,1));
            date_chooser.setDate(date);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
        bill_no.setText(model.getValueAt(i,2).toString());
        party_name.setText(model.getValueAt(i, 3).toString());
        amount.setText(model.getValueAt(i, 4).toString());
        try{
            int srow2 = jTable1.getSelectedRow();
            Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(srow2,5));
            date_chooser2.setDate(date2);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
        amount2.setText(model.getValueAt(i, 6).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        // TODO add your handling code here:

        String query = search.getText();
        filter(query);
    }//GEN-LAST:event_searchKeyReleased

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new HomeFrame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Bill Invoice");
        MessageFormat footer = new MessageFormat("page");
        try {
            jTable1.print(JTable.PrintMode.FIT_WIDTH,header ,footer);
        } catch (PrinterException ex) {
            Logger.getLogger(febraury.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_printActionPerformed

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
            java.util.logging.Logger.getLogger(april.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(april.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(april.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(april.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new april().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField amount2;
    private javax.swing.JButton back;
    private javax.swing.JTextField bill_no;
    private com.toedter.calendar.JDateChooser date_chooser;
    private com.toedter.calendar.JDateChooser date_chooser2;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField party_name;
    private javax.swing.JButton print;
    private javax.swing.JButton reset;
    private javax.swing.JTextField search;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
