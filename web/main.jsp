<%--
  Created by IntelliJ IDEA.
  User: mibbp
  Date: 2022/5/5
  Time: 14:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>

欢迎: &nbsp;${user.getName()}访问主界面
<br>
${user.toString()}


</body>
</html>
