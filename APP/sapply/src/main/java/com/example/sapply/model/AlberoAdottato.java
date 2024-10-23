package com.example.sapply.model;

import jakarta.persistence.*;



@Entity
@Table(name = "alberi_adottati")
public class AlberoAdottato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private int quantita;

    @OneToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "fk_id_albero", referencedColumnName = "id")
    private AlberoAdottato alberoAdottato;


@OneToOne(cascade = CascadeType.REFRESH)
@JoinColumn(name = "fk_id_adozione", referencedColumnName = "id")
private Adozione adozione;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public AlberoAdottato getAlberoAdottato() {
        return alberoAdottato;
    }

    public void setAlberoAdottato(AlberoAdottato alberoAdottato) {
        this.alberoAdottato = alberoAdottato;
    }

    public Adozione getAdozione() {
        return adozione;
    }

    public void setAdozione(Adozione adozione) {
        this.adozione = adozione;
    }
}
