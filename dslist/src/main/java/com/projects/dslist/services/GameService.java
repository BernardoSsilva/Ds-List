<<<<<<< HEAD
package com.projects.dslist.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projects.dslist.DTO.GameDTO;
import com.projects.dslist.DTO.gameMinDTO;
import com.projects.dslist.entities.Game;
import com.projects.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    /*
     * função que consulta todos os dados dentro do banco de dados e os molda para
     * as especificações do DTO
     * o fazendo uma lista que sera retornada
     */
    @Transactional(readOnly = true)
    public List<gameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<gameMinDTO> dto = result.stream().map(x -> new gameMinDTO(x)).toList();
        return dto;

    }

    // achar por id
    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);

    }
}
=======
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
    /*  função que consulta todos os dados dentro do banco de dados e os molda para as especificações do DTO 
        o fazendo uma lista que sera retornada
    */
    public List<gameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<gameMinDTO> dto = result.stream().map(x -> new gameMinDTO(x)).toList();
        return dto;

    }
}
>>>>>>> 1444bbe2afd3845d8bd9d22022d7826bb5f119a0
