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
        #binner{
            width: 85%;
            margin-left: 90px;
            margin-top: 20px;
            border: blueviolet 2px solid;
        }
        #ad{
            margin-left: 70px;
            margin-top: 40px;
        }



    </style>
    <link rel="stylesheet" href="static/css/adm.css">
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<div id="frame">
    <div style="font-size: 40px;margin-left: 500px;margin-top: 20px">图书详细信息</div>
   <div id="binner">
        <div id="ad">
                    图书编号:&nbsp;&nbsp;&nbsp;${book.getBook_id()}
            <br><br>图书名称:&nbsp;&nbsp;&nbsp;${book.getBook_name()}
            <br><br>图书类型:&nbsp;&nbsp;&nbsp;${book.getBook_type()}
            <br><br>图书数量:&nbsp;&nbsp;&nbsp;${book.getBook_num()}
            <br><br>图书价格:&nbsp;&nbsp;&nbsp;${book.getBook_price()}
            <br><br>图书借出数量:&nbsp;&nbsp;&nbsp;${book.getBook_lend()}
            <br><br>图书ISBN:&nbsp;&nbsp;&nbsp;${book.getBook_ISBN()}
            <br><br>图书地址:&nbsp;&nbsp;&nbsp;${book.getBook_address()}
            <br><br>图书出版商:&nbsp;&nbsp;&nbsp;${book.getBook_business()}
            <br><br>图书作者:&nbsp;&nbsp;&nbsp;${book.getBook_author()}
            <br><br>图书版号:&nbsp;&nbsp;&nbsp;${book.getBook_edition()}
            <br><br>图书借阅次数:&nbsp;&nbsp;&nbsp;${book.getBook_times()}
        </div>
   </div>


</div>
</body>
</html>
