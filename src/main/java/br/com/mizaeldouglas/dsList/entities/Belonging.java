package br.com.mizaeldouglas.dsList.entities;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;

@Entity
@Table(name = "tb_belonging")
@NoArgsConstructor
@Setter @Getter
public class Belonging {
    @EmbeddedId
    private BelongingPK id = new BelongingPK();
    private Integer position;

    public Belonging(Game game,GameList list , Integer position) {
        id.setGame(game);
        id.setGameList(list);
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Belonging belonging)) return false;
        return Objects.equals(getId(), belonging.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
