<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
        out.print("Esto es JSP <br /><br />");
        String nombre = "Fulanito";
        double sueldo = 2500;
        int diastrabajados = 2;
        out.print("Los datos del empleado son: <br />");
        out.print("Nombre: "+nombre+"<br />");
        out.print("Sueldo diario: "+sueldo+"<br />");
        out.print("Dias trabajados: "+diastrabajados+"<br />");
        
        %>
    </body>
</html>
