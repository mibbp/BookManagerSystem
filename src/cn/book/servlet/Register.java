package cn.book.servlet;

import cn.book.service.RegisterService;
import cn.book.service.RegisterServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet("/register")
public class Register extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        RegisterService rs = new RegisterServiceImpl();
        String user_id = req.getParameter("a");
        String user_name = req.getParameter("b");
        String user_sex = req.getParameter("c");
        String user_pwd = req.getParameter("d");
        rs.addUser(user_id,user_name,user_sex,user_pwd);
        req.getRequestDispatcher("login.jsp").forward(req,res);
    }
}
