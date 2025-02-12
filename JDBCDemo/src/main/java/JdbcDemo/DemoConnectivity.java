package JdbcDemo;

import java.awt.dnd.DropTarget;
import java.sql.*;

public class DemoConnectivity{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {



        Class.forName("com.mysql.cj.jdbc.Driver");
       // Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","21100BTCSDSI09468#g");

        Statement statement = connection.createStatement();

//        ResultSet rs = statement.executeQuery("SELECT * From customer");
        int rowCount = statement.executeUpdate("update  customer set customername = 'Shivam Gurjar'  ");
        System.out.println(rowCount);



       while(rs.next()){
            System.out.println(rs.getInt(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
    }
//        while(rg.next()){
//            System.out.println(rg.getInt(1));
//            System.out.println(rg.getString(2));
//            System.out.println(rg.getString(3));
//        }
    }
}