<%--
  Created by IntelliJ IDEA.
  User: mibbp
  Date: 2022/5/6
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        #search{
            width: 1224px;
            height: 100px;
            border: blueviolet 1px solid;
            position: absolute;
        }
        #sea{
            width: 300px;
            height: 40px;
            border: darkorchid 2px solid;
            border-radius: 2px;
            margin-left: 260px;
            margin-top: 30px;
            padding-left: 10px;
            padding-top: 5px;
        }
        #btn01{
            width: 70px;
            height: 40px;
            background: aliceblue;
        }
        #file{
            width:180px;
            height: 60px;
            /*border: red 1px solid;*/
            float:right;
            margin-right: 30px;
            margin-top: 20px;
            padding-top: 5px;
        }
        tr{
            width:1190px;
            height: 30px;
            font-size: 16px;
        }
        td{
            width: 170px;
            height: 30px;

        }
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    </style>
    <link rel="stylesheet" href="static/css/adm.css">
</head>
<body>
<div id="frame">
    <div id="search">
        <input type="text" id="sea">
        <button id="btn01" onclick="search()" >查询</button>
        <script>
            function search(){
                let goalFile = document.getElementById("sea").value;
                let admId = ${user.getUid()};
                window.location.href = "ufiledeal?action=booksearch&myid="+admId+"&goalFile="+goalFile;

            }


        </script>
        <div id="file">
            账户:&nbsp;${user.getUid()}
            <br>
            姓名:${user.getName()}


        </div>
    </div>
    <br><br><br><br><br><br>

    <table border="1" cellspacing="0" ; style="padding-left:10px; border: blueviolet">
        <tr>
            <td>图书编号</td>
            <td>图书名称</td>
            <td>图书类别</td>
            <td>图书总数</td>
            <td>借出总数</td>
            <td>图书操作</td>
            <td>查看借阅</td>
        </tr>

        <c:forEach items="${arr}" var="book" >
            <tr>
                <td>${book.getBook_id()}</td>
                <td>${book.getBook_name()}</td>
                <td>${book.getBook_type()}</td>
                <td>${book.getBook_num()}</td>
                <td>${book.getBook_lend()}</td>
                <td><button onclick="toUpBook('${book.getBook_id()}')">借书</button>
                </td>
                <td>
                    <button onclick="lookbookall('${book.getBook_id()}')">查看信息</button>
                </td>

            </tr>
        </c:forEach>
        <script>
            function findAllFile(v){
                //v查看书id
                window.location.href = "fileServlet?action=findAllFile&admid=${user.getUid()}&bookid="+v;
            }
            function toUpBook(m){
                window.location.href = "fileServlet?action=toUpBook&admid=${user.getUid()}&bookid="+m;
            }
            function lookLend(n){
                window.location.href = "fileServlet?action=lookLend&admid=${user.getUid()}&bookid="+n;
            }
            function lookbookall(v){
                window.location.href = "ufiledeal?action=lookbookall&myid=+${user.getUid()}&sign="+v;
            }

        </script>

    </table>
</div>
</body>
</html>
