package com.google.ads.interactivemedia.v3.api;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface StreamManager extends BaseManager {
    @Deprecated
    double getContentTimeForStreamTime(double d9);

    long getContentTimeMsForStreamTimeMs(long j9);

    List<CuePoint> getCuePoints();

    @Deprecated
    CuePoint getPreviousCuePointForStreamTime(double d9);

    CuePoint getPreviousCuePointForStreamTimeMs(long j9);

    String getStreamId();

    @Deprecated
    double getStreamTimeForContentTime(double d9);

    long getStreamTimeMsForContentTimeMs(long j9);

    void replaceAdTagParameters(Map<String, String> map);
}
