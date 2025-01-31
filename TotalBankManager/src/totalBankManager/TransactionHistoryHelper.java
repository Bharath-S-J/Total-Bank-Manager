package totalBankManager;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class TransactionHistoryHelper extends javax.swing.JFrame {

    int tt;
    long ac;
    String number1, pass1;
    String superadminname1;

    Connection con;
    PreparedStatement pst;
    ResultSet rs = null;

    public TransactionHistoryHelper(String phon, String pass, long acc, int n) {
        initComponents();
        tt = n;
        number1 = phon;
        pass1 = pass;
        ac = acc;
        jLabel1.setText("Transaction history of the customer having account number " + ac);
        call();
    }

    public TransactionHistoryHelper(long acc, int n) {
        initComponents();
        tt = n;
        ac = acc;
        jLabel1.setText("Transaction history of the customer having account number " + ac);
        call();
    }

    public TransactionHistoryHelper(long acc, int n, String superadminname) {
        initComponents();
        superadminname1 = superadminname;
        tt = n;
        ac = acc;
        jLabel1.setText("Transaction history of the customer having account number " + ac);
        call();
    }

    private void call() {
        bkk.setText(DBManager.bn);
        jTable1.setAutoCreateRowSorter(true);
        PreparedStatement insert;
        try {
            con = DBManager.conu();
            insert = con.prepareStatement("select * from history WHERE acnumber=? ");
            insert.setLong(1, ac);
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            DefaultTableModel Df = (DefaultTableModel) jTable1.getModel();
            Df.setRowCount(0);
            while (rs.next()) {
                Vector v1 = new Vector();
                for (int i = 0; i < 3; i++) {
                    v1.add(rs.getString("date"));
                    v1.add(rs.getString("acnumber"));
                    v1.add(rs.getString("type"));
                    v1.add(rs.getString("ammount"));
                }
                Df.addRow(v1);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        bkk = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        print = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(102, 255, 102));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "TIME / DATE", "ACCOUNT NUMBER", "WITHDRAW/DEPOSITE", "AMOUNT"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 237, 970, -1));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 98, 782, 41));

        bkk.setFont(new java.awt.Font("Segoe Print", 0, 24)); // NOI18N
        bkk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(bkk, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 51, 776, 41));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/search.png"))); // NOI18N
        jLabel2.setText("SEARCH");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 160, 128, -1));

        search.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 157, 630, -1));

        jPanel1.setBackground(new java.awt.Color(255, 102, 255));

        jButton1.setBackground(new java.awt.Color(51, 255, 0));
        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/exit small.png"))); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        print.setBackground(new java.awt.Color(102, 255, 0));
        print.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        print.setForeground(new java.awt.Color(255, 255, 255));
        print.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/generate bill & print.png"))); // NOI18N
        print.setText("PRINT PDF");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(832, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(print, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(555, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        switch (tt) {
            case 1 -> {
                UserDashboard history1 = new UserDashboard(number1, pass1);
                history1.show();
                dispose();
            }
            case 2 -> {
                Employee history1 = new Employee(2);
                history1.show();
                dispose();
            }
            default -> {
                SuperAdminDashboard history1 = new SuperAdminDashboard(7, superadminname1);
                history1.show();
                dispose();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        String name;
        name = search.getText().trim();
        TableRowSorter rowSorter = new TableRowSorter(jTable1.getModel());
        jTable1.setRowSorter(rowSorter);

        if (name.length() != 0) {
            rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + name));
        }
    }//GEN-LAST:event_searchKeyReleased

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed

        String FullName = null, phoneNo = null, IFSC, BankName, Email = null, Actype = null;
        try {
            con = DBManager.conu();
            pst = con.prepareStatement("select * from user WHERE acnumber=? ");
            pst.setLong(1, ac);
            ResultSet rs = pst.executeQuery();

            while (rs.next()) {
                FullName = rs.getString("name");
                phoneNo = rs.getString("number");
                Email = rs.getString("email");
                Actype = rs.getString("actype");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }

        BankName = DBManager.bn;
        IFSC = DBManager.ifs;

        String path = null;
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(this);
        if (x == JFileChooser.APPROVE_OPTION) {
            path = j.getSelectedFile().getPath();
        }
        Document doc1 = new Document();
        try {

            PdfWriter.getInstance(doc1, new FileOutputStream(path + "//" + ac + ".pdf"));
            doc1.open();
            Paragraph pra1 = new Paragraph("        NAME OF THE BANK : " + BankName);
            Paragraph pra3 = new Paragraph("        IFSC OF THE BANK : " + IFSC);
            Paragraph pra5 = new Paragraph("        ACCOUNT NUMBER : " + ac);
            Paragraph pra7 = new Paragraph("        ACCOUNT TYPE : " + Actype);
            Paragraph pra9 = new Paragraph("        NAME : " + FullName);
            Paragraph pra11 = new Paragraph("        PHONE NUMBER : " + phoneNo);
            Paragraph pra13 = new Paragraph("        EMAIL : " + Email);

            Date thisDatee = new Date();
            SimpleDateFormat dateForm = new SimpleDateFormat("dd-MM-Y");
            String date = dateForm.format(thisDatee);

            Paragraph pra14 = new Paragraph("        DATE PRINTED : " + date);
            Paragraph pra15 = new Paragraph("            ");
            doc1.add(pra1);
            doc1.add(pra3);
            doc1.add(pra5);
            doc1.add(pra7);
            doc1.add(pra9);
            doc1.add(pra11);
            doc1.add(pra13);
            doc1.add(pra14);
            doc1.add(pra15);

            PdfPTable tbl = new PdfPTable(4);
            tbl.addCell("TIME DATE");
            tbl.addCell("ACCOUNT NUMBER");
            tbl.addCell("WITHDRAWAL /DEPOSIT");
            tbl.addCell("AMOUNT");

            for (int i = 0; i < jTable1.getRowCount(); i++) {
                String datm = jTable1.getValueAt(i, 0).toString();
                String acno = jTable1.getValueAt(i, 1).toString();
                String type = jTable1.getValueAt(i, 2).toString();
                String amount = jTable1.getValueAt(i, 2).toString();
                tbl.addCell(datm);
                tbl.addCell(acno);
                tbl.addCell(type);
                tbl.addCell(amount);
            }

            doc1.add(tbl);

            JOptionPane.showMessageDialog(this, "PDF Generated");
        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Some thing went wrong");
        }

        doc1.close();


    }//GEN-LAST:event_printActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bkk;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton print;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
