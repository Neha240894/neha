package com.jspider.usm.model.dao.logindao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspider.usm.dto.logindto.Logindto;
import com.jspider.usm.dto.registerdto.Registerdto;
@Repository
public class Logindao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public Logindao() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	
	public Registerdto login(Logindto dto){
		Session session = sessionFactory.openSession();
		
		String hql="from Registerdto where email=:newemail and password=:newpassword";
		Query q=session.createQuery(hql);
		q.setParameter("newemail",dto.getEmail() );//getting the email from dto class what userr entered
		q.setParameter("newpassword",dto.getPassword());
		Registerdto fromDb=(Registerdto) q.uniqueResult();
		return fromDb;
		
		
	}
}
