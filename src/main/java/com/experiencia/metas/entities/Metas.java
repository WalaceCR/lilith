package com.experiencia.metas.entities;


import com.experiencia.metas.enuns.Tipo;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class Metas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMeta;
    private String nome;
    private String descricao;
    private Tipo tipo;
    private float valor;
    private Date data;
}
