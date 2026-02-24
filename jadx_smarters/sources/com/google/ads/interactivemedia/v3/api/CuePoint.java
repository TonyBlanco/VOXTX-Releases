package com.google.ads.interactivemedia.v3.api;

/* JADX INFO: loaded from: classes3.dex */
public interface CuePoint {
    @Deprecated
    double getEndTime();

    long getEndTimeMs();

    @Deprecated
    double getStartTime();

    long getStartTimeMs();

    boolean isPlayed();
}
