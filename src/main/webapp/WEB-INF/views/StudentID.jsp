<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<p>This is Students with ID</p>

<table>
<tr>
		<th width="80">Person ID</th>
		<th width="120">Person Name</th>
		<th width="120">Person Age</th>
		<th width="60">Person Salary</th>
</tr>
	

		<tr>
			<td>${person.id}</td>
			<td>${person.name}</td>
			<td>${person.age}</td>
			<td>${person.salary}</td>
		</tr>

</table>

</body>
</html>