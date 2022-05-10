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
    <link rel="stylesheet" href="static/css/verify.css">
    <style>
        #addbookInner{
            width: 500px;
            height: 500px;
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
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>

<div id="frame" style="margin-top: 1px">
    <h2 class="border">办理借书卡</h2>
    <h2 class="wave">办理借书卡</h2>
    <br><br><br>
    <div id="addbookInner">


        <input placeholder="请输入账号" type="text" id="card_id" class="input-item">
        <br><br><button style="margin-left: 175px;width: 150px" onclick="surelendcard()" class="btn-grad">注册</button>
    </div>
    <script>
        function surelendcard(){
            let card_id = document.getElementById("card_id").value;
            <%--alert('${user.getUid()}')--%>
            window.location.href = "ufiledeal?action=surelendcard&myid=${user.getUid()}&a="+card_id;


        }

    </script>


</div>

</body>
</html>
