package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculation.Classification;

//Classe
//Especificar as caracteristicas de algo
public class Film extends Title implements Classification { //the "extends" is used to use properties from another class
   private String director;

    public Film(String name, int relaseYear) {
        super(name, relaseYear);

    }

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

    @Override
    public String toString() {
        return "Film:" + this.getName() + "(" + getRelaseYear() + ")";
    }
}
