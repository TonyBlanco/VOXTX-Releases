package com.nst.iptvsmarterstvbox.model.database;

/* JADX INFO: loaded from: classes.dex */
public class PlayerResumeDBModel {
    private String eventType;
    private int idAuto;
    private long streamDuration;
    private boolean streamFinish;
    private String streamId;
    private long timeElapsed;

    public PlayerResumeDBModel() {
    }

    public PlayerResumeDBModel(String str, String str2, boolean z9, long j9, long j10) {
        this.eventType = str;
        this.streamId = str2;
        this.streamFinish = z9;
        this.timeElapsed = j9;
        this.streamDuration = j10;
    }

    public String getEventType() {
        return this.eventType;
    }

    public int getIdAuto() {
        return this.idAuto;
    }

    public long getStreamDuration() {
        return this.streamDuration;
    }

    public String getStreamId() {
        return this.streamId;
    }

    public long getTimeElapsed() {
        return this.timeElapsed;
    }

    public boolean isStreamFinish() {
        return this.streamFinish;
    }

    public void setEventType(String str) {
        this.eventType = str;
    }

    public void setIdAuto(int i9) {
        this.idAuto = i9;
    }

    public void setStreamDuration(long j9) {
        this.streamDuration = j9;
    }

    public void setStreamFinish(boolean z9) {
        this.streamFinish = z9;
    }

    public void setStreamId(String str) {
        this.streamId = str;
    }

    public void setTimeElapsed(long j9) {
        this.timeElapsed = j9;
    }
}
