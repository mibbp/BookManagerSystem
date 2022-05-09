package cn.book.service;
import cn.book.dao.FileDao;
import cn.book.dao.FileDaoImpl;
import cn.book.pojo.Book;
import cn.book.pojo.BookLendType;
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

    @Override
    public void addBook(String a, String b, String c, String d, String e, String f, String g, String h, String l) {
        fd.addBook(a,b,c,d,e,f,g,h,l);
    }

    @Override
    public List<BookLendType> getLendFile(String bookid) {
        return fd.getLendFile(bookid);
    }

    @Override
    public List<BookLendType> getLendFileByUserName(String username) {
        return fd.getLendFileByUserName(username);
    }

    @Override
    public void lendBook(String bookid,int lendnum,int times) {
        fd.lendBook(bookid,lendnum,times);
    }

    @Override
    public void addLendRecode(String l_id, String bookid, String uid, String ltime) {
        fd.addLendRecode(l_id,bookid,uid,ltime);
    }

    @Override
    public List<BookLendType> getUserfullLendFile(String uid) {
        return fd.getUserfullLendFile(uid);
    }

    @Override
    public String getBookid(String lendid) {
        return fd.getBookid(lendid);
    }

    @Override
    public void retBook(String lendid, String time) {
        fd.retBook(lendid,time);
    }

    @Override
    public void reduce(String bookid) {
        fd.reduce(bookid);
    }

    @Override
    public List<BookLendType> getMyLendFile(String deal, String myid) {
        return fd.getMyLendFile(deal,myid);
    }

    @Override
    public void uppwd(String pwd, String myid, String name, String sex, String idcard) {
        fd.uppwd(pwd,myid,name,sex,idcard);
    }


}
