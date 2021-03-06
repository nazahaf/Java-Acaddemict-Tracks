package com.realdolmen.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/HelloNameServlet")
public class HelloNameServlet extends HttpServlet {

	private static final long serialVersionUID = -7155032807030301376L;
	private static final String CONTENT_TYPE = "text/html";
	public void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		response.setContentType(CONTENT_TYPE);
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		out.println(name);
	}
}
