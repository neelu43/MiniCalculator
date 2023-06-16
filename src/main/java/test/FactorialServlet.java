package test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ft")
public class FactorialServlet implements Servlet {
	public void init(ServletConfig scf) throws ServletException {
//			NoCode
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		int v1 = Integer.parseInt(req.getParameter("v1"));
		int v2 = Integer.parseInt(req.getParameter("v2"));
		try {
			int fact1 = 1;
			for (int i = 1; i <= v1; i++) {
				fact1 *= i;
			}
			int fact2 = 1;
			for (int i = 1; i <= v2; i++) {
				fact2 *= i;
			}
			pw.println("<div class='res'>Factorial of " + v1 + " is " + fact1+"<br>Factorial of " + v2 + " is " + fact2+"</div>");
			pw.println();

		} catch (Exception e) {
			pw.println("Enter interger val....");
		}
		RequestDispatcher rd =

				req.getRequestDispatcher("input.html");

		rd.include(req, res);
	}

	public void destroy() {
//			NoCode
	}

	public ServletConfig getServletConfig() {
		return this.getServletConfig();
	}

	public String getServletInfo() {
		return "Choice";
	}
}
