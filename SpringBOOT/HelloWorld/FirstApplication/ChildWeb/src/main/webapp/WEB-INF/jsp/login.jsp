<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Login Page</h2>

 	<form:form method="POST" action="login" modelAttribute="UserLogin"> 
	
		
		<table border="1">

			<tr>

				<td>User Name</td>

				<td><form:input path="email" id="email"
						placeholder="Please Enter Email" />
				</td>

			</tr>


			<tr>
				<td>Password</td>

				<td><form:password path="password" id="password"
						placeholder="Please Enter Password" />
				</td>

			</tr>


			<tr>

				<td colspan="2"><input type="submit" value="login"></td>
			
			</tr>

		</table>



	</form:form>



</body>
</html>