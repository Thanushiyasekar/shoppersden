<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ taglib prefix="pf" uri="http://www.springframework.org/tags/form"%>
   
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<table class="table table-bordered">
            <th>c_id</th>
            <th>C_name</th>
            <th>Edit</th>
            <th>Delete</th>
            <c:forEach items="${user}" var="c">
           
            <td>${c.id}</td>
            <td>${c.user.username}</td>
            <td>${c.user.cart.id }</td>
            <td>${c.user.transaction }</td>
            <td>${c.cart.grandTotal}</td>
           </c:forEach>
           </table>
           </div>
     
</body>
</html>