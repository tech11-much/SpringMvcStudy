<%--
  Created by IntelliJ IDEA.
  User: kafei
  Date: 2021/6/15
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data" method="post">
    <input type="file" name="file"/>
    <input type="submit" value="upload">
  </form>
  <a href="${pageContext.request.contextPath}/download">点击下载</a>
  </body>
</html>
