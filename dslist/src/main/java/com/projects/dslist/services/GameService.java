package com.projects.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.dslist.DTO.gameMinDTO;
import com.projects.dslist.entities.Game;
import com.projects.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<gameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<gameMinDTO> dto = result.stream().map(x -> new gameMinDTO(x)).toList();
        return dto;

    }
}
