package cn.book.servlet;

import cn.book.pojo.User;
import cn.book.service.LoginService;
import cn.book.service.LoginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet("/login")

public class Login extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String id = req.getParameter("uid");
        String pwd = req.getParameter("pwd");
        User u =new User();
        u.setUid(id);
        u.setPwd(pwd);
        LoginService ls = new LoginServiceImpl();
        User user = ls.logServeice(u);
        if (user==null){
            //对象为空 账号密码不正确 返回登陆界面
        }
        else{

        }
    }
}