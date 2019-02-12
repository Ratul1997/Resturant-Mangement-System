
import java.sql.*;
import java.util.Arrays;
import java.util.Vector;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class DatabaseData {

    private final String username = "root";
    private final String password = "";
    private final String url = "jdbc:mysql://localhost:3306/ratulTest";

    public Vector<String[]> homeDelivery() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, username, password);

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("select * from HomeDelivery");

        Vector<String[]> v = new Vector<String[]>(rs.getRow());
        while (rs.next()) {
            String orderNo = rs.getString(1);
            String emailAddress = rs.getString(2);
            String phoneNumber = rs.getString(3);
            String address = rs.getString(4);
            String status = rs.getString(5);
            String orders = rs.getString(6);
            String[] content = {orderNo, emailAddress, phoneNumber, address, orders, status};
            v.add(content);
        }
        con.close();
        stmt.close();
        rs.close();
        return v;
    }

    public void updateHomeDeliveryStatus(String status, String number) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, username, password);

        Statement stmt = con.createStatement();
        stmt.executeUpdate("update HomeDelivery set Status = '" + status + "' where `Order No` = '" + number + "'");

        stmt.close();
        con.close();

    }

    public void insertHomeDelivery(String email, String phone, String address, String order) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, username, password);

        Statement stmt = con.createStatement();

        String querry = "INSERT INTO HomeDelivery (`Email`,`Phone`,`Address`,`Status`,`orders`)"
                + "VALUES ('" + email + "','" + phone + "','" + address + "', 'Pending' , '" + order + "')";

        stmt.executeUpdate(querry);
        stmt.close();
        con.close();
    }

    public boolean checkOwner(String id) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, username, password);

        Statement stmt = con.createStatement();

        String querry = "Select * from Owner Where `ID`= '" + id + "'";

        ResultSet rs = stmt.executeQuery(querry);

        if (rs.next()) {
            return true;
        } else {
            return false;
        }
    }

}
