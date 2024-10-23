package com.example.sapply.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "adozioni")
public class Adozione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "id_albero", referencedColumnName = "id")
    private int idAlbero;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "id_utente", referencedColumnName = "id")
    private int idUtente;

    @Column(name = "data_recensione")
    private LocalDate dataRecensione;

    @Column(name = "quantità")
    private int quantita;


}
