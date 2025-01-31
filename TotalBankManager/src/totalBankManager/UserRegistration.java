package totalBankManager;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class UserRegistration extends javax.swing.JFrame {

    String Checkotp;

    public UserRegistration() {
        initComponents();
        jLabel1.setText("Register To " + DBManager.bn);
    }

    public void OPTgen(String email) {
        Random r = new Random();
        int opt = r.nextInt(1000000);
        String OPT = String.valueOf(opt);
        Checkotp = OPT;
        String Subject = "CONFORMATION OF YOUR EMAIL ACCOUNT";
        String message = "Your OTP is : " + OPT + " Do Not Share OTP With Any One THIS OTP IS USED FOR CONFORMATION OF EMAIL ACCOUNT FOR BANK ACCOUNT CREATION";
        sendMail(email, Subject, message);

    }

    private void sendMail(String To, String Sub, String Mess) {

        String host = "smtp.gmail.com";
        //provide Aplication email
        final String user = "your email";
        //provide password for gmail
        final String password = "your password";

        if (!user.equals("") && !password.equals("")) {
            String SMTP_PORT = "465";
            String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";

            String to = To;

            //Get the session object  
            Properties props = new Properties();
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.auth", "true");
            props.put("mail.debug", "true");
            props.put("mail.smtp.port", SMTP_PORT);
            props.put("mail.smtp.socketFactory.port", SMTP_PORT);
            props.put("mail.smtp.socketFactory.class", SSL_FACTORY);
            props.put("mail.smtp.socketFactory.fallback", "false");

            Session session = Session.getDefaultInstance(props,
                    new javax.mail.Authenticator() {

                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(user, password);
                }
            });

            //Compose the message  
            try {
                MimeMessage message = new MimeMessage(session);
                // creates message part
                MimeBodyPart messageBodyPart = new MimeBodyPart();
                messageBodyPart.setContent(message, "text/html");

                message.setFrom(new InternetAddress(user));
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
                //message.setSubject("Subject");  
                message.setSubject(Sub);
                message.setText(Mess);
                //send the message  
                Transport.send(message);

                JOptionPane.showMessageDialog(null, "OTP sent Sucessfully...");

            } catch (MessagingException e) {
            }
        } else {
            JOptionPane.showMessageDialog(null, "Dear User! Please Enter Corect Email");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        registerbutton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        number = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        cpassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(434, 460));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 185, 463, -1));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 253, 463, -1));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Conform Password");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 329, 463, -1));

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));

        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton1.setText("SEND OTP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        registerbutton.setBackground(new java.awt.Color(0, 0, 204));
        registerbutton.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        registerbutton.setForeground(new java.awt.Color(255, 255, 255));
        registerbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/save.png"))); // NOI18N
        registerbutton.setText("REGISTER");
        registerbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerbuttonActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton2.setText("Resend OTP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 255, 204));
        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jLabel7.setText("Enter The OTP Sent To Your gmail");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Full Name");

        jButton3.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton3.setText("Already Have an Account");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Phone Number");

        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        number.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        email.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        password.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cpassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(85, 85, 85))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(163, 163, 163)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registerbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(29, 29, 29)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)))
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(registerbutton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(cpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(50, 50, 50))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 900, 510));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 463, 37));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerbuttonActionPerformed
        boolean check = false;
        boolean checkregister = false;

        String na = name.getText();
        String ph = number.getText();
        String ema = email.getText();
        String ps = password.getText();
        String cps = cpassword.getText();
        String emailpattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
        String mobilepattern = "^[0-9]*$";
        String Passwordpattern = "^.*(?=.{8,})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
        if (ema.matches(emailpattern) && ph.matches(mobilepattern) && ph.length() == 10) {
            ResultSet rs;
            Connection con;
            PreparedStatement insert;

            if ((!ps.equals(cps) || cps == null) || !ps.matches(Passwordpattern)) {
                JOptionPane.showMessageDialog(this, "Password Did not match");
                password.setText("");
                cpassword.setText("");
                password.requestFocus();
            } else {
                try {
                    con = DBManager.conu();
                    String sql = " SELECT * FROM user WHERE number=?";
                    insert = con.prepareCall(sql);
                    insert.setString(1, ph);

                    rs = insert.executeQuery();
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(rootPane, "YOU ALREADY HAVE AN ACCOUNT LOGIN USING YOUR PHONE NUMBER");
                        name.setText("");
                        number.setText("");
                        email.setText("");
                        password.setText("");
                        cpassword.setText("");
                        check = true;
                    }
                } catch (HeadlessException | SQLException e) {
                }
                if (!check) {

                    if (jTextField1.getText() != null) {
                        if (Checkotp.equals(jTextField1.getText())) {
                            JOptionPane.showMessageDialog(null, "OTP verified Sucessfully...");

                            try {

                                con = DBManager.conu();

                                insert = con.prepareStatement("insert into user(name,number,email,password)values(?,?,?,?)");
                                insert.setString(1, na);
                                insert.setString(2, ph);
                                insert.setString(3, ema);
                                insert.setString(4, ps);
                                insert.executeUpdate();

                                checkregister = true;
                                JOptionPane.showMessageDialog(this, "REGISTRATION SUCSESSFULL");

                            } catch (SQLException ex) {
                                Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
                            }

                            FirstLoadPage register = new FirstLoadPage();
                            register.show();
                            dispose();
                        }

                        jTextField1.setText("");

                    }
                }
            }
        }
        if (!checkregister) {

            JOptionPane.showMessageDialog(this, "PLEASE ENTER CORRECT DETAILS CHECK PHONE NUMBER AND EMAIL OR OPT");
        }
    }//GEN-LAST:event_registerbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean check = false;

        String ph = number.getText();
        String ema = email.getText();
        String ps = password.getText();
        String cps = cpassword.getText();
        String emailpattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
        String mobilepattern = "^[0-9]*$";
        String Passwordpattern = "^.*(?=.{8,})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
        if (ema.matches(emailpattern) && ph.matches(mobilepattern) && ph.length() == 10) {
            ResultSet rs;
            Connection con;
            PreparedStatement insert;

            if ((!ps.equals(cps) || cps == null) || !ps.matches(Passwordpattern)) {
                JOptionPane.showMessageDialog(this, "Password Did not match");
                password.setText("");
                cpassword.setText("");
                password.requestFocus();
            } else {
                try {
                    con = DBManager.conu();
                    String sql = " SELECT * FROM user WHERE number=?";
                    insert = con.prepareCall(sql);
                    insert.setString(1, ph);

                    rs = insert.executeQuery();
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(rootPane, "YOU ALREADY HAVE AN ACCOUNT LOGIN USING YOUR PHONE NUMBER");
                        name.setText("");
                        number.setText("");
                        email.setText("");
                        password.setText("");
                        cpassword.setText("");
                        check = true;
                    }
                } catch (HeadlessException | SQLException e) {
                }
                if (!check) {

                    OPTgen(ema);
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        boolean check = false;

        String na = name.getText();
        String ph = number.getText();
        String ema = email.getText();
        String ps = password.getText();
        String cps = cpassword.getText();
        String emailpattern = "^[a-zA-Z0-9]+[@]+[a-zA-Z0-9]+[.]+[a-zA-Z0-9]+$";
        String mobilepattern = "^[0-9]*$";
        String Passwordpattern = "^.*(?=.{8,})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";
        if (ema.matches(emailpattern) && ph.matches(mobilepattern) && ph.length() == 10) {
            ResultSet rs;
            Connection con;
            PreparedStatement insert;

            if ((!ps.equals(cps) || cps == null) || !ps.matches(Passwordpattern)) {
                JOptionPane.showMessageDialog(this, "Password Did not match");
                password.setText("");
                cpassword.setText("");
                password.requestFocus();
            } else {
                try {
                    con = DBManager.conu();
                    String sql = " SELECT * FROM user WHERE number=?";
                    insert = con.prepareCall(sql);
                    insert.setString(1, ph);

                    rs = insert.executeQuery();
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(rootPane, "YOU ALREADY HAVE AN ACCOUNT LOGIN USING YOUR PHONE NUMBER");
                        name.setText("");
                        number.setText("");
                        email.setText("");
                        password.setText("");
                        cpassword.setText("");
                        check = true;
                    }
                } catch (HeadlessException | SQLException e) {
                }
                if (!check) {

                    OPTgen(ema);
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        FirstLoadPage register = new FirstLoadPage();
        register.show();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField cpassword;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField number;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton registerbutton;
    // End of variables declaration//GEN-END:variables
}
