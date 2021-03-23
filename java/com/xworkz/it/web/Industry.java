package com.xworkz.it.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Industry extends HttpServlet {
	
	public Industry() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("invoked doGet");
	String parameter = req.getParameter("employeeId");
	String parameter2 = req.getParameter("address");
	System.out.println(parameter);
	System.out.println(parameter2);
		//super.doGet(req, resp);
	
	resp.setContentType("text/html");
	
	PrintWriter writer = resp.getWriter();
	writer.println("<html>");
	writer.println("<body>");
	writer.println("<h1>");
	writer.println("Writer used while getting the responce");
	writer.println("</h1>");
	writer.println("</br>");
	writer.println("employee id is "+parameter+" and addess of company is "+parameter2+" data is saved");
	writer.println("</body>");
	writer.println("</html>");
	writer.flush();

	}

}
