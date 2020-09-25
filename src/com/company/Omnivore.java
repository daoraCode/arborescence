package com.company;

public class Omnivore extends Animal {

    // JE DECLARE MES VARIABLES
    private String genre;
    private String origine;

    // JE CREER UN CONSTRUCTEUR
    public Omnivore() {
        genre = "Inconnu";
        origine = "Inconnue";
    }

    // JE CREE LES PARAMETRES DE MES CONSTRUCTEURS POUR CREER LES OBJETS
    public Omnivore(String pGenre, String pOrigine) {
        super();
        genre = pGenre;
        genre = pGenre;
    }

    // JE CREE MES ACCESSEURS AFIN QUE MES VARIABLES SOIENT ACCESSIBLES
    public String getGenre() {
        return genre;
    }
    public String getOrigine() {
        return origine;
    }

    // JE CREE MES GETTERS AFIN QUE MES VARIABLES PUISSENT ETRE RECUPEREES
    public void setGenre(String pGenre) {
        genre = pGenre;
    }
    public void setOrigine(String pOrigine) {
        origine = pOrigine;
    }
}
