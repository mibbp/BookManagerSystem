package cn.book.service;
import cn.book.pojo.Book;
import cn.book.pojo.BookLendType;
import cn.book.pojo.User;
import java.util.Set;
import java.util.List;

public interface FileService {

    public List<User> getAllUser();

    User getAdmainUser(String admid);

    List<Book> getAllBook();

    List<Book> getBookByNameOrId(String goalFile);


    void upBookNum(String bookId, String number, String price);

    void addBook(String a, String b, String c, String d, String e, String f, String g, String h, String l);

    List<BookLendType> getLendFile(String bookid);


    List<BookLendType> getLendFileByUserName(String username);

    void lendBook(String bookid,int lendnum,int times);

    void addLendRecode(String l_id, String bookid, String uid, String ltime);

    List<BookLendType> getUserfullLendFile(String uid);

    String getBookid(String lendid);

    void retBook(String lendid, String time);

    void reduce(String bookid);

    List<BookLendType> getMyLendFile(String deal, String myid);


    void uppwd(String pwd, String myid, String name, String sex, String idcard);
}
