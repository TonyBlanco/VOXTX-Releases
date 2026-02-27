package com.nst.iptvsmarterstvbox.model.SbpCombinedResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes.dex */
public class GetApkData {

    @SerializedName("apkversionname")
    @Expose
    private String apkversionname;

    @SerializedName("appdownloadlink")
    @Expose
    private String appdownloadlink;

    @SerializedName("appversion")
    @Expose
    private String appversion;

    public String getApkversionname() {
        return this.apkversionname;
    }

    public String getAppdownloadlink() {
        return this.appdownloadlink;
    }

    public String getAppversion() {
        return this.appversion;
    }

    public void setApkversionname(String str) {
        this.apkversionname = str;
    }

    public void setAppdownloadlink(String str) {
        this.appdownloadlink = str;
    }

    public void setAppversion(String str) {
        this.appversion = str;
    }
}
