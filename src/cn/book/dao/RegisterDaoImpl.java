package cn.book.dao;

import java.sql.*;

public class RegisterDaoImpl implements RegisterDao{
    @Override
    public void addUser(String user_id, String user_name, String user_sex, String user_pwd) {
        String sql="Insert into [dbo].[user] Values ('"+user_id+"','"+user_name+"','"+user_sex+"',null,0,'"+user_pwd+"',0,1)";
        deal(sql);
    }
    private void deal(String sql) {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=book";
        Connection connection;

        try {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            connection = DriverManager.getConnection(url,"sa","llh2002908");

            PreparedStatement pre = null;
            Statement stat = connection.createStatement();//创建一个 Statement 对象来将 SQL 语句发送到数据库。
            ResultSet res = null;
            try {
                pre = connection.prepareStatement(sql);
                pre.executeUpdate();

            } catch (SQLException throwables){
                throwables.printStackTrace();
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("catch");
            e.printStackTrace();
        }// 连接数据库cpp

    }
}
