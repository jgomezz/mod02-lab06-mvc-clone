<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<%@ page import="pe.edu.tecsup.app.models.Cliente" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  
  
  <%
  
  	// Variables predefinidas en el JSP ->  out , request, response, page

  	Cliente cli = (Cliente)request.getAttribute("cliente_encontrado");
  	
  	if (cli == null )
  		out.println("Usuario no encontrado");
  	else
  		out.println(cli.getNombres());

  %>
  
  
</body>
</html>