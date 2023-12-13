import br.com.alura.screenmatch.calculation.TimeCalculator;
import br.com.alura.screenmatch.models.Film;
import br.com.alura.screenmatch.models.Series;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Film myFilm = new Film(); //Reference type
        myFilm.setName("Top Gun") ;
        myFilm.setRelaseYear(2022);
        myFilm.setOnThePlan(true);
        myFilm.setDurationInMinutes(160);


        myFilm.showSpecifications();
        myFilm.toAssess(6);
        myFilm.toAssess(4);
        myFilm.toAssess(5.5);
        myFilm.toAssess(9.2);

        //calling a function for calculate average of reviews
//        System.out.println(myFilm.sumReviews);
        System.out.println(myFilm.getTotalReviews());
        System.out.println(myFilm.calculateAvarage());

        Series lupin = new Series();
        lupin.setName("Lupin");
        lupin.setRelaseYear(2020);
        lupin.setOnThePlan(true);
        lupin.setActive(true);
        lupin.setEpisodePerSeaseon(10);
        lupin.setSeasons(10);
        lupin.setMinutesPerEpisode(50);
        System.out.println(lupin.getDurationInMinutes());
//        lupin.showSpecifications();

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myFilm);
        System.out.println("Tempo total do filme: " + calculator.getTotalTime() + " minutos");

    }
}
