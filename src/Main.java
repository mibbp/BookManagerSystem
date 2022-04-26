
import java.sql.*;
public class Main {
    public static void main(String args[]) {
        String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=selectcourse";
        Connection conn;
        try {
            conn = DriverManager.getConnection(url,"sa","llh2002908");
            Statement stat = conn.createStatement();//创建一个 Statement 对象来将 SQL 语句发送到数据库。
            ResultSet resultSet=stat.executeQuery("select * from student");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("Sno"));
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }// 连接数据库cpp
    }


}
