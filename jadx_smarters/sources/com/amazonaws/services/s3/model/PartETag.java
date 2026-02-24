package com.amazonaws.services.s3.model;

/* JADX INFO: loaded from: classes.dex */
public class PartETag {
    private String eTag;
    private int partNumber;

    public PartETag(int i9, String str) {
        this.partNumber = i9;
        this.eTag = str;
    }

    public String getETag() {
        return this.eTag;
    }

    public int getPartNumber() {
        return this.partNumber;
    }

    public void setETag(String str) {
        this.eTag = str;
    }

    public void setPartNumber(int i9) {
        this.partNumber = i9;
    }

    public PartETag withETag(String str) {
        this.eTag = str;
        return this;
    }

    public PartETag withPartNumber(int i9) {
        this.partNumber = i9;
        return this;
    }
}
