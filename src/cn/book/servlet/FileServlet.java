package cn.book.servlet;

import cn.book.pojo.Book;
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
        String admId = req.getParameter("admid");
        User user = fs.getAdmainUser(admId);

        if (deal.equals("search")){

            String goalFile = req.getParameter("goalFile");
            User goalUserFile = fs.getAdmainUser(goalFile);
            List<User> list = new ArrayList<User>();
            list.add(goalUserFile);
            req.setAttribute("user",user);
            if(goalUserFile!=null){
                req.setAttribute("arr",list);
            }


            req.setAttribute("mainRight","userFile.jsp");
            req.getRequestDispatcher("AdmMainPage.jsp").forward(req,res);
        }
        else if(deal.equals("goUserShow")){
//访问用户管理界面
            List <User> arr = fs.getAllUser();
            req.setAttribute("arr",arr);
            req.setAttribute("user",user);
            req.setAttribute("mainRight","userFile.jsp");
            req.getRequestDispatcher("AdmMainPage.jsp").forward(req,res);
        }
        else if(deal.equals("booksearch")){
//            window.location.href = "fileServlet?action=booksearch&admid="+admId+"&goalFile="+goalFile;
//            获取图书

            String goalFile =req.getParameter("goalFile");
            List <Book> arr = fs.getBookByNameOrId(goalFile);

            req.setAttribute("arr",arr);
            req.setAttribute("user",user);
            req.setAttribute("mainRight","book.jsp");
            req.getRequestDispatcher("AdmMainPage.jsp").forward(req,res);
        }
        else if(deal.equals("findAllFile")){
//            window.location.href = "action=findAllFile?admid=${user.getUid()}&bookid="+v;
//            找图书所有信息
            String bookId = req.getParameter("bookid");
            Book book = fs.getBookByNameOrId(bookId).get(0);

            req.setAttribute("book",book);
            req.setAttribute("user",user);
            req.setAttribute("mainRight","bookshow.jsp");
            req.getRequestDispatcher("AdmMainPage.jsp").forward(req,res);

        }
        else if(deal.equals("upbook")){
//            window.location.href = "fileServlet?action=upbook&admid=${user.getUid()}&bookId="+bookId+"&number="+number;
            String bookId = req.getParameter("bookId");
            String number = req.getParameter("number");
            String price = req.getParameter("price");
            fs.upBookNum(bookId,number,price);


            List arr = fs.getBookByNameOrId(bookId);
            req.setAttribute("arr",arr);
            req.setAttribute("user",user);
            req.setAttribute("mainRight","book.jsp");
            req.getRequestDispatcher("AdmMainPage.jsp").forward(req,res);
        }
        else if(deal.equals("toUpBook")){
//             window.location.href = "fileServlet?action=toUpBook&admid=${user.getUid()}&bookid="+m;
            String m=req.getParameter("bookid");
            Book book = fs.getBookByNameOrId(m).get(0);

            req.setAttribute("user",user);
            req.setAttribute("book",book);
            req.setAttribute("mainRight","upBook.jsp");
            req.getRequestDispatcher("AdmMainPage.jsp").forward(req,res);

        }
        else if(deal.equals("goBookManage")){
//            window.location.href = "fileServlet?action=goBookManage&admid="+${user.getUid()};
            List <Book> arr = fs.getAllBook();
            req.setAttribute("arr",arr);
            req.setAttribute("user",user);

            req.setAttribute("mainRight","book.jsp");
            req.getRequestDispatcher("AdmMainPage.jsp").forward(req,res);
        }
        else if(deal.equals("goHead")){
//            window.location.href = "fileServlet?action=goHead&admid="+${user.getUid()};
            req.setAttribute("user",user);
            req.setAttribute("mainRight","show.jsp");
            req.getRequestDispatcher("AdmMainPage.jsp").forward(req,res);
        }
        else if(deal.equals("goBookAdd")){
//            window.location.href = "fileServlet?action=goBookAdd&admid="+${user.getUid()};
            req.setAttribute("user",user);
            req.setAttribute("mainRight","AddBook.jsp");
            req.getRequestDispatcher("AdmMainPage.jsp").forward(req,res);
        }
        else if(deal.equals("sureAdd")){
//            window.location.href = "fileServlet?action=sureAdd&admid=+${user.getUid()}&a="+book_name+"&b="+book_type
//                + "&c="+book_num+"&d="+book_price+"&e="+book_ISBN+"&f="+book_address+"&g="+book_business+"&h="+book_author
//                + "&i="+book_edition;
            String a = req.getParameter("a");
            String b = req.getParameter("b");
            String c = req.getParameter("c");
            String d = req.getParameter("d");
            String e = req.getParameter("e");
            String f = req.getParameter("f");
            String g = req.getParameter("g");
            String h = req.getParameter("h");
            String l = req.getParameter("l");
            fs.addBook(a,b,c,d,e,f,g,h,l);

            req.setAttribute("user",user);
            req.setAttribute("mainRight","show.jsp");
            req.getRequestDispatcher("AdmMainPage.jsp").forward(req,res);
            System.out.println("222");

        }




    }
}
