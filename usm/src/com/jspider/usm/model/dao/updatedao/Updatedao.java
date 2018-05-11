package com.jspider.usm.model.dao.updatedao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspider.usm.dto.registerdto.Registerdto;

@Repository
public class Updatedao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public Updatedao() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	
	public void update(Registerdto dto){
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.merge(dto);
		tx.commit();
		session.close();
		
		
	}}

