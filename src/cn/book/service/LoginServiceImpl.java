package cn.book.service;

import cn.book.pojo.User;
import cn.book.dao.*;

public class LoginServiceImpl implements LoginService{

    LoginDao loginDao = new LoginDaoImpl();

    @Override
    public User logServeice(User user) {


        return loginDao.LogDao(user);
    }
}