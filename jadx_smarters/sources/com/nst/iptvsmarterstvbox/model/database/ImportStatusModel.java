package com.nst.iptvsmarterstvbox.model.database;

/* JADX INFO: loaded from: classes.dex */
public class ImportStatusModel {
    private String date;
    private int idAuto;
    private String sourceRef;
    private String status;
    private String time;
    private String type;

    public String getDate() {
        return this.date;
    }

    public int getIdAuto() {
        return this.idAuto;
    }

    public String getSourceRef() {
        return this.sourceRef;
    }

    public String getStatus() {
        return this.status;
    }

    public String getTime() {
        return this.time;
    }

    public String getType() {
        return this.type;
    }

    public void setDate(String str) {
        this.date = str;
    }

    public void setIdAuto(int i9) {
        this.idAuto = i9;
    }

    public void setSourceRef(String str) {
        this.sourceRef = str;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public void setTime(String str) {
        this.time = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
