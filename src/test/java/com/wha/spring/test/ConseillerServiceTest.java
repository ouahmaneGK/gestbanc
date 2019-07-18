package com.wha.spring.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.wha.spring.config.JPAConfig;
import com.wha.spring.config.WebConfig;
import com.wha.spring.idao.ConseillerDao;
import com.wha.spring.model.Conseiller;

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { WebConfig.class, JPAConfig.class })
public class ConseillerServiceTest {

	@Autowired
	private ConseillerDao conseillerDao;

	@Test
	@Transactional
	@Rollback(true)
	public void getConseillerTest() {
		//Conseiller conseiller = new Conseiller();
		//conseiller = conseillerDao.findById(4);
		//assertEquals("omar", conseiller.getNom());
	}


}
