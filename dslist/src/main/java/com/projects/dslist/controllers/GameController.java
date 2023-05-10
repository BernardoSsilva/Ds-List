
package com.projects.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projects.dslist.DTO.gameMinDTO;
import com.projects.dslist.entities.Game;
import com.projects.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    // controlador que executara as suas funções ao ser acessado pelo mapping
    @GetMapping
    public List<gameMinDTO> findAll() {
        List<gameMinDTO> result = gameService.findAll();
        return result;
    }

}
