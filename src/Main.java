
import java.sql.*;
public class Main {
    public static void main(String args[]) {
        String url = "jdbc:sqlserver://(服务器地址:端口号）;databaseName=book";
        Connection conn;
        try {
            conn = DriverManager.getConnection(url,"sa","(密码)");
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
