package com.ex.board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ex.board.DAO.BoardDAO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class BoardController {

	@Autowired
	BoardDAO boardDAO;

	@GetMapping("/")
	public String index() throws JsonProcessingException, Exception {
		return new ObjectMapper().writeValueAsString(boardDAO.getBoardList());
	}
}
