package totalBankManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UserDataManagerForSuperAdmin extends javax.swing.JFrame {

    Connection con;
    PreparedStatement insert;
    ResultSet rs = null;

    String gname, options;
    long ggacc;
    int ammount1, ammount2;
    String superadminname1;

    public UserDataManagerForSuperAdmin(String na, long nu, String superadminname) {
        initComponents();
        gname = na;
        ggacc = nu;
        superadminname1 = superadminname;
        jLabel2.setText("Editing the details of customer having account number " + ggacc);
        call();
    }

    private void call() {
        String filename;

        try {
            con = DBManager.conu();
            String sql = " SELECT * FROM user WHERE acnumber=? AND name=? ";
            insert = con.prepareCall(sql);
            insert.setLong(1, ggacc);
            insert.setString(2, gname);

            rs = insert.executeQuery();

            if (rs.next()) {
                mob.setText(rs.getString("number"));
                mail.setText(rs.getString("email"));
                add.setText(rs.getString("address"));
                ammount1 = rs.getInt("balance");
                String bbb1 = String.valueOf(rs.getLong("balance"));
                bbb.setText(bbb1);
            } else {

            }

        } catch (SQLException e) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        add = new javax.swing.JTextArea();
        mail = new javax.swing.JTextField();
        mob = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bbb = new javax.swing.JLabel();
        option = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        getam = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add.setColumns(20);
        add.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        add.setRows(5);
        jScrollPane1.setViewportView(add);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 261, 230, 153));

        mail.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailActionPerformed(evt);
            }
        });
        getContentPane().add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 180, 236, -1));

        mob.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        getContentPane().add(mob, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 123, 236, -1));

        jLabel24.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel24.setText("MOBILE NUMBER");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 123, 160, -1));

        jLabel28.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel28.setText("EMAIL");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 183, 160, -1));

        jLabel31.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel31.setText("ADDRESS");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 261, 160, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("AVAILABLE ACCOUNT BALANCE ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 126, 425, -1));

        bbb.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        bbb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(bbb, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 169, 407, 25));

        option.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        option.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "WITHDRAWAL CHEQUE", "DEPOSIT CHEQUE" }));
        option.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionActionPerformed(evt);
            }
        });
        getContentPane().add(option, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 243, 407, 35));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENTER THE AMMOUNT FOR TRANSACTION");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 296, 407, 28));

        getam.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        getContentPane().add(getam, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 365, 407, -1));

        jButton3.setBackground(new java.awt.Color(255, 102, 255));
        jButton3.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/place order.png"))); // NOI18N
        jButton3.setText("PROCEED TRANSACTION");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(668, 455, 407, -1));

        jButton2.setBackground(new java.awt.Color(255, 102, 255));
        jButton2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/save.png"))); // NOI18N
        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 455, 230, -1));

        jButton1.setBackground(new java.awt.Color(255, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/exit small.png"))); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(938, 6, 137, -1));

        jButton4.setBackground(new java.awt.Color(255, 102, 255));
        jButton4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/delete.png"))); // NOI18N
        jButton4.setText("DELETE ACCOUNT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 516, 230, -1));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 61, 545, 44));

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionActionPerformed

    }//GEN-LAST:event_optionActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (getam.getText() == null) {
            JOptionPane.showMessageDialog(this, "PLEASE ENTER THE AMMOUNT FIRST");

        } else {
            int balanceupdater = 0;
            int temp = Integer.parseInt(getam.getText());
            String trans = option.getSelectedItem().toString();
            if (trans.equalsIgnoreCase("WITHDRAWAL CHEQUE")) {
                ammount2 = Integer.parseInt(getam.getText());
                balanceupdater = ammount1 - ammount2;

            } else {
                balanceupdater = ammount1 + temp;
            }
            if (balanceupdater < 0) {
                JOptionPane.showMessageDialog(this, "INSUFFICIANT BALANCE");
            } else {

                try {

                    con = DBManager.conu();
                    insert = con.prepareStatement("update user set balance= ?  WHERE acnumber=? AND name=?");

                    insert.setInt(1, balanceupdater);

                    insert.setLong(2, ggacc);
                    insert.setString(3, gname);
                    insert.executeUpdate();

                } catch (SQLException ex) {
                    Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (trans.equalsIgnoreCase("WITHDRAWAL CHEQUE")) {
                    JOptionPane.showMessageDialog(this, "WITHDRAWAL CHEQUE SUCSESSFULL");
                } else {
                    JOptionPane.showMessageDialog(this, "DEPOSIT CHEQUE SUCSESSFULL");
                }

                ammount1 = balanceupdater;
                bbb.setText(String.valueOf(ammount1));

                try {
                    con = DBManager.conu();

                    Date thisDate = new Date();
                    SimpleDateFormat dateform = new SimpleDateFormat("HH:mm MM/dd/Y");
                    String dd = dateform.format(thisDate);
                    String type;
                    if (trans.equalsIgnoreCase("WITHDRAWAL CHEQUE")) {
                        type = "WITHDRAWAL";
                    } else {
                        type = "DEPOSIT";
                    }
                    insert = con.prepareStatement("insert into history(date,acnumber,type,ammount)values(?,?,?,?)");
                    insert.setString(1, dd);
                    insert.setLong(2, ggacc);
                    insert.setString(3, type);
                    insert.setInt(4, temp);
                    insert.executeUpdate();

                    DBManager obj = new DBManager();
                    Date thisDatee = new Date();
                    SimpleDateFormat dateForm = new SimpleDateFormat("dd-MM-Y");
                    String date = dateForm.format(thisDatee);
                    if ("WITHDRAWAL".equals(type)) {
                        obj.with(temp, date);
                    } else {
                        obj.dip(temp, date);
                    }
                    if ("WITHDRAWAL".equals(type)) {
                        obj.with(temp, dd);
                    } else {
                        obj.dip(temp, dd);
                    }

                } catch (SQLException ex) {
                    Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
        getam.setText("");

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String number = mob.getText();
        String em = mail.getText();
        String addr = add.getText();

        try {

            con = DBManager.conu();
            insert = con.prepareStatement("update user set number= ? ,email=? ,address=? WHERE acnumber=? AND name=?");

            Random uid = new Random();

            insert.setString(1, number);
            insert.setString(2, em);
            insert.setLong(4, ggacc);
            insert.setString(5, gname);

            insert.setString(3, addr);
            insert.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this, "DETAILS UPDATED SUCESSFULLY");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SuperAdminDashboard edit = new SuperAdminDashboard(7, superadminname1);
        edit.show();
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailActionPerformed

    }//GEN-LAST:event_mailActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            int dialogResult = JOptionPane.showConfirmDialog(null, "do you want to delet", "warning", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                con = DBManager.conu();
                insert = con.prepareStatement("delete from user where acnumber=? ");
                insert.setLong(1, ggacc);
                insert.executeUpdate();

                JOptionPane.showMessageDialog(this, "BANK ACCOUNT DELETED");

                SuperAdminDashboard edit = new SuperAdminDashboard(2, superadminname1);
                edit.show();
                dispose();
            }

        } catch (SQLException ex) {
            Logger.getLogger(SuperAdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea add;
    private javax.swing.JLabel bbb;
    private javax.swing.JTextField getam;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField mob;
    private javax.swing.JComboBox<String> option;
    // End of variables declaration//GEN-END:variables
}
