package com.company.spring_pboard;

import java.net.InetAddress;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.company.spring_pboard.dao.BoardDAO;
import com.company.spring_pboard.model.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/dataSource-context.xml"})
public class DB004_DAOTEST {
	
	@Autowired
	private BoardDAO dao;
	
	@Test @Ignore
	public void inserttest() throws Exception {
		BoardVO vo = new BoardVO();
		vo.setPtitle("안녕");
		vo.setPcontent("안녕");
		vo.setPtag("킥킥");
		vo.setPpass("비번");
		vo.setPname("이름");
		vo.setPip(InetAddress.getLocalHost().getHostAddress());
		System.out.println(dao.insertBoard(vo));
	}
	@Test @Ignore
	public void selectAll() throws Exception{
		System.out.println(dao.selectBoardList());
		
	}
	@Test @Ignore
	public void selectOne()  throws Exception{
		BoardVO vo = new BoardVO();
		vo.setPno(1);
		System.out.println(dao.selectBoardOne(vo));
		
	}
	@Test @Ignore 
	public void updatetest() throws Exception{
		BoardVO vo = new BoardVO();
		vo.setPtitle("안녕3");
		vo.setPcontent("안녕3");
		vo.setPtag("킥킥3");
		vo.setPpass("비번");
		vo.setPname("이름");
		vo.setPno(1);
		System.out.println(dao.updateBoard(vo));
	}
	@Test @Ignore
	public void cnttest() throws Exception{
		BoardVO vo = new BoardVO();
		vo.setPno(1);
		System.out.println(dao.updateCnt(vo));
	}
	@Test @Ignore
	public void deletetest() throws Exception{
		BoardVO vo = new BoardVO();
		vo.setPno(1);
		System.out.println(dao.deleteBoard(vo));
	}
	//트랜잭션 테스트
	@Transactional(isolation=Isolation.READ_COMMITTED)
	@Test
	@Rollback(false)
	public void test_tx() throws Exception{
		BoardVO vo = new BoardVO();
		vo.setPno(2);
		dao.updateCnt(vo);
		dao.selectBoardOne(vo);
	}
}
