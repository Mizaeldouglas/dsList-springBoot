package br.com.mizaeldouglas.dsList.repositories;

import br.com.mizaeldouglas.dsList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
