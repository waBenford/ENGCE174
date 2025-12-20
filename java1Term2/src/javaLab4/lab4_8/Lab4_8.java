package javaLab4.lab4_8;
import java.util.Scanner;

class Movie {
    private String title;
    private String director;
    private double rating;

    public Movie(String title) {
        this(title, "Unknown");
    }

    public Movie(String title, String director) {
        this(title, director, 0.0);
    }

    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;
        if (rating > 10.0) {
            this.rating = 10.0;
        } else if (rating < 0.0) {
            this.rating = 0.0;
        } else {
            this.rating = rating;
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + title + ", Director: " + director + ", Rating: " + rating);
    }
}

public class Lab4_8 {
    public static void main(String[] args) {
        Scanner getValue = new Scanner(System.in);
        
        System.out.println( "Mode 1/2/3:" );
        int mode = getValue.nextInt();
        getValue.nextLine();

        Movie movie;
        if (mode == 1) {
            String title = getValue.nextLine();
            movie = new Movie(title);
        } else if (mode == 2) {
            String title = getValue.nextLine();
            String director = getValue.nextLine();
            movie = new Movie(title, director);
        } else {
            String title = getValue.nextLine();
            String director = getValue.nextLine();
            double rating = getValue.nextDouble();
            movie = new Movie(title, director, rating);
        }

        movie.displayDetails();
        getValue.close();
    }
}