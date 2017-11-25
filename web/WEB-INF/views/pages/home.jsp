<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: kelly
  Date: 11/14/17
  Time: 10:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<ul>
    <core:forEach var="quote" items="${quotes}">
        <li><c:out value="${quote.description}"/>
                <fmt:formatDate value="${quote.sentOn}" pattern="MM dd yyyy"/>
        </li>
    </core:forEach>
</ul>
</body>
</html>
