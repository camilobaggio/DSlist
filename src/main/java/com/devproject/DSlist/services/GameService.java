package com.devproject.dslist.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devproject.dslist.repositories.GameRepository;
import com.devproject.dslist.dto.GameDTO;
import com.devproject.dslist.dto.GameMinDTO;
import com.devproject.dslist.entities.Game;
import java.util.List;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){	
		List<Game> result = gameRepository.findAll();
		List <GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
		}
		
	
}
