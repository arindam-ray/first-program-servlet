
// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ClassB extends HttpServlet {

    private String message;

  public void init() throws ServletException {
      message = "<html> <head> <title> This is a Class B </title></head><body bgcolor='sky blue'> <h1 align='center'>This display comes from Class B </h1> </body></html>"; 
  }

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
    }

    public void destroy() {

    }
}