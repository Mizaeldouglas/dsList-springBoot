package br.com.mizaeldouglas.dsList.dto;

import br.com.mizaeldouglas.dsList.entities.Game;
import br.com.mizaeldouglas.dsList.services.GameService;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@NoArgsConstructor
@Getter @Setter
public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private String score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO(Game entities) {
        BeanUtils.copyProperties(entities,this);
    }
}
