package br.com.dio.persistence.entity;

import br.com.dio.persistence.entity.CardPriority;

import lombok.Data;

@Data
public class CardEntity {

    private Long id;
    private String title;
    private String description;
    private CardPriority priority;
    private BoardColumnEntity boardColumn = new BoardColumnEntity();

    public CardPriority getPriority() {
        return priority;
    }

    public void setPriority(CardPriority priority) {
        this.priority = priority;
    }

}
