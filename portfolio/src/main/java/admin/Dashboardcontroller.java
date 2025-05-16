package admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/admin/dashboard")
public class Dashboardcontroller extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("views/admin/dashboard.html");
	     dispatcher.forward(req, resp);
		
	}
}
