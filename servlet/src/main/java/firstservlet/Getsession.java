package firstservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/getsession")
public class Getsession extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PrintWriter out = resp.getWriter();
		
		HttpSession session=req.getSession();
		
		if (session !=null) {
			
			String username=(String)session.getAttribute("Username");
			String role=(String)session.getAttribute("Role");
			
			out.println("<h1> Username:"+username+"</h1>");
			out.println("<h1> Role:"+role+"</h1>");
		}
		
	}
}
