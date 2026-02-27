package com.nst.iptvsmarterstvbox.model.database;

/* JADX INFO: loaded from: classes.dex */
public class PasswordStatusDBModel {
    private int idPaswordStaus;
    private String passwordStatus;
    private String passwordStatusCategoryId;
    private String passwordStatusUserDetail;
    private int userID;

    public PasswordStatusDBModel() {
    }

    public PasswordStatusDBModel(String str, String str2, String str3) {
        this.passwordStatusCategoryId = str;
        this.passwordStatusUserDetail = str2;
        this.passwordStatus = str3;
    }

    public int getIdPaswordStaus() {
        return this.idPaswordStaus;
    }

    public String getPasswordStatus() {
        return this.passwordStatus;
    }

    public String getPasswordStatusCategoryId() {
        return this.passwordStatusCategoryId;
    }

    public String getPasswordStatusUserDetail() {
        return this.passwordStatusUserDetail;
    }

    public int getUserID() {
        return this.userID;
    }

    public void setIdPaswordStaus(int i9) {
        this.idPaswordStaus = i9;
    }

    public void setPasswordStatus(String str) {
        this.passwordStatus = str;
    }

    public void setPasswordStatusCategoryId(String str) {
        this.passwordStatusCategoryId = str;
    }

    public void setPasswordStatusUserDetail(String str) {
        this.passwordStatusUserDetail = str;
    }

    public void setUserID(int i9) {
        this.userID = i9;
    }
}
