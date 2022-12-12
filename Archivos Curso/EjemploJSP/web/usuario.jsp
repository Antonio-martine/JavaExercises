<%-- 
    Document   : usuario
    Created on : 22 ago. 2022, 16:43:10
    Author     : jesus
--%>

<%@page import="modelos.Dato"%>
<%
Dato d = new Dato();
d.setNombre(request.getParameter("nombre"));
d.setGenero(request.getParameter("genero"));
d.setEdad(Integer.parseInt(request.getParameter("edad")));
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Datos del usuario</title>
    </head>
    <body>
        <h1>Estos son sus datos</h1>
        <pre></pre>
        <%
        out.print("<h2>Nombre del usuario: " + d.getNombre() + "</h2>");
        %>
    </body>
</html>
