

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import team.misc.*;

/**
 * Servlet implementation class WebpageConverterServlet
 */
@WebServlet("/WebpageConverterServlet")
public class WebpageConverterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WebpageConverterServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Set string to user's input URL
		String inputURL=request.getParameter("inputURL");
		
		// Run libary with inputURL to get result
		String outputHTML = ArticleSearchRunner.runArticleSearch(inputURL);
		
		//FIXME: Put outputURL to html output		
		request.setAttribute("outputHTML", outputHTML);
		RequestDispatcher RequetsDispatcherObj = request.getRequestDispatcher("/OutputFile.jsp");
		RequetsDispatcherObj.forward(request, response);
		}
	
}
