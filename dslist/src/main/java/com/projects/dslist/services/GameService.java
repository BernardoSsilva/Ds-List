package com.projects.dslist.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.projects.dslist.DTO.GameDTO;
import com.projects.dslist.DTO.GameListDTO;
import com.projects.dslist.DTO.gameMinDTO;
import com.projects.dslist.entities.Game;
import com.projects.dslist.entities.GameList;
import com.projects.dslist.projections.GameMinProjection;
import com.projects.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(@PathVariable Long listId) {
        Game result = gameRepository.findById(listId).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<gameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(gameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public List<gameMinDTO> findByList(Long listId) {
        List<GameMinProjection> games = gameRepository.searchByList(listId);
        return games.stream().map(x -> new gameMinDTO(x)).toList();
    }
}
