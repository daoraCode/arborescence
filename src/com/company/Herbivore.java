package com.company;

public class Herbivore extends Animal {

    // JE DECLARE MES VARIABLES
    private int grandeur;
    private boolean insecte;
    private boolean agressif;

    // JE CREE MES CONSTRUCTEURS PAR DEFAUT
    public Herbivore() {
        grandeur = 0;
        insecte = false;
        agressif = false;
    }

    // JE CREE LES PARAMETRES DE MES CONSTRUCTEURS POUR CREER LES OBJETS
    public Herbivore(int pGrandeur, boolean pInsecte, boolean pAgressif) {
        super();
        grandeur = pGrandeur;
        insecte = pInsecte;
        agressif = pAgressif;
    }

    // JE CREE MES ACCESSEURS AFIN QUE MES VARIABLES SOIENT ACCESSIBLES
    public int getGrandeur() {
        return grandeur;
    }
    public boolean getInsecte() {
        return insecte;
    }
    public boolean getAgressif() {
        return agressif;
    }

    // JE CREE MES GETTERS AFIN QUE MES VARIABLES PUISSENT ETRE RECUPEREES
    public void setGrandeur(int pGrd) {
        grandeur = pGrd;
    }
    public void setInsecte(boolean pINsecte ) {
        insecte = pINsecte;
    }
    public  void setAgressif(boolean pAgr) {
        agressif = pAgr;
    }
}
