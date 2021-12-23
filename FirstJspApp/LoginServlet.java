package webapp;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {				
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UserValidationService service=new UserValidationService();
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException,IOException{
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException,IOException{
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		Boolean isUserValid=service.isUserValid(name, password);
		if(isUserValid) {
		request.setAttribute("name", request.getParameter("name"));
		request.setAttribute("email", request.getParameter("email"));
		request.setAttribute("password", request.getParameter("password"));
		
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
		}else {
			request.setAttribute("errorMessage", "Invalid Credential !");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}
	}
			
}
			