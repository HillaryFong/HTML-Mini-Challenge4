package fong.hillary.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class submit
 */
@WebServlet("/submit")
public class submit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public submit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String bgcolors = request.getParameter("bgcolor");
		String fcolor = request.getParameter("fontcolor");
		String postcolor = request.getParameter("postcolor");
		System.out.println(bgcolors);
		HttpSession session=request.getSession();
		session.setAttribute("bgcolor", bgcolors);
		Cookie c=new Cookie("bgcolor", bgcolors);
     	c.setMaxAge(60*20);
		response.addCookie(c);
		
		session.setAttribute("fcolor", fcolor);
		Cookie c2=new Cookie("fcolor", fcolor);
     	c2.setMaxAge(60*20);
		response.addCookie(c2);
		
		session.setAttribute("postcolor", postcolor);
		Cookie c3=new Cookie("postcolor", postcolor);
     	c3.setMaxAge(60*20);
		response.addCookie(c3);
		request.getRequestDispatcher("index.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("index.jsp").forward(request,response);
     
	
	}

}
