package com.example.filmsapi;

import java.util.UUID;

public class Film {

    private String id= UUID.randomUUID().toString();
    private String title;
    private String author;
    private boolean isPorn;

    public Film(){
    }

    public Film(String title, String author, boolean isPorn) throws Exception {
        checkTitle(title);
        checkAuthor(author);
        this.title = title;
        this.author = author;
        this.isPorn = isPorn;
    }

    private void checkAuthor(String author) throws Exception {
        if(author.equals("")) throw new Exception();
    }

    private void checkTitle(String title) throws Exception {
        if(title.equals("")) throw new Exception();
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isPorn() {
        return isPorn;
    }

    public void setAuthor(String author) throws Exception {
        checkAuthor(author);
        this.author=author;
    }

    public void setIsPorn(boolean porn) {
        this.isPorn=porn;
    }

    public void setTitle(String title) throws Exception {
        checkTitle(title);
        this.title=title;
    }
}
