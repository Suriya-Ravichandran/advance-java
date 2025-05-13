package firstservlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/submit")
public class Formsubmit extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String email = req.getParameter("email");
        String msg = req.getParameter("msg");

        // JDBC connection details
        String dburl = "jdbc:mysql://localhost:3306/adj?user=root&password=root";

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Use try-with-resources to manage JDBC resources
            try (Connection con = DriverManager.getConnection(dburl);
                 PreparedStatement psmt = con.prepareStatement(
                     "INSERT INTO `contact` (`email`, `message`) VALUES (?, ?)")) {

                psmt.setString(1, email);
                psmt.setString(2, msg);

                int count = psmt.executeUpdate();

                if (count > 0) {
                    System.out.println("Data inserted successfully");
                } else {
                    System.out.println("Data insertion failed");
                }
            }


            // Forward to JSP page
            RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/views/submit.jsp");
            dispatcher.forward(req, resp);

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            // Set content type and return error to client if forwarding fails
            resp.setContentType("text/html");
            resp.getWriter().write("<h3>Database error occurred: " + e.getMessage() + "</h3>");
        }
    }
}
