package com.projects.dslist.entities;

public class Game {
    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String plataform;
    private String imgUrl;
    Private String shortDescription;
    Private String longDescription;

    public Game(){

    }
    
    public Game(Long id, String title, Integer year, String genre, String plataform, String imgUrl, String shortDescription, String longDescription){
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.plataform =  plataform;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }


}
