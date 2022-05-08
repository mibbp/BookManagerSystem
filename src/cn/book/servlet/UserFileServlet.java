package cn.book.servlet;

import cn.book.pojo.Book;
import cn.book.pojo.User;
import cn.book.service.FileService;
import cn.book.service.FileServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.List;

@WebServlet("/ufiledeal")
public class UserFileServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//        window.location.href = "ufiledeal?action=goHead&myid="+${user.getUid()};
        String myid = req.getParameter("myid");
        String deal = req.getParameter("action");
        FileService fs = new FileServiceImpl();
        User user = fs.getAdmainUser(myid);
        if(deal.equals("goHead")){

            req.setAttribute("user",user);
            req.setAttribute("mainRight","usershow.jsp");
            req.getRequestDispatcher("UserMain.jsp").forward(req,res);
        }
        else if(deal.equals("gouserBookLook")){
//window.location.href = "ufiledeal?action=userBookLook&myid="+${user.getUid()};
            List<Book> arr = fs.getAllBook();
            req.setAttribute("arr",arr);
            req.setAttribute("user",user);
            req.setAttribute("mainRight","userBookLook.jsp");
            req.getRequestDispatcher("UserMain.jsp").forward(req,res);
        }
        else if(deal.equals("booksearch")){
//             window.location.href = "ufiledeal?action=booksearch&admid="+admId+"&goalFile="+goalFile;
            String file =req.getParameter("goalFile");
            List <Book> arr = fs.getBookByNameOrId(file);
            req.setAttribute("arr",arr);
            req.setAttribute("user",user);
            req.setAttribute("mainRight","userBookLook.jsp");
            req.getRequestDispatcher("UserMain.jsp").forward(req,res);
        }
        else if(deal.equals("lookbookall")){
//            window.location.href = "ufiledeal?action=lookbookall&myid=+${user.getUid()}&sign="+v;
            String sign = req.getParameter("sign");
            Book book = fs.getBookByNameOrId(sign).get(0);

            req.setAttribute("book",book);
            req.setAttribute("user",user);
            req.setAttribute("mainRight","bookshow.jsp");
            req.getRequestDispatcher("UserMain.jsp").forward(req,res);
        }
    }
}
