package totalBankManager;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FirstLoadPage extends javax.swing.JFrame {

    public FirstLoadPage() {
        initComponents();
        DBManager.temp();
        jLabel1.setText(DBManager.bn);
        DBManager.check();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        dipositeorwithdraw = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pnumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        departmentlogin = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        register = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(744, 599));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 51, 732, 48));

        dipositeorwithdraw.setBackground(new java.awt.Color(102, 153, 255));
        dipositeorwithdraw.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        dipositeorwithdraw.setForeground(new java.awt.Color(255, 255, 255));
        dipositeorwithdraw.setText("DIPOSIT / WITHDRAWAL");
        dipositeorwithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dipositeorwithdrawActionPerformed(evt);
            }
        });
        getContentPane().add(dipositeorwithdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 273, 252, -1));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/verify users.png"))); // NOI18N
        jLabel2.setText("LOGIN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 134, 90, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel3.setText("Phone Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 185, 107, -1));
        getContentPane().add(pnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 219, 197, -1));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 279, 83, -1));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 338, 197, -1));

        departmentlogin.setBackground(new java.awt.Color(0, 0, 204));
        departmentlogin.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        departmentlogin.setForeground(new java.awt.Color(255, 0, 51));
        departmentlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/login.png"))); // NOI18N
        departmentlogin.setText("Department Login");
        departmentlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                departmentloginMouseClicked(evt);
            }
        });
        getContentPane().add(departmentlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(569, 11, 169, -1));

        login.setBackground(new java.awt.Color(102, 204, 255));
        login.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/login.png"))); // NOI18N
        login.setText("login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 418, 100, 40));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 102));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/change Security Question.png"))); // NOI18N
        jLabel6.setText("forgot password");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 372, 150, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        register.setBackground(new java.awt.Color(102, 204, 255));
        register.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        register.setForeground(new java.awt.Color(255, 255, 255));
        register.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/new product.png"))); // NOI18N
        register.setText("No Account Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(539, Short.MAX_VALUE)
                .addComponent(register)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(419, Short.MAX_VALUE)
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void departmentloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departmentloginMouseClicked
        DepartmentLogin First = new DepartmentLogin();
        First.show();
        dispose();

    }//GEN-LAST:event_departmentloginMouseClicked

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        String pho = pnumber.getText();
        String pas = password.getText();

        Connection con;
        PreparedStatement pst;

        ResultSet rs;

        try {
            con = DBManager.conu();
            String sql = " SELECT * FROM user WHERE number=? AND password=? ";
            pst = con.prepareCall(sql);
            pst.setString(1, pho);
            pst.setString(2, pas);

            rs = pst.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(rootPane, "LOGIN SUCCESSFULL");
                String na = rs.getString("acnumber");
                String fathe = rs.getString("father");
                if (fathe == null || rs.getString("reason") != null) {
                    NewUsersDataFilling First = new NewUsersDataFilling(pho, pas);
                    First.show();
                    dispose();
                } else if (na == null && rs.getString("reason") == null) {

                    JOptionPane.showMessageDialog(rootPane, "YOUR ACCOUNT IS YET TO BE VERIFIED LOGIN AFTER 2-3 DAYS");
                    pnumber.setText("");
                    password.setText("");
                    pnumber.requestFocus();
                } else {
                    UserDashboard First = new UserDashboard(pho, pas);
                    First.show();
                    dispose();
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "LOGIN FAILED");
                pnumber.setText("");
                password.setText("");
                pnumber.requestFocus();
            }

        } catch (HeadlessException | SQLException e) {

        }

    }//GEN-LAST:event_loginActionPerformed

    private void dipositeorwithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dipositeorwithdrawActionPerformed
        TransactionsManager First = new TransactionsManager();
        First.show();
        dispose();
    }//GEN-LAST:event_dipositeorwithdrawActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        UserPasswordReset First = new UserPasswordReset();
        First.show();
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        UserRegistration First = new UserRegistration();
        First.show();
        dispose();
    }//GEN-LAST:event_registerActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new FirstLoadPage().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel departmentlogin;
    private javax.swing.JButton dipositeorwithdraw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField pnumber;
    private javax.swing.JButton register;
    // End of variables declaration//GEN-END:variables
}
