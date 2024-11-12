package com.devproject.dslist.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devproject.dslist.GameMinDTO;
import com.devproject.dslist.repositories.GameRepository;
import com.devproject.dslist.entities.Game;
import java.util.List;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){	
		List<Game> result = gameRepository.findAll();
		List <GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
		}
		
	
}
