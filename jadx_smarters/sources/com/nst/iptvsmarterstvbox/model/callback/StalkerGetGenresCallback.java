package com.nst.iptvsmarterstvbox.model.callback;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.nst.iptvsmarterstvbox.model.pojo.StalkerGetGenresPojo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class StalkerGetGenresCallback {

    @SerializedName("js")
    @Expose
    private List<StalkerGetGenresPojo> js = null;

    public List<StalkerGetGenresPojo> getJs() {
        return this.js;
    }

    public void setJs(List<StalkerGetGenresPojo> list) {
        this.js = list;
    }
}
