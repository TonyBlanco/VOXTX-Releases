package com.nst.iptvsmarterstvbox.model;

/* JADX INFO: loaded from: classes.dex */
public class LiveDataModel {
    private boolean isChange;
    private int type;
    private int mPosition = -1;
    private String mStreamId = "";
    private String mCatId = "";
    private boolean mStatus = false;

    public String getCatId() {
        return this.mCatId;
    }

    public int getPosition() {
        return this.mPosition;
    }

    public String getStreamId() {
        return this.mStreamId;
    }

    public int getType() {
        return this.type;
    }

    public boolean isChange() {
        return this.isChange;
    }

    public boolean isStatus() {
        return this.mStatus;
    }

    public void setCatId(String str) {
        this.mCatId = str;
    }

    public void setPosition(int i9) {
        this.mPosition = i9;
    }

    public void setStatus(boolean z9) {
        this.mStatus = z9;
    }

    public void setStreamId(String str) {
        this.mStreamId = str;
    }

    public void setType(int i9) {
        this.type = i9;
    }

    public void setUpdateForChange(boolean z9) {
        this.isChange = z9;
    }
}
