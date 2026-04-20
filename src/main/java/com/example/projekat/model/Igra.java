package com.example.projekat.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="igre")
public class Igra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String naziv;

    private String opis;

    @Column(nullable = false)
    private String urlIgrice;

    private String slikaIgrice;

    private LocalDate datumDodavanja;

    @Column(nullable = false)
    private boolean aktivna;

    @ManyToOne
    @JoinColumn(name = "kategorija_id", nullable = false)
    private Kategorija kategorija;

    //@OneToMany(mappedBy = "igra", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Statistika> statistike = new ArrayList<>();

    //@OneToMany(mappedBy = "igra", cascade = CascadeType.ALL, orphanRemoval = true)
    //private List<Postignuce> postignuca = new ArrayList<>();

    public Igra() {
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

    public String getUrlIgrice() {
        return urlIgrice;
    }

    public void setUrlIgrice(String urlIgrice) {
        this.urlIgrice = urlIgrice;
    }

    public String getSlikaIgrice() {
        return slikaIgrice;
    }

    public void setSlikaIgrice(String slikaIgrice) {
        this.slikaIgrice = slikaIgrice;
    }

    public LocalDate getDatumDodavanja() {
        return datumDodavanja;
    }

    public void setDatumDodavanja(LocalDate datumDodavanja) {
        this.datumDodavanja = datumDodavanja;
    }

    public boolean isAktivna() {
        return aktivna;
    }

    public void setAktivna(boolean aktivna) {
        this.aktivna = aktivna;
    }

    public Kategorija getKategorija() {
        return kategorija;
    }

    public void setKategorija(Kategorija kategorija) {
        this.kategorija = kategorija;
    }

    public List<Statistika> getStatistike() {
        return statistike;
    }

    public void setStatistike(List<Statistika> statistike) {
        this.statistike = statistike;
    }
/*
    public List<Postignuce> getPostignuca() {
        return postignuca;
    }

    public void setPostignuca(List<Postignuce> postignuca) {
        this.postignuca = postignuca;
    }

 */
}
