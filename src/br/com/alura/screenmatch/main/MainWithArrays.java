package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.models.Film;
import br.com.alura.screenmatch.models.Series;
import br.com.alura.screenmatch.models.Title;

import java.util.*;

public class MainWithArrays {

    public static void main(String[] args) {
        Film myFilm = new Film("Top Gun", 2022); //Reference type
        Series lupin = new Series("Lupin", 2020);
        Film interstelar = new Film("Interstelar", 2017);

        Film f1 = myFilm;

        ArrayList<Title> list = new ArrayList<>();
        list.add(interstelar);
        list.add(myFilm);
        list.add(lupin);

        for (Title i: list) {
            System.out.println(i.getName());
            if (i instanceof Film film){
                System.out.println("Review: " + film.getClassification());
            }
        }

        List<String> searchArtist = new LinkedList<>();
        searchArtist.add("Adam Sandler");
        searchArtist.add("Vinicius");
        searchArtist.add("Matuê");
        System.out.println(searchArtist);

        Collections.sort(searchArtist);

        System.out.println(searchArtist);

        Collections.sort(list);
        System.out.println(list);
        list.sort(Comparator.comparing(Title::getRelaseYear));
    }
}
