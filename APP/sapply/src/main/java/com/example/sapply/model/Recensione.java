package com.example.sapply.model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "recensioni")
public class Recensione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // suppongo sia 1 adozione = 1 recensione
    @OneToOne
    @JoinColumn(name = "id_adozione", referencedColumnName = "id")
    private int idAdozione;

    @Column
    private int valutazione;

    @Column
    private String commento;

    @Column(name = "data_recensione")
    private LocalDate dataRecensione;
}

