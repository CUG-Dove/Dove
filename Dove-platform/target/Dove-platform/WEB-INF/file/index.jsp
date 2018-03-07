<%--
  Created by IntelliJ IDEA.
  User: zy
  Date: 2018/3/2
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page  isELIgnored="false"%>
<html>
<head>
    <title>File Scan</title>
</head>
<body>
<c:forEach var="file" items="${files.directaryNames}">
    <p>文件夹:<a href="${file.value}${file.key}/"> ${file.key}</a></p>
</c:forEach>

<c:forEach var="file" items="${files.fileNames}">
    <p>文件:<a href="${file.value}${file.key}"> ${file.key}</a></p>
</c:forEach>
</body>
</html>
