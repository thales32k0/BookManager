package com.example.bookmanager.model;

import jakarta.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String autor;

    //Getters and Setters
    public Long getId(){
        return id;

    }

    public String getTitle(){
        return title;

    }

    public String getAutor() {
        return autor;

    }

    public void setAutor(String autor) {
        this.autor = autor;

    }

    public void setTitle(String title) {
        this.title = title;

    }
}
