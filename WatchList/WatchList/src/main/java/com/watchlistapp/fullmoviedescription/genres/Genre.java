package com.watchlistapp.fullmoviedescription.genres;

/**
 * Created by VEINHORN on 01/01/14.
 */
public class Genre {
    private String title;
    private String id;

    public Genre(String title, String id) {
        this.title = title;
        this.id = id;
    }

    public Genre() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
