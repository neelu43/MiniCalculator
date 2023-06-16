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

@WebServlet("/sb")
public class SubstractionServlet implements Servlet {
	public void init(ServletConfig scf) throws ServletException {
//		NoCode
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		int v1 = Integer.parseInt(req.getParameter("v1"));
		int v2 = Integer.parseInt(req.getParameter("v2"));
		try {

			pw.println("<div class='res'>Subtraction:" + (v1 - v2)+"</div>");

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
