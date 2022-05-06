package cn.book.dao;

import cn.book.pojo.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;
import cn.book.pojo.User;

public class FileDaoImpl implements FileDao{

    @Override
    public List<User> getAllUser() {
        List <User> arr = new ArrayList<User>();

        String url = "jdbc:sqlserver://127.0.0.1:1433;databaseName=book";
        Connection connection;

        try {
            connection = DriverManager.getConnection(url,"sa","llh2002908");

            PreparedStatement pre = null;
            Statement stat = connection.createStatement();//创建一个 Statement 对象来将 SQL 语句发送到数据库。
//            ResultSet res=stat.executeQuery("select * from [dbo].[user]");
            ResultSet res = null;
            String sql="select * from [dbo].[user] where u_id!=0";
            System.out.println(sql);
            try {
                pre = connection.prepareStatement(sql);
                res=pre.executeQuery();
                while(res.next()){
                    User u = new User();

                    u.setUid(res.getString("u_id"));
                    u.setName(res.getString("u_name"));
                    u.setSex(res.getString("u_sex"));
                    u.setIdcard(res.getString("u_idcard"));
                    u.setU_times(res.getInt("u_times"));
                    u.setPwd(res.getString("u_pwd"));
                    u.setState(res.getInt("u_state"));
                    u.setRole(res.getInt("u_role"));
                    arr.add(u);
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





        return arr;
    }
}
