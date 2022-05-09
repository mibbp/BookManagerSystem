package cn.book.servlet;

import cn.book.pojo.Book;
import cn.book.pojo.BookLendType;
import cn.book.pojo.User;
import cn.book.service.FileService;
import cn.book.service.FileServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        else if(deal.equals("lendBook")){
//            window.location.href = "fileServlet?action=lendBook&myid=${user.getUid()}&bookid="+n;
            String bookid = req.getParameter("bookid");
            Book book = fs.getBookByNameOrId(bookid).get(0);
            int lendnum=book.getBook_lend()+1;
            int times = book.getBook_times()+1;
            fs.lendBook(bookid,lendnum,times);

            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
            String l_id = "l"+sdf.format(date);

            sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            String ltime = sdf.format(date);
            fs.addLendRecode(l_id,bookid,user.getUid(),ltime);

            List<Book> arr = fs.getAllBook();
            req.setAttribute("arr",arr);
            req.setAttribute("user",user);
            req.setAttribute("mainRight","userBookLook.jsp");
            req.getRequestDispatcher("UserMain.jsp").forward(req,res);
        }
        else if(deal.equals("goUserLendRecode")) {
//            window.location.href = "ufiledeal?action=goUserLendRecode&myid="+${user.getUid()};
            List<BookLendType> arr = fs.getUserfullLendFile(user.getUid());

            req.setAttribute("arr", arr);
            req.setAttribute("user", user);
            req.setAttribute("mainRight", "userLendRecode.jsp");
            req.getRequestDispatcher("UserMain.jsp").forward(req, res);

        }
        else if(deal.equals("UserRetBook")){
//            window.location.href = "ufiledeal?action=UserRetBook&myid=${user.getUid()}&lendid="+v;
            String lendid=req.getParameter("lendid");
            String bookid = fs.getBookid(lendid);

            //借阅表更新还书时间和还书状态
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            String time = sdf.format(date);
            fs.retBook(lendid,time);

            //图书表借出数减少
            fs.reduce(bookid);

            List<BookLendType> arr = fs.getUserfullLendFile(user.getUid());

            req.setAttribute("arr", arr);
            req.setAttribute("user", user);
            req.setAttribute("mainRight", "userLendRecode.jsp");
            req.getRequestDispatcher("UserMain.jsp").forward(req, res);
        }
        else if(deal.equals("retBook")||deal.equals("unretBook")||deal.equals("all")){
//            window.location.href = "ufiledeal?action=retBook&admid="+${user.getUid()};
//            unretBook
//            all
            List <BookLendType> arr = fs.getMyLendFile(deal,myid);
            req.setAttribute("arr", arr);
            req.setAttribute("user", user);
            req.setAttribute("mainRight", "userLendRecode.jsp");
            req.getRequestDispatcher("UserMain.jsp").forward(req, res);

        }
        else if(deal.equals("goMyFile")){
//            window.location.href = "ufiledeal?action=goMyFile&myid="+${user.getUid()};
            req.setAttribute("user",user);
            req.setAttribute("mainRight", "MyFile.jsp");
            req.getRequestDispatcher("UserMain.jsp").forward(req, res);

        }
        else if(deal.equals("touppwd")){
//            window.location.href = "ufiledeal?action=uppwd&myid="+${user.getUid()};
            req.setAttribute("user",user);
            req.setAttribute("mainRight", "uppwd.jsp");
            req.getRequestDispatcher("UserMain.jsp").forward(req, res);
        }
        else if(deal.equals("uppwd")){
//            window.location.href = "ufiledeal?action=uppwd&pwd="+n+"&myid=${user.getUid()}&name="+name+
//                    "&sex="+d+"&idcard="+e;
            String pwd = req.getParameter("pwd");
            String name = req.getParameter("name");
            String sex = req.getParameter("sex");
            String idcard = req.getParameter("idcard");
            fs.uppwd(pwd,myid,name,sex,idcard);
            req.setAttribute("user",user);
            req.setAttribute("mainRight", "MyFile.jsp");
            req.getRequestDispatcher("UserMain.jsp").forward(req, res);
        }
        else if(deal.equals("goCreateLendCard")){
//            window.location.href = "ufiledeal?action=goCreateLendCard&myid="+${user.getUid()};
            req.setAttribute("user",user);
            req.getRequestDispatcher("createLendCard.jsp").forward(req, res);
        }
        else if(deal.equals("surelendcard")){
//            window.location.href = "ufiledeal?action=surelendcard&admid=+${user.getUid()}&a="+user_id;
            String card_id = req.getParameter("a");
            fs.lendcard(myid,card_id);

            req.setAttribute("user",user);
            req.setAttribute("mainRight","usershow.jsp");
            req.getRequestDispatcher("UserMain.jsp").forward(req,res);
        }

    }
}
