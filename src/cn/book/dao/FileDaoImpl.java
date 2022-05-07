package cn.book.dao;

import cn.book.pojo.Book;
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
//            ResultSet res=stat.executeQuery("select * from [dbo].[user]");
            ResultSet res = null;
            String sql="select * from [dbo].[user] where u_id!='0'";
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
            System.out.println("catch");
            e.printStackTrace();
        }// 连接数据库cpp





        return arr;
    }

    @Override
    public User getUserByidOrName(String admid) {

        String url = "jdbc:sqlserver://localhost:1433;databaseName=book";
        Connection connection;
        User u =null;


        try {


            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            connection = DriverManager.getConnection(url,"sa","llh2002908");

            PreparedStatement pre = null;
            ResultSet res = null;

            String sql="select * from [dbo].[user] Where u_id ='"+admid+"' OR u_name Like '%"+admid+"%'";
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

    @Override
    public List<Book> getAllBook() {
        List <Book> arr = new ArrayList<Book>();

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
//            ResultSet res=stat.executeQuery("select * from [dbo].[user]");
            ResultSet res = null;
            String sql="select * from [dbo].[books]";
            try {
                pre = connection.prepareStatement(sql);
                res=pre.executeQuery();
                while(res.next()){
                    Book book = new Book();
                    book.setBook_id(res.getString("book_id"));
                    book.setBook_name(res.getString("book_name"));
                    book.setBook_type(res.getString("book_type"));
                    book.setBook_num(res.getInt("book_num"));
                    book.setBook_price(res.getDouble("book_price"));
                    book.setBook_lend(res.getInt("book_lend"));
                    book.setBook_ISBN(res.getString("book_ISBN"));
                    book.setBook_address(res.getString("book_address"));
                    book.setBook_author(res.getString("book_author"));
                    book.setBook_edition(res.getString("book_edition"));
                    book.setBook_times(res.getInt("book_times"));


                    arr.add(book);
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





        return arr;
    }

    @Override
    public List<Book> getBookByNameOrId(String goalFile) {
        List <Book> arr = new ArrayList<Book>();

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
//            ResultSet res=stat.executeQuery("select * from [dbo].[user]");
            ResultSet res = null;
//Select * From [dbo].[books] Where book_id ='b' OR book_name Like '%Java%';
            String sql="select * from [dbo].[books] Where book_id ='"+goalFile+"' OR book_name Like '%"+goalFile+"%' OR book_type like '%"+goalFile+"%'";
            try {
                pre = connection.prepareStatement(sql);
                res=pre.executeQuery();
                while(res.next()){
                    Book book = new Book();
                    book.setBook_id(res.getString("book_id"));
                    book.setBook_name(res.getString("book_name"));
                    book.setBook_type(res.getString("book_type"));
                    book.setBook_num(res.getInt("book_num"));
                    book.setBook_price(res.getDouble("book_price"));
                    book.setBook_lend(res.getInt("book_lend"));
                    book.setBook_ISBN(res.getString("book_ISBN"));
                    book.setBook_address(res.getString("book_address"));
                    book.setBook_author(res.getString("book_author"));
                    book.setBook_edition(res.getString("book_edition"));
                    book.setBook_times(res.getInt("book_times"));


                    arr.add(book);
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





        return arr;
    }
}
