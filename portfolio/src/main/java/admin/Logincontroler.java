package admin;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("admin/login")
public class Logincontroler {
	 protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		 String email = req.getParameter("email");
	     String password = req.getParameter("password");
	     
	     String verifyeamil="suriya@gmail.com";
	     String verifypassword="1234";
	     
	     if (email.equals(verifyeamil)) {
	    	 if(password.equals(verifypassword)) {
	    		 resp.sendRedirect("http://localhost:8080/portfolio/admin/dashboard");
	    	 }
	    	 else {
	    		 resp.sendRedirect("http://localhost:8080/portfolio/admin");
	    	 }
	    	 
	     }
	     else {
	    	 resp.sendRedirect("http://localhost:8080/portfolio/admin");
	     }
	     
	 }
}
