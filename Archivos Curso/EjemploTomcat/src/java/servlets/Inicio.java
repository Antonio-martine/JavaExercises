/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jesus
 */
/*Se puede cambiar el url sin afectar el nombre del archivo*/
@WebServlet(name = "Prueba", urlPatterns = {"/Prueba"})
public class Inicio extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Ejemplo de un servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Hola mundo este es un ejemplo de mi primer servlet</h1>");
            out.println("<h1>Aquí declaro una variable producto de tipo string llamada *Tablet*</h1>");
            String producto = "tablet";
            out.println("<h3>Aquí declaro una variable cantidad de tipo entero con valor *5*</h3>");
            int cantidad = 5;
            out.println("<h3>Aquí declaro una varible precio de tipo double con valor 6798.90</h3>");
            double precio = 6798.90;
            out.println("<h3>Escribimos en la pantalla el valor de de las tres variables:</h3>");
            out.println("<h2>Producto: " + producto + "</h2>");
            out.println("<h2>Cantidad: " + cantidad + "</h2>");
            out.println("<h2>Precio: $" + precio + "</h2>");
            out.println("<h3>Calculamos el total: </h3>");
            double total = cantidad * precio;
            out.println("<h2>Total: " + total + "</h2>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
