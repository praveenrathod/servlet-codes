package com.xworkz.leave.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.leave.entity.LeaveEntity;

public class LeaveDAOimpl  implements LeaveDAO{
	

	@Override
	public void saveLeaveApp(LeaveEntity entity) {
		System.out.println("saving leaveapplication");
		Configuration configuration=new Configuration();
		configuration.configure().addAnnotatedClass(LeaveEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		try(Session openSession = factory.openSession()){
		Transaction transaction = openSession.beginTransaction();
		openSession.save(entity);
		transaction.commit();
		openSession.close();
		factory.close();
	}
	}

	@Override
	public LeaveEntity getByName(String name) {
		System.out.println("getting by name from DB");
		Configuration configuration=new Configuration();
		configuration.configure().addAnnotatedClass(LeaveEntity.class);
		SessionFactory factory = configuration.buildSessionFactory();
		try(Session openSession = factory.openSession()){
			Transaction transaction = openSession.beginTransaction();
		String query="select entity from LeaveEntity entity where entity.name=:name";
		Query<LeaveEntity> qu=openSession.createQuery(query);
		qu.setParameter(name, "name");
		qu.uniqueResult();
		transaction.commit();
		factory.close();
		return null;
	}
	}
}
