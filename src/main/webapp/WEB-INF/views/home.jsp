<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  Welcome to Student Databases with some changes: </P>

<form action="${pageContext.request.contextPath}/addStudent" method="POST">
  First name: <input type="text" name="name"><br>
  First age: <input type="text" name="age"><br>
  First salary: <input type="text" name="salary"><br>
  <input type="submit" value="Submit">
</form>

</body>
</html>
