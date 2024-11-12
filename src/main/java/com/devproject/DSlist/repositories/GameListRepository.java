package com.devproject.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devproject.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
