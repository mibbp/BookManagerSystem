package cn.book.service;

import cn.book.dao.RegisterDao;
import cn.book.dao.RegisterDaoImpl;

public class RegisterServiceImpl implements RegisterService{
    RegisterDao rd = new RegisterDaoImpl();
    @Override
    public void addUser(String user_id, String user_name, String user_sex, String user_pwd) {
        rd.addUser(user_id,user_name,user_sex,user_pwd);
    }
}
