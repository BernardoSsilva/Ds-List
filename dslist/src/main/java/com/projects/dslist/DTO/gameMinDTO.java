<<<<<<< HEAD
package com.projects.dslist.DTO;

import com.projects.dslist.entities.Game;

public class gameMinDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    gameMinDTO() {

    }

    // criar a entidade game
    public gameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

=======
package com.projects.dslist.DTO;

import com.projects.dslist.entities.Game;

public class gameMinDTO {
    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private String imgUrl;
    private String shortDescription;

    gameMinDTO() {

    }

    // criar a entidade game
    public gameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        genre = entity.getGenre();
        platforms = entity.getPlatforms();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

>>>>>>> 1444bbe2afd3845d8bd9d22022d7826bb5f119a0
}