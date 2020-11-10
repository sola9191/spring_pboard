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

public class DataSource002 {
	
	@Inject
	private DataSource ds;
	
	@Test
	public void testDataSource() throws Exception{
		
		try {
		Connection conn = ds.getConnection();
		System.out.println("basic005 conn: " +conn);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	

}
