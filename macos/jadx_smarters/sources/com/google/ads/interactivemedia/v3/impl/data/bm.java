package com.google.ads.interactivemedia.v3.impl.data;

import android.util.Log;
import com.google.ads.interactivemedia.v3.internal.bur;
import com.google.ads.interactivemedia.v3.internal.but;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes3.dex */
public final class bm {
    public double adBreakDuration;
    public String adBreakTime;
    public List<Float> adCuePoints;
    public c adData;
    public double adPeriodDuration;
    public d adPodInfo;
    public int adPosition;
    public long adTimeUpdateMs;
    public long appSetIdTimeoutMs;
    public double bufferedTime;
    public Map<String, CompanionData> companions;
    public List<bb> cuepoints;
    public double currentTime;
    public boolean disableAppSetId;
    public double duration;
    public boolean enableGks;
    public boolean enableInstrumentation;
    public int errorCode;
    public String errorMessage;
    public Integer espAdapterTimeoutMs;
    public List<String> espAdapters;
    public String eventId;
    public String innerError;
    public SortedSet<Float> internalCuePoints;
    public String ln;
    public bl logData;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f18612m;
    public boolean monitorAppLifecycle;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f18613n;
    public bq networkRequest;
    public Integer platformSignalCollectorTimeoutMs;
    public String queryId;
    public ResizeAndPositionVideoMsgData resizeAndPositionVideo;
    public double seekTime;
    public String streamId;
    public String streamUrl;
    public List<HashMap<String, String>> subtitles;
    public int totalAds;
    public String url;
    public String vastEvent;
    public String videoUrl;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return bur.c(this, obj, new String[0]);
    }

    public int hashCode() {
        return but.a(this, new String[0]);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("JavaScriptMsgData[");
        for (Field field : bm.class.getFields()) {
            try {
                Object obj = field.get(this);
                sb.append(field.getName());
                sb.append(":");
                sb.append(obj);
                sb.append(",");
            } catch (IllegalAccessException e9) {
                e = e9;
                str = "IllegalAccessException occurred";
                Log.e("IMASDK", str, e);
            } catch (IllegalArgumentException e10) {
                e = e10;
                str = "IllegalArgumentException occurred";
                Log.e("IMASDK", str, e);
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
