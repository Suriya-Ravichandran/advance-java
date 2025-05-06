package firstservlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/about")
public class Firstservlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException, ServletException {
		
		//	resp.setContentType("text/html");
//			PrintWriter out = resp.getWriter();
//			String page_title="Servlet page";
//			
//			out.println("<!DOCTYPE html>\r\n"
//					+ "<html>\r\n"
//					+ "<head>\r\n"
//					+ "<meta charset=\"UTF-8\">\r\n"
//					+ "<title>Home Page</title>\r\n"
//					+ "<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n"
//					+ "</head>\r\n"
//					+ "<body>\r\n"
//					+ "	<h1 class=\"ms-3 text-danger\">"+page_title+"</h1>\r\n"
//					+ "	<a href=\"/servlet\" class=\"ms-3 btn btn-primary\">Back to Home</a>\r\n"
//					+ "</body>\r\n"
//					+ "</html>");
		String content = req.getParameter("content");
		if (content == null) content = "Contrary to popular belief, "
				+ "Lorem Ipsum is not simply random text. "
				+ "It has roots in a piece of classical Latin"
				+ " literature from 45 BC, making it over 2000 years old."
				+ " Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, "
				+ "looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, "
				+ "and going through the cites of the word in classical literature, discovered the undoubtable source. "
				+ "Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" "
				+ "(The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. "
				+ "The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.";
		req.setAttribute("content", content);
		
		RequestDispatcher render= req.getRequestDispatcher("WEB-INF/views/about.jsp");
		render.forward(req, resp);
	}
}
