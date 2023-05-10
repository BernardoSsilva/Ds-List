package com.projects.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projects.dslist.DTO.GameListDTO;
import com.projects.dslist.DTO.gameMinDTO;
import com.projects.dslist.services.GameListService;
import com.projects.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<gameMinDTO> findByList(@PathVariable Long listId) {
        List<gameMinDTO> result = gameService.findByList(listId);
        return result;
    }
}
