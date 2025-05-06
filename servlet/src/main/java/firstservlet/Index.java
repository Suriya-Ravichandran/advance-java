package firstservlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")  // This maps to the root path
public class Index extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        
        String indexContent = req.getParameter("index-content");
        indexContent = "There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, "
                         + "or randomised words which don't look even slightly believable. "
                         + "If you are going to use a passage of Lorem Ipsum, "
                         + "you need to be sure there isn't anything embarrassing hidden in the middle of text. "
                         + "All the Lorem Ipsum generators on the Internet tend to repeat predefined chunks as necessary, "
                         + "making this the first true generator on the Internet. It uses a dictionary of over 200 Latin words, combined with a handful of model sentence structures, "
                         + "to generate Lorem Ipsum which looks reasonable. The generated Lorem Ipsum is therefore always free from repetition, injected humour, or non-characteristic words etc.";

        req.setAttribute("indexContent", indexContent);
        RequestDispatcher dispatcher = req.getRequestDispatcher("WEB-INF/views/index.jsp");
        dispatcher.forward(req, resp);
    }
}
