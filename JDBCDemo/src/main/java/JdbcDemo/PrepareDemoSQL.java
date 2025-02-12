package JdbcDemo;
import java.sql.*;
public  class PrepareDemoSQL {
    private static Object ClassNotFoundException;

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        getNewTable(13,"Darshit soni");

    }


    public static void getNewTable (int studentId,String studentName) throws ClassNotFoundException, SQLException {

        String sql = "select * from new_table where studentId= ? and studentName =?";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_student", "root", "21100BTCSDSI09468#g");
        PreparedStatement preparedStatement = con.prepareStatement(sql);
        preparedStatement.setInt(1, studentId);
        preparedStatement.setString(2, studentName);
        ResultSet rs = preparedStatement.executeQuery();
        while (rs.next()) {
            System.out.println("fetching Data from Studnet :" + studentId);
            System.out.println(rs.getString(1));
            System.out.println(rs.getString(2));
            System.out.println(rs.getString(3));
            System.out.println(rs.getString(4));
            System.out.println(rs.getString(5));
            System.out.println(rs.getString(6));


        }


    }
}