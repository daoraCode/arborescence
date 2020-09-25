package com.company;

public class Lapin extends Herbivore {

    // JE DECLARE MES VARIABLES
    private String pelage;
    private int ageDuLapin;
    private boolean femelle;

    // JE CREE MES CONSTRUCTEURS PAR DEFAUT
    public Lapin() {
        pelage = " ";
        ageDuLapin = 0;
        femelle = false;
    }

    // JE CREE LES PARAMETRES DE MES CONSTRUCTEURS POUR CREER LES OBJETS
    public Lapin(String pPelage, int pAgeDuLapin, boolean pFemelle) {
        super();
        pelage = pPelage;
        ageDuLapin = pAgeDuLapin;
        femelle = pFemelle;
    }

    // JE CREE MES ACCESSEURS AFIN QUE MES VARIABLES SOIENT ACCESSIBLES
    // JE CREE MES GETTERS AFIN QUE MES VARIABLES PUISSENT ETRE RECUPEREES


}
