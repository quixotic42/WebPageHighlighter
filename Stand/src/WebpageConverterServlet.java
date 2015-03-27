
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import team.misc.*;

@WebServlet("/WebpageConverterServlet")
public class WebpageConverterServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
    public WebpageConverterServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Set string to user's input URL
		String inputURL=request.getParameter("inputURL");
		
		// Run library with inputURL to get result
		String outputHTML = ArticleSearchRunner.runArticleSearch(inputURL);
		
		// Put outputURL to html output		
		request.setAttribute("outputHTML", outputHTML);
		RequestDispatcher RequetsDispatcherObj = request.getRequestDispatcher("/OutputFile.jsp");
		RequetsDispatcherObj.forward(request, response);
		}
	
}
