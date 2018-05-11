package com.jspider.usm.controller.logincontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jspider.usm.dto.logindto.Logindto;
import com.jspider.usm.dto.registerdto.Registerdto;
import com.jspider.usm.model.service.loginservice.Loginservice;
import com.jspider.usm.model.service.registerservice.Registerservice;

@Controller
@RequestMapping("/")
public class Logincontroller {
	@Autowired
	private Loginservice loginservice;
	
	public Logincontroller() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}
	@RequestMapping("/login.do")
	public  ModelAndView login(Logindto dto,HttpServletRequest req)
	{
		Registerdto fromDb=loginservice.login(dto);
		HttpSession session=req.getSession();
		if(fromDb!=null)
		{
			session.setAttribute("key1", fromDb);
	/*		String name=req.getParameter("name");
			String email=req.getParameter("email");
			String password=req.getParameter("password");*/
		/*	req.setAttribute("name", name);
			req.setAttribute("email", email);
			req.setAttribute("password", password);
			*/
			return new ModelAndView("/home.jsp","key",fromDb.getEmail());
		}
			else
			return new ModelAndView("/login.jsp","key","invalid");
	}
	
	
		
	}