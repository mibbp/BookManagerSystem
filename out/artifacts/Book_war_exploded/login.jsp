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
    <link rel="stylesheet" href="static/css/tittlt-style.scss">
    <style>
        *{
            padding: 0%;
            margin: 0%;
            font-family: 'Open Sans Light';
            letter-spacing: .05em;

        }

        html{
            /*height: 100%;*/
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

            background-image: linear-gradient(to top, #fff1eb 0%, #ace0f9 100%);

            width: 550px;
            height: 400px;
            margin-left: 480px;
            margin-top: 200px;
            padding-top: 1px;
            border: none;
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
            display: block;
            BACKGROUND-COLOR: transparent;
            /*height: 30px;*/
            /*width: 220px;*/
            border: none;
            display: block;
            width: 100%;
            margin-bottom: 20px;
            border: 0;
            padding: 10px;
            border-bottom: 1px solid rgb(128, 125, 125);
            font-size: 15px;
            outline: none;
        }
        /*button{*/
        /*    width: 100px;*/
        /*    font-size: 18px;*/
        /*    margin-left: 20px;*/
        /*}*/



        .btn-grad {background-image: linear-gradient(to right, #2BC0E4 0%, #EAECC6  51%, #2BC0E4  100%)}
        .btn-grad {
            width: 100px;
            font-size: 18px;
            margin-left: 25px;
            text-align: center;
            text-transform: uppercase;
            transition: 0.5s;
            background-size: 200% auto;
            color: white;
            box-shadow: 0 0 20px #eee;
            border-radius: 10px;
            border-color: snow;
        }

        .btn-grad:hover {
            background-position: right center; /* change the direction of the change here */
            color: #fff;
            text-decoration: none;
        }





    </style>
    <script>
        function login(){
            let uid = document.getElementById("uid").value;
            uid = "'"+uid+"'";
            alert(uid);
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
            <h2 class="border">图书管理系统</h2>
            <h2 class="wave">图书管理系统</h2>
            <div id="login_">
<%--                <div class="tittle">图书管理系统</div>--%>
                <label for="uid"></label>
                <input placeholder="请输入账号" type="text" id="uid" name="uid" class="input-item">
                <br><br>
                <label for="upwd"></label>
                <input placeholder="请输入密码" type="password" id="upwd" name="upwd" class="input-item">
                <br><br>

                <button id="btn01" class="btn-grad" onclick="window.open('register.jsp')">注册</button>
                <button id="btn02" class="btn-grad" onclick="login()">登录</button>
                <br>
                <span id="error" style="color:red">${error}</span>
            </div>


        </div>



    </div>

</div>





</body>
</html>
