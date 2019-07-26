package usingSession;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;

public class Mediator extends HttpServlet {
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException , ServletException {
		int a = Integer.parseInt(req.getParameter("num1"));
		int b = Integer.parseInt(req.getParameter("num2"));
		
		HttpSession session = req.getSession();
		session.setAttribute("a", a);
		session.setAttribute("b",b);
		res.sendRedirect("mulSer");
		
	}
}
