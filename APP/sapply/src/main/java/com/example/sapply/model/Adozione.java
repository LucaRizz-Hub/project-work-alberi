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
    private Albero albero;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "id_utente", referencedColumnName = "id")
    private Utente utente;

    @Column(name = "data_recensione")
    private LocalDate dataRecensione;

    @Column(name = "quantità")
    private int quantita;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Albero getAlbero() {
        return albero;
    }

    public void setAlbero(Albero albero) {
        this.albero = albero;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public LocalDate getDataRecensione() {
        return dataRecensione;
    }

    public void setDataRecensione(LocalDate dataRecensione) {
        this.dataRecensione = dataRecensione;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }
}
