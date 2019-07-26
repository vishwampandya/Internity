package getPostandMultipleservlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class SquareServlet extends HttpServlet {
	public void doPost(HttpServletRequest req , HttpServletResponse res)throws IOException {
		PrintWriter pri = res.getWriter();
		
		int n = (int) req.getAttribute("n");
		
		pri.println("inside SquareServlet " + n);
	}
}
