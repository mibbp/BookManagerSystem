<%--
  Created by IntelliJ IDEA.
  User: mibbp
  Date: 2022/4/25
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
<%--    <link rel="stylesheet" href="./static/login-style.css">--%>
    <style>
        *{
            padding: 0%;
            margin: 0%;
            font-family: 'Open Sans Light';

        }

        html{
            height: 100%;
            background-color: #0093E9;
            background-image: linear-gradient(160deg, #0093E9 0%, #80D0C7 100%);
        }

        body{
            height: 100%;
        }
        .container{
            heght: 100%;



        }

        #frame{


        }
        #inner{

            background: white;
            width: 550px;
            height: 400px;
            margin-left: 480px;
            margin-top: 200px;
            border: white solid 3px;
            border-radius: 20px;
        }
        .tittle{

            margin-left: 100px;
            


        }
        #login_{
            width: 300px;
            height: 200px;
            margin-left: 125px;
            margin-top: 125px;
            /*border: #a6c1ee solid 3px;*/
        }
        input{
            height: 30px;
            width: 220px;
            border: blueviolet solid 3px;
            border-radius: 4px;
        }
        button{
            width: 100px;
            font-size: 18px;
            margin-left: 20px;
        }


    </style>
    <script>
        function login(){
            let uid = document.getElementById("uid").value;
            let pwd = document.getElementById("upwd").value;
            if(uid==null||uid.trim()==""){
                document.getElementById("error").innerHTML = "账户不能为空";
                return ;
            }
            if(pwd==null||pwd.trim()==""){
                document.getElementById("error").innerHTML = "密码不能为空";
                return ;
            }
            window.location.href='login?uid='+uid+'&pwd='+pwd;   //找服务器地址


        }



    </script>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>




</head>
<body>
<div class="container">

    <div id="frame">
        <div id="inner">
            <div id="login_">
                <div class="tittle">图书管理系统</div>
                <label for="uid">账号:</label>
                <input placeholder="请输入账号" type="text" id="uid" name="uid">
                <br><br>
                <label for="upwd"></label>
                密码:&nbsp;&nbsp;<input placeholder="请输入密码" type="password" id="upwd" name="upwd">
                <br><br>

                <button id="btn01">注册</button>
                <button id="btn02" onclick="login()">登录</button>
                <br>
                <span id="error" style="color:red">${error}</span>
            </div>


        </div>



    </div>

</div>





</body>
</html>
