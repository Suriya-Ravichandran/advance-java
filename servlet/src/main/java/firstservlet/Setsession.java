package firstservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/setsession")
public class Setsession extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
//		set session 
		
		HttpSession session=req.getSession();
		
		session.setAttribute("Username","suriya");
		session.setAttribute("Role","Admin");
		
		RequestDispatcher render= req.getRequestDispatcher("WEB-INF/views/session.jsp");
		render.forward(req, resp);
	}

}
