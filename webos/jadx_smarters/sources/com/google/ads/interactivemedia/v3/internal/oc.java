package com.google.ads.interactivemedia.v3.internal;

import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class oc implements ea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f23907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f23908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f23909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f23910d;

    static {
        boolean z9 = false;
        if ("Amazon".equals(cq.f22642c)) {
            String str = cq.f22643d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z9 = true;
            }
        }
        f23907a = z9;
    }

    public oc(UUID uuid, byte[] bArr, boolean z9) {
        this.f23908b = uuid;
        this.f23909c = bArr;
        this.f23910d = z9;
    }
}
