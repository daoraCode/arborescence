package com.company;

public class Animal {
    // JE DECLARE MES ATTRIBUTS (VARIABLES)
    private String nomAnimal;
    private int nombreDePattes;
    private boolean saDangerosite;
    private String manger;
    // JE CREE UN COMPTEUR EN CHARGE DE COMPTER LE NOMBRE DE FOIS QUE LES INSTANCES SERONT APPELES
    public static int decompteNbrAnimauxARecuperer = 0;
    // JE CREE MES CONSTRUCTEURS PAR DEFAUT
    public Animal() {
        nomAnimal = " ";
        nombreDePattes = 0;
        saDangerosite = false;
        manger = " ";
        decompteNbrAnimauxARecuperer++;
    }
    // JE CREE LES PARAMETRES DE MES CONSTRUCTEURS POUR CREER LES OBJETS
    public Animal(String pNomAnimal, int pNombreDePattes, boolean pSaDangerosite, String pMangeDeLaViande) {
        nomAnimal = pNomAnimal;
        nombreDePattes = pNombreDePattes;
        saDangerosite = pSaDangerosite;
        manger = pMangeDeLaViande;
    }
    // JE CREE MES ACCESSEURS AFIN QUE MES VARIABLES DEVIENNENT ACCESSIBLES
    public int getDecompteAnimauxARecuperer() { return decompteNbrAnimauxARecuperer; }
    public String getNomAnimal() {
        return nomAnimal;
    }
    public int getNombreDePattes() {
        return  nombreDePattes;
    }
    public boolean getDangerosite() {
        return saDangerosite;
    }
    public String getManger() {
        return manger;
    }
    public static int getDecompteNbrAnimauxARecuperer() {
        return decompteNbrAnimauxARecuperer;
    }
    // JE CREE MES GETTERS AFIN QUE MES VARIABLES PUISSENT ETRE RECUPEREES
    public void setNomAnimal(String pNomAnimal) {
        nomAnimal = pNomAnimal;
    }
    public void setNombreDePattes(int pNombreDePattes) {
        nombreDePattes = pNombreDePattes;
    }
    public void setSaDangerosite(boolean pSDanger) {
        saDangerosite = pSDanger;
    }
    public void setMangeDeLaViande(String mgViande) {
        manger = mgViande;
    }
    // JE CREE MES PROPRES METHODES
    public void manger() {
        System.out.println("mange tous les animaux");
    }

    public void String() {
        toString();
    }

}


