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
import javax.servlet.http.HttpSession;
import modelos.Productos;

/**
 *
 * @author jesus
 */
@WebServlet(name = "OtraPagina", urlPatterns = {"/OtraPagina"})
public class OtraPagina extends HttpServlet {


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
                /*Manera de crear una session*/
        HttpSession session = request.getSession();
        Productos producto = (Productos)session.getAttribute("p");
        
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistroProducto</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Producto registrado</h1>");
            out.print("<h2>Nombre del producto: " + producto.getProducto() + "</h2>");
            out.print("<h2>Cantidad de producto: " + producto.getCantidad()+ "</h2>");
            out.print("<h2>Precio del producto: " + producto.getPrecio()+ "</h2>");
            out.print("<h2>Total del producto: " + producto.calcularTotal()+ "</h2>");
            out.print("<form action='Cerrar' method='post'>");
            out.print("<input type=\"submit\" value=\"Cerrar\"/>");
            out.print("</form>");
            out.println("</body>");
            out.println("</html>");
        }
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
