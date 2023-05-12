package com.projects.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.dslist.entities.Game;

// interface para criar o serviço
public interface GameRepository extends JpaRepository<Game, Long> {

}
