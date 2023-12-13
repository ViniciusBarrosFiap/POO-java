package br.com.alura.screenmatch.calculation;

import br.com.alura.screenmatch.models.Title;

public class TimeCalculator {
    private int totalTime;
    public int getTotalTime() {
        return totalTime;
    }
//    public void include(Film f){
//        totalTime += f.getDurationInMinutes();
//    }
//    public void include(Series s){
//        totalTime += f.getDurationInMinutes();
//    }
    public void include(Title title){
        this.totalTime += title.getDurationInMinutes();
    }
}