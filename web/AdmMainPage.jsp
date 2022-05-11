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
    <link rel="stylesheet" href="static/css/background-style.scss">
    <link rel="stylesheet" href="static/css/tittlt-style.scss">
    <link rel="stylesheet" href="static/css/button-style.css">
    <style>
        /*background-image: linear-gradient(25deg, #4ea4b0, #8ec2ca, #c7e0e4, #ffffff)*/
        #rightNavigation{
            /*background-image: linear-gradient(25deg, #86b4e7, #b0c2e0, #d3d0d8, #f4dfd0);*/
            /*background-image: linear-gradient(25deg, #1f242e, #393a40, #535252, #6f6b65);*/
            /*background: black;*/
            background: #393a40;
            width: 210px;
            height: 800px;
            /*border: blueviolet 3px solid;*/
            /*margin-top: 100px;*/
            /*margin-left: 40px;*/
            /*padding-top: px;*/
        }
        button{
            background-image: linear-gradient(25deg, #86b4e7, #b0c2e0, #d3d0d8, #f4dfd0)
        }
        #a,#b,#c,#d,#e,#f,#g,#h,#i{
            width: 150px;
            height: 70px;
            /*border: blueviolet 1px solid;*/
            /*border-radius: 2px;*/
            border: none;
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
        <button id="a" onclick="goHead()" class="btn-grad">回到首页</button>
        <button id="b" onclick="goBookManage()" class="btn-grad">图书管理</button>
        <button id="c" onclick="goBookAdd()" class="btn-grad">增加图书</button>

        <button id="e" onclick="goLendRecord()" class="btn-grad">借阅记录</button>
        <button id="f" onclick="goUserShow()" class="btn-grad">用户管理</button>
        <button id="g" onclick="logout()" class="btn-grad">退出系统</button>
        <button id="h" onclick="gobackup()" class="btn-grad">备份数据库</button>
        <button id="i" onclick="goredu()" class="btn-grad">还原数据库</button>
    </div>
    <script>
        function goUserShow(){
            window.location.href = "fileServlet?action=goUserShow&admid="+${user.getUid()};

        }
        function goBookManage(){
            window.location.href = "fileServlet?action=goBookManage&admid="+${user.getUid()};
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
        function gobackup(){
            // alert("备份成功!")
            window.location.href = "fileServlet?action=gobackup&admid="+${user.getUid()};
            alert("备份成功!")
        }
        function goredu(){
            window.location.href = "fileServlet?action=goredu&admid="+${user.getUid()};
            // alert("还原成功!")
        }
        function logout(){
            if (window.confirm("确认要退出系统吗？")) {
                window.open("login.jsp", "感谢使用");
            }
        }




    </script>


</div>
<jsp:include page="${mainRight==null? 'show.jsp':mainRight}"></jsp:include>
</body>
</html>
