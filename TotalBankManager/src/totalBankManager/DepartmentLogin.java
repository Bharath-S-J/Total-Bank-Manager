package totalBankManager;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DepartmentLogin extends javax.swing.JFrame {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public DepartmentLogin() {
        initComponents();
        con = DBManager.conu();
        uname.requestFocus();
        bankdis.setText(DBManager.bn);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pword = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        bankdis = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(394, 397));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DEPARTMENT LOGIN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 134, 209, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("USERNAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 242, 482, -1));

        uname.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        uname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 282, 476, -1));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PASSWORD");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 347, 476, -1));

        pword.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        pword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(pword, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 387, 476, -1));

        login.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/login.png"))); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 513, 111, -1));

        bankdis.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        bankdis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(bankdis, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 52, 482, 44));

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jButton2.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/exit small.png"))); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(395, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap(516, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed

        int check = 1;
        String usern = uname.getText();
        String pass = pword.getText();

        if (1 == 1) {
            try {
                String sql = " SELECT * FROM bank WHERE sadmin=? AND spassword=? ";
                pst = con.prepareCall(sql);
                pst.setString(1, usern);
                pst.setString(2, pass);

                rs = pst.executeQuery();

                if (rs.next()) {
                    JOptionPane.showMessageDialog(rootPane, "LOGIN SUCCESSFULL");
                    SuperAdminDashboard Dlogin = new SuperAdminDashboard(rs.getString("name"));
                    Dlogin.show();
                    dispose();
                    check = 2;
                }

            } catch (HeadlessException | SQLException e) {

            }

        }
        if (check == 1) {
            try {
                String sql = " SELECT * FROM dlogin WHERE userid=? AND password=? ";
                pst = con.prepareCall(sql);
                pst.setString(1, usern);
                pst.setString(2, pass);

                rs = pst.executeQuery();

                if (rs.next()) {
                    JOptionPane.showMessageDialog(rootPane, "LOGIN SUCCESSFULL");
                    Employee Dlogin = new Employee(rs.getString("name"));
                    Dlogin.show();
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "LOGIN FAILED");
                    uname.setText("");
                    pword.setText("");
                    uname.requestFocus();
                }

            } catch (HeadlessException | SQLException e) {

            }

        }

    }//GEN-LAST:event_loginActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FirstLoadPage Dlogin = new FirstLoadPage();
        Dlogin.show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bankdis;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField pword;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
