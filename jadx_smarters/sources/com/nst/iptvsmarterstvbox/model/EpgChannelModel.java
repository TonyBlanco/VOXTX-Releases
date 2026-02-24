package com.nst.iptvsmarterstvbox.model;

/* JADX INFO: loaded from: classes.dex */
public class EpgChannelModel {
    String nowPlaying = "";
    String next = "";

    public String getNext() {
        return this.next;
    }

    public String getNowPlaying() {
        return this.nowPlaying;
    }

    public void setNext(String str) {
        this.next = str;
    }

    public void setNowPlaying(String str) {
        this.nowPlaying = str;
    }
}
