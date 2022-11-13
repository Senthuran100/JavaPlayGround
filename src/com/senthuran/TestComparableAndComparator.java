package com.senthuran;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie implements Comparable<Movie> {

    private double rating;
    private String name;
    private int year;

    public Movie(double rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Movie movie) {
        return this.year - movie.year;
    }
}

class MovieNameComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie movie, Movie t1) {
        return movie.getName().compareTo(t1.getName());
    }
}

class MovieRatingComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie movie, Movie t1) {
        if (movie.getRating() > t1.getRating())
            return 1;
        else if (movie.getRating() < t1.getRating())
            return -1;
        else
            return 0;
    }
}

public class TestComparableAndComparator {


    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie(6.0, "ABC", 2000));
        movies.add(new Movie(7.0, "XYZ", 2001));
        movies.add(new Movie(8.0, "CDE", 1995));

        Collections.sort(movies);

        // Default Sorting based on Year.
        System.out.println("Sorted Movies List based on Year");
        for (Movie m : movies) {
            System.out.println("Movie : " + m.getName() + "  " + m.getYear() + "  " + m.getRating());
        }

        // Sorting based on the Movie Name.
        MovieNameComparator movieNameComparator = new MovieNameComparator();
        Collections.sort(movies, movieNameComparator);
        System.out.println("Sorted Movies List based on Name");
        for (Movie m : movies) {
            System.out.println("Movie : " + m.getName() + "  " + m.getYear() + "  " + m.getRating());
        }

        // Sorting based on the Movie Rating.
        MovieRatingComparator movieRatingComparator =  new MovieRatingComparator();
        Collections.sort(movies,movieRatingComparator);
        System.out.println("Sorted Movies List based on Rating");
        for (Movie m : movies) {
            System.out.println("Movie : " + m.getName() + "  " + m.getYear() + "  " + m.getRating());
        }
    }
}
