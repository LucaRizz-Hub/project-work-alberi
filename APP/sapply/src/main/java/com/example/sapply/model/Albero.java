package com.example.sapply.model;

import jakarta.persistence.*;

@Entity
@Table(name = "albero")
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeAlbero() {
        return nomeAlbero;
    }

    public void setNomeAlbero(String nomeAlbero) {
        this.nomeAlbero = nomeAlbero;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getPaese() {
        return paese;
    }

    public void setPaese(String paese) {
        this.paese = paese;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public double getCo2() {
        return co2;
    }

    public void setCo2(double co2) {
        this.co2 = co2;
    }

    public String getSignificato() {
        return significato;
    }

    public void setSignificato(String significato) {
        this.significato = significato;
    }
}
