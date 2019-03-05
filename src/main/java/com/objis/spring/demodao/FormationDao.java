package com.objis.spring.demodao;

import com.objis.spring.demodomaine.Formation;

public class FormationDao implements IformationDAO {

	/* (non-Javadoc)
	 * @see com.objis.spring.demodao.IformationDAO#create(com.objis.spring.demodomaine.Formation)
	 */
	@Override
	public void create(Formation formation) {
		System.out.println("créer formation" + formation.toString());
	}
}
