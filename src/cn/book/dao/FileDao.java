package cn.book.dao;

import cn.book.pojo.Book;
import cn.book.pojo.User;

import java.util.Set;
import java.util.List;

public interface FileDao {
    public List<User> getAllUser();

    User getUserByidOrName(String admid);

    List<Book> getAllBook();

    List<Book> getBookByNameOrId(String goalFile);

    void upBookNum(String bookId, String number, String price);
}
