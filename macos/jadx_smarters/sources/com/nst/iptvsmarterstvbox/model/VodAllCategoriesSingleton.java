package com.nst.iptvsmarterstvbox.model;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class VodAllCategoriesSingleton {
    private static VodAllCategoriesSingleton myObj;
    private ArrayList<LiveStreamsDBModel> continueWatchingList;
    private ArrayList<LiveStreamCategoryIdDBModel> liveCategoriesList;
    private ArrayList<LiveStreamsDBModel> liveFavList;
    private ArrayList<LiveStreamsDBModel> liveList;
    private String moviesPoster = "";
    private ArrayList<LiveStreamsDBModel> radioFavList;
    private ArrayList<LiveStreamCategoryIdDBModel> vodCategoriesList;
    private ArrayList<LiveStreamsDBModel> vodFavList;
    private ArrayList<LiveStreamsDBModel> vodList;

    private VodAllCategoriesSingleton() {
    }

    public static VodAllCategoriesSingleton getInstance() {
        if (myObj == null) {
            myObj = new VodAllCategoriesSingleton();
        }
        return myObj;
    }

    public ArrayList<LiveStreamsDBModel> getContinueWatchingList() {
        return this.continueWatchingList;
    }

    public ArrayList<LiveStreamCategoryIdDBModel> getLiveCategoriesList() {
        return this.liveCategoriesList;
    }

    public ArrayList<LiveStreamsDBModel> getLiveFavList() {
        return this.liveFavList;
    }

    public ArrayList<LiveStreamsDBModel> getLiveList() {
        return this.liveList;
    }

    public String getMoviesPoster() {
        return this.moviesPoster;
    }

    public ArrayList<LiveStreamsDBModel> getRadioFavList() {
        return this.radioFavList;
    }

    public ArrayList<LiveStreamCategoryIdDBModel> getVodCategoriesList() {
        return this.vodCategoriesList;
    }

    public ArrayList<LiveStreamsDBModel> getVodFavList() {
        return this.vodFavList;
    }

    public ArrayList<LiveStreamsDBModel> getvodList() {
        return this.vodList;
    }

    public void setContinueWatchingList(ArrayList<LiveStreamsDBModel> arrayList) {
        this.continueWatchingList = arrayList;
    }

    public void setLiveCategoriesList(ArrayList<LiveStreamCategoryIdDBModel> arrayList) {
        this.liveCategoriesList = arrayList;
    }

    public void setLiveFavList(ArrayList<LiveStreamsDBModel> arrayList) {
        this.liveFavList = arrayList;
    }

    public void setLiveList(ArrayList<LiveStreamsDBModel> arrayList) {
        this.liveList = arrayList;
    }

    public void setMoviesPoster(String str) {
        this.moviesPoster = str;
    }

    public void setRadioFavList(ArrayList<LiveStreamsDBModel> arrayList) {
        this.radioFavList = arrayList;
    }

    public void setVodCategoriesList(ArrayList<LiveStreamCategoryIdDBModel> arrayList) {
        this.vodCategoriesList = arrayList;
    }

    public void setVodFavList(ArrayList<LiveStreamsDBModel> arrayList) {
        this.vodFavList = arrayList;
    }

    public void setVodList(ArrayList<LiveStreamsDBModel> arrayList) {
        this.vodList = arrayList;
    }
}
