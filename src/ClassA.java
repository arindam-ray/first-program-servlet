
// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ClassA extends HttpServlet {

    private String message;

  public void init() throws ServletException {
      message = "<html> <head> <title> This is a Class A </title></head><body bgcolor='yellow'> <h1 align='center'>This display comes from Class A </h1></body></html>"; 
  }

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
    }

    public void destroy() {
    //	super.destroy();

    }
}