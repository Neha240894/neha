package com.jspider.usm.model.dao.Forgetdao;

import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspider.usm.dto.registerdto.Registerdto;
@Repository
public class Forgetdao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public Forgetdao() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	
	public Registerdto chkPass(String email)
	{
Session session = sessionFactory.openSession();
		
		String hql="from Registerdto where email=:newemail";
		Query q=session.createQuery(hql);
		q.setParameter("newemail",email );//getting the email from dto class what userr entered
		/*q.setParameter("newpassword",dto.getPassword());*/
		Registerdto fromDb=(Registerdto) q.uniqueResult();
		return fromDb;
	}
	public int updatePass(String email, String id)
	{
		Session session = sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		String hql="update Registerdto set password=:newpassword where email=:newemail";
		Query q=session.createQuery(hql);
		q.setParameter("newpassword",id );
		q.setParameter("newemail", email);
		
		//Registerdto fromDb=(Registerdto) q.uniqueResult();
		int value=q.executeUpdate();
		tx.commit();
		System.out.println(value);
		return value;
	}
	}
