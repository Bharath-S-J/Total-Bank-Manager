package totalBankManager;

import java.awt.Image;
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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.util.Random;

public class SuperAdminDashboard extends javax.swing.JFrame {

    public String ggnumber;
    public String ggname;
    public long ggacc;

    Connection con, con1;
    PreparedStatement pst, insert;
    ResultSet rs = null;
    String superadminname1;

    public SuperAdminDashboard(String superadminname) {
        superadminname1 = superadminname;
        initComponents();
        allpanals.setSelectedIndex(6);
        loaddefault();
        bname.setText(DBManager.bn);
    }

    private void loaddefault() {
        ana.setText(DBManager.aa);
        anc.setText(DBManager.ac);
        abn.setText(DBManager.bn);
        ifsc.setText(DBManager.ifs);
        adname.setText("Wellcome Back " + superadminname1);
    }

    public SuperAdminDashboard(int i, String superadminname) {
        superadminname1 = superadminname;
        initComponents();
        allpanals.setSelectedIndex(i);
        table_forman();
        loaddefault();
        bname.setText(DBManager.bn);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        allpanals = new javax.swing.JTabbedPane();
        pan1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pp1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mobnum = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        faname = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        mname = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        adnum = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pnum = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        jLabel72 = new javax.swing.JLabel();
        actype = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        photo = new javax.swing.JLabel();
        accept = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        reason = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        pan2 = new javax.swing.JPanel();
        pan5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pp2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        fname1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        mobnum1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        dob1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        age1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        accnumber = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        userid = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        balance = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        gender1 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        complain = new javax.swing.JTextArea();
        jLabel74 = new javax.swing.JLabel();
        actype1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        photo1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        responce = new javax.swing.JTextArea();
        ressub = new javax.swing.JButton();
        search1 = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        pan4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        link11 = new javax.swing.JTextField();
        link22 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel42 = new javax.swing.JLabel();
        search3 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        uname = new javax.swing.JTextField();
        upass = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jLabel47 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        pan7 = new javax.swing.JPanel();
        pan8 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel46 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        pp4 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        fname3 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        mobnum3 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        email2 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        dob3 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        age3 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        faname2 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        mname2 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        adnum2 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        pnum2 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        gender3 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        actype3 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        photo3 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        accnumber2 = new javax.swing.JLabel();
        userid2 = new javax.swing.JLabel();
        balance2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        search4 = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        address2 = new javax.swing.JTextArea();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        bname = new javax.swing.JLabel();
        adname = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        abn = new javax.swing.JEditorPane();
        jButton8 = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        ana = new javax.swing.JEditorPane();
        jLabel69 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        anc = new javax.swing.JEditorPane();
        jLabel70 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        ifsc = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        pan3 = new javax.swing.JPanel();
        pan6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        pp3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        fname2 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        mobnum2 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        email1 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        dob2 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        age2 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        faname1 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        mname1 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        adnum1 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        pnum1 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        gender2 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        address1 = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        photo2 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        accnumber1 = new javax.swing.JLabel();
        userid1 = new javax.swing.JLabel();
        balance1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        actype2 = new javax.swing.JLabel();
        search2 = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu10 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(743, 603));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        allpanals.setBackground(new java.awt.Color(0, 255, 255));

        pan1.setBackground(new java.awt.Color(102, 255, 255));
        pan1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setBackground(new java.awt.Color(153, 255, 153));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SUBMITED DATE", "NAME", "PNONE NUMBER"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        pan1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 187, 374, 526));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/search.png"))); // NOI18N
        jLabel1.setText("SEARCH");
        pan1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 113, 362, -1));

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pp1.setBackground(new java.awt.Color(51, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel2.setText("FULL NAME");

        fname.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel4.setText("MOBILE NUMBER");

        mobnum.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel5.setText("EMAIL");

        email.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel6.setText("DOB");

        dob.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel3.setText("AGE");

        age.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel7.setText("ADDRESS");

        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel8.setText("FATHER NAME");

        faname.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel9.setText("MOTHER NAME");

        mname.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel10.setText("AADHAR NUMBER");

        adnum.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel11.setText("PAN NUMBER");

        pnum.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel12.setText("GENDER");

        gender.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        address.setBackground(new java.awt.Color(51, 255, 255));
        address.setColumns(20);
        address.setRows(5);
        jScrollPane13.setViewportView(address);

        jLabel72.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel72.setText("ACCOUNT TYPE");

        actype.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        javax.swing.GroupLayout pp1Layout = new javax.swing.GroupLayout(pp1);
        pp1.setLayout(pp1Layout);
        pp1Layout.setHorizontalGroup(
            pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mobnum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adnum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(faname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addComponent(actype, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pp1Layout.setVerticalGroup(
            pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mobnum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(age, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(faname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adnum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pp1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel72, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(actype, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel1.add(pp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 138, -1, -1));

        jPanel3.setBackground(new java.awt.Color(51, 255, 255));

        accept.setBackground(new java.awt.Color(255, 153, 255));
        accept.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        accept.setForeground(new java.awt.Color(255, 255, 255));
        accept.setText("ACCEPT");
        accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel13.setText("REASON FOR REJECTION");

        reason.setColumns(20);
        reason.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        reason.setRows(5);
        jScrollPane2.setViewportView(reason);

        jButton2.setBackground(new java.awt.Color(255, 153, 255));
        jButton2.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("REJECT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 35, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(accept)
                                .addGap(159, 159, 159))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(accept)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jButton2))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(477, 138, -1, -1));

        jLabel66.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("ACCEPT OR REJECT APPLICATION");
        jPanel1.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 862, 43));

        pan1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 6, 1050, 720));

        search.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        pan1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 147, 374, -1));

        allpanals.addTab("", pan1);

        pan2.setBackground(new java.awt.Color(51, 255, 255));
        pan2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pan5.setBackground(new java.awt.Color(51, 255, 255));

        jTable2.setBackground(new java.awt.Color(153, 255, 153));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SUBMITED DATE", "NAME", "PNONE NUMBER"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        jLabel14.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/search.png"))); // NOI18N
        jLabel14.setText("SEARCH");

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));

        pp2.setBackground(new java.awt.Color(51, 255, 255));

        jLabel15.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel15.setText("FULL NAME");

        fname1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel16.setText("MOBILE NUMBER");

        mobnum1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel18.setText("DOB");

        dob1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel19.setText("AGE");

        age1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel21.setText("ACCOUNT NUMBER");

        accnumber.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel22.setText("USER ID");

        userid.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel23.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel23.setText("BALANCE");

        balance.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel25.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel25.setText("GENDER");

        gender1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel27.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel27.setText("REQUEST/COMPLAIN");

        complain.setBackground(new java.awt.Color(51, 255, 255));
        complain.setColumns(20);
        complain.setRows(5);
        jScrollPane9.setViewportView(complain);

        jLabel74.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        actype1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        javax.swing.GroupLayout pp2Layout = new javax.swing.GroupLayout(pp2);
        pp2.setLayout(pp2Layout);
        pp2Layout.setHorizontalGroup(
            pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pp2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane9)
                    .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pp2Layout.createSequentialGroup()
                        .addGroup(pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fname1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mobnum1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dob1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(age1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(accnumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(balance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gender1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addGroup(pp2Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel74, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(actype1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pp2Layout.setVerticalGroup(
            pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fname1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mobnum1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(dob1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(age1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(accnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22)
                    .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23)
                    .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(pp2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(gender1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(actype1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(51, 255, 255));

        jLabel26.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel26.setText("ENTER RESPONCE BELOW");

        responce.setColumns(20);
        responce.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        responce.setRows(5);
        jScrollPane4.setViewportView(responce);

        ressub.setBackground(new java.awt.Color(255, 153, 255));
        ressub.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        ressub.setForeground(new java.awt.Color(255, 255, 255));
        ressub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/save.png"))); // NOI18N
        ressub.setText("SUBMIT");
        ressub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ressubActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 255, Short.MAX_VALUE)
                                .addComponent(ressub, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(photo1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(photo1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(ressub))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(pp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pp2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        search1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        search1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pan5Layout = new javax.swing.GroupLayout(pan5);
        pan5.setLayout(pan5Layout);
        pan5Layout.setHorizontalGroup(
            pan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(search1)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pan5Layout.setVerticalGroup(
            pan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pan5Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3)))
                .addContainerGap())
        );

        pan2.add(pan5, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 75, -1, -1));

        jLabel62.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("RESPOND TO THE COMPLAIN OR REQUESTS");
        pan2.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 6, 684, -1));

        jLabel73.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel73.setText("ACCOUNT TYPE");
        pan2.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 418, 121, -1));

        allpanals.addTab("", pan2);

        pan4.setBackground(new java.awt.Color(51, 255, 255));
        pan4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(51, 255, 255));

        jLabel40.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel40.setText("LINK FOR UPLOADING ID PROF");

        link11.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N

        link22.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N

        jLabel41.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel41.setText("LINK FOR UPLOADING REQUIRED DOCUMENTS FOR COMPLAIN OR REQUEST");

        jButton3.setBackground(new java.awt.Color(255, 153, 255));
        jButton3.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/save.png"))); // NOI18N
        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(link11)
                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(link22))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel40)
                .addGap(18, 18, 18)
                .addComponent(link11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(jLabel41)
                .addGap(18, 18, 18)
                .addComponent(link22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addContainerGap())
        );

        pan4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 184, -1, -1));

        jLabel64.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("UPDATE THE LINKS");
        pan4.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 125, 1326, 41));

        allpanals.addTab("", pan4);

        jPanel5.setBackground(new java.awt.Color(51, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setBackground(new java.awt.Color(153, 255, 153));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(jTable4);

        jPanel5.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 1338, -1));

        jLabel42.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/search.png"))); // NOI18N
        jLabel42.setText("SEARCH");
        jPanel5.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 149, 128, -1));

        search3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        search3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search3KeyReleased(evt);
            }
        });
        jPanel5.add(search3, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 146, 1192, -1));

        jLabel43.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/place order.png"))); // NOI18N
        jLabel43.setText("TRANSACTION HISTORY OF ALL THE COSTOMER");
        jPanel5.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 63, 1326, 41));

        allpanals.addTab("", jPanel5);

        jPanel9.setBackground(new java.awt.Color(51, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(51, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "registration", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe Print", 1, 12))); // NOI18N

        jLabel44.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel44.setText("ADMIN USERID");

        jLabel45.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel45.setText("ADMIN PASSWORD");

        add.setBackground(new java.awt.Color(255, 153, 255));
        add.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/save.png"))); // NOI18N
        add.setText("ADD ADMIN");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(255, 153, 255));
        edit.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/view edit delete product.png"))); // NOI18N
        edit.setText("EDIT ADMIN");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(255, 153, 255));
        delete.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/delete.png"))); // NOI18N
        delete.setText("DELETE ADMIN");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        uname.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        uname.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        upass.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        upass.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButton4.setBackground(new java.awt.Color(255, 153, 255));
        jButton4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/clear.png"))); // NOI18N
        jButton4.setText("CLEAR FEALDS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel71.setText("ADMIN NAME");

        jTextField1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                    .addComponent(jLabel44)
                                    .addGap(26, 26, 26))
                                .addGroup(jPanel11Layout.createSequentialGroup()
                                    .addComponent(jLabel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(51, 51, 51)))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel71, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(add)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(edit)
                        .addGap(29, 29, 29)
                        .addComponent(delete)
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addComponent(upass)
                    .addComponent(uname)
                    .addComponent(jTextField1))
                .addContainerGap())
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(upass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(38, 38, 38)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edit)
                    .addComponent(add)
                    .addComponent(delete))
                .addGap(26, 26, 26))
        );

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 590, -1));

        jTable5.setBackground(new java.awt.Color(153, 255, 153));
        jTable5.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "REF NO.", "USER ID", "PASSWORD", "ADMIN NAME"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable5MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(jTable5);

        jPanel9.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 695, 548));

        jLabel47.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel47.setText("ADMIN REGISTRATION");
        jPanel9.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 23, -1, -1));

        allpanals.addTab("", jPanel9);

        jPanel10.setBackground(new java.awt.Color(51, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pan7.setBackground(new java.awt.Color(51, 255, 255));

        pan8.setBackground(new java.awt.Color(51, 255, 255));

        jTable6.setBackground(new java.awt.Color(153, 255, 153));
        jTable6.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ACCOUNT NUMBER", "NAME", "BALANCE"
            }
        ));
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable6MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jTable6);

        jLabel46.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/search.png"))); // NOI18N
        jLabel46.setText("SEARCH");

        jPanel12.setBackground(new java.awt.Color(51, 255, 255));

        pp4.setBackground(new java.awt.Color(51, 255, 255));

        jLabel48.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel48.setText("FULL NAME");

        fname3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel49.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel49.setText("MOBILE NUMBER");

        mobnum3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel50.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel50.setText("EMAIL");

        email2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel51.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel51.setText("DOB");

        dob3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel52.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel52.setText("AGE");

        age3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel53.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel53.setText("ADDRESS");

        jLabel54.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel54.setText("FATHER NAME");

        faname2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel55.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel55.setText("MOTHER NAME");

        mname2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel56.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel56.setText("ADHAR NUMBER");

        adnum2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel57.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel57.setText("PAN NUMBER");

        pnum2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel58.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel58.setText("GENDER");

        gender3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel63.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel63.setText("ACCOUNT TYPE");

        actype3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        javax.swing.GroupLayout pp4Layout = new javax.swing.GroupLayout(pp4);
        pp4.setLayout(pp4Layout);
        pp4Layout.setHorizontalGroup(
            pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel58, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel54, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel53, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fname3, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(mobnum3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(email2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dob3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(age3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(faname2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mname2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adnum2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnum2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gender3, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(actype3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pp4Layout.setVerticalGroup(
            pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fname3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mobnum3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel50, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(email2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dob3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(age3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel53)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(faname2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mname2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnum2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(gender3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pp4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel63)
                    .addComponent(actype3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        jPanel13.setBackground(new java.awt.Color(51, 255, 255));

        jLabel59.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel59.setText("BALANCE");

        jLabel60.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel60.setText("USER ID");

        jLabel61.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel61.setText("ACCOUNT NUMBER");

        accnumber2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        userid2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        balance2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jButton6.setBackground(new java.awt.Color(255, 153, 255));
        jButton6.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/delete.png"))); // NOI18N
        jButton6.setText("DELETE ACCOUNT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 153, 255));
        jButton7.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/close.png"))); // NOI18N
        jButton7.setText("CANCEL DELETION");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(photo3, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel61))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accnumber2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userid2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(balance2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(photo3, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61)
                    .addComponent(accnumber2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel60)
                    .addComponent(userid2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel59)
                    .addComponent(balance2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(pp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        search4.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        search4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search4KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pan8Layout = new javax.swing.GroupLayout(pan8);
        pan8.setLayout(pan8Layout);
        pan8Layout.setHorizontalGroup(
            pan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                    .addComponent(search4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pan8Layout.setVerticalGroup(
            pan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pan8Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel65.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setText("DELETE REQUESTS");

        javax.swing.GroupLayout pan7Layout = new javax.swing.GroupLayout(pan7);
        pan7.setLayout(pan7Layout);
        pan7Layout.setHorizontalGroup(
            pan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pan8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(pan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pan7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, 1190, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pan7Layout.setVerticalGroup(
            pan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan7Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(pan8, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(pan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pan7Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel65)
                    .addContainerGap(624, Short.MAX_VALUE)))
        );

        jPanel10.add(pan7, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 28, -1, -1));

        address2.setColumns(20);
        address2.setRows(5);
        jScrollPane15.setViewportView(address2);

        jPanel10.add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(564, 336, 246, 78));

        allpanals.addTab("", jPanel10);

        jPanel14.setBackground(new java.awt.Color(51, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(51, 255, 255));

        bname.setFont(new java.awt.Font("Serif", 3, 24)); // NOI18N
        bname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        adname.setFont(new java.awt.Font("Serif", 3, 36)); // NOI18N
        adname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel67.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("Welcome display");

        abn.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jScrollPane10.setViewportView(abn);

        jButton8.setBackground(new java.awt.Color(255, 153, 255));
        jButton8.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("EDIT");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel68.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("Announcement to the admins");

        jButton9.setBackground(new java.awt.Color(255, 153, 255));
        jButton9.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("EDIT");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        ana.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jScrollPane11.setViewportView(ana);

        jLabel69.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("Announcement to the customer");

        jButton10.setBackground(new java.awt.Color(255, 153, 255));
        jButton10.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("EDIT");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        anc.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        jScrollPane12.setViewportView(anc);

        jLabel70.setFont(new java.awt.Font("Serif", 3, 18)); // NOI18N
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("Change IFSC Code");

        jButton11.setBackground(new java.awt.Color(255, 153, 255));
        jButton11.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("EDIT");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        ifsc.setFont(new java.awt.Font("Serif", 3, 14)); // NOI18N
        ifsc.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 972, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ifsc, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 971, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adname, javax.swing.GroupLayout.DEFAULT_SIZE, 1316, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel15Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel67, jLabel70});

        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(bname, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(adname, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel68, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)))
                .addGap(43, 43, 43)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel69, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton8)))
                .addGap(38, 38, 38)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel67, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11))
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel70, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ifsc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jPanel15Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel67, jLabel70});

        jPanel14.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 14, -1, -1));

        allpanals.addTab("", jPanel14);

        jPanel16.setBackground(new java.awt.Color(51, 255, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pan3.setBackground(new java.awt.Color(51, 255, 255));

        pan6.setBackground(new java.awt.Color(51, 255, 255));

        jTable3.setBackground(new java.awt.Color(153, 255, 153));
        jTable3.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ACCOUNT NUMBER", "NAME", "BALANCE"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable3);

        jLabel17.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/search.png"))); // NOI18N
        jLabel17.setText("SEARCH");

        jPanel6.setBackground(new java.awt.Color(51, 255, 255));

        pp3.setBackground(new java.awt.Color(51, 255, 255));

        jLabel20.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel20.setText("FULL NAME");

        fname2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel24.setText("MOBILE NUMBER");

        mobnum2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel28.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel28.setText("EMAIL");

        email1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel29.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel29.setText("DOB");

        dob2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel30.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel30.setText("AGE");

        age2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel31.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel31.setText("ADDRESS");

        jLabel32.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel32.setText("FATHER NAME");

        faname1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel33.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel33.setText("MOTHER NAME");

        mname1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel34.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel34.setText("ADDHAR NUMBER");

        adnum1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel35.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel35.setText("PAN NUMBER");

        pnum1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jLabel36.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel36.setText("GENDER");

        gender2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        address1.setBackground(new java.awt.Color(51, 255, 255));
        address1.setColumns(20);
        address1.setRows(5);
        jScrollPane14.setViewportView(address1);

        javax.swing.GroupLayout pp3Layout = new javax.swing.GroupLayout(pp3);
        pp3.setLayout(pp3Layout);
        pp3Layout.setHorizontalGroup(
            pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fname2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mobnum2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(email1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dob2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(age2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adnum1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnum1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(gender2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                    .addComponent(faname1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mname1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane14))
                .addContainerGap())
        );
        pp3Layout.setVerticalGroup(
            pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pp3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fname2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mobnum2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(email1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dob2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(age2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pp3Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pp3Layout.createSequentialGroup()
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGroup(pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(faname1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mname1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adnum1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnum1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pp3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(gender2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111))
        );

        jPanel7.setBackground(new java.awt.Color(51, 255, 255));

        jLabel37.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel37.setText("BALANCE");

        jLabel38.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel38.setText("USER ID");

        jLabel39.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel39.setText("ACCOUNT NUMBER");

        accnumber1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        userid1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        balance1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/view edit delete product.png"))); // NOI18N
        jButton1.setText("EDIT/DELETE  ACCOUNT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 153, 255));
        jButton5.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/generate bill & print.png"))); // NOI18N
        jButton5.setText("SEE TRANSACTION");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel75.setText("ACCOUNT TYPE");

        actype2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(photo2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel75, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(accnumber1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userid1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(balance1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(actype2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(photo2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39)
                    .addComponent(accnumber1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38)
                    .addComponent(userid1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(balance1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(actype2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel75))
                .addGap(23, 23, 23)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(pp3, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        search2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        search2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pan6Layout = new javax.swing.GroupLayout(pan6);
        pan6.setLayout(pan6Layout);
        pan6Layout.setHorizontalGroup(
            pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                    .addComponent(search2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pan6Layout.setVerticalGroup(
            pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pan6Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane5)))
                .addContainerGap())
        );

        jLabel76.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("EDITING PANEL");

        javax.swing.GroupLayout pan3Layout = new javax.swing.GroupLayout(pan3);
        pan3.setLayout(pan3Layout);
        pan3Layout.setHorizontalGroup(
            pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan3Layout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addComponent(pan6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pan3Layout.createSequentialGroup()
                    .addGap(207, 207, 207)
                    .addComponent(jLabel76, javax.swing.GroupLayout.DEFAULT_SIZE, 872, Short.MAX_VALUE)
                    .addGap(207, 207, 207)))
        );
        pan3Layout.setVerticalGroup(
            pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan3Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(pan6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(pan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pan3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel76)
                    .addContainerGap(707, Short.MAX_VALUE)))
        );

        jPanel16.add(pan3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 3, -1, -1));

        allpanals.addTab("", jPanel16);

        getContentPane().add(allpanals, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1370, 790));

        jMenuBar1.setBackground(new java.awt.Color(102, 255, 0));
        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(70, 50));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(70, 50));

        jMenu1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu1.setText("ACCOUNT APPROVE");
        jMenu1.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu2.setText("MANAGE ACCOUNTS");
        jMenu2.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu3.setText("UPDATE LINKS");
        jMenu3.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu4.setText("RESPOND TO COMPLAINS/REQUESTS");
        jMenu4.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu6.setText("TRANSACTION HISTORY");
        jMenu6.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        jMenu7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu7.setText("MANAGE ADMINS");
        jMenu7.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        jMenu8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu8.setText("DELETE REQUESTS");
        jMenu8.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jMenu8.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                jMenu8MenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu8);

        jMenu9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu9.setText("ANNOUNCEMENTS");
        jMenu9.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jMenu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu9MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu9);

        jMenu10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu10.setText("STATISTICS");
        jMenu10.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jMenu10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu10MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu10);

        jMenu5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenu5.setText(" BACK/LOGOUT");
        jMenu5.setFont(new java.awt.Font("Segoe Print", 1, 11)); // NOI18N
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        String filename;
        reason.setText("");
        DefaultTableModel Df = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        int mr = jTable1.convertRowIndexToModel(selectedIndex);

        String num = (Df.getValueAt(mr, 2).toString());
        String name = (Df.getValueAt(mr, 1).toString());

        ggnumber = num;
        ggname = name;
        try {
            con = DBManager.conu();
            String sql = " SELECT * FROM user WHERE number=? AND name=? ";
            pst = con.prepareCall(sql);
            pst.setString(1, num);
            pst.setString(2, name);

            rs = pst.executeQuery();

            if (rs.next()) {
                actype.setText(rs.getString("actype"));
                fname.setText(rs.getString("name"));
                mobnum.setText(rs.getString("number"));
                email.setText(rs.getString("email"));
                dob.setText(rs.getString("dob"));
                age.setText(rs.getString("age"));
                address.setText(rs.getString("address"));
                faname.setText(rs.getString("father"));
                mname.setText(rs.getString("mother"));
                adnum.setText(rs.getString("adhar"));
                pnum.setText(rs.getString("pan"));
                gender.setText(rs.getString("gender"));

                filename = rs.getString("image");
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(photo.getWidth(), photo.getHeight(), Image.SCALE_SMOOTH));
                photo.setIcon(imageIcon);

            } else {

            }

        } catch (SQLException e) {

        }

    }//GEN-LAST:event_jTable1MouseClicked

    private void acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptActionPerformed

        Connection con1, con2, con3;
        PreparedStatement insert1, insert2, insert3;
        long acc = 0;
        int balance = 0;

        try {

            con1 = DBManager.conu();
            insert1 = con.prepareStatement("select * from bank");

            rs = insert1.executeQuery();

            if (rs.next()) {
                acc = rs.getLong("acnumber");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {

            con2 = DBManager.conu();
            insert2 = con.prepareStatement("update user set acnumber= ? ,userid=? ,balance=? WHERE number=? AND name=?");
            acc = acc + 1;
            Random uid = new Random();
            int userid;
            userid = uid.nextInt(999999);

            insert2.setLong(1, acc);
            insert2.setInt(2, userid);
            insert2.setString(4, ggnumber);
            insert2.setString(5, ggname);

            insert2.setInt(3, balance);
            insert2.executeUpdate();

            Date thisDate = new Date();
            SimpleDateFormat dateForm = new SimpleDateFormat("dd-MM-Y");
            String date = dateForm.format(thisDate);

            DBManager obj = new DBManager();
            obj.acc2(1, date);

        } catch (SQLException ex) {
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            int i = 1;
            con1 = DBManager.conu();
            insert3 = con.prepareStatement("update bank set acnumber=? where id=?");

            insert3.setLong(1, acc);
            insert3.setInt(2, i);

            insert3.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(this, "AACOUNT APPROOVED SUCCESSFULL");
        reset1();
        table_updateforapp();
    }//GEN-LAST:event_acceptActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        Connection con;
        PreparedStatement insert;
        ResultSet rs = null;

        String re = reason.getText();

        try {

            con = DBManager.conu();
            insert = con.prepareStatement("update user set reason= ? where number=? AND name=?");
            insert.setString(1, re);
            insert.setString(2, ggnumber);
            insert.setString(3, ggname);

            insert.executeUpdate();

            JOptionPane.showMessageDialog(this, "ACCOUNT REJECTED SUCCESSFULLY BY SUBMITTING REASON");
            reset1();

        } catch (SQLException ex) {
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        table_updateforapp();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        String name;
        name = search.getText().trim();
        TableRowSorter rowSorter = new TableRowSorter(jTable1.getModel());
        jTable1.setRowSorter(rowSorter);

        if (name.length() != 0) {
            rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + name));
        }
        reset1();
    }//GEN-LAST:event_searchKeyReleased

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        String filename;
        responce.setText("");
        DefaultTableModel Df = (DefaultTableModel) jTable2.getModel();
        int selectedIndex = jTable2.getSelectedRow();
        int mr = jTable2.convertRowIndexToModel(selectedIndex);

        String num = (Df.getValueAt(mr, 2).toString());
        String name = (Df.getValueAt(mr, 1).toString());

        ggnumber = num;
        ggname = name;
        try {
            con = DBManager.conu();
            String sql = " SELECT * FROM user WHERE number=? AND name=? ";
            pst = con.prepareCall(sql);
            pst.setString(1, num);
            pst.setString(2, name);

            rs = pst.executeQuery();

            if (rs.next()) {
                actype1.setText(rs.getString("actype"));
                fname1.setText(rs.getString("name"));
                mobnum1.setText(rs.getString("number"));
                dob1.setText(rs.getString("dob"));
                age1.setText(rs.getString("age"));
                String aaa = String.valueOf(rs.getLong("acnumber"));
                String uuu = String.valueOf(rs.getLong("userid"));
                String bbb = String.valueOf(rs.getLong("balance"));
                accnumber.setText(aaa);
                userid.setText(uuu);
                balance.setText(bbb);

                gender1.setText(rs.getString("gender"));

                complain.setText(rs.getString("complain"));

                filename = rs.getString("image");
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(photo1.getWidth(), photo1.getHeight(), Image.SCALE_SMOOTH));
                photo1.setIcon(imageIcon);

            } else {

            }

        } catch (SQLException e) {

        }

    }//GEN-LAST:event_jTable2MouseClicked

    private void ressubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ressubActionPerformed
        Connection con;
        PreparedStatement insert;
        ResultSet rs = null;

        String re = responce.getText();

        try {

            con = DBManager.conu();
            insert = con.prepareStatement("update user set responce= ? where number=? AND name=?");
            insert.setString(1, re);
            insert.setString(2, ggnumber);
            insert.setString(3, ggname);

            insert.executeUpdate();

            Date thisDate = new Date();
            SimpleDateFormat dateForm = new SimpleDateFormat("dd-MM-Y");
            String date = dateForm.format(thisDate);

            DBManager obj = new DBManager();
            obj.comp22(1, date);

            JOptionPane.showMessageDialog(this, "RESPONCE SUBMETED SUCESSFULLY");
            reset1();

        } catch (SQLException ex) {
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        table_forcomp();
        reset2();

    }//GEN-LAST:event_ressubActionPerformed

    private void search1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search1KeyReleased
        String name;
        name = search1.getText().trim();
        TableRowSorter rowSorter = new TableRowSorter(jTable2.getModel());
        jTable2.setRowSorter(rowSorter);

        if (name.length() != 0) {
            rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + name));
        }
        reset2();
    }//GEN-LAST:event_search1KeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            int temp = 1;
            con = DBManager.conu();
            pst = con.prepareStatement("update bank set link1= ? ,link2=? where id=?");
            pst.setString(1, link11.getText());
            pst.setString(2, link22.getText());
            pst.setInt(3, temp);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "LINKS UPDATED SUCCESSFULL");

            DBManager.temp();
        } catch (SQLException ex) {
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked

        allpanals.setSelectedIndex(0);
        table_updateforapp();
        reset1();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        allpanals.setSelectedIndex(7);
        table_forman();
        reset3();

    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        allpanals.setSelectedIndex(2);
        link11.setText(DBManager.link1);
        link22.setText(DBManager.link2);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        allpanals.setSelectedIndex(1);
        table_forcomp();
        reset2();
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        allpanals.setSelectedIndex(3);
        call();
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        FirstLoadPage SuperAdmin = new FirstLoadPage();
        SuperAdmin.show();
        dispose();
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        allpanals.setSelectedIndex(4);
        table_update();
    }//GEN-LAST:event_jMenu7MouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        String name = uname.getText();
        String passw = upass.getText();
        String adminrname = jTextField1.getText();
        try {
            con = DBManager.conu();
            pst = con.prepareStatement("insert into dlogin(userid,password,name)values(?,?,?)");
            pst.setString(1, name);
            pst.setString(2, passw);
            pst.setString(3, adminrname);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "ADMIN ADDED SUCESSFULLY");
            table_update();
            uname.setText("");
            upass.setText("");
            uname.requestFocus();

        } catch (SQLException ex) {
            Logger.getLogger(SuperAdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        table_update();

    }//GEN-LAST:event_addActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        DefaultTableModel Df = (DefaultTableModel) jTable5.getModel();
        int selectedIndex = jTable5.getSelectedRow();

        try {
            int id = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());
            int dialogResult = JOptionPane.showConfirmDialog(null, "do you want to delet", "warning", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                con1 = DBManager.conu();
                insert = con1.prepareStatement("delete from dlogin where id=? ");
                insert.setInt(1, id);
                insert.executeUpdate();

                JOptionPane.showMessageDialog(this, "ADMIN DELETED");
                table_update();
                uname.setText("");
                upass.setText("");

                uname.requestFocus();

            }

        } catch (SQLException ex) {
            Logger.getLogger(SuperAdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        table_update();

    }//GEN-LAST:event_deleteActionPerformed

    private void jTable5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable5MouseClicked

        DefaultTableModel Df = (DefaultTableModel) jTable5.getModel();
        int selectedIndex = jTable5.getSelectedRow();

        uname.setText(Df.getValueAt(selectedIndex, 1).toString());
        upass.setText(Df.getValueAt(selectedIndex, 2).toString());
        jTextField1.setText(Df.getValueAt(selectedIndex, 3).toString());

    }//GEN-LAST:event_jTable5MouseClicked

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        DefaultTableModel Df = (DefaultTableModel) jTable5.getModel();
        int selectedIndex = jTable5.getSelectedRow();
        try {
            int id = Integer.parseInt(Df.getValueAt(selectedIndex, 0).toString());
            String name = uname.getText();
            String pass = upass.getText();

            con1 = DBManager.conu();
            insert = con1.prepareStatement("update dlogin set userid= ? ,name=? ,password=? where id=? ");
            insert.setString(1, name);
            insert.setString(3, pass);
            insert.setString(2, jTextField1.getText());
            insert.setInt(4, id);
            insert.executeUpdate();

            JOptionPane.showMessageDialog(this, "DETAILS UPDATED");
            table_update();
            jTextField1.setText("");
            uname.setText("");
            upass.setText("");

            uname.requestFocus();

        } catch (SQLException ex) {
            Logger.getLogger(SuperAdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        table_update();
    }//GEN-LAST:event_editActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        uname.setText("");
        upass.setText("");
        uname.requestFocus();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenu8MenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_jMenu8MenuKeyPressed

    }//GEN-LAST:event_jMenu8MenuKeyPressed

    private void jTable6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable6MouseClicked
        String filename;

        DefaultTableModel Df = (DefaultTableModel) jTable6.getModel();
        int selectedIndex = jTable6.getSelectedRow();

        String accnum = (Df.getValueAt(selectedIndex, 0).toString());

        String name = (Df.getValueAt(selectedIndex, 1).toString());

        ggacc = Long.parseLong(accnum);
        ggname = name;
        try {
            con = DBManager.conu();
            String sql = " SELECT * FROM user WHERE acnumber=? AND name=? ";
            pst = con.prepareCall(sql);
            pst.setLong(1, ggacc);
            pst.setString(2, name);

            rs = pst.executeQuery();

            if (rs.next()) {
                actype3.setText(rs.getString("actype"));
                fname3.setText(rs.getString("name"));
                mobnum3.setText(rs.getString("number"));
                dob3.setText(rs.getString("dob"));
                age3.setText(rs.getString("age"));
                String aaa = String.valueOf(rs.getLong("acnumber"));
                String uuu = String.valueOf(rs.getLong("userid"));
                String bbb = String.valueOf(rs.getLong("balance"));
                accnumber2.setText(aaa);
                userid2.setText(uuu);
                balance2.setText(bbb);
                gender3.setText(rs.getString("gender"));
                email2.setText(rs.getString("email"));
                address2.setText(rs.getString("address"));
                faname2.setText(rs.getString("father"));
                mname2.setText(rs.getString("mother"));
                adnum2.setText(rs.getString("adhar"));
                pnum2.setText(rs.getString("pan"));

                filename = rs.getString("image");
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(photo2.getWidth(), photo2.getHeight(), Image.SCALE_SMOOTH));
                photo3.setIcon(imageIcon);

            } else {

            }

        } catch (SQLException e) {

        }
    }//GEN-LAST:event_jTable6MouseClicked

    private void search4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search4KeyReleased
        String name;
        name = search4.getText().trim();
        TableRowSorter rowSorter = new TableRowSorter(jTable6.getModel());
        jTable6.setRowSorter(rowSorter);

        if (name.length() != 0) {
            rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + name));
        }
        reset4();
    }//GEN-LAST:event_search4KeyReleased

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            int dialogResult = JOptionPane.showConfirmDialog(null, "do you want to delet", "warning", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                con = DBManager.conu();
                insert = con.prepareStatement("delete from user where acnumber=? ");
                insert.setLong(1, ggacc);
                insert.executeUpdate();

                JOptionPane.showMessageDialog(this, "BANK ACCOUNT DELETED");

            }
        } catch (SQLException ex) {
            Logger.getLogger(SuperAdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        table_fordel();
        reset4();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        allpanals.setSelectedIndex(5);
        table_fordel();
        reset4();
    }//GEN-LAST:event_jMenu8MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {

            con = DBManager.conu();
            insert = con.prepareStatement("update user set deletion= ?  WHERE acnumber=? AND name=?");
            int a = 0;
            insert.setInt(1, a);
            insert.setLong(2, ggacc);
            insert.setString(3, ggname);
            insert.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(this, "DELETE REQUEST CANCELLED SUCCESSFULLY");
        reset4();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String aforadmin = ana.getText();
        try {

            con = DBManager.conu();
            insert = con.prepareStatement("update bank set anouncementA= ?  WHERE id=? ");
            insert.setInt(2, 1);
            insert.setString(1, aforadmin);
            insert.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        DBManager.temp();
        loaddefault();
        JOptionPane.showMessageDialog(this, "ANNOUCEMENT TO THE ADMIN UPDATED");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String aforcus = anc.getText();
        try {

            con = DBManager.conu();
            insert = con.prepareStatement("update bank set anouncementC= ?  WHERE id=? ");
            insert.setInt(2, 1);
            insert.setString(1, aforcus);
            insert.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        DBManager.temp();
        loaddefault();
        JOptionPane.showMessageDialog(this, "ANNOUCEMENT TO THE CUSTOMER UPDATED");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String bankname = ifsc.getText();
        try {

            con = DBManager.conu();
            insert = con.prepareStatement("update bank set ifsc= ?  WHERE id=? ");
            insert.setInt(2, 1);
            insert.setString(1, bankname);
            insert.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        DBManager.temp();
        loaddefault();
        JOptionPane.showMessageDialog(this, "IFSC CODE HAS BEEN UPDATED");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        String bankname = abn.getText();
        try {

            con = DBManager.conu();
            insert = con.prepareStatement("update bank set bname= ?  WHERE id=? ");
            insert.setInt(2, 1);
            insert.setString(1, bankname);
            insert.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
        }
        DBManager.temp();
        loaddefault();
        JOptionPane.showMessageDialog(this, "BANK DISPLAY NAME HAS BEEN UPDATED");
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        String filename;

        DefaultTableModel Df = (DefaultTableModel) jTable3.getModel();
        int selectedIndex = jTable3.getSelectedRow();
        int mr = jTable3.convertRowIndexToModel(selectedIndex);

        String accnum = (Df.getValueAt(mr, 0).toString());
        String name = (Df.getValueAt(mr, 1).toString());

        ggacc = Long.parseLong(accnum);
        ggname = name;
        try {
            con = DBManager.conu();
            String sql = " SELECT * FROM user WHERE acnumber=? AND name=? ";
            pst = con.prepareCall(sql);
            pst.setLong(1, ggacc);
            pst.setString(2, name);

            rs = pst.executeQuery();

            if (rs.next()) {

                fname2.setText(rs.getString("name"));
                mobnum2.setText(rs.getString("number"));
                dob2.setText(rs.getString("dob"));
                age2.setText(rs.getString("age"));
                String aaa = String.valueOf(rs.getLong("acnumber"));
                String uuu = String.valueOf(rs.getLong("userid"));
                String bbb = String.valueOf(rs.getLong("balance"));
                accnumber1.setText(aaa);
                userid1.setText(uuu);
                balance1.setText(bbb);
                gender2.setText(rs.getString("gender"));
                email1.setText(rs.getString("email"));
                address1.setText(rs.getString("address"));
                faname1.setText(rs.getString("father"));
                mname1.setText(rs.getString("mother"));
                adnum1.setText(rs.getString("adhar"));
                pnum1.setText(rs.getString("pan"));

                filename = rs.getString("image");
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(photo2.getWidth(), photo2.getHeight(), Image.SCALE_SMOOTH));
                photo2.setIcon(imageIcon);
                actype2.setText(rs.getString("actype"));
            } else {

            }

        } catch (SQLException e) {

        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        UserDataManagerForSuperAdmin SuperAdmin = new UserDataManagerForSuperAdmin(ggname, ggacc, superadminname1);
        SuperAdmin.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        TransactionHistoryHelper SuperAdmin = new TransactionHistoryHelper(ggacc, 3, superadminname1);
        SuperAdmin.show();
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void search2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search2KeyReleased
        String name;
        name = search2.getText().trim();
        TableRowSorter rowSorter = new TableRowSorter(jTable3.getModel());
        jTable3.setRowSorter(rowSorter);

        if (name.length() != 0) {
            rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + name));
        }
    }//GEN-LAST:event_search2KeyReleased

    private void search3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search3KeyReleased
        String name;
        name = search3.getText().trim();
        TableRowSorter rowSorter = new TableRowSorter(jTable4.getModel());
        jTable4.setRowSorter(rowSorter);

        if (name.length() != 0) {
            rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + name));
        }
    }//GEN-LAST:event_search3KeyReleased

    private void jMenu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MouseClicked
        allpanals.setSelectedIndex(6);

    }//GEN-LAST:event_jMenu9MouseClicked

    private void jMenu10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu10MouseClicked
        SuperAdminTools SuperAdmin = new SuperAdminTools(superadminname1);
        SuperAdmin.show();
        dispose();
    }//GEN-LAST:event_jMenu10MouseClicked

    private void table_update() {
        jTable5.setAutoCreateRowSorter(true);
        int c;
        con1 = DBManager.conu();
        try {
            insert = con1.prepareStatement("select * from dlogin");
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            c = rss.getColumnCount();
            DefaultTableModel Df = (DefaultTableModel) jTable5.getModel();
            Df.setRowCount(0);

            while (rs.next()) {
                Vector v1 = new Vector();
                for (int i = 0; i < c; i++) {
                    v1.add(rs.getInt("id"));
                    v1.add(rs.getString("userid"));
                    v1.add(rs.getString("password"));
                    v1.add(rs.getString("name"));
                }
                Df.addRow(v1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SuperAdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void call() {

        jTable4.setAutoCreateRowSorter(true);

        try {
            con = DBManager.conu();
            insert = con.prepareStatement("select * from history");
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            DefaultTableModel Df = (DefaultTableModel) jTable4.getModel();
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

    private void table_fordel() {
        jTable6.setAutoCreateRowSorter(true);
        PreparedStatement insert;

        try {
            con = DBManager.conu();
            insert = con.prepareStatement("select * from user");
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();

            DefaultTableModel Df = (DefaultTableModel) jTable6.getModel();

            Df.setRowCount(0);

            while (rs.next()) {
                if (rs.getInt("deletion") != 0) {
                    Vector v1 = new Vector();
                    for (int i = 0; i < 2; i++) {
                        v1.add(rs.getString("acnumber"));
                        v1.add(rs.getString("name"));
                        v1.add(rs.getString("balance"));
                    }
                    Df.addRow(v1);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void table_forman() {
        jTable3.setAutoCreateRowSorter(true);
        PreparedStatement insert;

        try {
            con = DBManager.conu();
            insert = con.prepareStatement("select * from user");
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();

            DefaultTableModel Df = (DefaultTableModel) jTable3.getModel();

            Df.setRowCount(0);

            while (rs.next()) {
                if (rs.getString("acnumber") != null) {
                    Vector v1 = new Vector();
                    for (int i = 0; i < 2; i++) {
                        v1.add(rs.getString("acnumber"));
                        v1.add(rs.getString("name"));
                        v1.add(rs.getString("balance"));
                    }
                    Df.addRow(v1);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void reset4() {
        fname3.setText("");
        mobnum3.setText("");
        dob3.setText("");
        age3.setText("");
        gender3.setText("");
        email2.setText("");
        address2.setText("");
        faname2.setText("");
        mname2.setText("");
        adnum2.setText("");
        pnum2.setText("");
        actype3.setText("");
        photo3.setIcon(null);
    }

    private void reset3() {
        fname2.setText("");
        mobnum2.setText("");
        dob2.setText("");
        age2.setText("");
        accnumber1.setText("");
        userid1.setText("");
        balance1.setText("");
        gender2.setText("");
        email1.setText("");
        address1.setText("");
        faname1.setText("");
        mname1.setText("");
        adnum1.setText("");
        pnum1.setText("");
        photo2.setIcon(null);
        actype2.setText("");
    }

    private void reset2() {
        fname1.setText("");
        mobnum1.setText("");
        dob1.setText("");
        age1.setText("");

        accnumber.setText("");
        userid.setText("");
        balance.setText("");

        gender1.setText("");
        responce.setText("");
        complain.setText("");
        actype1.setText("");
        photo1.setIcon(null);
    }

    private void reset1() {
        fname.setText("");
        mobnum.setText("");
        email.setText("");
        dob.setText("");
        age.setText("");
        address.setText("");
        faname.setText("");
        mname.setText("");
        adnum.setText("");
        pnum.setText("");
        gender.setText("");
        actype.setText("");
        photo.setIcon(null);
    }

    private void table_forcomp() {
        jTable2.setAutoCreateRowSorter(true);
        PreparedStatement insert;
        try {
            con = DBManager.conu();
            insert = con.prepareStatement("select * from user");
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();

            DefaultTableModel Df = (DefaultTableModel) jTable2.getModel();

            Df.setRowCount(0);

            while (rs.next()) {
                if (rs.getString("complain") != null && rs.getString("responce") == null) {
                    Vector v1 = new Vector();
                    for (int i = 0; i < 2; i++) {
                        v1.add(rs.getString("compdate"));
                        v1.add(rs.getString("name"));
                        v1.add(rs.getString("number"));
                    }
                    Df.addRow(v1);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void table_updateforapp() {

        PreparedStatement insert;
        jTable1.setAutoCreateRowSorter(true);

        try {
            con = DBManager.conu();
            insert = con.prepareStatement("select * from user");
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();

            DefaultTableModel Df = (DefaultTableModel) jTable1.getModel();

            Df.setRowCount(0);

            while (rs.next()) {
                if (rs.getString("acnumber") == null && rs.getString("father") != null) {
                    Vector v1 = new Vector();
                    for (int i = 0; i < 2; i++) {
                        v1.add(rs.getString("accdate"));
                        v1.add(rs.getString("name"));
                        v1.add(rs.getString("number"));
                    }
                    Df.addRow(v1);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane abn;
    private javax.swing.JButton accept;
    private javax.swing.JLabel accnumber;
    private javax.swing.JLabel accnumber1;
    private javax.swing.JLabel accnumber2;
    private javax.swing.JLabel actype;
    private javax.swing.JLabel actype1;
    private javax.swing.JLabel actype2;
    private javax.swing.JLabel actype3;
    private javax.swing.JButton add;
    private javax.swing.JTextArea address;
    private javax.swing.JTextArea address1;
    private javax.swing.JTextArea address2;
    private javax.swing.JLabel adname;
    private javax.swing.JLabel adnum;
    private javax.swing.JLabel adnum1;
    private javax.swing.JLabel adnum2;
    private javax.swing.JLabel age;
    private javax.swing.JLabel age1;
    private javax.swing.JLabel age2;
    private javax.swing.JLabel age3;
    private javax.swing.JTabbedPane allpanals;
    private javax.swing.JEditorPane ana;
    private javax.swing.JEditorPane anc;
    private javax.swing.JLabel balance;
    private javax.swing.JLabel balance1;
    private javax.swing.JLabel balance2;
    private javax.swing.JLabel bname;
    private javax.swing.JTextArea complain;
    private javax.swing.JButton delete;
    private javax.swing.JLabel dob;
    private javax.swing.JLabel dob1;
    private javax.swing.JLabel dob2;
    private javax.swing.JLabel dob3;
    private javax.swing.JButton edit;
    private javax.swing.JLabel email;
    private javax.swing.JLabel email1;
    private javax.swing.JLabel email2;
    private javax.swing.JLabel faname;
    private javax.swing.JLabel faname1;
    private javax.swing.JLabel faname2;
    private javax.swing.JLabel fname;
    private javax.swing.JLabel fname1;
    private javax.swing.JLabel fname2;
    private javax.swing.JLabel fname3;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel gender1;
    private javax.swing.JLabel gender2;
    private javax.swing.JLabel gender3;
    private javax.swing.JTextField ifsc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField link11;
    private javax.swing.JTextField link22;
    private javax.swing.JLabel mname;
    private javax.swing.JLabel mname1;
    private javax.swing.JLabel mname2;
    private javax.swing.JLabel mobnum;
    private javax.swing.JLabel mobnum1;
    private javax.swing.JLabel mobnum2;
    private javax.swing.JLabel mobnum3;
    private javax.swing.JPanel pan1;
    private javax.swing.JPanel pan2;
    private javax.swing.JPanel pan3;
    private javax.swing.JPanel pan4;
    private javax.swing.JPanel pan5;
    private javax.swing.JPanel pan6;
    private javax.swing.JPanel pan7;
    private javax.swing.JPanel pan8;
    private javax.swing.JLabel photo;
    private javax.swing.JLabel photo1;
    private javax.swing.JLabel photo2;
    private javax.swing.JLabel photo3;
    private javax.swing.JLabel pnum;
    private javax.swing.JLabel pnum1;
    private javax.swing.JLabel pnum2;
    private javax.swing.JPanel pp1;
    private javax.swing.JPanel pp2;
    private javax.swing.JPanel pp3;
    private javax.swing.JPanel pp4;
    private javax.swing.JTextArea reason;
    private javax.swing.JTextArea responce;
    private javax.swing.JButton ressub;
    private javax.swing.JTextField search;
    private javax.swing.JTextField search1;
    private javax.swing.JTextField search2;
    private javax.swing.JTextField search3;
    private javax.swing.JTextField search4;
    private javax.swing.JTextField uname;
    private javax.swing.JTextField upass;
    private javax.swing.JLabel userid;
    private javax.swing.JLabel userid1;
    private javax.swing.JLabel userid2;
    // End of variables declaration//GEN-END:variables
}
