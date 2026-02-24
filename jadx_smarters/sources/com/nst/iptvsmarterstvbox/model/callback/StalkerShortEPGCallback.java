package com.nst.iptvsmarterstvbox.model.callback;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.nst.iptvsmarterstvbox.model.pojo.StalkerShortEPGPojo;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class StalkerShortEPGCallback {

    @SerializedName("js")
    @Expose
    private List<StalkerShortEPGPojo> js = null;

    public List<StalkerShortEPGPojo> getJs() {
        return this.js;
    }

    public void setJs(List<StalkerShortEPGPojo> list) {
        this.js = list;
    }
}
