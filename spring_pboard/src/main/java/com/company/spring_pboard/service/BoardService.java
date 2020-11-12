package com.company.spring_pboard.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.company.spring_pboard.model.BoardVO;

public interface BoardService {

	public List<BoardVO> selectBoardList() throws Exception;
	public BoardVO selectBoardOne(BoardVO vo) throws Exception;
	public int insertBoard(BoardVO vo, HttpServletRequest request, MultipartFile file) throws Exception;
	public int updateBoard(BoardVO vo, HttpServletRequest request, MultipartFile file) throws Exception;
	public int updateCnt(BoardVO vo) throws Exception;
	public int deleteBoard(BoardVO vo) throws Exception;
}
