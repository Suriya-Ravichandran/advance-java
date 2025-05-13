package firstservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/cookies") 
public class CreateCookies extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		
		
		Cookie usercookie=new Cookie("Username","foo");
		
		usercookie.setMaxAge(24 * 60 * 60);
		
		resp.addCookie(usercookie);

		
		String content = req.getParameter("content");
		if (content == null) content = "Cookies added successfully";
		req.setAttribute("content", content);
		
		RequestDispatcher render= req.getRequestDispatcher("WEB-INF/views/cookies.jsp");
		render.forward(req, resp);
		
	}

	
	
}
