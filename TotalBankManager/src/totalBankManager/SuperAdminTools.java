package totalBankManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class SuperAdminTools extends javax.swing.JFrame {

    Connection con1;
    ResultSet rs = null;
    PreparedStatement pst = null;

    String superadminname1;

    public SuperAdminTools(String superadminname) {
        initComponents();
        superadminname1 = superadminname;
        pan7.setSelectedIndex(1);
        homegraph();
    }

    void homegraph() {
        int n1 = 0, n2 = 0, n3 = 0;

        try {
            con1 = DBManager.conu();
            pst = con1.prepareStatement("select * from user");
            rs = pst.executeQuery();

            while (rs.next()) {
                if (rs.getString("acnumber") != null) {
                    n1++;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con1 = DBManager.conu();
            pst = con1.prepareStatement("select * from user");
            rs = pst.executeQuery();

            while (rs.next()) {
                if (rs.getString("complain") != null && rs.getString("responce") == null) {
                    n2 = n2 + 1;
                    System.out.println("yes");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con1 = DBManager.conu();
            pst = con1.prepareStatement("select * from user");
            rs = pst.executeQuery();

            while (rs.next()) {
                if (rs.getString("acnumber") == null && rs.getString("father") != null) {
                    n3 = n3 + 1;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }

        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();

        barChartData.setValue(n1, "No Of Accounts", "Running Accounts");
        barChartData.setValue(n2, "No Of Accounts", "Complaints / Requests");
        barChartData.setValue(n3, "No Of Accounts", "New Accounts Requested");

        JFreeChart barChart = ChartFactory.createBarChart("Graph Of Accounts/Requests/New Accounts", null, "Number Of Accounts", barChartData, PlotOrientation.VERTICAL, false, false, false);
        CategoryPlot barchrt = barChart.getCategoryPlot();
        barchrt.setRangeGridlinePaint(Color.BLUE);

        ChartPanel barPanel = new ChartPanel(barChart);
        p2.removeAll();
        p2.add(barPanel, BorderLayout.CENTER);
        p2.validate();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        pan7 = new javax.swing.JTabbedPane();
        p1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pword = new javax.swing.JPasswordField();
        pword1 = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        uname1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pword2 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        p2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        p3 = new javax.swing.JPanel();
        sely = new javax.swing.JComboBox<>();
        selm = new javax.swing.JComboBox<>();
        jButton7 = new javax.swing.JButton();
        chartpan = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        p4 = new javax.swing.JPanel();
        p6 = new javax.swing.JPanel();
        sely1 = new javax.swing.JComboBox<>();
        selm1 = new javax.swing.JComboBox<>();
        jButton9 = new javax.swing.JButton();
        chartpan1 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        p7 = new javax.swing.JPanel();
        sely2 = new javax.swing.JComboBox<>();
        selm2 = new javax.swing.JComboBox<>();
        jButton10 = new javax.swing.JButton();
        chartpan2 = new javax.swing.JPanel();
        jButton14 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();

        javax.swing.GroupLayout p5Layout = new javax.swing.GroupLayout(p5);
        p5.setLayout(p5Layout);
        p5Layout.setHorizontalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );
        p5Layout.setVerticalGroup(
            p5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(153, 255, 132));
        jButton1.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/place order.png"))); // NOI18N
        jButton1.setText("Withdraw/Diposite");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 220, 30));

        pan7.setBackground(new java.awt.Color(153, 255, 255));

        p1.setBackground(new java.awt.Color(102, 204, 255));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("CURRECT USERNAME");

        uname.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        uname.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel4.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("CURRENT PASSWORD");

        pword.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        pword.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        pword1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        pword1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("NEW PASSWORD");

        uname1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        uname1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        uname1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uname1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("NEW USERNAME");

        jLabel7.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("CONFORM NEW PASSWORD");

        pword2.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        pword2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pword2ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 153, 255));
        jButton2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/save.png"))); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(p1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(uname1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pword, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(p1Layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(pword1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(pword2, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(636, Short.MAX_VALUE))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(pword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(uname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(pword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(22, 22, 22)
                .addComponent(pword2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pan7.addTab("", p1);

        p2.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(102, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
        );

        p2.add(jPanel1, java.awt.BorderLayout.CENTER);

        pan7.addTab("", p2);

        p3.setBackground(new java.awt.Color(102, 204, 255));
        p3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sely.setBackground(new java.awt.Color(255, 153, 255));
        sely.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        sely.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select year", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        p3.add(sely, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 170, -1));

        selm.setBackground(new java.awt.Color(255, 153, 255));
        selm.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        selm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        p3.add(selm, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 200, -1));

        jButton7.setBackground(new java.awt.Color(255, 153, 255));
        jButton7.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton7.setText("See Bar Graph");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        p3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 30, 170, -1));

        chartpan.setBackground(new java.awt.Color(102, 204, 255));
        chartpan.setLayout(new java.awt.BorderLayout());
        p3.add(chartpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 1100, 530));

        jButton13.setBackground(new java.awt.Color(255, 153, 255));
        jButton13.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton13.setText("See Line Graph");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        p3.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 170, -1));

        pan7.addTab("", p3);

        p4.setBackground(new java.awt.Color(102, 204, 255));

        p6.setBackground(new java.awt.Color(102, 204, 255));
        p6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sely1.setBackground(new java.awt.Color(255, 153, 255));
        sely1.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        sely1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select year", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        p6.add(sely1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 170, -1));

        selm1.setBackground(new java.awt.Color(255, 153, 255));
        selm1.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        selm1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        p6.add(selm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 200, -1));

        jButton9.setBackground(new java.awt.Color(255, 153, 255));
        jButton9.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton9.setText("See Bar Graph");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        p6.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, 170, -1));

        chartpan1.setBackground(new java.awt.Color(102, 204, 255));
        chartpan1.setForeground(new java.awt.Color(102, 204, 255));
        chartpan1.setLayout(new java.awt.BorderLayout());
        p6.add(chartpan1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 1100, 530));

        jButton11.setBackground(new java.awt.Color(255, 153, 255));
        jButton11.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton11.setText("See Line Graph");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        p6.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 170, -1));

        javax.swing.GroupLayout p4Layout = new javax.swing.GroupLayout(p4);
        p4.setLayout(p4Layout);
        p4Layout.setHorizontalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
            .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, 1130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        p4Layout.setVerticalGroup(
            p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(p4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(p6, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pan7.addTab("", p4);

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));

        p7.setBackground(new java.awt.Color(102, 204, 255));
        p7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sely2.setBackground(new java.awt.Color(255, 153, 255));
        sely2.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        sely2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select year", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035", "2036", "2037", "2038", "2039", "2040" }));
        p7.add(sely2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 170, -1));

        selm2.setBackground(new java.awt.Color(255, 153, 255));
        selm2.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        selm2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        p7.add(selm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 200, -1));

        jButton10.setBackground(new java.awt.Color(255, 153, 255));
        jButton10.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton10.setText("See Line Graph");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        p7.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 30, 170, -1));

        chartpan2.setBackground(new java.awt.Color(102, 204, 255));
        chartpan2.setLayout(new java.awt.BorderLayout());
        p7.add(chartpan2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1130, 520));

        jButton14.setBackground(new java.awt.Color(255, 153, 255));
        jButton14.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton14.setText("See Bar Graph");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        p7.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, 170, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1130, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, 1130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(p7, javax.swing.GroupLayout.PREFERRED_SIZE, 597, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pan7.addTab("", jPanel2);

        getContentPane().add(pan7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 1130, 630));

        jButton3.setBackground(new java.awt.Color(153, 255, 132));
        jButton3.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/exit small.png"))); // NOI18N
        jButton3.setText("Back To Main Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 600, 200, 30));

        jButton4.setBackground(new java.awt.Color(153, 255, 132));
        jButton4.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton4.setText("Accounts Created/Submited");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 220, 30));

        jButton5.setBackground(new java.awt.Color(153, 255, 132));
        jButton5.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton5.setText("Requests / Complains");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 220, 30));

        jButton6.setBackground(new java.awt.Color(153, 255, 132));
        jButton6.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton6.setText("Main Menu Of Statistics");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 220, 30));

        jButton8.setBackground(new java.awt.Color(153, 255, 132));
        jButton8.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/change Password.png"))); // NOI18N
        jButton8.setText("Change Password/User Id");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 230, 30));

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void uname1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uname1ActionPerformed
    }//GEN-LAST:event_uname1ActionPerformed

    private void pword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pword2ActionPerformed
    }//GEN-LAST:event_pword2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String a = uname.getText();
        String b = pword.getText();
        String c = uname1.getText();
        String d = pword1.getText();
        String e = pword2.getText();

        if (d.equals(e) && d != null && e != null && a != null && b != null && c != null) {

            try {
                String sql = " SELECT * FROM bank WHERE sadmin=? AND spassword=? ";
                pst = con1.prepareCall(sql);
                pst.setString(1, a);
                pst.setString(2, b);

                rs = pst.executeQuery();

                if (rs.next()) {

                    try {

                        con1 = DBManager.conu();
                        pst = con1.prepareStatement("update bank set sadmin= ? ,spassword=?  where id=? ");
                        pst.setString(1, c);
                        pst.setString(2, d);
                        pst.setInt(3, 1);
                        pst.executeUpdate();

                        JOptionPane.showMessageDialog(this, "DETAILS UPDATED");

                    } catch (HeadlessException | SQLException ex) {

                    }

                }
            } catch (SQLException ex) {
            }
        } else {

            JOptionPane.showMessageDialog(this, "Password Did not match (or)details must be wrong");
            uname.setText("");
            pword.setText("");
            uname1.setText("");
            pword1.setText("");
            pword2.setText("");
        }
        uname.setText("");
        pword.setText("");
        uname1.setText("");
        pword1.setText("");
        pword2.setText("");


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pan7.setSelectedIndex(2);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        pan7.setSelectedIndex(1);
        int n1 = 0, n2 = 0, n3 = 0;

        try {
            con1 = DBManager.conu();
            pst = con1.prepareStatement("select * from user");
            rs = pst.executeQuery();

            while (rs.next()) {
                if (rs.getString("acnumber") != null) {
                    n1++;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con1 = DBManager.conu();
            pst = con1.prepareStatement("select * from user");
            rs = pst.executeQuery();

            while (rs.next()) {
                if (rs.getString("complain") != null && rs.getString("responce") == null) {
                    n2++;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            con1 = DBManager.conu();
            pst = con1.prepareStatement("select * from user");
            rs = pst.executeQuery();

            while (rs.next()) {
                if (rs.getString("acnumber") == null && rs.getString("father") == null) {
                    n3++;
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
        }

        DefaultCategoryDataset barChartData = new DefaultCategoryDataset();

        barChartData.setValue(n1, "No Of Accounts", "Running Accounts");
        barChartData.setValue(n2, "No Of Accounts", "Complaints / Requests");
        barChartData.setValue(n3, "No Of Accounts", "New Accounts Requested");

        JFreeChart barChart = ChartFactory.createBarChart("Graph Of Accounts/Requests/New Accounts", null, "Number Of Accounts", barChartData, PlotOrientation.VERTICAL, false, false, false);
        CategoryPlot barchrt = barChart.getCategoryPlot();
        barchrt.setRangeGridlinePaint(Color.BLUE);

        ChartPanel barPanel = new ChartPanel(barChart);
        p2.removeAll();
        p2.add(barPanel, BorderLayout.CENTER);
        p2.validate();

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SuperAdminDashboard statistics = new SuperAdminDashboard(superadminname1);
        statistics.show();
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        pan7.setSelectedIndex(0);

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        DefaultCategoryDataset dataset;
        JFreeChart chart;
        CategoryPlot catplot;
        ChartPanel cp;

        String month = selm.getSelectedItem().toString();
        String year = sely.getSelectedItem().toString();
        if (month.length() < 3 && year.length() < 5) {

            dataset = new DefaultCategoryDataset();

            try {
                con1 = DBManager.conu();
                String sql = "SELECT * FROM tracking WHERE monthh=? AND yearr=?";
                pst = con1.prepareCall(sql);
                pst.setString(1, month);
                pst.setString(2, year);
                rs = pst.executeQuery();

                while (rs.next()) {
                    dataset.setValue(rs.getInt("inn"), "Diposite", rs.getString("dayy"));
                    dataset.setValue(rs.getInt("outt"), "Withdraw", rs.getString("dayy"));

                }

            } catch (SQLException e) {
            }
            String headline = "Month : " + month + "  Year : " + year;
            chart = ChartFactory.createBarChart3D("Transactions", headline, "Amount In Rupees", dataset, PlotOrientation.VERTICAL, true, true, false);

            catplot = chart.getCategoryPlot();
            cp = new ChartPanel(chart);
            chartpan.removeAll();
            chartpan.add(cp, BorderLayout.CENTER);
            chartpan.validate();

        } else {
            JOptionPane.showMessageDialog(this, "SELECT MONTH AND YEAR");
        }


    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        DefaultCategoryDataset dataset;
        JFreeChart chart;
        CategoryPlot catplot;
        ChartPanel cp;

        String month = selm1.getSelectedItem().toString();
        String year = sely1.getSelectedItem().toString();
        if (month.length() < 3 && year.length() < 5) {

            dataset = new DefaultCategoryDataset();

            try {
                con1 = DBManager.conu();
                String sql = "SELECT * FROM tracking WHERE monthh=? AND yearr=?";
                pst = con1.prepareCall(sql);
                pst.setString(1, month);
                pst.setString(2, year);
                rs = pst.executeQuery();

                while (rs.next()) {
                    dataset.setValue(rs.getInt("acc1"), "New Accounts Submitted", rs.getString("dayy"));
                    dataset.setValue(rs.getInt("acc2"), "Accounts Created", rs.getString("dayy"));

                }

            } catch (SQLException e) {
            }
            String headline = "Month : " + month + "  Year : " + year;
            chart = ChartFactory.createBarChart3D("Accounts", headline, "No Of Accounts", dataset, PlotOrientation.VERTICAL, true, true, false);

            catplot = chart.getCategoryPlot();
            cp = new ChartPanel(chart);
            chartpan1.removeAll();
            chartpan1.add(cp, BorderLayout.CENTER);
            chartpan1.validate();

        } else {
            JOptionPane.showMessageDialog(this, "SELECT MONTH AND YEAR");
        }


    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        DefaultCategoryDataset dataset;
        JFreeChart chart;
        CategoryPlot catplot;
        ChartPanel cp;

        String month = selm2.getSelectedItem().toString();
        String year = sely2.getSelectedItem().toString();
        if (month.length() < 3 && year.length() < 5) {

            dataset = new DefaultCategoryDataset();
            try {
                con1 = DBManager.conu();
                String sql = "SELECT * FROM tracking WHERE monthh=? AND yearr=?";
                pst = con1.prepareCall(sql);
                pst.setString(1, month);
                pst.setString(2, year);
                rs = pst.executeQuery();

                while (rs.next()) {
                    dataset.setValue(rs.getInt("comp1"), "Request Submitted by customers", rs.getString("dayy"));
                    dataset.setValue(rs.getInt("comp2"), "Responce Submitted by bank staffs", rs.getString("dayy"));

                }

            } catch (SQLException e) {
            }
            String headline = "Month : " + month + "  Year : " + year;
            chart = ChartFactory.createLineChart("Complains / Requests", headline, "No Of Accounts", dataset, PlotOrientation.VERTICAL, true, true, false);

            catplot = chart.getCategoryPlot();
            cp = new ChartPanel(chart);
            chartpan2.removeAll();
            chartpan2.add(cp, BorderLayout.CENTER);
            chartpan2.validate();

        } else {
            JOptionPane.showMessageDialog(this, "SELECT MONTH AND YEAR");
        }

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        pan7.setSelectedIndex(3);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        pan7.setSelectedIndex(4);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        DefaultCategoryDataset dataset;
        JFreeChart chart;
        CategoryPlot catplot;
        ChartPanel cp;

        String month = selm1.getSelectedItem().toString();
        String year = sely1.getSelectedItem().toString();
        if (month.length() < 3 && year.length() < 5) {

            dataset = new DefaultCategoryDataset();

            try {
                con1 = DBManager.conu();
                String sql = "SELECT * FROM tracking WHERE monthh=? AND yearr=?";
                pst = con1.prepareCall(sql);
                pst.setString(1, month);
                pst.setString(2, year);
                rs = pst.executeQuery();

                while (rs.next()) {
                    dataset.setValue(rs.getInt("acc1"), "New Accounts Submitted", rs.getString("dayy"));
                    dataset.setValue(rs.getInt("acc2"), "Accounts Created", rs.getString("dayy"));

                }

            } catch (SQLException e) {
            }
            String headline = "Month : " + month + "  Year : " + year;
            chart = ChartFactory.createLineChart("Accounts", headline, "No Of Accounts", dataset, PlotOrientation.VERTICAL, false, true, false);

            catplot = chart.getCategoryPlot();
            cp = new ChartPanel(chart);
            chartpan1.removeAll();
            chartpan1.add(cp, BorderLayout.CENTER);
            chartpan1.validate();

        } else {
            JOptionPane.showMessageDialog(this, "SELECT MONTH AND YEAR");
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        DefaultCategoryDataset dataset;
        JFreeChart chart;
        CategoryPlot catplot;
        ChartPanel cp;

        String month = selm.getSelectedItem().toString();
        String year = sely.getSelectedItem().toString();
        if (month.length() < 3 && year.length() < 5) {

            dataset = new DefaultCategoryDataset();

            try {
                con1 = DBManager.conu();
                String sql = "SELECT * FROM tracking WHERE monthh=? AND yearr=?";
                pst = con1.prepareCall(sql);
                pst.setString(1, month);
                pst.setString(2, year);
                rs = pst.executeQuery();

                while (rs.next()) {
                    dataset.setValue(rs.getInt("inn"), "Diposite", rs.getString("dayy"));
                    dataset.setValue(rs.getInt("outt"), "Withdraw", rs.getString("dayy"));

                }

            } catch (SQLException e) {
            }
            String headline = "Month : " + month + "  Year : " + year;
            chart = ChartFactory.createLineChart("Transactions", headline, "Amount In Rupees", dataset, PlotOrientation.VERTICAL, true, true, false);

            catplot = chart.getCategoryPlot();
            cp = new ChartPanel(chart);
            chartpan.removeAll();
            chartpan.add(cp, BorderLayout.CENTER);
            chartpan.validate();

        } else {
            JOptionPane.showMessageDialog(this, "SELECT MONTH AND YEAR");
        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        DefaultCategoryDataset dataset;
        JFreeChart chart;
        CategoryPlot catplot;
        ChartPanel cp;

        String month = selm2.getSelectedItem().toString();
        String year = sely2.getSelectedItem().toString();
        if (month.length() < 3 && year.length() < 5) {

            dataset = new DefaultCategoryDataset();

            try {
                con1 = DBManager.conu();
                String sql = "SELECT * FROM tracking WHERE monthh=? AND yearr=?";
                pst = con1.prepareCall(sql);
                pst.setString(1, month);
                pst.setString(2, year);
                rs = pst.executeQuery();

                while (rs.next()) {
                    dataset.setValue(rs.getInt("comp1"), "Request Submitted by customers", rs.getString("dayy"));
                    dataset.setValue(rs.getInt("comp2"), "Responce Submitted by bank staffs", rs.getString("dayy"));

                }

            } catch (SQLException e) {
            }
            String headline = "Month : " + month + "  Year : " + year;
            chart = ChartFactory.createBarChart3D("Complains / Requests", headline, "No Of Accounts", dataset, PlotOrientation.VERTICAL, true, true, false);

            catplot = chart.getCategoryPlot();
            cp = new ChartPanel(chart);
            chartpan2.removeAll();
            chartpan2.add(cp, BorderLayout.CENTER);
            chartpan2.validate();

        } else {
            JOptionPane.showMessageDialog(this, "SELECT MONTH AND YEAR");
        }
    }//GEN-LAST:event_jButton14ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel chartpan;
    private javax.swing.JPanel chartpan1;
    private javax.swing.JPanel chartpan2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JPanel p4;
    private javax.swing.JPanel p5;
    private javax.swing.JPanel p6;
    private javax.swing.JPanel p7;
    private javax.swing.JTabbedPane pan7;
    private javax.swing.JPasswordField pword;
    private javax.swing.JPasswordField pword1;
    private javax.swing.JPasswordField pword2;
    private javax.swing.JComboBox<String> selm;
    private javax.swing.JComboBox<String> selm1;
    private javax.swing.JComboBox<String> selm2;
    private javax.swing.JComboBox<String> sely;
    private javax.swing.JComboBox<String> sely1;
    private javax.swing.JComboBox<String> sely2;
    private javax.swing.JTextField uname;
    private javax.swing.JTextField uname1;
    // End of variables declaration//GEN-END:variables
}
