package com.example.sapply.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table (name = "utente")
public class Utente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    @NotBlank(message = "Il nome è obbligatorio")
    @Pattern(regexp = "^[A-Za-zÀ-ÖØ-öø-ÿ]+$", message = "Il nome può contenere solo lettere")
    private String nome;

    @Column
    @NotBlank(message = "Il cognome è obbligatorio")
    @Pattern(regexp = "^[A-Za-zÀ-ÖØ-öø-ÿ]+$", message = "Il cognome può contenere solo lettere")
    private String cognome;

    @Column
    @NotBlank(message = "L'email è obbligatoria")
    @Email(message = "Inserisci un'email valida")
    private String email;

    @Column
    @Pattern(regexp = "^[A-Za-zÀ-ÖØ-öø-ÿ]+$", message = "Username può contenere solo lettere")
    private String username;

    @Column
    @NotBlank(message = "La password è obbligatoria")
    @Size(min = 8, message = "La password deve contenere almeno 8 caratteri, un simbolo e un numero")
    private String password;

    @Column(name= "metodo_pagamento")
    private String metodoPagamento;

    @Column(name= "foto")
    private String fotoCodificata;

    @Column(name = "data_di_nascita")
    @Past(message = "La data di nascita deve essere nel passato")
    private LocalDate dataNascita;

    @Column(name = "data_iscrizione")
    private LocalDate dataIscrizione;


    // GETTER SETTER

    public String getFotoCodificata() {
        return fotoCodificata;
    }

    public void setFotoCodificata(String fotoCodificata) {
        this.fotoCodificata = fotoCodificata;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public LocalDate getDataIscrizione() {
        return dataIscrizione;
    }

    public void setDataIscrizione(LocalDate dataIscrizione) {
        this.dataIscrizione = dataIscrizione;
    }

//    public List<Adozione> getAdozioni() {
//        return adozioni;
//    }
//
//    public void setAdozioni(List<Adozione> adozioni) {
//        this.adozioni = adozioni;
//    }
//
//    public List<Recensione> getRecensioni() {
//        return recensioni;
//    }
//
//    public void setRecensioni(List<Recensione> recensioni) {
//        this.recensioni = recensioni;
//    }
}
