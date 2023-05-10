package br.com.mizaeldouglas.dsList.dto;

import br.com.mizaeldouglas.dsList.entities.Game;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(Game entities) {
        id = entities.getId();
        title = entities.getTitle();
        year = entities.getYear();
        imgUrl = entities.getImgUrl();
        shortDescription = entities.getShortDescription();
    }
}
