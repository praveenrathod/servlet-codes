package com.xwrokz.servlet_hibernate;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servlet_H extends HttpServlet {

	public servlet_H() {
		System.out.println("invoking"+this.getClass().getSimpleName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String phone = req.getParameter("phone");
		String company = req.getParameter("company");
		String about = req.getParameter("about");
		
		System.out.println(name);
		System.out.println(phone);
		System.out.println(company);
		System.out.println(about);

		
		

		//super.doPost(req, resp);
	}
}
