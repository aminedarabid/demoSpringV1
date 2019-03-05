package com.objis.spring.demodao;

import com.objis.spring.demodomaine.Formation;

public class FormationDao {

	public void create(Formation formation) {
		System.out.println("créer formation" + formation.toString());
	}
}
