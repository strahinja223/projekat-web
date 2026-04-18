package com.example.projekat.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "kategorije")
public class Kategorija {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String naziv;

    private String opis;

    @OneToMany(mappedBy = "kategorija", cascade = CascadeType.ALL)
    private List<Igra> igre = new ArrayList<>();

    public Kategorija() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public List<Igra> getIgre() {
        return igre;
    }

    public void setIgre(List<Igra> igre) {
        this.igre = igre;
    }
}

