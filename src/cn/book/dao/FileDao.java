package cn.book.dao;

import cn.book.pojo.Book;
import cn.book.pojo.BookLendType;
import cn.book.pojo.User;

import java.util.Set;
import java.util.List;

public interface FileDao {
    public List<User> getAllUser();

    User getUserByidOrName(String admid);

    List<Book> getAllBook();

    List<Book> getBookByNameOrId(String goalFile);

    void upBookNum(String bookId, String number, String price);

    void addBook(String a, String b, String c, String d, String e, String f, String g, String h, String l);

    List<BookLendType> getLendFile(String bookid);

    List<BookLendType> getLendFileByUserName(String username);
}
