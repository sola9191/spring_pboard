package com.company.spring_pboard.dao;

import java.util.List;

import com.company.spring_pboard.model.BoardVO;

public interface BoardDAO {
	
	public List<BoardVO> selectBoardList() throws Exception;
	public BoardVO selectBoardOne(BoardVO vo) throws Exception;
	public int insertBoard(BoardVO vo) throws Exception;
	public int updateBoard(BoardVO vo) throws Exception;
	public int updateCnt(BoardVO vo) throws Exception;
	public int deleteBoard(BoardVO vo) throws Exception;
	
 
}
