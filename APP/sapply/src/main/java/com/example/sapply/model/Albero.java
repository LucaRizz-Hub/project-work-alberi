package com.example.sapply.model;

import jakarta.persistence.*;

@Entity
@Table(name = "alberi")
public class Albero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nome_albero")
    private String nomeAlbero;

    @Column
    private String specie;

    @Column
    private String descrizione;

    @Column
    private String continente;

    @Column
    private String paese;

    @Column
    private double prezzo;

    @Column
    private String foto;

    @Column
    private double co2;

    @Column
    private String significato;





}
