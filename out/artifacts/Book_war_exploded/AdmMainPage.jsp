<%--
  Created by IntelliJ IDEA.
  User: mibbp
  Date: 2022/5/6
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员界面</title>
    <style>
        #rightNavigation{
            width: 210px;
            height: 430px;
            border: blueviolet 3px solid;
            margin-top: 100px;
            margin-left: 40px;
        }
        #a,#b,#c,#d,#e,#f,#g{
            width: 150px;
            height: 35px;
            border: blueviolet 1px solid;
            border-radius: 2px;
            margin-top: 20px;
            margin-left: 30px;
            padding-left: 30px;
            padding-top: 5px;
        }
        #BigFrame{
            position: absolute;


        }





    </style>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

</head>
<body>
<div id="BigFrame">
    <div id = "rightNavigation">
        <button id="a" onclick="goHead()">回到首页</button>
        <button id="b" onclick="goBookManage()">图书管理</button>
        <button id="c" onclick="goBookAdd()">增加图书</button>

        <button id="e" onclick="goLendRecord()">借阅记录</button>
        <button id="f" onclick="goUserShow()">用户管理</button>
        <button id="g" onclick="logout()">退出系统</button>

    </div>
    <script>
        function goUserShow(){
            window.location.href = "fileServlet?action=goUserShow&admid="+${user.getUid()};

        }
        function goBookManage(){
            // alert("333")
            window.location.href = "fileServlet?action=goBookManage&admid="+${user.getUid()};
            // alert("555")

        }
        function goHead(){
            window.location.href = "fileServlet?action=goHead&admid="+${user.getUid()};
        }
        function goBookAdd(){
            window.location.href = "fileServlet?action=goBookAdd&admid="+${user.getUid()};
        }
        function goLendRecord(){
            window.location.href = "fileServlet?action=goLendRecord&admid="+${user.getUid()};

        }

        function logout(){
            if (window.confirm("Do you really want to leave?")) {
                window.open("login.jsp", "Thanks for Visiting!");
            }
        }




    </script>


</div>
<jsp:include page="${mainRight==null? 'show.jsp':mainRight}"></jsp:include>
</body>
</html>
