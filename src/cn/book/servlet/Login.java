package cn.book.servlet;

import cn.book.pojo.Book;
import cn.book.pojo.User;
import cn.book.service.FileService;
import cn.book.service.FileServiceImpl;
import cn.book.service.LoginService;
import cn.book.service.LoginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.List;
import java.util.Set;

@WebServlet("/login")

public class Login extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String id = req.getParameter("uid");
        String pwd = req.getParameter("pwd");

        User u = new User();
        u.setUid(id);
        u.setPwd(pwd);
        LoginService ls = new LoginServiceImpl();
        User user = ls.logServeice(u);
        if (user==null){
            //对象为空 账号密码不正确 返回登陆界面

            req.setAttribute("error","账户密码不一致");
            req.getRequestDispatcher("login.jsp").forward(req,res);
        }
        else{
            //账号密码正确跳转到主界面
            req.setAttribute("user",user);

            if(user.getRole()==0){
                req.setAttribute("user",user);
                req.setAttribute("mainRight","show.jsp");
                req.getRequestDispatcher("AdmMainPage.jsp").forward(req,res);
            }
            else{
                System.out.println("去用户界面");
            }

        }

    }
}