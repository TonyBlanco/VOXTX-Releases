package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseBooleanArray;

/* JADX INFO: renamed from: com.google.ads.interactivemedia.v3.internal.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1328q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f24163a;

    public final int a(int i9) {
        af.y(i9, b());
        return this.f24163a.keyAt(i9);
    }

    public final int b() {
        return this.f24163a.size();
    }

    public final boolean c(int i9) {
        return this.f24163a.get(i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1328q)) {
            return false;
        }
        C1328q c1328q = (C1328q) obj;
        if (cq.f22640a >= 24) {
            return this.f24163a.equals(c1328q.f24163a);
        }
        if (b() != c1328q.b()) {
            return false;
        }
        for (int i9 = 0; i9 < b(); i9++) {
            if (a(i9) != c1328q.a(i9)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (cq.f22640a >= 24) {
            return this.f24163a.hashCode();
        }
        int iB = b();
        for (int i9 = 0; i9 < b(); i9++) {
            iB = (iB * 31) + a(i9);
        }
        return iB;
    }
}
