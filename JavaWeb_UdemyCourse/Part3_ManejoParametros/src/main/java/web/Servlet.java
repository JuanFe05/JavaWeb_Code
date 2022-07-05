package web;

import java.io.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
    
        //Obterner parámetros del form
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");
       
        System.out.println("User " + usuario + " Pass " + password);
        
        PrintWriter out = response.getWriter();
        
        out.println("<html>");
        out.println("<head></head>");         
        out.println("<body>");
        
        out.println("<h1>Hola " + usuario + "</h1>");
        
        out.println("</body>");
        out.println("</html>"); 
        
    }
    
}
