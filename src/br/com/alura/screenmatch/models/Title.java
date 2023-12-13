package br.com.alura.screenmatch.models;

public class Title {
    private String name;
    private int relaseYear;
    private boolean onThePlan;
    private double sumReviews; //this property is private so nowhere is it possible to access it
    private int totalReviews; //this property is private so nowhere is it possible to access it
    private int durationInMinutes;

    //METHODS OF CLASS FILM
    //MÉTODOS DA CLASSE FILM
    public String getName() {return name;} //get of name
    public int getRelaseYear() {return relaseYear;} //get of relase year
    public boolean getOnThePlan() {return onThePlan;} //get of on the plan
    public int getTotalReviews(){return totalReviews;} //get of total reviews
    public int getDurationInMinutes() {return durationInMinutes;} //get of duration in minutes
    public void setName(String name) {this.name = name;} //setter of name
    public void setRelaseYear(int relaseYear) {this.relaseYear = relaseYear;} //setter of relase year
    public void setOnThePlan(boolean onThePlan) {this.onThePlan = onThePlan;} //setter of on the plan
    public void setDurationInMinutes(int durationInMinutes) {this.durationInMinutes = durationInMinutes;} //setter of duration in minutes

    //This function return nothing, this is specified using "void"
    //Esta função não retorna nada, isso é especificado usando "void"
    public void showSpecifications(){
        System.out.println("br.com.alura.screenmatch.models.Film's name:\t" + name);
        System.out.println("Relace date:\t" + relaseYear);
        System.out.println("Included in the plan:\t" + onThePlan);
        System.out.println("Note:\t" + sumReviews);
        System.out.println("Total reviews:\t" + totalReviews);
        System.out.println("Duration in minutes:\t" + durationInMinutes);
    }

    //This function returns nothing other than calculating the sum of grades and the sum of total ratings
    //Esta função não retorna nada além de calcular a soma das notas e a soma das avaliações totais
    public void toAssess(double note){
        sumReviews += note;
        totalReviews++;
    }

    //This function return a double value, this is specified using "double" to start a function
    //Esta função retorna um valor double, isso é especificado usando o "double" para iniciar a função
    public double calculateAvarage(){
        return sumReviews / totalReviews;
    }
}
