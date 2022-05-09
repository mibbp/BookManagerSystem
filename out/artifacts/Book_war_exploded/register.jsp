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
<%--    <link rel="stylesheet" href="static/css/adm.css">--%>
    <link rel="stylesheet" href="static/css/background-style.scss">
    <link rel="stylesheet" href="static/css/tittlt-style.scss">
    <link rel="stylesheet" href="static/css/button-style.css">
    <style>
        #addbookInner{
            width: 500px;
            /*margin-left: 100px;*/
            margin-top: 40px;
            /*border: blueviolet 2px solid;*/
            padding-left: 500px;
            padding-right: 100px;
            padding-top: 60px;
            padding-bottom: 60px;
        }
        input{
            display: block;
            BACKGROUND-COLOR: transparent;
            /*height: 30px;*/
            width: 220px;
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
        h2{
            margin-left: 650px;
        }


    </style>
</head>
<body>

<div id="frame" style="margin-top: 1px">
    <h2 class="border">注册账号</h2>
    <h2 class="wave">注册账号</h2>
    <br><br><br>
    <div id="addbookInner">

        <input placeholder="请输入账号" type="text" id="user_id" class="input-item">
        <br><br><input placeholder="请输入名称" type="text" id="user_name" class="input-item">
        <br><br><input placeholder="请输入性别" type="text" id="user_sex" class="input-item">
        <br><br><input placeholder="请输入密码" type="text" id="user_pwd" class="input-item">
        <br><br><button style="margin-left: 175px;width: 150px" onclick="sureRegister()" class="btn-grad">注册</button>
    </div>
    <script>
        function sureRegister(){
            let user_id = document.getElementById("user_id").value;
            let user_name = document.getElementById("user_name").value;
            let user_sex = document.getElementById("user_sex").value;
            let user_pwd = document.getElementById("user_pwd").value;
            window.location.href = "register?action=sureRegister&admid=+${user.getUid()}&a="+user_id+"&b="+user_name
                + "&c="+user_sex+"&d="+user_pwd;

        }

    </script>


</div>

</body>
</html>
