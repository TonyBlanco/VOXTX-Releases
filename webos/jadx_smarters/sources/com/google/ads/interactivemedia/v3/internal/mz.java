package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class mz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f23846a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private UUID f23847b = C1304i.f23215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private od f23850e = og.f23914a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ws f23851f = new ws();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f23848c = new int[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f23849d = 300000;

    public final nj a(oj ojVar) {
        return new nj(this.f23847b, this.f23850e, ojVar, this.f23846a, this.f23848c, this.f23851f, 300000L, null, null, null);
    }

    public final void b(int... iArr) {
        for (int i9 : iArr) {
            boolean z9 = true;
            if (i9 != 2 && i9 != 1) {
                z9 = false;
            }
            af.u(z9);
        }
        this.f23848c = (int[]) iArr.clone();
    }

    public final void c(UUID uuid, od odVar) {
        af.s(uuid);
        this.f23847b = uuid;
        this.f23850e = odVar;
    }
}
