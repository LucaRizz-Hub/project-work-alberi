package com.example.sapply.model;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "recensione")
public class Recensione {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // suppongo sia 1 adozione = 1 recensione
    @OneToOne
    @JoinColumn(name = "id_adozione", referencedColumnName = "id")
    private Adozione adozione;

    @Column
    private int valutazione;

    @Column
    private String commento;

    @Column(name = "data_recensione")
    private LocalDate dataRecensione;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Adozione getAdozione() {
        return adozione;
    }

    public void setAdozione(Adozione adozione) {
        this.adozione = adozione;
    }

    public int getValutazione() {
        return valutazione;
    }

    public void setValutazione(int valutazione) {
        this.valutazione = valutazione;
    }

    public String getCommento() {
        return commento;
    }

    public void setCommento(String commento) {
        this.commento = commento;
    }

    public LocalDate getDataRecensione() {
        return dataRecensione;
    }

    public void setDataRecensione(LocalDate dataRecensione) {
        this.dataRecensione = dataRecensione;
    }
}

