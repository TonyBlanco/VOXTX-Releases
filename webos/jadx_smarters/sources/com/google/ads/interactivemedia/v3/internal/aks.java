package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.util.Log;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.CuePoint;
import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.StreamManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class aks extends ajc implements StreamManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f20046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f20047b;

    public aks(String str, ajx ajxVar, StreamDisplayContainer streamDisplayContainer, akv akvVar, aid aidVar, akn aknVar, ajj ajjVar, Context context, String str2, boolean z9) {
        super(str, ajxVar, akvVar, streamDisplayContainer, aidVar, aknVar, ajjVar, context, z9);
        this.f20047b = new ArrayList();
        this.f20046a = str2;
        akvVar.k();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajc, com.google.ads.interactivemedia.v3.internal.ajv
    public final void b(aju ajuVar) {
        akv akvVar = (akv) c();
        AdEvent.AdEventType adEventType = AdEvent.AdEventType.ALL_ADS_COMPLETED;
        int iOrdinal = ajuVar.f19961a.ordinal();
        if (iOrdinal == 3) {
            akvVar.n();
        } else if (iOrdinal == 4) {
            this.f20047b = ajuVar.f19964d;
        } else if (iOrdinal == 14) {
            Log.i("IMASDK", "Seek time when ad is skipped: " + ajuVar.f19966f);
            akvVar.l(Math.round(ajuVar.f19966f * 1000.0d));
        } else if (iOrdinal != 15) {
            switch (iOrdinal) {
                case 23:
                    akvVar.e();
                    break;
                case DateTimeConstants.HOURS_PER_DAY /* 24 */:
                    akvVar.b();
                    break;
                case 25:
                    akvVar.j();
                    break;
                case 26:
                    akvVar.i();
                    break;
            }
        } else {
            akvVar.m(ajuVar.f19962b);
        }
        super.b(ajuVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ajc, com.google.ads.interactivemedia.v3.api.BaseManager
    public final void destroy() {
        super.destroy();
        n(ajq.contentComplete);
        l();
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final double getContentTimeForStreamTime(double d9) {
        double startTime = d9;
        for (CuePoint cuePoint : this.f20047b) {
            if (cuePoint.getStartTime() > cuePoint.getEndTime()) {
                return 0.0d;
            }
            double endTime = cuePoint.getEndTime();
            double endTime2 = cuePoint.getEndTime();
            if (d9 >= endTime) {
                startTime -= endTime2 - cuePoint.getStartTime();
            } else if (d9 < endTime2 && d9 > cuePoint.getStartTime()) {
                startTime -= d9 - cuePoint.getStartTime();
            }
        }
        return startTime;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final long getContentTimeMsForStreamTimeMs(long j9) {
        long startTimeMs = j9;
        for (CuePoint cuePoint : this.f20047b) {
            if (cuePoint.getStartTimeMs() > cuePoint.getEndTimeMs()) {
                return 0L;
            }
            long endTimeMs = cuePoint.getEndTimeMs();
            long endTimeMs2 = cuePoint.getEndTimeMs();
            if (j9 >= endTimeMs) {
                startTimeMs -= endTimeMs2 - cuePoint.getStartTimeMs();
            } else if (j9 < endTimeMs2 && j9 > cuePoint.getStartTimeMs()) {
                startTimeMs -= j9 - cuePoint.getStartTimeMs();
            }
        }
        return startTimeMs;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final List<CuePoint> getCuePoints() {
        return Collections.unmodifiableList(this.f20047b);
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final CuePoint getPreviousCuePointForStreamTime(double d9) {
        CuePoint cuePoint = null;
        for (CuePoint cuePoint2 : this.f20047b) {
            if (cuePoint2.getStartTime() < d9) {
                cuePoint = cuePoint2;
            }
        }
        return cuePoint;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final CuePoint getPreviousCuePointForStreamTimeMs(long j9) {
        CuePoint cuePoint = null;
        for (CuePoint cuePoint2 : this.f20047b) {
            if (cuePoint2.getStartTimeMs() < j9) {
                cuePoint = cuePoint2;
            }
        }
        return cuePoint;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final String getStreamId() {
        return this.f20046a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final double getStreamTimeForContentTime(double d9) {
        double endTime = d9;
        double startTime = 0.0d;
        double endTime2 = 0.0d;
        for (CuePoint cuePoint : this.f20047b) {
            if (cuePoint.getStartTime() > cuePoint.getEndTime()) {
                return 0.0d;
            }
            startTime += cuePoint.getStartTime() - endTime2;
            if (startTime > d9) {
                return endTime;
            }
            endTime += cuePoint.getEndTime() - cuePoint.getStartTime();
            endTime2 = cuePoint.getEndTime();
        }
        return endTime;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final long getStreamTimeMsForContentTimeMs(long j9) {
        long endTimeMs = j9;
        long startTimeMs = 0;
        long endTimeMs2 = 0;
        for (CuePoint cuePoint : this.f20047b) {
            if (cuePoint.getStartTimeMs() > cuePoint.getEndTimeMs()) {
                return 0L;
            }
            startTimeMs += cuePoint.getStartTimeMs() - endTimeMs2;
            if (startTimeMs > j9) {
                return endTimeMs;
            }
            endTimeMs += cuePoint.getEndTimeMs() - cuePoint.getStartTimeMs();
            endTimeMs2 = cuePoint.getEndTimeMs();
        }
        return endTimeMs;
    }

    @Override // com.google.ads.interactivemedia.v3.api.BaseManager
    public final boolean isCustomPlaybackUsed() {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamManager
    public final void replaceAdTagParameters(Map<String, String> map) {
        if (map == null) {
            return;
        }
        HashMap map2 = new HashMap();
        map2.put("adTagParameters", map);
        m(ajp.adsManager, ajq.replaceAdTagParameters, map2);
    }
}
