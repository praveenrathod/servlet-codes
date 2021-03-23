package com.xworkz.leave.dao;

import com.xworkz.leave.entity.LeaveEntity;

public interface LeaveDAO {

	public void saveLeaveApp(LeaveEntity entity);
	
	public LeaveEntity getByName(String name);
}
