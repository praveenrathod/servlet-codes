package com.xworkz.leave.service;

import com.xworkz.leave.entity.LeaveEntity;

public interface leaveService<T>{

	public boolean validateAndSave(LeaveEntity entity);
	
	public LeaveEntity validateAndGetByName(String name);
}
