<!DOCTYPE html>
<html> 
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<p>C&oacute;digos disponibles : X001 , X002, X003 </p>
	
	<form action="ClientesBuscarServlet" method="post">
	
		C&oacute;digo: <select name="txtCodigo">
							<option value ="X001" selected >X001</option>
							<option value ="X002">X002</option>
							<option value ="X003">X003</option>
					   </select>
		
		<input type="submit" value="Buscar"/>
	
	</form>
</body>
</html>