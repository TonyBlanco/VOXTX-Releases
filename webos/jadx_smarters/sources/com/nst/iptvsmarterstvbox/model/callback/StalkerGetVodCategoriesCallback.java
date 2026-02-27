package com.nst.iptvsmarterstvbox.model.callback;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.nst.iptvsmarterstvbox.model.pojo.StalkerGetVodCategoriesPojo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class StalkerGetVodCategoriesCallback {

    @SerializedName("js")
    @Expose
    private List<StalkerGetVodCategoriesPojo> js = null;

    public List<StalkerGetVodCategoriesPojo> getJs() {
        return this.js;
    }

    public void setJs(List<StalkerGetVodCategoriesPojo> list) {
        this.js = list;
    }
}
