package cn.book.service;
import cn.book.dao.FileDao;
import cn.book.dao.FileDaoImpl;
import cn.book.pojo.Book;
import cn.book.pojo.User;
import java.util.Set;
import java.util.List;
public class FileServiceImpl implements FileService{

    FileDao fd = new FileDaoImpl();

    public List<User> getAllUser(){
        return fd.getAllUser();

    }

    @Override
    public User getAdmainUser(String admid) {
        if(admid.equals("")||admid.trim()==null){
            return null;
        }
        else return fd.getUserByidOrName(admid);
    }

    @Override
    public List<Book> getAllBook() {
        return fd.getAllBook();
    }

    @Override
    public List<Book> getBookByNameOrId(String goalFile) {
        return fd.getBookByNameOrId(goalFile);
    }

    @Override
    public void upBookNum(String bookId, String number, String price) {
        fd.upBookNum(bookId,number,price);
    }



}
