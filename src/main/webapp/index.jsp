<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
</head>

<body>
<body>


<a href="addStudent.action">添加信息</a><br>

<a href="updateStudent.action">修改信息</a><br>

<a href="queryStudent.action">动态查询</a><br>

<a href="queryStudentAndTeacher.action">关联查询</a><br>

<a href="getStudentByIdIn.action">动态封装IN查询</a><br>

</body>
</html>
