

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		
		String inputURL=request.getParameter("inputURL");
		
		// FIXME: run libary with inputURL to get result
		//forward to the view
		
		String outputUrl="example.html";
		
		String destinationUrl = "/output.jsp";
		
		//FIXME: Put reference to html output
		request.setAttribute("output", outputUrl);
        getServletContext()
                .getRequestDispatcher(destinationUrl)
                .forward(request, response);
		}
	
}
