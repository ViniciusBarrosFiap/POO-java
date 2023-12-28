package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.calculation.RecomendationFilter;
import br.com.alura.screenmatch.calculation.TimeCalculator;
import br.com.alura.screenmatch.models.Episode;
import br.com.alura.screenmatch.models.Film;
import br.com.alura.screenmatch.models.Series;

import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film("Top Gun", 2022); //Reference type
        myFilm.setRelaseYear(2022);
        myFilm.setOnThePlan(true);
        myFilm.setDurationInMinutes(160);


        myFilm.showSpecifications();
        myFilm.rating(6);
        myFilm.rating(4);
        myFilm.rating(5.5);
        myFilm.rating(9.2);

        //calling a function for calculate average of reviews
//        System.out.println(myFilm.sumReviews);
        System.out.println(myFilm.getTotalReviews());
        System.out.println(myFilm.calculateAvarage());

        Series lupin = new Series("Lupin", 2020);
//        lupin.setName("Lupin");
//        lupin.setRelaseYear(2020);
        lupin.setOnThePlan(true);
        lupin.setActive(true);
        lupin.setEpisodePerSeaseon(10);
        lupin.setSeasons(10);
        lupin.setMinutesPerEpisode(50);
        System.out.println(lupin.getDurationInMinutes());
//        lupin.showSpecifications();

        //Instanciando o objeto filme em uma variável
        Film interstelar = new Film("Interstelar", 2017);
        interstelar.setDurationInMinutes(200);
        interstelar.setRelaseYear(2017);
        interstelar.rating(10);

        ArrayList<Film> filmList = new ArrayList<>();
        filmList.add(interstelar);
        filmList.add(myFilm);
        System.out.println("Array size: " + filmList.size());
        System.out.println("First film: " + filmList.get(0).getName());
        System.out.println(filmList);



        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myFilm);
        System.out.println("Film's total time: " + calculator.getTotalTime() + " minutos");

        RecomendationFilter filter = new RecomendationFilter();

        System.out.print("Film rating: ");
        filter.filter(myFilm);

        Episode episode = new Episode();

        episode.setNumber(1);
        episode.setSerie(lupin);
        episode.setTotalViews(300);
        System.out.print("Episode rating: ");
        filter.filter(episode);



    }
}
