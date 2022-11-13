package com.senthuran;

import java.util.ArrayList;
import java.util.Collections;

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

public class TestComparableAndComparator {


    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie(6.0, "ABC", 2000));
        movies.add(new Movie(7.0, "CDE", 2001));
        movies.add(new Movie(8.0, "XYZ", 1995));

        Collections.sort(movies);

        System.out.println("Sorted Movie List");
        for (Movie m :
                movies) {
            System.out.println("Movie : " + m.getName() + "  " + m.getYear() + "  " + m.getRating());
        }
    }
}
