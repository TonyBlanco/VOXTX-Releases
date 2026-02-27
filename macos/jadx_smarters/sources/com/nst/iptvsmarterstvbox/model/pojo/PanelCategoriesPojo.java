package com.nst.iptvsmarterstvbox.model.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.nst.iptvsmarterstvbox.model.callback.LiveStreamCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.VodCategoriesCallback;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class PanelCategoriesPojo {

    @SerializedName("movie")
    @Expose
    private ArrayList<VodCategoriesCallback> movie = null;

    @SerializedName("live")
    @Expose
    private ArrayList<LiveStreamCategoriesCallback> live = null;

    public ArrayList<LiveStreamCategoriesCallback> getLive() {
        return this.live;
    }

    public ArrayList<VodCategoriesCallback> getMovie() {
        return this.movie;
    }

    public void setLive(ArrayList<LiveStreamCategoriesCallback> arrayList) {
        this.live = arrayList;
    }

    public void setMovie(ArrayList<VodCategoriesCallback> arrayList) {
        this.movie = arrayList;
    }
}
