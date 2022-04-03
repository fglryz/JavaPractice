package Day31;

import java.util.ArrayList;
import java.util.Arrays;

public class MovieTask {
    public String country,title,genre,releaseDate,director;
     public  ArrayList<String> casts;

    public MovieTask(String country, String title, String genre, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.director = director;
        casts = new ArrayList<>();
    }
    public void addCAst(String name){
        casts.add(name);
    }

    public void addCAst(String[] name){
        casts.addAll(Arrays.asList(name));
    }

    public String toString() {
        return "MovieTask{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", director='" + director + '\'' +
                ", casts=" + casts +
                '}';
    }
}
/*
3. Movie Task:
3.1. Create a class named Movie
    Attributes:
        country (String), title (String), Genre (String),
releaseDate (String), director (String), casts (ArrayList<String>)
Add a constructor to set the country, title, release
date, and director of the Movie
    Actions
        addCast(String): adds the given string argument
to the arrayList casts
        addCasts(String[]): adds the given string array
argument to the arrayList casts
        toString(): returns the name of country, title,
release date, and total number of casts
4. 2create a class called MovieObjects
1. create an object of the movie:
title: Journey to SDET: Cydeo Batch 25
country: USA
Genre: Adventure, Comedy, Thriller
release date: 10/25/2021
director: Kuzzat Altay
Casts: Asiya, Adam, Muhtar and 5 more students from
your group
print the full info of the movie
4
 */