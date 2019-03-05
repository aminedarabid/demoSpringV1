package com.objis.spring.demoservice;

import com.objis.spring.demodao.FormationDao;
import com.objis.spring.demodomaine.Formation;

public class FormationService {

	private FormationDao dao;

	public FormationDao getDao() {
		return dao;
	}

	public void setDao(FormationDao dao) {
		this.dao = dao;
	}

	public void creerformation(Formation formation) {
		dao.create(formation);
	}
}
