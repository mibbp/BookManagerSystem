package cn.book.dao;

import cn.book.pojo.*;

import java.sql.*;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Set;
import java.util.List;
import cn.book.pojo.User;
import java.util.Date;

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

    @Override
    public void upBookNum(String bookId, String number, String price) {
        /*
        改变图书信息
UPDATE [dbo].[books] set book_num=10,book_price=24 where book_id='b101121';
         */
        String sql = "UPDATE [dbo].[books] set book_num="+number+",book_price="+price+" where book_id='"+bookId+"'";
        deal(sql);



    }

    @Override
    public void addBook(String a, String b, String c, String d, String e, String f, String g, String h, String l) {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
        String bid = "b"+sdf.format(date);
//        Insert Into [dbo].[books] Values
//('b567823','母猪产后护理','生物护理',5,30,2,589-176-8-2,'四川省南充市','四川大学出版社','刘龙浩','2022第七版',5);
        String sql = "Insert Into [dbo].[books] Values('"+bid+"','"+a+"','"+b+"',"+c+","+d+",0,"+e+",'"+f+"','"+g+"','"+h+"','"+l+"',0)";

        deal(sql);
    }

    public List<BookLendType> getLendFiles(String sql){
        String url = "jdbc:sqlserver://localhost:1433;databaseName=book";
        Connection connection;
        List<BookLendType> list = null;
        System.out.println(sql);
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
                list = new ArrayList<BookLendType>();
                pre = connection.prepareStatement(sql);
                res=pre.executeQuery();
                while(res.next()){
                    BookLendType blt = new BookLendType();
                    blt.setLend_id(res.getString("a"));
                    blt.setLend_name(res.getString("b"));
                    blt.setLend_ltime(res.getString("c"));
                    blt.setLend_rtime(res.getString("d"));
                    blt.setLend_type(res.getString("e"));

                    list.add(blt);
                }



            } catch (SQLException throwables){
                System.out.println("catch1");
                throwables.printStackTrace();
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("catch");
            e.printStackTrace();
        }// 连接数据库cpp

        return list;
    }


    @Override
    public List<BookLendType> getLendFile(String bookid) {
        String sql = null;
        System.out.println(bookid);
        if(bookid.equals("all")){
            sql = "Select l_id AS a,book_name AS b,l_ltime AS c ,r_rtime AS d, case l_state when 0 then '未归还'  when 1 then '已归还' else '查询不到信息' end AS e" +
                    " From [dbo].[booklend] Join [dbo].[books] on l_bookid=book_id";

        }
        else if(bookid.equals("retBook")){
            //还
            sql = "Select l_id AS a,book_name AS b,l_ltime AS c ,r_rtime AS d, case l_state when 0 then '未归还'  when 1 then '已归还' else '查询不到信息' end AS e" +
                    " From [dbo].[booklend] Join [dbo].[books] on l_bookid=book_id "+"Where l_state=1";
        }
        else if(bookid.equals("unretBook")){
            sql = "Select l_id AS a,book_name AS b,l_ltime AS c ,r_rtime AS d, case l_state when 0 then '未归还'  when 1 then '已归还' else '查询不到信息' end AS e" +
                    " From [dbo].[booklend] Join [dbo].[books] on l_bookid=book_id "+"Where l_state=0";
        }
        else{
            sql = "Select u_name AS a, book_name AS b,l_ltime AS c,r_rtime AS d," +
                    "case l_state when 0 then '未归还'  when 1 then '已归还' else '查询不到信息' end AS e " +
                    "From [dbo].[booklend] Join[dbo].[user] on l_uid=u_id Join [dbo].[books] on l_bookid=book_id " +
                    "Where book_id='"+bookid+"'";
        }


        return getLendFiles(sql);
    }

    @Override
    public List<BookLendType> getLendFileByUserName(String username) {
        String sql="Select l_id a,book_name b,l_ltime c,r_rtime d,case l_state when 0 then '未归还'  when 1 then '已归还' else '查询不到信息' end e"
                + " From [dbo].[booklend] Join [dbo].[user] on l_uid = u_id Join [dbo].[books] on l_bookid=book_id" +
                " Where u_name ='"+username+"'";
//        System.out.println(sql);
        return getLendFiles(sql);
    }

    @Override
    public void lendBook(String bookid,int lendnum,int times) {
        String sql = "Update [dbo].[books] Set book_lend="+lendnum+",book_times="+times+" where book_id = '"+bookid+"'";
        System.out.println(sql);
        deal(sql);
    }

    @Override
    public void addLendRecode(String l_id, String bookid, String uid, String ltime) {
        String sql ="Insert Into [dbo].[booklend] Values('"+l_id+"','"+bookid+"','"+uid+"','"+ltime+"',NULL,0)";
        deal(sql);
    }

    @Override
    public List<BookLendType> getUserfullLendFile(String uid) {
        String sql="Select l_id a,book_name b,l_ltime c,r_rtime d,case l_state when 0 then '未归还'  when 1 then '已归还' else '查询不到信息' end e" +
                " From [dbo].[booklend] Join [dbo].[user] on l_uid = u_id Join [dbo].[books] on l_bookid=book_id" +
                " Where l_uid ='"+uid+"'";
        System.out.println(sql);
        return getLendFiles(sql);
    }

    @Override
    public String getBookid(String lendid) {
        String sql = "Select l_bookid AS a From [dbo].[booklend] Where l_id ='"+lendid+"'";
        String url = "jdbc:sqlserver://localhost:1433;databaseName=book";
        Connection connection;
        List<BookLendType> list = null;
        System.out.println(sql);
        String bookid = null;
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
                list = new ArrayList<BookLendType>();
                pre = connection.prepareStatement(sql);
                res=pre.executeQuery();
                while(res.next()){
                    bookid = res.getString("a");
                }
            } catch (SQLException throwables){
                System.out.println("catch1");
                throwables.printStackTrace();
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("catch");
            e.printStackTrace();
        }// 连接数据库cpp
        return bookid;
    }

    @Override
    public void retBook(String lendid, String time) {
        String sql="Update [dbo].[booklend] Set r_rtime = '"+time+"',l_state=1 Where l_id='"+lendid+"'";
        deal(sql);
    }

    @Override
    public void reduce(String bookid) {
        String sql = "Update [dbo].[books] Set book_lend = book_lend-1 Where book_id = '"+bookid+"'";
        deal(sql);
    }

    @Override
    public List<BookLendType> getMyLendFile(String deal, String myid) {

        String sql = null;
//        System.out.println(deal);
        if(deal.equals("all")){
            sql = "Select l_id AS a,book_name AS b,l_ltime AS c ,r_rtime AS d, case l_state when 0 then '未归还'  when 1 then '已归还' else '查询不到信息' end AS e" +
                    " From [dbo].[booklend] Join [dbo].[books] on l_bookid=book_id AND l_uid ='"+myid+"'";

        }
        else if(deal.equals("retBook")){
            //还
            sql = "Select l_id AS a,book_name AS b,l_ltime AS c ,r_rtime AS d, case l_state when 0 then '未归还'  when 1 then '已归还' else '查询不到信息' end AS e" +
                    " From [dbo].[booklend] Join [dbo].[books] on l_bookid=book_id "+"Where l_state=1 AND l_uid ='"+myid+"'";
        }
        else if(deal.equals("unretBook")){
            sql = "Select l_id AS a,book_name AS b,l_ltime AS c ,r_rtime AS d, case l_state when 0 then '未归还'  when 1 then '已归还' else '查询不到信息' end AS e" +
                    " From [dbo].[booklend] Join [dbo].[books] on l_bookid=book_id "+"Where l_state=0 AND l_uid ='"+myid+"'";
        }



        return getLendFiles(sql);



    }

    @Override
    public void uppwd(String pwd, String myid, String name, String sex, String idcard) {
//        Update [dbo].[user] Set u_pwd='1',u_name='刘龙浩',u_sex='女',u_idcard ='511526200301130510' Where u_id='1'
        String sql="Update [dbo].[user] Set u_pwd='"+pwd+"',u_name='"+name+"',u_sex='"+sex+"',u_idcard ='"+idcard+"' Where u_id='"+myid+"'";
        deal(sql);
    }

    @Override
    public void lendcard(String myid, String card_id) {
//        Update [dbo].[user] Set u_lendcard ='123456' , u_state=1 Where u_id='1'
        String sql="Update [dbo].[user] Set u_lendcard ='"+card_id+"' , u_state=1 Where u_id='"+myid+"'";
        deal(sql);

    }

    @Override
    public void backup(String time) {
        String sql = "Backup Database book\n" +
                "to disk = 'C:\\Program Files\\Microsoft SQL Server\\MSSQL10.SQLEXPRESS\\MSSQL\\Backup\\book"+time+".bak'";
        String sql1 ="Insert Into [dbo].[bookbackup] Values('"+time+"')";
//        System.out.println(sql);
        deal(sql);
        deal(sql1);
    }

    @Override
    public List<bookbackup> getAllbackup() {
        List <bookbackup> arr = new ArrayList<bookbackup>();

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
            String sql="select * from [dbo].[bookbackup]";
            System.out.println(sql);
            try {
                pre = connection.prepareStatement(sql);
                res=pre.executeQuery();
                while(res.next()){
                    bookbackup u = new bookbackup();

                    u.setBackup_id(res.getString("backup_id"));

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
    public void redo(String backupid) {
//        Use Master
//Go
//ALTER DATABASE book SET SINGLE_USER WITH ROLLBACK IMMEDIATE;
//restore database book from disk= 'C:\Program Files\Microsoft SQL Server\MSSQL10.SQLEXPRESS\MSSQL\Backup\book.bak' WITH REPLACE;
//ALTER DATABASE book SET MULTI_USER WITH ROLLBACK IMMEDIATE;
        String sql = "Use Master Go " + "ALTER DATABASE book SET SINGLE_USER WITH ROLLBACK IMMEDIATE" +
                "restore database book from disk= 'C:\\Program Files\\Microsoft SQL Server\\MSSQL10.SQLEXPRESS\\MSSQL\\Backup\\book+"+backupid+".bak' WITH REPLACE;\n" +
                "ALTER DATABASE book SET MULTI_USER WITH ROLLBACK IMMEDIATE";
        System.out.println(sql);
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

