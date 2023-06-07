<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Zohocrm-Database</title>
</head>
<style>
td{
padding:10px;

}
</style>
<body>
<table border=3>
<tr>
<th>User Name</th>
<th>Email</th>
<th>Mobile</th>
<th>Gender</th>
<th>Delete</th>
<th>Update</th>
</tr>
<c:forEach var="leads" items="${leads}">
<tr>
<td>${leads.username}</td>
<td>${leads.email}</td>
<td>${leads.mobile}</td>
<td>${leads.gender}</td>
<td><a href="deletelead?sno=${leads.sno}">Delete</a></td>
<td><a href="updatelead?sno=${leads.sno}">Update</a></td>

</tr>
</c:forEach>
</table>
</body>
</html>