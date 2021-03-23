package com.xworkz.leave.service;

import com.xworkz.leave.dao.LeaveDAO;
import com.xworkz.leave.dao.LeaveDAOimpl;
import com.xworkz.leave.entity.LeaveEntity;

public class leaveServiceImpl implements leaveService<LeaveEntity> {
	private LeaveDAO dao;

	public leaveServiceImpl() {
		this.dao = new LeaveDAOimpl();
	}

	@Override
	public boolean validateAndSave(LeaveEntity entity) {
		boolean valid = false;
		if (entity != null) {
			String name = entity.getName();
			if (name != null && name != "" && name.length() > 3 && name.length() <= 20) {
				System.out.println("name is valid");
				valid = true;
			} else {
				System.err.println("name is not valid");
				valid = false;
			}
			String email = entity.getEmail();
			if (email != null && !email.isEmpty() && email.contains("@") && email.endsWith(".com")) {
				System.out.println("email is valid");
				valid = true;
			} else {
				System.err.println("email is not valid");
				valid = false;
			}
			String leaves = entity.getLeave();
			if (leaves != null && !leaves.isEmpty() && leaves.length() == 1) {
				System.out.println("leave for is valid");
				valid = true;
			} else {
				System.err.println("leave for is not valid");
				valid = false;
			}
			String start = entity.getStart();
			if (start != null && !start.isEmpty() && start.length() == 6) {
				System.out.println("start date is valid");
				valid = true;
			} else {
				System.err.println("start date is not valid");
				valid = false;
			}
			String end = entity.getEnd();
			if (end != null && !end.isEmpty() && end.length() == 6) {
				System.out.println("end date is valid");
				valid = true;
			} else {
				System.err.println("end date is not valid");
				valid = false;
			}
			String reason = entity.getReason();
			if (reason != null && reason != "") {
				System.out.println("reason is valid");
				valid = true;
			} else {
				System.err.println("reason not valid");
				valid = false;
			}
			if (valid) {
				System.out.println("data is valid and can be saved");

			} else {
				System.err.println("data is not valid cant save the data");
			}
			if (valid) {
				this.dao.saveLeaveApp(entity);
			}

		}
		return valid;

	}

	@Override
	public LeaveEntity validateAndGetByName(String name) {
		System.out.println("validating and getting the name");
		if (name != null && !name.isEmpty() && name.length() > 3 && name.length() <= 20) {
			System.out.println("name is valid");
			LeaveDAO dao = new LeaveDAOimpl();
			LeaveEntity byName = dao.getByName(name);
			System.out.println(byName);
			return byName;
		} else {
			System.out.println("invalid name");
		}
		return null;

	}
}
