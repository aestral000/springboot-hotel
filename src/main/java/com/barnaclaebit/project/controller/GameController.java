package com.barnaclaebit.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.barnaclaebit.project.entity.Game;
import com.barnaclaebit.project.service.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {

	
	@Autowired
	private GameService gameService;
	
	
	
	@GetMapping
	public List<Game> findAll(){
		return gameService.findAll();
	}
	
	

}
