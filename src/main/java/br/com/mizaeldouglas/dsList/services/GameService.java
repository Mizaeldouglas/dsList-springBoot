package br.com.mizaeldouglas.dsList.services;

import br.com.mizaeldouglas.dsList.dto.GameDTO;
import br.com.mizaeldouglas.dsList.dto.GameMinDTO;
import br.com.mizaeldouglas.dsList.entities.Game;
import br.com.mizaeldouglas.dsList.projections.GameMinProjection;
import br.com.mizaeldouglas.dsList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long lisId){
        List<GameMinProjection> result = gameRepository.searchByList(lisId);
        return result.stream().map(GameMinDTO::new).toList();
    }



}
