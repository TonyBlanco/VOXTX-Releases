package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: renamed from: com.google.ads.interactivemedia.v3.internal.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1283b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1283b f20974a = new C1283b(new C1280a[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final C1280a f20975d = new C1280a().c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final C1280a[] f20978e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20977c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20976b = 0;

    private C1283b(C1280a[] c1280aArr) {
        this.f20978e = c1280aArr;
    }

    public final C1280a a(int i9) {
        return i9 < 0 ? f20975d : this.f20978e[i9];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1283b.class == obj.getClass()) {
            C1283b c1283b = (C1283b) obj;
            if (cq.V(null, null) && Arrays.equals(this.f20978e, c1283b.f20978e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + Arrays.hashCode(this.f20978e);
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + ((Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }
}
