<%-- 
    Document   : mostrar
    Created on : 11 sep. 2022, 22:10:06
    Author     : jesus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.Persona" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Documento JSP</h1>
        <%
            Persona p = new Persona();
            p.setNombre(request.getParameter("nombre"));
            p.setEdad(Integer.parseInt(request.getParameter("edad")));
        %>

        <p>Tu nombre es: <%= p.getNombre()%></p>
        <p>Tu edad es: <%= p.getEdad()%></p>
        <p>Te faltan <%= p.getFaltantes()%> años para cumplir 100 años</p>
        
        <a href="index.html">Regresar</a>
        
        
    </body>
</html>
