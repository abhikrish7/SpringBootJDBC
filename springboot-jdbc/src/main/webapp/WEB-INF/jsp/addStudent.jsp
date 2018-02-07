<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add New Student Data</title>
</head>
<jsp:include page="menu.jsp" />
<body>
	<h3 style="color: red;">Add New Student</h3>

	<div id="addStudent">
		<form:form action="/addStudent" method="post"
			modelAttribute="student">
			<p>
				<label>Enter Student ID</label>
				<form:input path="id" />
			</p>
			<p>
				<label>Enter Student Name</label>
				<form:input path="name" />
			</p>
			<p>
				<label>Enter Student AGE</label>
				<form:input path="age" />
			</p>
			<p>
				<label>Student Result</label>
				<form:input path="result" />
			</p>
			<input type="SUBMIT" value="Submit" />
		</form:form>
	</div>
</body>
</html>
