package firstservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/viewdata")
public class Formsubmit extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String email=(String)req.getParameter("email");
		String msg=(String)req.getParameter("msg");
		
		String userContent = req.getParameter("user-content");
        userContent = "EMAIL :"+email+"Message:"+msg;

        req.setAttribute("userContent", userContent);
        
        RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/views/viewdata.jsp");
        dispatcher.forward(req, resp);
	}
}
