package com.company.spring_pboard;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/dataSource-context.xml"})
public class DB003_MyBatis {
	
	@Autowired
	private SqlSessionFactory sqlFactory;
	
	@Test
	public void sqltest() {
		SqlSession session = sqlFactory.openSession();
		System.out.println("Session Factory: " + session);
		
		
	}

}
