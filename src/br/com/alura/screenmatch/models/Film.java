package br.com.alura.screenmatch.models;

//Classe
//Especificar as caracteristicas de algo
public class Film extends Title { //the "extends" is used to use properties from another class
   private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
