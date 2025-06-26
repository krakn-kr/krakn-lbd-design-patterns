package org.krashokkumarnaidu.designpatterns.Structural.composite.ProblemStatement;

public class Main {
    public static void main(String[] args) {
        Directory movies = new Directory("Movies");
        File bahubali = new File("Bahunbali");
        movies.add(bahubali);
        Directory tollywood = new Directory("Tollywood");
        File teluguMovieFile = new File("Gabbar singh");
        tollywood.add(teluguMovieFile);
        Directory bollyWood = new Directory("BollyWood");
        File hindiMovieFile = new File("Dabang");
        bollyWood.add(hindiMovieFile);
        movies.add(tollywood);
        movies.add(bollyWood);
        movies.ls();
    }
}
