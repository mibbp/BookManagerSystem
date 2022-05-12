package cn.book.dao;

import cn.book.pojo.User;
import java.lang.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;


public class LoginDaoImpl implements LoginDao{
    @Override
    public User LogDao(User user) {
        String id = user.getUid();
        String pwd = user.getPwd();

        String url = "jdbc:sqlserver://112.74.80.148:11433;databaseName=book";
        Connection connection;
        User u =null;


        try {


            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            connection = DriverManager.getConnection(url,"sa","E6gps@1234");

            PreparedStatement pre = null;
            ResultSet res = null;

            String sql="select * from [dbo].[user] where u_id='"+id+"' and u_pwd = '"+pwd+"' ";
            System.out.println(sql);
//            System.out.println("yes");
            try {
                pre = connection.prepareStatement(sql);
                res=pre.executeQuery();
                while(res.next()){
                    u = new User();
                    u.setUid(res.getString("u_id"));
                    u.setName(res.getString("u_name"));
                    u.setSex(res.getString("u_sex"));
                    u.setIdcard(res.getString("u_idcard"));
                    u.setU_times(res.getInt("u_times"));
                    u.setPwd(res.getString("u_pwd"));
                    u.setState(res.getInt("u_state"));
                    u.setRole(res.getInt("u_role"));

                }



            } catch (SQLException throwables){
              throwables.printStackTrace();
            }

//            while (rs.next()) {
//                System.out.println(rs.getString("u_name"));
//            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("catch");
            e.printStackTrace();
        }// 连接数据库cpp



        return u;
    }
}