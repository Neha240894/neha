package com.jspider.usm.model.service.registerservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.usm.dto.registerdto.Registerdto;
import com.jspider.usm.model.dao.registerdao.Registerdao;

@Service
public class Registerservice {

	public Registerservice() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private Registerdao dao;
	
	
	public void register(Registerdto dto){
		dao.register(dto);
	}
}