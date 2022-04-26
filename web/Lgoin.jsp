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
    <style>
        #frame{


        }
        #inner{
            width: 550px;
            height: 400px;
            margin-left: 480px;
            margin-top: 200px;
            border: blueviolet solid 3px;
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





</head>
<body>
<div id="frame">
    <div id="inner">
        <div id="login_">
            账户:&nbsp;&nbsp;<input type="text" id="uid">
            <br><br>
            密码:&nbsp;&nbsp;<input type="password" id="upwd">
            <br><br>
            <button id="btn01">注册</button>
            <button id="btn02" onclick="login()">登录</button>
            <br>
            <span id="error" style="color:red"></span>
        </div>


    </div>



</div>





</body>
</html>
