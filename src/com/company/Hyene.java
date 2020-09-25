package com.company;

public class Hyene extends Carnivore {

    private boolean enMeute;
    private String couleurPelage;
    private int nbrHabitat;

    // JE CREE MES CONSTRUCTEURS PAR DEFAUT
    public Hyene() {
        enMeute = false;
        couleurPelage = " ";
        nbrHabitat = 0;
    }

    public Hyene(boolean pEnMeute, String pCouleurPelage, int pNbreHabitat) {
        super();
        enMeute = pEnMeute;
        couleurPelage = pCouleurPelage;
        nbrHabitat = pNbreHabitat;
    }

}
