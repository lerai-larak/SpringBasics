<%--
  Created by IntelliJ IDEA.
  User: kelly
  Date: 11/15/17
  Time: 10:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Kwots | For Everyday Wisdom</title>
    <link rel="stylesheet" href="/resources/css/style.css">
</head>
<body>
    <!--This is the main application template -->
<div id="header"><tiles:insertAttribute name="header"/></div>
<section id="sidemenu"><tiles:insertAttribute name="menu"/></section>
<section id="body"><tiles:insertAttribute name="body"/></section>
<section id="footer"><tiles:insertAttribute name="footer"/></section>
</body>
</html>
