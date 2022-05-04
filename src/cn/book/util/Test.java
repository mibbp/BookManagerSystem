package cn.book.util;

import cn.book.pojo.User;
import cn.book.service.LoginService;
import cn.book.service.LoginServiceImpl;

public class Test {
    public static void main(String[] args) {
        String id = "202031773154";
        String pwd = "123456";
        User u = new User();
        u.setUid(id);
        u.setPwd(pwd);
        LoginService ls = new LoginServiceImpl();
        User user = ls.logServeice(u);
        if(user == null){
            System.out.println("id和密码不正确");
        }
        else{
            System.out.println(user.toString());
        }
    }



}
