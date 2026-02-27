package com.nst.iptvsmarterstvbox.model.callback;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class StalkerLiveFavIdsCallback {

    @SerializedName("js")
    @Expose
    private List<Integer> js = null;

    public List<Integer> getJs() {
        return this.js;
    }

    public void setJs(List<Integer> list) {
        this.js = list;
    }
}
