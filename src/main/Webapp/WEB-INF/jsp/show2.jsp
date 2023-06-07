<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Zoho-Crm Customer Data</title>
</head>
<body>
<h1>Update Data</h1>
<form action="updatelead1" method="post">
<pre>

<input type="hidden" name="sno" value="${lead.sno}"/>

User-Name:<input type="text" name="username" value="${lead.username}"/>

   Email:<input type="email" name="Email" value="${lead.email}"/>

  Mobile:<input type="number" name="Mobile" value="${lead.mobile}"/>

 Gender:<input type="text" name="Gender" value="${lead.gender}"/>
<input type="hidden" name="Paswd" value="${lead.paswd}"/>
  <input type="submit" value="update"/>
</pre>
</form>
</body>
</html>