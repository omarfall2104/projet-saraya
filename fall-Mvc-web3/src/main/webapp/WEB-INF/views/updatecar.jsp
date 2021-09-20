
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<hr>
		<legend>Update article</legend>
		<fieldset>
		<form method = "post" modelAttribute="rapide">
		<form:hidden path="id"/>
		
				year: <input type="text" path="year" required="required"/>
				make: <input type="text" path="make" required="required"/>
				model: <input type="text" path="mode" required="required"/>
				<input type="submit"/>
		</form>
		</fieldset>
	  
	<%@ include file="common/footer.jspf"%>
	