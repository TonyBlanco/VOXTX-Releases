package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdProgressInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class aju {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AdEvent.AdEventType f19961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.ads.interactivemedia.v3.impl.data.c f19962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f19963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f19964d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    AdProgressInfo f19965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f19966f;

    public aju(AdEvent.AdEventType adEventType, com.google.ads.interactivemedia.v3.impl.data.c cVar) {
        this.f19961a = adEventType;
        this.f19962b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        return bur.c(this, obj, new String[0]);
    }

    public final int hashCode() {
        return but.a(this, new String[0]);
    }
}
