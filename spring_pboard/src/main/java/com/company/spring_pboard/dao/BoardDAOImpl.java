package com.company.spring_pboard.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.spring_pboard.model.BoardVO;

@Repository //이거쓰는 이유까먹었다
public class BoardDAOImpl implements BoardDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private static final String namespace="com.company.spring_pboard.boardMapper";
	@Override
	public List<BoardVO> selectBoardList() throws Exception {
		return sqlSession.selectList(namespace + ".selectBoardList");
	}

	@Override
	public BoardVO selectBoardOne(BoardVO vo) throws Exception {
		return sqlSession.selectOne(namespace + ".selectBoardOne", vo);
	}

	@Override
	public int insertBoard(BoardVO vo) throws Exception {
		return sqlSession.insert(namespace + ".insertBoard", vo);
	}

	@Override
	public int updateBoard(BoardVO vo) throws Exception {
		return sqlSession.update(namespace + ".updateBoard", vo);
	}

	@Override
	public int updateCnt(BoardVO vo) throws Exception {
		return sqlSession.update(namespace + ".updateCnt", vo);
	}

	@Override
	public int deleteBoard(BoardVO vo) throws Exception {
		return sqlSession.delete(namespace + ".deleteBoard", vo);
	}

}
