<%--
  Created by IntelliJ IDEA.
  User: mibbp
  Date: 2022/5/7
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="static/css/card-style.css">
    <link rel="stylesheet" href="static/css/background-style.scss">
    <link rel="stylesheet" href="static/css/tittlt-style.scss">
    <link rel="stylesheet" href="static/css/button-style.css">
    <style>
        h2{
            margin-left: 550px;
        }

    </style>
</head>
<body>
<div id="frame" style="width: 100%;height: 700px">

    <h2 class="border">欢迎来到借书系统</h2>
    <h2 class="wave">欢迎来到借书系统</h2>

</div>

    <script>
        let unretcou=${unretcou}
        if(unretcou>0){
            if (window.confirm("您有一些书已经逾期没还请尽快还书")) {
                window.location.href = "ufiledeal?action=goUserLendRecode&myid="+${user.getUid()};
            }
        }




    </script>
</body>
</html>
