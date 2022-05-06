<%--
  Created by IntelliJ IDEA.
  User: mibbp
  Date: 2022/5/6
  Time: 14:01
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
            border: blueviolet 1px solid;
            position: absolute;
        }
        #sea{
            width: 300px;
            height: 40px;
            border: darkorchid 2px solid;
            border-radius: 2px;
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
    <div id="frame">
        <div id="search">
            <input type="text" id="sea">
            <button id="btn01">查询</button>
            <div id="file">
                账户:&nbsp;${user.getUid()}
                <br>
                姓名:${user.getName()}


            </div>
        </div>
        <br><br><br><br><br><br>

        <table border="1" cellspacing="0" ; style="padding-left:80px; border: blueviolet">
            <tr>
                <td>账户</td>
                <td>姓名</td>
                <td>身份证号</td>
                <td>借阅次数</td>
                <td>状态</td>
                <td>操作</td>
            </tr>
            <tr>
                <td>202031773154</td>
                <td>刘龙浩</td>
                <td>5111526200301130510</td>
                <td>3</td>
                <td>0</td>
                <td><button>删除</button></td>
            </tr>
            <tr>
                <td>124901590184</td>
                <td>张三</td>
                <td>1287489550399275941</td>
                <td>5</td>
                <td>0</td>
                <td><button>删除</button></td>
            </tr>
        </table>
    </div>
</body>
</html>
