package com.company;

public class Homme extends Omnivore {

    // JE CREE VARIABLES D'INSTANCES
    private String nom;
    private String prenom;
    private String genre;
    private int age;

    // JE CREE MES CONSTRUCTEURS PAR DEFAUT
    public Homme() {
        System.out.println("Creation d'un être humain");
        nom = " ";
        prenom = " ";
        genre = " ";
        age = 0;
    }

    // JE CREE LES PARAMETRES DE MES CONSTRUCTEURS POUR CREER LES OBJETS
    public Homme(String pNom, String pPrenom, String pGenre, int pAgeDeLaPersonne) {
        super();
        nom = pNom;
        prenom = pPrenom;
        genre = pGenre;
        age = pAgeDeLaPersonne;
    }

    // JE CREE MES ACCESSEURS AFIN QUE MES VARIABLES SOIENT ACCESSIBLES
    // JE CREE MES GETTERS AFIN QUE MES VARIABLES PUISSENT ETRE RECUPEREES
}