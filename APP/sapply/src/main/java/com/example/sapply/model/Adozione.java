package com.example.sapply.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "adozione")
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

    @Column(name = "data_adozione")
    private LocalDate dataAdozione;

    @Column(name = "quantità")
    private int quantita;

    @Column (name = "costo_totale")
    private  int costoTotale;

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

    public LocalDate getDataAdozione() {
        return dataAdozione;
    }

    public void setDataAdozione(LocalDate dataAdozione) {
        this.dataAdozione = dataAdozione;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public int getCostoTotale() {
        return costoTotale;
    }

    public void setCostoTotale(int costoTotale) {
        this.costoTotale = costoTotale;
    }
}