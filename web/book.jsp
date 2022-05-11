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
    <link rel="stylesheet" href="static/css/card-style.css">
    <link rel="stylesheet" href="static/css/background-style.scss">
    <link rel="stylesheet" href="static/css/tittlt-style.scss">
    <link rel="stylesheet" href="static/css/button-style.css">
    <style>

        #search{
            margin-top: 1px;
            width: 1000px;
            height: 100px;
            /*border: white 1px solid;*/
            border: none;
            position: absolute;
        }
        input{

            BACKGROUND-COLOR: transparent;
            /*height: 30px;*/
            /*width: 220px;*/
            border: none;
            /*width: 100%;*/
            /*margin-bottom: 20px;*/
            border: 0;
            padding: 10px;

            border-bottom: 1px solid rgb(128, 125, 125);
            font-size: 15px;
            outline: none;
        }
        #sea{
            width: 300px;
            height: 40px;
            /*border: darkorchid 2px solid;*/
            border-radius: 2px;
            margin-left: 260px;
            margin-top: 30px;
            padding-left: 10px;
            padding-top: 5px;
        }
        #btn01{
            width: 70px;
            height: 40px;
            border: none;
            /*background: aliceblue;*/
            /*border-radius: 10px;*/
            /*border: white;*/
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

<div class="container">
    <div class="card">
        <div id="search">
            <input type="text" id="sea" class="input-item">
            <button id="btn01" onclick="search()" class="btn-grad">查询</button>
            <script>
                function search(){
                    let goalFile = document.getElementById("sea").value;
                    let admId = ${user.getUid()};
                    window.location.href = "fileServlet?action=booksearch&admid="+admId+"&goalFile="+goalFile;

                }


            </script>
            <div id="file">
                账户:&nbsp;${user.getUid()}
                <br>
                姓名:${user.getName()}


            </div>
        </div>
        <br><br><br><br><br><br>
        <div class="content">
            <table border="1" cellspacing="0" ; style="padding-left:10px; border: none">
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
                        <td><button onclick="toUpBook('${book.getBook_id()}')">修改</button>
                            <button onclick="findAllFile('${book.getBook_id()}')">查看信息</button>
                        </td>
                        <td>
                            <button onclick="lookLend('${book.getBook_id()}')">查看借阅</button>
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

                </script>

            </table>
        </div>
    </div>

</div>
</body>
</html>
