<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>


	<h1>Best car ever</h1>
	<table>
			<thead>
					<tr>
						<td>Image</td>
						<td>Year</td>
						<td>Make</td>
						<td>Model</td>
						<td>update</td>
						<td>Delete</td>
					</tr>
			</thead>
			<tbody>
			<c:forEach items="${cars}" var="car">
				<tr>
					<td><img src = "${car.image}" width="300" height="300" /></td>
					<td>${car.year}</td>
					<td>${car.make}</td>
					<td>${car.model}</td>
					<td><a href= "/update-car?id=${car.id}">update</a></td>
					<td><a href= "/delete-car?id=${car.id}">Delete</a></td>
				</tr>
			</c:forEach>	
			</tbody>
				
			
		</table>
	
	 <a href="/add-car">Add a car</a> 
<%@ include file="common/footer.jspf"%>