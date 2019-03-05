package com.objis.spring.demospringMaven;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.objis.spring.demodomaine.Formation;
import com.objis.spring.demoservice.FormationService;

@SpringBootApplication
public class DemoV1Application {

	public static void main(String[] args) {
		try{
			
			Formation formation = new Formation("GTM");
			
			// TODO Auto-generated method stub
			// 1. Chargement du conteneur en 4.0.0 Spring
			ApplicationContext appContext = new ClassPathXmlApplicationContext(new String ("demo-beans.xml"));
	
			// 2. Recuperation d'un bean du conteneur
			FormationService formationService = (FormationService) appContext.getBean("formationService");
	
			// 3. Manipulation du bean avec injection de dependances
			formationService.creerformation(formation);
			
			
		 } catch (Exception e) {
			 e.printStackTrace();
	     }
	}

}
