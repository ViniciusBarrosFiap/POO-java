package br.com.alura.screenmatch.calculation;

public class RecomendationFilter {
    private String Recomendation;
    public void filter(Classification sortable){
        if (sortable.getClassification() > 4){
            System.out.println("It is among the classified");
        } else if (sortable.getClassification() >= 2) {
            System.out.println("Very well reted");
        } else {
            System.out.println("Add to your list for see later!");
        }
    }
}
