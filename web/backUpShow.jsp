<%--
  Created by IntelliJ IDEA.
  User: mibbp
  Date: 2022/5/6
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        #search{
            width: 1224px;
            height: 100px;
            border: none;
            position: absolute;
        }
        #sea{
            width: 300px;
            height: 40px;
            border: none;

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
            margin-top: 20px;
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
<div id="frame" style="border: none">

    <br><br><br><br><br><br>

    <table border="1" cellspacing="0" ; style="padding-left:10px; border: blueviolet">
        <tr>
            <td>备份编号</td>
        </tr>

        <c:forEach items="${arr}" var="backup" >
            <tr>
                <td>book${backup.getBackup_id()}</td>
                <td><button onclick="redo('${backup.getBackup_id()}')">还原</button></td>

            </tr>
        </c:forEach>
        <script>
            function redo(v){
                //v查看备份id
                // alert(v)
                window.location.href = "fileServlet?action=redo&admid=${user.getUid()}&backupid="+v;
            }

        </script>

    </table>
</div>
</body>
</html>
