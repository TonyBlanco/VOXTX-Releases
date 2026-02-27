package com.nst.iptvsmarterstvbox.model.callback;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.nst.iptvsmarterstvbox.model.pojo.VodInfoPojo;

/* JADX INFO: loaded from: classes.dex */
public class VodInfoCallback {

    @SerializedName("info")
    @Expose
    private VodInfoPojo info;

    public VodInfoPojo getInfo() {
        return this.info;
    }

    public void setInfo(VodInfoPojo vodInfoPojo) {
        this.info = vodInfoPojo;
    }
}
