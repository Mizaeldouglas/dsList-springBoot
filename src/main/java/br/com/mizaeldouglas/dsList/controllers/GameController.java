package br.com.mizaeldouglas.dsList.controllers;

import br.com.mizaeldouglas.dsList.dto.GameMinDTO;
import br.com.mizaeldouglas.dsList.entities.Game;
import br.com.mizaeldouglas.dsList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;
@GetMapping
public List<GameMinDTO> findAll(){
    return gameService.findAll();
}

}
