package com.xworkz.leave;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.leave.dao.LeaveDAOimpl;
import com.xworkz.leave.entity.LeaveEntity;

public class LeaveServletGetByName extends HttpServlet{
	
	private LeaveDAOimpl service=null;
	public LeaveServletGetByName() {
		System.out.println("invoked LeaveServletGetByName"+this.getClass().getSimpleName());
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		this.service=new LeaveDAOimpl();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("invoked by doPost");
	String name = req.getParameter("name");
	System.out.println(name);
	
		//super.doPost(req, resp);
	}

}
