package com.nst.iptvsmarterstvbox.model.callback;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class StalkerGetAdCallback {

    @SerializedName("js")
    @Expose
    private List<Object> js = null;

    public List<Object> getJs() {
        return this.js;
    }

    public void setJs(List<Object> list) {
        this.js = list;
    }
}
