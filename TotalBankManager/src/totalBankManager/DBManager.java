package totalBankManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBManager {

    static String aa, ac, bn, ifs, refreshdate, link1, link2;
    Connection con1 = null;
    PreparedStatement pst;
    ResultSet rs;

    public static Connection conu() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/miniproject2", "root", "");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.print(e);
        }
        return con;
    }

    public static void temp() {
        Connection con1 = DBManager.conu();
        PreparedStatement pst;
        ResultSet rs;
        try {
            String sql = " SELECT * FROM bank WHERE id=? ";
            pst = con1.prepareCall(sql);
            pst.setInt(1, 1);
            rs = pst.executeQuery();
            if (rs.next()) {
                aa = rs.getString("anouncementA");
                ac = rs.getString("anouncementC");
                bn = rs.getString("bname");
                ifs = rs.getString("IFSC");
                refreshdate = rs.getString("date");
                link1 = rs.getString("link1");
                link2 = rs.getString("link2");

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static boolean isNumeric(String string) {
        boolean numeric = true;
        if (string != null) {
            try {
                Double num = Double.valueOf(string);
            } catch (NumberFormatException e) {
                numeric = false;
            }
        }
        return numeric;
    }

    public static void check() {
        Connection con;
        PreparedStatement insert;
        Date thisDate = new Date();

        SimpleDateFormat dateForm = new SimpleDateFormat("dd-MM-Y");
        String date = dateForm.format(thisDate);

        String prevdate = DBManager.refreshdate;
        if (date.compareTo(prevdate) != 0) {
            try {

                con = DBManager.conu();
                insert = con.prepareStatement("update user set remainammount= ? WHERE actype=? ");
                insert.setInt(1, 40000);
                insert.setString(2, "SAVING ACCOUNT");
                insert.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {

                con = DBManager.conu();
                insert = con.prepareStatement("update user set remainammount= ? WHERE actype=? ");
                insert.setInt(1, 999999999);
                insert.setString(2, "CURRENT ACCOUNT");
                insert.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
            }
            //for tracking database

            //initiation
            try {
                con = DBManager.conu();
                SimpleDateFormat dateForm1 = new SimpleDateFormat("Y");
                SimpleDateFormat dateForm2 = new SimpleDateFormat("MM");
                String date1 = dateForm1.format(thisDate);
                String date2 = dateForm2.format(thisDate);
                SimpleDateFormat dateForm3 = new SimpleDateFormat("dd");
                String date3 = dateForm3.format(thisDate);
                insert = con.prepareStatement("insert into tracking(datee,dayy,monthh,yearr)values(?,?,?,?)");
                insert.setString(1, date);
                insert.setString(2, date3);
                insert.setString(3, date2);
                insert.setString(4, date1);
                insert.executeUpdate();

            } catch (SQLException ex) {
                Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
            }
            // incremeting updating date
            try {
                con = DBManager.conu();
                insert = con.prepareStatement("update bank set date= ?  WHERE id=? ");
                insert.setInt(2, 1);
                insert.setString(1, date);
                insert.executeUpdate();
            } catch (SQLException ex) {
                Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
            }
            DBManager.temp();

        }
    }

    public void dip(long temp, String date) {

        long pre = 0;

        try {
            con1 = DBManager.conu();
            String sql = "SELECT * FROM tracking WHERE datee=?";
            pst = con1.prepareCall(sql);
            pst.setString(1, date);
            rs = pst.executeQuery();

            if (rs.next()) {
                pre = rs.getInt("inn");
            }

        } catch (SQLException e) {
        }

        try {
            con1 = DBManager.conu();
            String sql = "update tracking set inn= ? WHERE datee=? ";
            pst = con1.prepareCall(sql);
            pst.setLong(1, pre + temp);
            pst.setString(2, date);
            pst.executeUpdate();

        } catch (SQLException e) {
        }

    }

    public void with(long temp, String date) {
        long pre = 0;
        try {
            con1 = DBManager.conu();
            String sql = " SELECT * FROM tracking WHERE datee=? ";
            pst = con1.prepareCall(sql);
            pst.setString(1, date);
            rs = pst.executeQuery();
            if (rs.next()) {
                pre = rs.getInt("outt");
            }

        } catch (SQLException e) {
        }

        try {
            con1 = DBManager.conu();
            String sql = "update tracking set outt= ? WHERE datee=? ";
            pst = con1.prepareCall(sql);
            pst.setLong(1, pre + temp);
            pst.setString(2, date);
            pst.executeUpdate();

        } catch (SQLException e) {
        }

    }

    public void acc1(long temp, String date) {
        long pre = 0;
        try {
            con1 = DBManager.conu();
            String sql = " SELECT * FROM tracking WHERE datee=? ";
            pst = con1.prepareCall(sql);
            pst.setString(1, date);
            rs = pst.executeQuery();
            if (rs.next()) {
                pre = rs.getInt("acc1");
            }

        } catch (SQLException e) {
        }

        try {
            con1 = DBManager.conu();
            String sql = "update tracking set acc1= ? WHERE datee=? ";
            pst = con1.prepareCall(sql);
            pst.setLong(1, pre + temp);
            pst.setString(2, date);
            pst.executeUpdate();

        } catch (SQLException e) {
        }
    }

    public void acc2(long temp, String date) {
        long pre = 0;
        try {
            con1 = DBManager.conu();
            String sql = " SELECT * FROM tracking WHERE datee=? ";
            pst = con1.prepareCall(sql);
            pst.setString(1, date);
            rs = pst.executeQuery();
            if (rs.next()) {
                pre = rs.getInt("acc2");
            }

        } catch (SQLException e) {
        }

        try {
            con1 = DBManager.conu();
            String sql = "update tracking set acc2= ? WHERE datee=? ";
            pst = con1.prepareCall(sql);
            pst.setLong(1, pre + temp);
            pst.setString(2, date);
            pst.executeUpdate();

        } catch (SQLException e) {
        }
    }

    public void comp11(long temp, String date) {
        long pre = 0;
        try {
            con1 = DBManager.conu();
            String sql = " SELECT * FROM tracking WHERE datee=? ";
            pst = con1.prepareCall(sql);
            pst.setString(1, date);
            rs = pst.executeQuery();
            if (rs.next()) {
                pre = rs.getInt("comp1");
            }

        } catch (SQLException e) {
        }

        try {
            con1 = DBManager.conu();
            String sql = "update tracking set comp1= ? WHERE datee=? ";
            pst = con1.prepareCall(sql);
            pst.setLong(1, pre + temp);
            pst.setString(2, date);
            pst.executeUpdate();

        } catch (SQLException e) {
        }
    }

    public void comp22(long temp, String date) {
        long pre = 0;
        try {
            con1 = DBManager.conu();
            String sql = " SELECT * FROM tracking WHERE datee=? ";
            pst = con1.prepareCall(sql);
            pst.setString(1, date);
            rs = pst.executeQuery();
            if (rs.next()) {
                pre = rs.getInt("comp2");
            }

        } catch (SQLException e) {
        }

        try {
            con1 = DBManager.conu();
            String sql = "update tracking set comp2= ? WHERE datee=? ";
            pst = con1.prepareCall(sql);
            pst.setLong(1, pre + temp);
            pst.setString(2, date);
            pst.executeUpdate();

        } catch (SQLException e) {
        }
    }

}
