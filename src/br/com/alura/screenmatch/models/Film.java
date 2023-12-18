package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculation.Classification;

//Classe
//Especificar as caracteristicas de algo
public class Film extends Title implements Classification { //the "extends" is used to use properties from another class
   private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int)calculateAvarage() / 2;
    }
}
