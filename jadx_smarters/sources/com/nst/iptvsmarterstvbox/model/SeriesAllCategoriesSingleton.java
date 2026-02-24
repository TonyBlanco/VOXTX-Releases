package com.nst.iptvsmarterstvbox.model;

import com.nst.iptvsmarterstvbox.model.callback.GetEpisdoeDetailsCallback;
import com.nst.iptvsmarterstvbox.model.callback.SeriesDBModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class SeriesAllCategoriesSingleton {
    private static SeriesAllCategoriesSingleton myObj;
    private List<GetEpisdoeDetailsCallback> continueWatchingList;
    private ArrayList<LiveStreamCategoryIdDBModel> seriesCategoriesList;
    private ArrayList<SeriesDBModel> seriesFavList;
    private ArrayList<SeriesDBModel> seriesList;

    private SeriesAllCategoriesSingleton() {
    }

    public static SeriesAllCategoriesSingleton getInstance() {
        if (myObj == null) {
            myObj = new SeriesAllCategoriesSingleton();
        }
        return myObj;
    }

    public List<GetEpisdoeDetailsCallback> getContinueWatchingList() {
        return this.continueWatchingList;
    }

    public ArrayList<LiveStreamCategoryIdDBModel> getSeriesCategoriesList() {
        return this.seriesCategoriesList;
    }

    public ArrayList<SeriesDBModel> getSeriesFavList() {
        return this.seriesFavList;
    }

    public ArrayList<SeriesDBModel> getSeriesList() {
        return this.seriesList;
    }

    public void setContinueWatchingList(List<GetEpisdoeDetailsCallback> list) {
        this.continueWatchingList = list;
    }

    public void setSeriesCategoriesList(ArrayList<LiveStreamCategoryIdDBModel> arrayList) {
        this.seriesCategoriesList = arrayList;
    }

    public void setSeriesFavList(ArrayList<SeriesDBModel> arrayList) {
        this.seriesFavList = arrayList;
    }

    public void setSeriesList(ArrayList<SeriesDBModel> arrayList) {
        this.seriesList = arrayList;
    }
}
