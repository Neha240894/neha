package com.jspider.usm.controller.registercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jspider.usm.dto.registerdto.Registerdto;
import com.jspider.usm.model.service.registerservice.Registerservice;



@Controller
@RequestMapping("/")
public class Registercontroller {
	@Autowired
	private Registerservice service;
	
	public Registercontroller() {
		System.out.println(this.getClass().getSimpleName()+"created");
	}

	
	
	@RequestMapping(value="/register.do", method=RequestMethod.POST)
	public ModelAndView registrationController(Registerdto dto){
		System.out.println(dto);
		service.register(dto);
		return new ModelAndView("/register.jsp", "key", "success");
		
	}
}