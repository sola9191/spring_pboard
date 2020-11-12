package com.company.spring_pboard.service;

import java.io.File;
import java.net.InetAddress;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.company.spring_pboard.dao.BoardDAO;
import com.company.spring_pboard.model.BoardVO;

@Service
public class BoardServiceImpl implements BoardService {

	protected Log log = LogFactory.getLog(BoardServiceImpl.class);
	
	@Autowired
	private BoardDAO dao;
	
	
	@Override
	public List<BoardVO> selectBoardList() throws Exception {
		return dao.selectBoardList();
	}
	
	@Transactional
	@Override
	public BoardVO selectBoardOne(BoardVO vo) throws Exception {
		dao.updateCnt(vo);
		return dao.selectBoardOne(vo);
	}

	@Override
	public int insertBoard(BoardVO vo, HttpServletRequest request, MultipartFile file) throws Exception {
		System.out.println("ㅁ name: " + file.getOriginalFilename());
		System.out.println("ㅁ size: " + file.getSize());
		System.out.println("ㅁ contentType: " + file.getContentType());
		//1. 파일이름 중복되지 않게 처리
		UUID uid = UUID.randomUUID();
		String filename = uid.toString() + "-" + file.getOriginalFilename();
		String uploadpath = request.getSession().getServletContext().getRealPath("/") + "upload";
		System.out.println("ㅁuploadpath 확인:" + uploadpath);
		System.out.println("ㅁfilename 확인: " + filename);
		File target = new File(uploadpath, filename);
		FileCopyUtils.copy(file.getBytes(), target);
		vo.setPfile(filename);
		vo.setPip(InetAddress.getLocalHost().getHostAddress());
		return dao.insertBoard(vo);
	}

	@Override
	public int updateBoard(BoardVO vo, HttpServletRequest request, MultipartFile file) throws Exception {
		UUID uid = UUID.randomUUID();
		String filename = uid.toString() + "-" + file.getOriginalFilename();
		String uploadpath = request.getSession().getServletContext().getRealPath("/") + "upload";
		System.out.println("ㅁuploadpath 확인:" + uploadpath);
		System.out.println("ㅁfilename 확인: " + filename);
		File target = new File(uploadpath, filename);
		FileCopyUtils.copy(file.getBytes(), target);
		vo.setPfile(filename);
		return dao.updateBoard(vo);
	}

	@Override
	public int updateCnt(BoardVO vo) throws Exception {
		return dao.updateCnt(vo);
	}

	@Override
	public int deleteBoard(BoardVO vo) throws Exception {
		return dao.deleteBoard(vo);
	}

}
