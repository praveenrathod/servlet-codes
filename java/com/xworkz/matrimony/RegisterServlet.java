package com.xworkz.matrimony;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {
	
	public RegisterServlet() {
		System.out.println("invoked"+getClass().getSimpleName());
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String parameter = req.getParameter("FirstName");
		String parameter2 = req.getParameter("LastName");
		System.out.println(parameter);
		System.out.println(parameter2);
		resp.setContentType("text/html");
		
		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>");
		writer.println("SUCCESSFULLY REGISTERED");
		writer.println("</h1>");
		writer.println("</br>");
		writer.println("name is "+parameter+" and surname is "+parameter2+" data is saved");
		writer.println("</body>");
		writer.println("</html>");
		writer.flush();
		//super.doGet(req, resp);
	}
	
	

}
