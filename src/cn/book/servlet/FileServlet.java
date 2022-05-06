package cn.book.servlet;

import cn.book.service.FileService;
import cn.book.service.FileServiceImpl;
import cn.book.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/fileServlet")
public class FileServlet extends HttpServlet {
    /*
    window.location.href = "fileServlet?action=search&admid="+admId+"&goalFile="+goalFile;
     */

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        String deal = req.getParameter("action");
        FileService fs = new FileServiceImpl();
        if (deal.equals("search")){
            String admid = req.getParameter("admid");
            String goalFile = req.getParameter("goalFile");
            User admUser = fs.getAdmainUser(admid);

            User goalUserFile = fs.getAdmainUser(goalFile);
            System.out.println(goalUserFile);

            List<User> list = new ArrayList<User>();
            list.add(goalUserFile);
            req.setAttribute("user",admUser);
            if(goalUserFile!=null){
                req.setAttribute("arr",list);
            }


            req.setAttribute("mainRight","userFile.jsp");
            req.getRequestDispatcher("AdmMainPage.jsp").forward(req,res);
        }






    }
}
