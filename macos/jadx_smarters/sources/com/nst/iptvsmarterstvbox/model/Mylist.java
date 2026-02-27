package com.nst.iptvsmarterstvbox.model;

/* JADX INFO: loaded from: classes.dex */
public class Mylist {
    String du;
    String extension;
    int fh;
    int fw;
    long md;
    String name;
    String size;

    public Mylist(String str, long j9, String str2, int i9, int i10, String str3, String str4) {
        this.name = str;
        this.md = j9;
        this.du = str3;
        this.size = str2;
        this.fw = i9;
        this.fh = i10;
        this.extension = str4;
    }

    public String getDuration() {
        return this.du;
    }

    public String getExtension() {
        return this.extension;
    }

    public int getFrame_height() {
        return this.fh;
    }

    public int getFrmae_width() {
        return this.fw;
    }

    public long getModified_date() {
        return this.md;
    }

    public String getName() {
        return this.name;
    }

    public String getSize() {
        return this.size;
    }

    public void setDuration(String str) {
        this.du = str;
    }

    public void setExtension(String str) {
        this.extension = str;
    }

    public void setFrame_height(int i9) {
        this.fh = i9;
    }

    public void setFrmae_width(int i9) {
        this.fw = i9;
    }

    public void setModified_date(long j9) {
        this.md = j9;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setSize(String str) {
        this.size = str;
    }
}
