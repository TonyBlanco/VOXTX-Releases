package com.nst.iptvsmarterstvbox.model.callback;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.nst.iptvsmarterstvbox.model.pojo.StalkerGetVODByCatPojo;

/* JADX INFO: loaded from: classes.dex */
public class StalkerGetVODByCatCallback {

    @SerializedName("js")
    @Expose
    private StalkerGetVODByCatPojo js;

    public StalkerGetVODByCatPojo getJs() {
        return this.js;
    }

    public void setJs(StalkerGetVODByCatPojo stalkerGetVODByCatPojo) {
        this.js = stalkerGetVODByCatPojo;
    }
}
