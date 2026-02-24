package com.nst.iptvsmarterstvbox.model;

/* JADX INFO: loaded from: classes.dex */
public class FavouriteDBModel {
    private String categoryID;
    private String commaSeparatedStreamIDs;
    private int id;
    private String name;
    private String num;
    private int streamID;
    private String streamIDOneStream;
    private String timestamp;
    private String type;
    private int userID;

    public FavouriteDBModel() {
    }

    public FavouriteDBModel(int i9, String str, String str2, String str3, String str4, int i10) {
        this.streamID = i9;
        this.streamIDOneStream = str;
        this.categoryID = str2;
        this.type = str3;
        this.name = str4;
        this.userID = i10;
    }

    public String getCategoryID() {
        return this.categoryID;
    }

    public String getCommaSeparatedStreamIDs() {
        return this.commaSeparatedStreamIDs;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getNum() {
        return this.num;
    }

    public int getStreamID() {
        return this.streamID;
    }

    public String getStreamIDOneStream() {
        return this.streamIDOneStream;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getType() {
        return this.type;
    }

    public int getUserID() {
        return this.userID;
    }

    public void setCategoryID(String str) {
        this.categoryID = str;
    }

    public void setCommaSeparatedStreamIDs(String str) {
        this.commaSeparatedStreamIDs = str;
    }

    public void setId(int i9) {
        this.id = i9;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setNum(String str) {
        this.num = str;
    }

    public void setStreamID(int i9) {
        this.streamID = i9;
    }

    public void setStreamIDOneStream(String str) {
        this.streamIDOneStream = str;
    }

    public void setTimestamp(String str) {
        this.timestamp = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUserID(int i9) {
        this.userID = i9;
    }
}
