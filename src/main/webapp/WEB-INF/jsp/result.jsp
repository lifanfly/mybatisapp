<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
    <title>我的第一个SpringMVC页面</title>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <meta http-equiv="Cache-Control" content="no-store"/>
    <meta http-equiv="Pragma" content="no-cache"/>
    <meta http-equiv="Expires" content="0"/>
</head>
<body>
<c:out value="${requestScope.result}" />
</body>
</html>