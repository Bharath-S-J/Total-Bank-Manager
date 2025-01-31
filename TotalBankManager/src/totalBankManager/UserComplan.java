package totalBankManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UserComplan extends javax.swing.JFrame {

    String pass1, number1;

    public UserComplan(String phon, String pass) {

        Connection con;
        PreparedStatement insert;
        ResultSet rs;
        initComponents();
        pass1 = pass;
        number1 = phon;
        jLabel1.setText(DBManager.bn);
        jTextArea2.setText(DBManager.ac);
        try {

            con = DBManager.conu();
            insert = con.prepareStatement("select * from bank");

            rs = insert.executeQuery();

            if (rs.next()) {
                link2.setText(rs.getString("link2"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con = DBManager.conu();
            String sql = " SELECT * FROM user WHERE number=? AND password=? ";
            insert = con.prepareCall(sql);
            insert.setString(1, number1);
            insert.setString(2, pass1);

            rs = insert.executeQuery();
            if (rs.next()) {
                String res = rs.getString("responce");
                String cmp = rs.getString("complain");
                if (res != null) {
                    responce.setText(rs.getString("responce"));
                    comp.setText(cmp);

                }
            } else {

            }

        } catch (SQLException e) {

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        comp = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        link2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        responce = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 828, 45));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel2.setText("SUBMIT YOUR COMPLAIN OR REQUEST");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 188, 828, -1));

        comp.setColumns(20);
        comp.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        comp.setRows(5);
        jScrollPane1.setViewportView(comp);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 228, 828, 141));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel4.setText("RESPONCE WILL BE SHOWN BELLOW");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 463, 828, -1));

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/place order.png"))); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 419, 211, -1));

        back.setBackground(new java.awt.Color(102, 255, 102));
        back.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/exit small.png"))); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(633, 644, 201, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel3.setText("LINK TO UPLOAD REQUIRED DOQUMENTS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 380, 280, 26));

        link2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        getContentPane().add(link2, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 375, 532, 26));

        responce.setColumns(20);
        responce.setRows(5);
        jScrollPane2.setViewportView(responce);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 497, 840, 129));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel5.setText("ANNOUNCEMENT WILL BE SHOWN BELOW");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 62, 285, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane3.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 90, 828, -1));

        jPanel1.setBackground(new java.awt.Color(255, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 850, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        UserDashboard complain = new UserDashboard(number1, pass1);
        complain.show();
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection con;
        PreparedStatement insert;

        Date thisDate = new Date();
        SimpleDateFormat dateForm = new SimpleDateFormat("dd-MM-Y");
        String datee = dateForm.format(thisDate);
        String com = comp.getText();
        try {
            String res = null;
            con = DBManager.conu();
            insert = con.prepareStatement("update user set complain= ? ,responce= ? ,compdate=? where number=? AND password=?");
            insert.setString(1, com);
            insert.setString(2, res);
            insert.setString(3, datee);
            insert.setString(4, number1);
            insert.setString(5, pass1);

            insert.executeUpdate();

            DBManager obj = new DBManager();
            obj.comp11(1, datee);

            JOptionPane.showMessageDialog(this, "YOUR REQUEST SUBMITED SUCESSFULLY ");

        } catch (SQLException ex) {
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }

        UserDashboard complain = new UserDashboard(number1, pass1);
        complain.show();
        dispose();


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextArea comp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel link2;
    private javax.swing.JTextArea responce;
    // End of variables declaration//GEN-END:variables
}
