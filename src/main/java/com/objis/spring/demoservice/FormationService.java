package com.objis.spring.demoservice;

import com.objis.spring.demodao.IformationDAO;
import com.objis.spring.demodomaine.Formation;

public class FormationService {

	private IformationDAO dao;

	public IformationDAO getDao() {
		return dao;
	}

	public void setDao(IformationDAO dao) {
		this.dao = dao;
	}

	public void creerformation(Formation formation) {
		dao.create(formation);
	}
	
	public void initmethod() {
		System.out.println("je suis init");
	}
	
	public void destroymethod() {
		System.out.println("je suis destroy");
	}
}
