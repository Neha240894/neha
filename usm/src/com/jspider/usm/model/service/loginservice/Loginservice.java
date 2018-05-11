package com.jspider.usm.model.service.loginservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.usm.dto.logindto.Logindto;
import com.jspider.usm.dto.registerdto.Registerdto;
import com.jspider.usm.model.dao.logindao.Logindao;
@Service
public class Loginservice {
	public Loginservice() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private Logindao logindao;
	
	
	public Registerdto login(Logindto dto){
		return logindao.login(dto);
	}
}
