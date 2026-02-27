package com.nst.iptvsmarterstvbox.model.callback.storage;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class Data {

    @SerializedName("mode")
    @Expose
    private String mode;

    @SerializedName("modename")
    @Expose
    private String modename;

    public String getMode() {
        return this.mode;
    }

    public String getModename() {
        return this.modename;
    }

    public void setMode(String str) {
        this.mode = str;
    }

    public void setModename(String str) {
        this.modename = str;
    }
}
