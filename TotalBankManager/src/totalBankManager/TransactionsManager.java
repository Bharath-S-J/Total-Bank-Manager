package totalBankManager;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TransactionsManager extends javax.swing.JFrame {

    Connection con1, con2;
    PreparedStatement insert;
    ResultSet rs = null;

    int acbl;
    String phon;
    long ggacc;
    int id;
    boolean tt = false;
    int blockkey;

    public TransactionsManager() {
        initComponents();
        bkk.setText(DBManager.bn);
    }

    private void call(String number) {
        try {

            con1 = DBManager.conu();
            insert = con1.prepareStatement("select * from user WHERE number=?");
            insert.setString(1, number);
            rs = insert.executeQuery();

            if (rs.next()) {
                ggacc = rs.getLong("acnumber");
                blockkey = rs.getInt("block");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bkk = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ac1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        mb1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        am1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mb2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        ac2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        ud = new javax.swing.JTextField();
        am2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bkk.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        bkk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(bkk, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 40, 753, 52));

        jButton3.setBackground(new java.awt.Color(255, 153, 51));
        jButton3.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/exit small.png"))); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(659, 6, 100, -1));

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DEPOSITE MONEY");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel2.setText("ACCOUNT NUMBER");

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel3.setText("MOBILE NUMBER");

        ac1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 153, 51));
        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/category.png"))); // NOI18N
        jButton1.setText("DIPOSITE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        mb1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("OR");

        jLabel10.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel10.setText("ENTER THE AMMOUNT");

        am1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ac1)
                            .addComponent(mb1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(am1))
                        .addGap(0, 15, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ac1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(mb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(am1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 126, -1, 464));

        jPanel3.setBackground(new java.awt.Color(102, 255, 255));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("WITHDRAW MONEY");

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel6.setText("ACCOUNT NUMBER");

        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel7.setText("MOBILE NUMBER");

        mb2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jButton2.setBackground(new java.awt.Color(255, 153, 51));
        jButton2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/category.png"))); // NOI18N
        jButton2.setText("WITHDRAW");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("OR");

        ac2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel9.setText("USER ID");

        ud.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        am2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel11.setText("ENTER THE AMMOUNT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ac2)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mb2)
                    .addComponent(ud)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(am2)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(ac2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(am2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 126, -1, -1));

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        FirstLoadPage inandout = new FirstLoadPage();
        inandout.show();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String a = ac1.getText();
        String b = mb1.getText();
        String c = am1.getText();

        try {

            if ((a.isEmpty() && b.isEmpty()) || c.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "PLEASE ENTER THE REQUIRED DETAILS");
            } else {
                if (a.isEmpty()) {
                    try {
                        con1 = DBManager.conu();
                        String sql = " SELECT * FROM user WHERE number= ? ";
                        insert = con1.prepareCall(sql);
                        insert.setString(1, mb1.getText());
                        rs = insert.executeQuery();
                        if (rs.next()) {
                            acbl = rs.getInt("balance");
                            tt = true;
                            ggacc = rs.getLong("acnumber");
                            call(a);
                            try {

                                con2 = DBManager.conu();
                                insert = con2.prepareStatement("update user set balance= ?  WHERE number= ? ");
                                int temp = Integer.parseInt(am1.getText());
                                insert.setInt(1, temp + acbl);
                                insert.setString(2, mb1.getText());
                                insert.executeUpdate();
                            } catch (SQLException ex) {
                                Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "NO DATA FOUND YOUR TRANSACTION WAS CANCELLED");
                        }

                    } catch (HeadlessException | NumberFormatException | SQLException e) {

                    }
                } else {
                    try {
                        con1 = DBManager.conu();
                        String sql = " SELECT * FROM user WHERE acnumber= ? ";
                        insert = con1.prepareCall(sql);
                        long temp = Long.parseLong(ac1.getText());
                        insert.setLong(1, temp);
                        rs = insert.executeQuery();
                        if (rs.next()) {
                            acbl = rs.getInt("balance");
                            tt = true;
                            try {
                                ggacc = temp;

                                con2 = DBManager.conu();
                                insert = con2.prepareStatement("update user set balance= ?  WHERE acnumber= ? ");
                                int temp2 = Integer.parseInt(am1.getText());
                                insert.setInt(1, temp2 + acbl);
                                long temp3 = Long.parseLong(ac1.getText());
                                insert.setLong(2, temp3);
                                insert.executeUpdate();
                            } catch (SQLException ex) {
                                Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "NO DATA FOUND YOUR TRANSACTION WAS CANCELLED");
                        }

                    } catch (HeadlessException | NumberFormatException | SQLException e) {
                    }
                }

            }

            if (tt == true) {
                try {
                    con2 = DBManager.conu();
                    Date thisDate = new Date();
                    SimpleDateFormat dateform = new SimpleDateFormat("HH:mm MM/dd/Y");
                    String dd = dateform.format(thisDate);
                    String type;
                    type = "DEPOSIT";
                    int temp = Integer.parseInt(am1.getText());
                    insert = con2.prepareStatement("insert into history(date,acnumber,type,ammount)values(?,?,?,?)");
                    insert.setString(1, dd);
                    insert.setLong(2, ggacc);
                    insert.setString(3, type);
                    insert.setInt(4, temp);
                    insert.executeUpdate();
                    JOptionPane.showMessageDialog(rootPane, "DEPOSITED SUCCESSFULL THE BALANCE IS " + (acbl + Integer.parseInt(am1.getText())));

                    Date thisDate1 = new Date();
                    SimpleDateFormat dateform1 = new SimpleDateFormat("dd-MM-Y");
                    String dd1 = dateform1.format(thisDate1);
                    DBManager obj = new DBManager();
                    obj.dip(temp, dd1);

                } catch (SQLException ex) {
                    Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            ac1.setText("");
            mb1.setText("");
            am1.setText("");
            tt = false;
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "CHECK THE AMOUNT ENTERED");
            ac2.setText("");
            mb2.setText("");
            am2.setText("");
            ud.setText("");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int remaining = 0;
        String a = ac2.getText();
        String b = mb2.getText();
        String c = am2.getText();
        String d = ud.getText();
        String acc = null;
        try {
            int temp = Integer.parseInt(am2.getText());
            if ((a.isEmpty() && b.isEmpty()) || c.isEmpty() || d.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "PLEASE ENTER THE REQUIRED DETAILS");
            } else {
                if (a.isEmpty()) {
                    try {
                        con1 = DBManager.conu();
                        String sql = " SELECT * FROM user WHERE number= ? AND userid=? ";
                        insert = con1.prepareCall(sql);
                        insert.setString(1, mb2.getText());
                        insert.setString(2, ud.getText());
                        rs = insert.executeQuery();
                        if (rs.next()) {
                            acbl = rs.getInt("balance");
                            blockkey = rs.getInt("block");
                            ggacc = rs.getLong("acnumber");
                            acc = String.valueOf(ggacc);

                            remaining = rs.getInt("remainammount");
                            if (blockkey == 1) {
                                JOptionPane.showMessageDialog(rootPane, "TRANSACTIONS HAVE BEEN BLOCKED BY THE CUSTOMER");
                            } else {

                                if (acbl - temp < 0) {
                                    JOptionPane.showMessageDialog(rootPane, "INSUFFICIANT BALANCE AVAILABLE IS " + (acbl));
                                } else {

                                    if (remaining - temp < 0) {
                                        JOptionPane.showMessageDialog(rootPane, "YOUR DAILY LIMIT HAS BEEN EXCEEDED");
                                    } else {
                                        call(mb2.getText());

                                        tt = true;
                                        try {

                                            con2 = DBManager.conu();
                                            insert = con2.prepareStatement("update user set balance= ?,remainammount= ? WHERE number=? AND userid= ? ");

                                            insert.setInt(1, acbl - temp);
                                            insert.setInt(2, remaining - temp);
                                            insert.setString(3, mb2.getText());
                                            insert.setString(4, ud.getText());
                                            insert.executeUpdate();
                                        } catch (SQLException ex) {
                                            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }
                                }
                            }

                        } else {
                            JOptionPane.showMessageDialog(rootPane, "NO DATA FOUND YOUR TRANSACTION WAS CANCELLED");
                        }

                    } catch (HeadlessException | SQLException e) {

                    }
                } else {
                    try {
                        con1 = DBManager.conu();
                        String sql = " SELECT * FROM user WHERE acnumber= ? AND userid=? ";
                        insert = con1.prepareCall(sql);
                        insert.setString(2, ud.getText());
                        insert.setString(1, a);
                        rs = insert.executeQuery();
                        if (rs.next()) {
                            acbl = rs.getInt("balance");
                            blockkey = rs.getInt("block");
                            remaining = rs.getInt("remainammount");
                            acc = rs.getString("acnumber");
                            if (blockkey == 1) {
                                JOptionPane.showMessageDialog(rootPane, "TRANSACTIONS HAVE BEEN BLOCKED BY THE CUSTOMER");
                            } else {
                                if (acbl - temp < 0) {
                                    JOptionPane.showMessageDialog(rootPane, "INSUFFICIANT BALANCE AVAILABLE IS " + acbl);
                                } else {
                                    if (remaining - temp < 0) {
                                        JOptionPane.showMessageDialog(rootPane, "YOUR DAILY LIMIT HAS BEEN EXCEEDED");
                                    } else {

                                        try {
                                            tt = true;
                                            con2 = DBManager.conu();
                                            insert = con2.prepareStatement("update user set balance= ?,remainammount= ? WHERE acnumber=? AND userid=?");
                                            insert.setInt(1, acbl - temp);
                                            long temp3 = Long.parseLong(ac2.getText());
                                            insert.setInt(2, remaining - temp);
                                            insert.setLong(3, temp3);
                                            insert.setString(4, ud.getText());
                                            insert.executeUpdate();
                                        } catch (SQLException ex) {
                                            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
                                        }
                                    }
                                }
                            }
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "NO DATA FOUND YOUR TRANSACTION WAS CANCELLED");
                        }

                    } catch (HeadlessException | NumberFormatException | SQLException e) {

                    }
                }

            }

            if (tt == true) {
                try {
                    con2 = DBManager.conu();
                    System.out.println("edfyug");
                    Date thisDate = new Date();
                    SimpleDateFormat dateform = new SimpleDateFormat("HH:mm MM/dd/Y");
                    String dd = dateform.format(thisDate);
                    String type;
                    type = "WITHDRAWAL";
                    int temp2 = Integer.parseInt(am2.getText());
                    insert = con2.prepareStatement("insert into history(date,acnumber,type,ammount)values(?,?,?,?)");
                    insert.setString(1, dd);
                    insert.setString(2, acc);
                    insert.setString(3, type);
                    insert.setInt(4, temp2);
                    insert.executeUpdate();

                    Date thisDate1 = new Date();
                    SimpleDateFormat dateform1 = new SimpleDateFormat("dd-MM-Y");
                    String dd1 = dateform1.format(thisDate1);
                    DBManager obj = new DBManager();
                    obj.with(temp, dd1);
                } catch (SQLException ex) {
                    Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(rootPane, "WITHDRAW SUCCESSFULL THE BALANCE IS " + (acbl - temp));

                tt = false;
            }
            ac1.setText("");

            ac2.setText("");
            mb2.setText("");
            am2.setText("");
            ud.setText("");

        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "CHECK THE AMOUNT ENTERED");
            ac2.setText("");
            mb2.setText("");
            am2.setText("");
            ud.setText("");
        }

    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ac1;
    private javax.swing.JTextField ac2;
    private javax.swing.JTextField am1;
    private javax.swing.JTextField am2;
    private javax.swing.JLabel bkk;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField mb1;
    private javax.swing.JTextField mb2;
    private javax.swing.JTextField ud;
    // End of variables declaration//GEN-END:variables
}
