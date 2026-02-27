package com.nst.iptvsmarterstvbox.model.callback;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class StalkerSetLiveFavCallback {

    @SerializedName("js")
    @Expose
    private Boolean js;

    public Boolean getJs() {
        return this.js;
    }

    public void setJs(Boolean bool) {
        this.js = bool;
    }
}
