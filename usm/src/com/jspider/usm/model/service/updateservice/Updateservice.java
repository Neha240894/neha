package com.jspider.usm.model.service.updateservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.usm.dto.logindto.Logindto;
import com.jspider.usm.dto.registerdto.Registerdto;

import com.jspider.usm.model.dao.registerdao.Registerdao;
import com.jspider.usm.model.dao.updatedao.Updatedao;
@Service
public class Updateservice {
	{
		// TODO Auto-generated constructor stub
	}

	@Autowired
	private Updatedao dao;
	
	
	public void update(Registerdto dto){
		dao.update(dto);
	}
}
