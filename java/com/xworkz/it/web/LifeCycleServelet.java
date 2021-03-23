package com.xworkz.it.web;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LifeCycleServelet extends GenericServlet {
	
	public LifeCycleServelet() {
		System.out.println("invoking "+this.getClass().getSimpleName());
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("creating service LifeCycle");
		
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
	System.out.println("invoking init LifeCycleServelet");
		super.init(config);
	}
	@Override
	public void destroy() {
		System.out.println("invoking destroy in LifeCycleServelet");
		super.destroy();
	}

}
