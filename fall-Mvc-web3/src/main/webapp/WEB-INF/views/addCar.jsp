
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
		<legend>Add new article</legend>
		<form action="post" modelAttibute="rapide">
				year: <input type="text" name="year" required="required"/>
				make: <input type="text" name="make" required="required"/>
				model: <input type="text" name="mode" required="required"/>
				picture: <input type="text" name="picture" />
				<input type="submit">
		</form>
	  
	<%@ include file="common/footer.jspf"%>
	
	
	