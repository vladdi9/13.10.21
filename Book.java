package org.itstep;

enum Genres{Fantasy, SciFi, Mystery, Thriller, Romance};
public class Book{
    private String name;
    private String author;
    private int pages;
    private Genres genre;
    Book(String name, String author, int pages, Genres genre){

        this.name = name;
        this.author = author;
        this.pages = pages;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public Genres getGenre() {
        return genre;
    }
}
