package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.atf;

/* JADX INFO: loaded from: classes3.dex */
@atf(a = j.class)
public abstract class b {
    public static a builder() {
        return new h();
    }

    public abstract String appState();

    public abstract String eventId();

    public abstract long nativeTime();

    public abstract ay nativeViewBounds();

    public abstract boolean nativeViewHidden();

    public abstract ay nativeViewVisibleBounds();

    public abstract double nativeVolume();

    public abstract String queryId();
}
