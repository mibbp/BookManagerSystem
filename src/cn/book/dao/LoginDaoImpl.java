package cn.book.dao;

import cn.book.pojo.User;

import java.sql.*;

public class LoginDaoImpl implements LoginDao{
    @Override
    public User LogDao(User user) {
        String id = user.getUid();
        String pwd = user.getPwd();

        String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=book";
        Connection connection;
        User u =null;
        try {
            connection = DriverManager.getConnection(url,"sa","llh2002908");

            PreparedStatement pre = null;
            Statement stat = connection.createStatement();//创建一个 Statement 对象来将 SQL 语句发送到数据库。
//            ResultSet res=stat.executeQuery("select * from [dbo].[user]");
            ResultSet res = null;
            String sql="select * from [dbo].[user] where u_id="+id+"and u_pwd = "+pwd+" ";
            System.out.println(sql);
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
            e.printStackTrace();
        }// 连接数据库cpp



        return u;
    }
}