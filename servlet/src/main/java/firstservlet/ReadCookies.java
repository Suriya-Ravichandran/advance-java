package firstservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readcookies")
public class ReadCookies extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies=req.getCookies();
		
		
		String content = req.getParameter("content");
		if (content == null) content = "Welcome "+cookies[0].getValue()+"!";
		req.setAttribute("content", content);
		
		RequestDispatcher render= req.getRequestDispatcher("WEB-INF/views/readcookies.jsp");
		render.forward(req, resp);
	}
	
}
