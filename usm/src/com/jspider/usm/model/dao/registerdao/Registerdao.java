package com.jspider.usm.model.dao.registerdao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspider.usm.dto.registerdto.Registerdto;



@Repository
public class Registerdao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Registerdao() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	
	public void register(Registerdto dto){
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(dto);
		tx.commit();
		session.close();
		
	}
}
