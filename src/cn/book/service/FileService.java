package cn.book.service;
import cn.book.pojo.Book;
import cn.book.pojo.User;
import java.util.Set;
import java.util.List;

public interface FileService {

    public List<User> getAllUser();

    User getAdmainUser(String admid);

    List<Book> getAllBook();

    List<Book> getBookByNameOrId(String goalFile);


    void upBookNum(String bookId, String number, String price);
}
