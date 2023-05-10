package com.projects.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
