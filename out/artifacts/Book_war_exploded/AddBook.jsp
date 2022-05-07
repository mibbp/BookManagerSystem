<%--
  Created by IntelliJ IDEA.
  User: mibbp
  Date: 2022/5/7
  Time: 20:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加图书</title>
    <link rel="stylesheet" href="static/css/adm.css">
    <style>
        #addbookInner{
            width: 70%;
            margin-left: 100px;
            margin-top: 40px;
            border: blueviolet 2px solid;
            padding-left: 200px;
            padding-top: 60px;
            padding-bottom: 60px;
        }
        input{
            height: 30px;
            width: 420px;
            border: blueviolet 2px solid;
            border-radius: 2px;
            font-size: 17px
        }


    </style>
</head>
<body>
<div id="frame">
    <div style="font-size: 40px;margin-left: 400px;margin-top: 20px">增加图书</div>
    <div id="addbookInner">

        图书名称:&nbsp;&nbsp;<input type="text" id="book_name">
        <br><br>图书类别:&nbsp;&nbsp;<input type="text" id="book_type">
        <br><br>图书数量:&nbsp;&nbsp;<input type="text" id="book_num">
        <br><br>图书价格:&nbsp;&nbsp;<input type="text" id="book_price">
        <br><br>ISBN:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" id="book_ISBN">
        <br><br>所在位置:&nbsp;&nbsp;<input type="text" id="book_address">
        <br><br>出版商:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" id="book_business">
        <br><br>图书作者:&nbsp;&nbsp;<input type="text" id="book_author">
        <br><br>图书版本:&nbsp;&nbsp;<input type="text" id="book_edition">
        <br><br><button style="margin-left: 300px;width: 150px" onclick="sureAdd()">确认添加</button>
    </div>
    <script>
        function sureAdd(){
            let book_name = document.getElementById("book_name").value;
            let book_type = document.getElementById("book_type").value;
            let book_num = document.getElementById("book_num").value;
            let book_price = document.getElementById("book_price").value;
            let book_ISBN = document.getElementById("book_ISBN").value;
            let book_address = document.getElementById("book_address").value;
            let book_business = document.getElementById("book_business").value;
            let book_author = document.getElementById("book_author").value;
            let book_edition = document.getElementById("book_edition").value;
            window.location.href = "fileServlet?action=sureAdd&admid=+${user.getUid()}&a="+book_name+"&b="+book_type
                + "&c="+book_num+"&d="+book_price+"&e="+book_ISBN+"&f="+book_address+"&g="+book_business+"&h="+book_author
                + "&l="+book_edition;
        }

    </script>


</div>

</body>
</html>
