package br.com.mizaeldouglas.dsList.controllers;

import br.com.mizaeldouglas.dsList.dto.GameDTO;
import br.com.mizaeldouglas.dsList.dto.GameListDTO;
import br.com.mizaeldouglas.dsList.dto.GameMinDTO;
import br.com.mizaeldouglas.dsList.services.GameListService;
import br.com.mizaeldouglas.dsList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

}
