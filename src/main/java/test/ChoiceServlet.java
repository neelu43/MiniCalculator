package test;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/first")
public class ChoiceServlet implements Servlet {
	public void init(ServletConfig scf) throws ServletException {
//	NoCode
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
//		int val1=Integer.parseInt(req.getParameter("v1"));
//		int val2=Integer.parseInt(req.getParameter("v2"));
		String s1 = req.getParameter("s1");
		if (s1.equals("Greater")) {
			RequestDispatcher rd =

					req.getRequestDispatcher("gt");

					rd.forward(req, res);
		}
		else if (s1.equals("Smaller")) {
			RequestDispatcher rd =

					req.getRequestDispatcher("sm");

					rd.forward(req, res);
		} 
		else if (s1.equals("Addition")) {
			RequestDispatcher rd =

					req.getRequestDispatcher("ad");

					rd.forward(req, res);
		}
		else if (s1.equals("Subtract")) {
			RequestDispatcher rd =

					req.getRequestDispatcher("sb");

					rd.forward(req, res);
		}
		else if (s1.equals("Multiply")) {
			RequestDispatcher rd =

					req.getRequestDispatcher("ml");

					rd.forward(req, res);
		} 
		else if (s1.equals("Division")) {
			RequestDispatcher rd =

					req.getRequestDispatcher("dv");

					rd.forward(req, res);
		} 
		else if (s1.equals("Modular")) {
			RequestDispatcher rd =

					req.getRequestDispatcher("md");

					rd.forward(req, res);
		} 
		else if (s1.equals("Factorial")) {
			RequestDispatcher rd =

					req.getRequestDispatcher("ft");

					rd.forward(req, res);
		}
		else  {
			RequestDispatcher rd =

					req.getRequestDispatcher("pm");

					rd.forward(req, res);
		}

	}

	public void destroy() {
//		NoCode
	}

	public ServletConfig getServletConfig() {
		return this.getServletConfig();
	}

	public String getServletInfo() {
		return "Choice";
	}
}
