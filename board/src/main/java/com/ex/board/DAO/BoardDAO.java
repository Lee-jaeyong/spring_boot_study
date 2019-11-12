package com.ex.board.DAO;

import java.util.List;

import com.ex.board.VO.BoardVO;

public interface BoardDAO {
	public List<BoardVO> getBoardList() throws Exception;
}
