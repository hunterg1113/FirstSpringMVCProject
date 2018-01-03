<html>
<head>
<title>Admission Success</title>
</head>
<body>
	<h1>${hdrMsg}</h1>

	<h3>Congratulations! Your application has been processed successfully!</h3>

	<h2>Details submitted by you:</h2>

	<table>
		<tr>
			<td>Student Name:</td>
			<td>${student.studentName}</td>
		</tr>
		<tr>
			<td>Student Hobby:</td>
			<td>${student.studentHobby}</td>
		</tr>
		<tr>
			<td>Student Mobile:</td>
			<td>${student.studentMobile}</td>
		</tr>
		<tr>
			<td>Student DOB:</td>
			<td>${student.studentDOB}</td>
		</tr>
		<tr>
			<td>Student Skills:</td>
			<td>${student.studentSkills}</td>
		</tr>
		<tr>
			<td>Student Address:</td>
			<td>Country: ${student.studentAddress.country} City: ${student.studentAddress.city} Street: ${student.studentAddress.street} Zip Code:
				${student.studentAddress.zipCode}</td>
		</tr>
	</table>
</body>
</html>