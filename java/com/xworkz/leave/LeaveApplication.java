package com.xworkz.leave;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.leave.dao.LeaveDAO;
import com.xworkz.leave.dao.LeaveDAOimpl;
import com.xworkz.leave.entity.LeaveEntity;
import com.xworkz.leave.service.leaveService;
import com.xworkz.leave.service.leaveServiceImpl;

public class LeaveApplication extends HttpServlet {
	private leaveService<LeaveEntity> leaveService;
	public LeaveApplication() {
		this.leaveService=new leaveServiceImpl();

		System.out.println("invoked" + this.getClass().getSimpleName());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String leave = req.getParameter("leave");
		String reason = req.getParameter("reason");
		String startDate = req.getParameter("start");
		String endDate = req.getParameter("end");
		// super.doPost(req, resp);
		System.out.println(name);
		System.out.println(email);
		System.out.println(leave);
		System.out.println(reason);
		System.out.println(startDate);
		System.out.println(endDate);

		resp.setContentType("text/html");
		PrintWriter writer = resp.getWriter();
		writer.print("submitted successfully");
		writer.flush();

		LeaveEntity entity = new LeaveEntity(id, name, email, leave, reason, startDate, endDate);
	
		
			this.leaveService.validateAndSave(entity);
		
	}
}
