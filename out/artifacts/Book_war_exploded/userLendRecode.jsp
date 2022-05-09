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
        #top{
            margin-left: 300px;
        }
        #search{
            width: 1224px;
            height: 100px;
            border: blueviolet 1px solid;
            position: absolute;
        }
        #recodeSearch{
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
            /*margin-top: 20px;*/
            margin-bottom: 50px;
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
    <div id="top">
        <button onclick="retBook()" style="width: 200px">归还</button>
        <button onclick="unretBook()" style="width: 200px">未还</button>
        <button onclick="allBook()" style="width: 200px">全部</button>
    </div>

    <script>
        function retBook(){
            window.location.href = "ufiledeal?action=retBook&myid="+${user.getUid()};
        }
        function unretBook(){
            window.location.href = "ufiledeal?action=unretBook&myid="+${user.getUid()};
        }
        function allBook(){
            window.location.href = "ufiledeal?action=all&myid="+${user.getUid()};
        }


    </script>

    <br><br>


    <br><br><br><br>

    <table border="1" cellspacing="0" ; style="padding-left:80px; border: blueviolet">
        <tr>
            <td>借阅编号</td>
            <td>借阅图书</td>
            <td>借阅时间</td>
            <td>还书时间</td>
            <td>操作</td>



        </tr>

        <c:forEach items="${arr}" var="lbook" >
            <tr>
                <td>${lbook.getLend_id()}</td>
                <td>${lbook.getLend_name()}</td>
                <td>${lbook.getLend_ltime()}</td>
                <td>${lbook.getLend_rtime()}</td>
                <td><button onclick="UserRetBook('${lbook.getLend_id()}','${lbook.getLend_type()}')">还书</button></td>
            </tr>
        </c:forEach>


    </table>
    <script>
        function UserRetBook(v,m){
            // alert(m)
            if(m=='已归还'){
                alert("您已经还过书了")
            }
            else {
                window.location.href = "ufiledeal?action=UserRetBook&myid=${user.getUid()}&lendid="+v;
            }
        }
    </script>
</div>
</body>
</html>
