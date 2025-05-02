package firstservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/hello")
public class Firstservlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) {
		
		try {
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			String page_title="Servlet page";
			
			out.println("<!DOCTYPE html>\r\n"
					+ "<html>\r\n"
					+ "<head>\r\n"
					+ "<meta charset=\"UTF-8\">\r\n"
					+ "<title>Home Page</title>\r\n"
					+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "	<h1 class=\"ms-3 text-danger\">"+page_title+"</h1>\r\n"
					+ "	<a href=\"/servlet\" class=\"ms-3 btn btn-primary\">Back to Home</a>\r\n"
					+ "</body>\r\n"
					+ "</html>");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
