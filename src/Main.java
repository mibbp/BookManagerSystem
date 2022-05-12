
import java.sql.*;
public class Main {
    public static void main(String args[]) {
        String url = "jdbc:sqlserver://112.74.80.148:11433;databaseName=book";
        Connection conn;
        try {
            conn = DriverManager.getConnection(url,"sa","E6gps@1234");
            Statement stat = conn.createStatement();//创建一个 Statement 对象来将 SQL 语句发送到数据库。
            ResultSet resultSet=stat.executeQuery("select * from [dbo].[user]");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("u_name"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }// 连接数据库cpp
    }


}
