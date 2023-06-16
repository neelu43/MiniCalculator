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

@WebServlet("/pm")
public class PrimeServlet implements Servlet {
	public void init(ServletConfig scf) throws ServletException {
//		NoCode
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		int v1 = Integer.parseInt(req.getParameter("v1"));
		int v2 = Integer.parseInt(req.getParameter("v2"));
		try {
			int c1 = 0;
			int c2 = 0;
			for (int i = 2; i <= v1 / 2; i++) {
				if (v1 % i == 2)
					c1++;
				if (v2 % i == 2)
					c2++;
			}
			if (c1 < 1) {
				pw.println("<div class='res'>"+v1 + " is prime number</div>");
			} else
				pw.println("<div class='res'>"+v1 + " is not prime number</div>");

			if (c2 < 1) {
				pw.println("<div class='res'>"+v2 + " is prime number</div>");
			} else
				pw.println("<div class='res'>"+v2 + " is not prime number</div>");

		} catch (Exception e) {
			pw.println("<div class='res'>Enter interger val....</div>");
		}
		RequestDispatcher rd =

				req.getRequestDispatcher("input.html");

		rd.include(req, res);
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
