<%--
  Created by IntelliJ IDEA.
  User: mibbp
  Date: 2022/5/9
  Time: 21:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="static/css/adm.css">
    <style>
        #inner{
            margin-left: 160px;
            margin-top: 60px;
            width: 70%;
            border: blueviolet 2px solid;
        }
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
</head>
<body>
<h2 style="margin-left: 500px">个人详细信息</h2>
<div id="frame">
    <div id="binner">
        <div id="ad">
            用户编号:&nbsp;&nbsp;&nbsp;${user.getUid()}
            <br><br>用户名称:&nbsp;&nbsp;&nbsp;${user.getName()}
            <br><br>用户性别:&nbsp;&nbsp;&nbsp;${user.getSex()}
            <br><br>身份证号:&nbsp;&nbsp;&nbsp;${user.getIdcard()}
            <br><br>借阅次数:&nbsp;&nbsp;&nbsp;${user.getU_times()}
            <br><br>
            <button style="width: 200px" onclick="touppwd()">修改个人信息</button>
        </div>
        <script>
            function touppwd(){
                window.location.href = "ufiledeal?action=touppwd&myid="+${user.getUid()};
            }

        </script>


    </div>
</div>


</body>
</html>
