package day31_CustomClass_Cunstructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Movie {

    public String country, title, Genre, releaseDate, director;

    public ArrayList<String> castsList = new ArrayList<>();


    public Movie(String country, String title, String Genre, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.Genre = Genre;
        this.releaseDate = releaseDate;
        this.director = director;
    }

    public void addCast(String castName){
        castsList.add(castName);
    }
    public void addCasts(String[] castNames){
        castsList.addAll(Arrays.asList(castNames));
    }

    public String toString() {
        return "title: " + title + '\n' +
                "country: " + country + '\n' +
                "Genre: " + Genre + '\n' +
                "releaseDate: " + releaseDate + '\n' +
                "director: " + director + '\n' +
                "Casts: " + castsList;
    }
}
