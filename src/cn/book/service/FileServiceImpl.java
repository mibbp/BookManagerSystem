package cn.book.service;
import cn.book.dao.FileDao;
import cn.book.dao.FileDaoImpl;
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

}
