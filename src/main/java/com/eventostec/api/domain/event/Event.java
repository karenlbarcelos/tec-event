package com.eventostec.api.domain.event;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Table(name = "event") //representa a tabela
@Entity
@Setter
@Getter
@NoArgsConstructor //cria um construtor sem argumentos
@AllArgsConstructor //cria um construtor que recebe todos os argumentos
public class Event {

    @Id
    @GeneratedValue  //gera um valor automatico a cada entrada registrada na tabela
    private UUID id;

    private String title;

    private String description;

    private String imageUrl;

    private String eventUrl;

    private Boolean remote;

    private Date date;


}
