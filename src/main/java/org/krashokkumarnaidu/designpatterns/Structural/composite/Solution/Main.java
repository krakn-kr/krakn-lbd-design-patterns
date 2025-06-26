package org.krashokkumarnaidu.designpatterns.Structural.composite.Solution;

public class Main {
    public static void main(String[] args) {
        Directory movies = new Directory("Movies");
        FileSystem bahubali = new File("Bahunbali");
        movies.add(bahubali);
        Directory tollywood = new Directory("Tollywood");
        FileSystem teluguMovieFile = new File("Gabbar singh");
        tollywood.add(teluguMovieFile);
        Directory bollyWood = new Directory("BollyWood");
        FileSystem hindiMovieFile = new File("Dabang");
        bollyWood.add(hindiMovieFile);
        movies.add(tollywood);
        movies.add(bollyWood);
        movies.ls();
    }
}
