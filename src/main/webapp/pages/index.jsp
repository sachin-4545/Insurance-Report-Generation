<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Report App</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<h3 class="pd-3 pt-3">Insurance Report Generation</h3>
		<form:form action="search" modelAttribute="search" method="POST">
			<table>
				<tr>
					<td>Plan Name:</td>
					<td><form:select path="planName">
							<form:option value=""> -select-</form:option>
							<form:options items="${names}" />
						</form:select></td>

					<td>Plan Status:</td>
					<td><form:select path="planStatus">
							<form:option value=""> -select-</form:option>
							<form:options items="${status}" />
						</form:select></td>

					<td>Gender:</td>
					<td><form:select path="gender">
							<form:option value="">-select-</form:option>
							<form:option value="Male"> Male</form:option>
							<form:option value="Female">Female</form:option>
						</form:select></td>
				<tr>
					<td>Start Date:</td>
					<td><form:input path="startDate" type="date"
							date-date-format="mm-dd-yyyy" /></td>

					<td>End Date:</td>
					<td><form:input path="endDate" type="date"
							date-date-format="mm-dd-yyyy" /></td>
				<tr>
				<tr>
					<td><input type="submit" value="search"
						class="btn btn-primary" /></td>
				</tr>


			</table>

		</form:form>

		<hr />
		<table class="table table-striped table-hover">
			<thead>
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Gender</th>
					<th>PlanName</th>
					<th>planStatus</th>
					<th>StratDate</th>
					<th>EndDate</th>
					<th>BenifitAmt</th>
					<th>DenielReason</th>
					<th>DenielReason</th>
					<th>TerminatedDate</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${plans}" var="plan" varStatus="index">
					<tr>
						<td>${index.count}</td>
						<td>${plan.citizenName}</td>
						<td>${plan.gender}</td>
						<td>${plan.planName}</td>
						<td>${plan.planStatus}</td>
						<td>${plan.planStartDate}</td>
						<td>${plan.planEndDate}</td>
						<td>${plan.benifitamt}</td>
						<td>${plan.denielReason}</td>
						<td>${plan.terminationReason}</td>
						<td>${plan.terminatedDate}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<hr />

		Export: <a href="">Excel</a> <a href="">Pdf</a>

	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
		crossorigin="anonymous"></script>


</body>
</html>