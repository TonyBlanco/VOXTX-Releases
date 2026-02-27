package com.nst.iptvsmarterstvbox.model;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class MoviesUsingSinglton {
    private static MoviesUsingSinglton myObj;
    private List<LiveStreamsDBModel> MoviesList;

    private MoviesUsingSinglton() {
    }

    public static MoviesUsingSinglton getInstance() {
        if (myObj == null) {
            myObj = new MoviesUsingSinglton();
        }
        return myObj;
    }

    public List<LiveStreamsDBModel> getMoviesList() {
        return this.MoviesList;
    }

    public void setMoviesList(List<LiveStreamsDBModel> list) {
        this.MoviesList = list;
    }
}
