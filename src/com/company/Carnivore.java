package com.company;

public class Carnivore extends Animal {

    // JE DECLARE MES VARIABLES
    private String temperament;
    private boolean course;
    private String nomRace;

    // JE CREE MES CONSTRUCTEURS PAR DEFAUT
    public Carnivore() {
        temperament = " ";
        course = false;
        nomRace = " ";
    }

    // JE CREE LES PARAMETRES DE MES CONSTRUCTEURS POUR CREER LES OBJETS
    public Carnivore(String  pTemperament, boolean pCourse, String pNomRace) {
        super();
        temperament = pTemperament;
        course = pCourse;
        nomRace = pNomRace;
    }

    // JE CREE MES GETTERS AFIN QUE MES VARIABLES PUISSENT ETRE RECUPEREES
    public String getTemperament() {
        return temperament;
    }
    public boolean getCourse() {
        return course;
    }
    public String getNomRace() {
        return nomRace;
    }

    // JE CREE MES GETTERS AFIN QUE MES VARIABLES PUISSENT ETRE RECUPEREES
    public void setTemperament(String pTemperament) {
        temperament = pTemperament;
    }
    public void setCourse(boolean pCourse) {
        course = pCourse;
    }
    public void setNomRace(String pNomRace) {
        nomRace = pNomRace;
    }

}


