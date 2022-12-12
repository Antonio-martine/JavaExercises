/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Persona;


@WebServlet(name = "Recibe", urlPatterns = {"/Recibe"})
public class Recibe extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*Objeto de la calse persona*/
        Persona p = new Persona();
        p.setNombre(request.getParameter("nombre"));
        p.setEdad(Integer.parseInt(request.getParameter("edad")));
        p.setGenero(request.getParameter("genero"));
        p.calcularDecenas();
        
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            out.print("<!DOCTYPE html>");
            out.print("<html>");
            out.print("<head>");
            out.print("<title>Servlet Recibe</title>");
            out.print("</head>");
            out.print("<body>");
            out.print("<h2>Nombre: " + p.getNombre() + "</h2>");
            out.print("<h2>Edad: " + p.getEdad()+ "</h2>");
            out.print("<h2>Género: " + p.getGenero()+ "</h2>");
            out.print("<h2>Decenas: " + p.getDecenas()+ "</h2>");
            out.print("</body>");
            out.print("</html>");
            
        }
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
