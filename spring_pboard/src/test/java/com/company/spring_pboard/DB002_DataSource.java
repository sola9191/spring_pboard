package com.company.spring_pboard;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/dataSource-context.xml"})
public class DB002_DataSource {
	
	@Inject
	private DataSource ds;
	
	@Test
	public void testDataSource() throws Exception{
		
		try {
		Connection conn = ds.getConnection();
		System.out.println("MYSQL 연결 " +conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
