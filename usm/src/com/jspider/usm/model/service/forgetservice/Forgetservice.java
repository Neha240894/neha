package com.jspider.usm.model.service.forgetservice;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.jspider.usm.dto.registerdto.Registerdto;
import com.jspider.usm.model.dao.Forgetdao.Forgetdao;
import com.jspider.usm.model.dao.registerdao.Registerdao;
@Service
public class Forgetservice {
	
	@Autowired
	JavaMailSender mailSender;
	@Autowired
	private Forgetdao dao;
	
public Forgetservice()
{
	
}


	
	
	
	public Registerdto chkPass(String email)
	{
		return dao.chkPass(email);
		
	}

	public boolean updatePass(String email)
	{
		System.out.println(email+"======= in service");
		UUID uuid=UUID.randomUUID();
		String id=uuid.toString();//id is password
		System.out.println(id);
		
	 int id1=dao.updatePass(email,id);
	 if(id1!=0)
	 {
		 System.out.println("stated sending mail");
		 SimpleMailMessage mailMessage=new SimpleMailMessage();
		 mailMessage.setTo("neha240894@gmail.com");
		 mailMessage.setFrom("neha240894@gmail.com");
		 mailMessage.setSubject("New generated password");
		 mailMessage.setText("Hi user, /n This is new password generated."
				 +"Please use the same for next login" +id);
		 mailSender.send(mailMessage);
		 return true;
	 }
	 else
		 return false;
	}
	
		
	}

