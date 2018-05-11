package com.jspider.usm.controller.updatecontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jspider.usm.dto.logindto.Logindto;
import com.jspider.usm.dto.registerdto.Registerdto;

import com.jspider.usm.model.service.registerservice.Registerservice;
import com.jspider.usm.model.service.updateservice.Updateservice;
@Controller
@RequestMapping("/")
public class Updatecontroller {
	@Autowired
	private Updateservice updateservice;
	
	public Updatecontroller() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}

	
	
	@RequestMapping(value="/update.do")
	public ModelAndView updateController(Registerdto dto,HttpServletRequest req){
	
		HttpSession session=req.getSession(false);
		Registerdto dto1=(Registerdto) session.getAttribute("key1");
		/*System.out.println(dto1);
		System.out.println(dto);*/
		
		System.out.println(dto1.getId());
		dto.setId(dto1.getId());
		System.out.println(dto);
		HttpSession session1=req.getSession();
		session1.setAttribute("key1", dto);
		updateservice.update(dto);
		return new ModelAndView("/update.jsp", "key", "success");
		
	 
		
		
		
		
}}
		
