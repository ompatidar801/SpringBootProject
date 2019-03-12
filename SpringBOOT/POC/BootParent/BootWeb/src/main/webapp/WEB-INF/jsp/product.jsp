<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<html>
<head>
<title>Product Page</title>

<link
	href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css"
	rel="stylesheet">

<script src="https://code.jquery.com/jquery-3.3.1.js"></script>

<script
	src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$('#MYTABLE').DataTable({
			"pagingType" : "full_numbers"
		});
	});
</script>



</head>
<body>

	<h2>Product JSP</h2>

	<form:form method="POST" action="product" modelAttribute="UserProduct" >

		<table border="1" align="center">

			<tr>
				<td>Product Name</td>

				<td><form:input path="pname" id="pname"
						placeholder="Please Enter Product Name" /> 
				</td>

			</tr>

			<tr>
				<td>Product Description</td>

				<td><form:input path="pdescription" id="pdescription"
						placeholder="Please Enter Product Description" /> 
						
				</td>

			</tr>

			<tr>
				<td>Product Price</td>

				<td><form:input path="pprice" id="pprice"
						placeholder="Please Enter Product Price" /> 
				</td>

			</tr>

			<tr>
				<td>Product Quantity</td>

				<td><form:input path="pquantity" id="pquantity"
						placeholder="Please Enter Product Quantity" /> 
				</td>

			</tr>



			<tr>

				<td colspan="2"><input type="submit" value="Product"></td>
			
			</tr>


			<a href="logout">logout</a>

		</table>


	</form:form>


	<hr>

	<table id="MYTABLE" border="1" align="center" bgcolor="grey">
		<thead>
			<tr>

				<td>Product ID</td>
				<td>Product Name</td>
				<td>Product Description</td>
				<td>Product Price</td>
				<td>Product Quantity</td>	
	
			</tr>
		</thead>
		<tbody>
			<c:choose>

				<c:when test="${empty productList}">
	
				No Record Found.
	
			</c:when>

				<c:otherwise>

					<c:forEach items="${productList}" var="pro">

						<tr>

							<td><c:out value="${pro.pid}"></c:out></td>
							<td><c:out value="${pro.pname}"></c:out></td>
							<td><c:out value="${pro.pdescription}"></c:out></td>
							<td><c:out value="${pro.pprice}"></c:out></td>
							<td><c:out value="${pro.pquantity}"></c:out></td>
							<td><a href="<c:url value='/editproduct-${pro.pid}'/>">edit</a></td>
							<td><a href="<c:url value='/deleteproduct-${pro.pid}'/>">delete</a></td>	

						</tr>

					</c:forEach>

				</c:otherwise>

			</c:choose>

		</tbody>

	</table>



</body>
</html>