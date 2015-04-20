package fong.hillary.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class checker
 */
@WebServlet("/checker")
public class checker extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public checker() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookieList=request.getCookies();
		boolean hasLoggedIn= false;
		String bgcolor="white";
		String fcolor="black";
		String pcolor="red";
		if(cookieList != null){
		for(Cookie c: cookieList){
			
			if(c.getName().equals("bgcolor")){
			
				bgcolor = c.getValue();
				break;
			}
		}
		for(Cookie c2: cookieList){
			if(c2.getName().equals("fontcolor")){
			
				fcolor = c2.getValue();
				break;
			}
		}
		for(Cookie c3: cookieList){
			if(c3.getName().equals("postcolor")){
				
				pcolor = c3.getValue();
				break;
			}
		}
		}
		request.getSession().setAttribute("bgcolor", bgcolor);
		request.getSession().setAttribute("font", fcolor);
		request.getSession().setAttribute("postcolor", pcolor);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
