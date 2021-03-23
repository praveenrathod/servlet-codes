package com.xworkz.it.web;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ItIndustry extends HttpServlet{

	public ItIndustry() {
	System.out.println("created "+getClass().getSimpleName());
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("invoked doGetMethod");
		super.doGet(req, resp);
	}
	
}
