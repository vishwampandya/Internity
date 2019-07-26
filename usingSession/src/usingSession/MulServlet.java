package usingSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MulServlet extends HttpServlet {
	public void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException , ServletException {
		HttpSession session = req.getSession();
		int a = (int)session.getAttribute("a");
		int b = (int)session.getAttribute("b");
		int c = a*b;
		
		PrintWriter pri = res.getWriter();
		pri.println(c);
	}
}
