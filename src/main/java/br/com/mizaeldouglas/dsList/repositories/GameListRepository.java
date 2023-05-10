package br.com.mizaeldouglas.dsList.repositories;

import br.com.mizaeldouglas.dsList.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
