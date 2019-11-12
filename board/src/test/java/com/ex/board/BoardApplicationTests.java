package com.ex.board;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ex.board.DAO.BoardDAO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
class BoardApplicationTests {

	@Autowired
	BoardDAO boardDAO;
	
	@Test
	void contextLoads() throws JsonProcessingException, Exception{
		System.out.println(new ObjectMapper().writeValueAsString(boardDAO.getBoardList()));
	}

}
