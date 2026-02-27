package com.nst.iptvsmarterstvbox.model.database;

/* JADX INFO: loaded from: classes.dex */
public class PasswordDBModel {
    private int id;
    private String userDetail;
    private int userId;
    private String userPassword;

    public PasswordDBModel() {
    }

    public PasswordDBModel(String str, String str2) {
        this.userDetail = str;
        this.userPassword = str2;
    }

    public int getId() {
        return this.id;
    }

    public String getUserDetail() {
        return this.userDetail;
    }

    public int getUserId() {
        return this.userId;
    }

    public String getUserPassword() {
        return this.userPassword;
    }

    public void setId(int i9) {
        this.id = i9;
    }

    public void setUserDetail(String str) {
        this.userDetail = str;
    }

    public void setUserId(int i9) {
        this.userId = i9;
    }

    public void setUserPassword(String str) {
        this.userPassword = str;
    }
}
