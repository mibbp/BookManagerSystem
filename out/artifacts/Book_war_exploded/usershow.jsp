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
</head>
<body>
<div id="frame" style="width: 100%;height: 700px">
    <div style="font-size: 80px;margin-left: 400px;margin-top: 20px;color: dimgrey">欢迎来到借书系统</div>

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
