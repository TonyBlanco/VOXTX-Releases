package com.nst.iptvsmarterstvbox.model.pojo;

/* JADX INFO: loaded from: classes.dex */
public class ExternalPlayerModelClass {
    private int id = 0;
    private String appname = "";
    private String packagename = "";
    private String appicon = "";

    public String getAppicon() {
        return this.appicon;
    }

    public String getAppname() {
        return this.appname;
    }

    public int getId() {
        return this.id;
    }

    public String getPackagename() {
        return this.packagename;
    }

    public void setAppicon(String str) {
        this.appicon = str;
    }

    public void setAppname(String str) {
        this.appname = str;
    }

    public void setId(int i9) {
        this.id = i9;
    }

    public void setPackagename(String str) {
        this.packagename = str;
    }
}
