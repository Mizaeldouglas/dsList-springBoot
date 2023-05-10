package br.com.mizaeldouglas.dsList.services;

import br.com.mizaeldouglas.dsList.dto.GameDTO;
import br.com.mizaeldouglas.dsList.dto.GameListDTO;
import br.com.mizaeldouglas.dsList.dto.GameMinDTO;
import br.com.mizaeldouglas.dsList.entities.Game;
import br.com.mizaeldouglas.dsList.entities.GameList;
import br.com.mizaeldouglas.dsList.repositories.GameListRepository;
import br.com.mizaeldouglas.dsList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameRepository.findAll();
        return result.stream().map(GameListDTO::new).toList();
    }



}
