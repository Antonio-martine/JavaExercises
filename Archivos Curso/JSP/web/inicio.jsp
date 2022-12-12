<%-- 
    Document   : inicio
    Created on : 22 ago. 2022, 16:15:58
    Author     : jesus
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <!--<!-- <%%> Indica que se comenzara a utilizar lenguaje de JAVA -->
        <%
            out.print("Esto es JSP <br /><br />");
            String nombre = "Antonio";
            double sueldo = 2500;
            int diasTrabajados = 2;
            out.print("Los datos del empleado son: <br />");
            out.print("Nombre: " + nombre + "<br />");
            out.print("Sueldo diario: " + sueldo + "<br />");
            out.print("Dias Trabajados: " + diasTrabajados + "<br />");
        %>
    </body>
</html>
