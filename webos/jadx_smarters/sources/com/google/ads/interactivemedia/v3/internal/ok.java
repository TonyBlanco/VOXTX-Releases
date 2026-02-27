package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class ok extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dc f23921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f23922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f23923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f23924d;

    public ok(dc dcVar, Uri uri, Map map, long j9, Throwable th) {
        super(th);
        this.f23921a = dcVar;
        this.f23922b = uri;
        this.f23923c = map;
        this.f23924d = j9;
    }
}
