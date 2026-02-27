package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class sw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f24552a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicLong f24553b = new AtomicLong();

    public sw() {
    }

    public sw(dc dcVar) {
        Uri uri = dcVar.f22688a;
        Collections.emptyMap();
    }

    public static long a() {
        return f24553b.getAndIncrement();
    }
}
