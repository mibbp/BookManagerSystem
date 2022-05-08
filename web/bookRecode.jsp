<%--
  Created by IntelliJ IDEA.
  User: mibbp
  Date: 2022/5/6
  Time: 14:01
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
                window.location.href = "fileServlet?action=search&admid="+admId+"&goalFile="+goalFile;

            }


        </script>
        <div id="file">
            账户:&nbsp;${user.getUid()}
            <br>
            姓名:${user.getName()}


        </div>
    </div>
    <br><br><br><br><br><br>

    <table border="1" cellspacing="0" ; style="padding-left:80px; border: blueviolet">
        <tr>
            <td>借阅编号</td>
            <td>借阅图书</td>
            <td>借阅时间</td>
            <td>还书时间</td>
            <td>归还状态</td>
        </tr>

        <c:forEach items="${arr}" var="lbook" >
            <tr>
                <td>${lbook.getLend_id()}</td>
                <td>${lbook.getLend_name()}</td>
                <td>${lbook.getLend_ltime()}</td>
                <td>${lbook.getLend_rtime()}</td>
                <td>${lbook.getLend_type()}</td>
            </tr>
        </c:forEach>


    </table>
</div>
</body>
</html>
