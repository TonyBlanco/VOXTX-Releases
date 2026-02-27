package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioAttributes;

/* JADX INFO: renamed from: com.google.ads.interactivemedia.v3.internal.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1292e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioAttributes f22760a;

    public /* synthetic */ C1292e(C1295f c1295f) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i9 = cq.f22640a;
        if (i9 >= 29) {
            C1286c.a(usage, 1);
        }
        if (i9 >= 32) {
            C1289d.a(usage, 0);
        }
        this.f22760a = usage.build();
    }
}
