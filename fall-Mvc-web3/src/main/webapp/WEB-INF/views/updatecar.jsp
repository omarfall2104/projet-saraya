
<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
	
		<legend>Add new article</legend>
		<form:form modelAttribute="rapide" method="post">
				<form:hidden path="id"/>
				<form:errors path="make"/>
				<form:input type="text" path ="year" required="required"/>	
				<form:input type="text" path ="make" required="required"/>
				<form:input type="text" path ="model" required="required"/>
				<form:input type="text" path ="image"/>
				<input type="submit"/>

		</form:form>
	  
	<%@ include file="common/footer.jspf"%>
	