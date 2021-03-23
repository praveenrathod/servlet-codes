package com.xworkz.box;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XboxServlet extends HttpServlet {
	public XboxServlet() {
		System.out.println("invoked XboxServlet " + this.getClass().getSimpleName());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("invoked doPost method");
		String game = req.getParameter("game");
		String gametype = req.getParameter("type");
		String gameseries = req.getParameter("series");
		String username = req.getParameter("userName");
		String email = req.getParameter("Email");
		
		
		System.out.println(game);
		System.out.println(gametype);
		System.out.println(gameseries);
		System.out.println(username);
		System.out.println(email);
		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>");
		writer.println("Writer used while getting the responce");
		writer.println("</h1>");
		writer.println("order for game "+game+" and type is "+gametype+" series is "+gameseries+" for the name "+username+" and email is "+email);
		writer.println("</body>");
		writer.println("</html>");
		writer.flush();
		

		//super.doPost(req, resp);
	}

}
