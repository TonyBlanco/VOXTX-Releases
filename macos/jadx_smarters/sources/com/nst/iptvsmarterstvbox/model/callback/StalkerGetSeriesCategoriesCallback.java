package com.nst.iptvsmarterstvbox.model.callback;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.nst.iptvsmarterstvbox.model.pojo.StalkerGetSeriesCategoriesPojo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class StalkerGetSeriesCategoriesCallback {

    @SerializedName("js")
    @Expose
    private List<StalkerGetSeriesCategoriesPojo> js = null;

    public List<StalkerGetSeriesCategoriesPojo> getJs() {
        return this.js;
    }

    public void setJs(List<StalkerGetSeriesCategoriesPojo> list) {
        this.js = list;
    }
}
