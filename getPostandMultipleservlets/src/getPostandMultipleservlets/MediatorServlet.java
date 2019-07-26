package getPostandMultipleservlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;


public class MediatorServlet extends HttpServlet{
	public void doPost(HttpServletRequest req , HttpServletResponse res)throws IOException , ServletException{
		int n = Integer.parseInt(req.getParameter("num"));
		
		PrintWriter pri = res.getWriter();
		
		n=n*n;
		req.setAttribute("n",n);
		
		pri.println("inside servlet MediatorServlet");
		
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req,res);
	}
}
