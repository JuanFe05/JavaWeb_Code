package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
       
        out.println("<html>");
        out.println("<head></head>");         
        out.println("<body>");
        
        out.println("<h1>Hola desde un Servlet</h1>");
        
        out.println("</body>");
        out.println("</html>"); 
    }
    
}
