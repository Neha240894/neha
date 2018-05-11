package com.jspider.usm.controller.forgetcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jspider.usm.dto.logindto.Logindto;
import com.jspider.usm.dto.registerdto.Registerdto;
import com.jspider.usm.model.service.forgetservice.Forgetservice;
import com.jspider.usm.model.service.loginservice.Loginservice;
@Controller
@RequestMapping("/")
public class Forgetcontroller {
	

		@Autowired
		private Forgetservice forgetservice;
		
		public Forgetcontroller() {
			System.out.println(this.getClass().getSimpleName()+"created");
		}
		@RequestMapping(value="/forget.do")
		public ModelAndView chkPass(HttpServletRequest req)
		{
			String email=req.getParameter("email");
			Registerdto fromDb=forgetservice.chkPass(email);
			if(fromDb!=null)
				
			{
				forgetservice.updatePass(email);
				return new ModelAndView("/login.jsp","key","allow to change pass");
			}
			else
				return new ModelAndView("/forget.jsp","key","change again");
		}

}
