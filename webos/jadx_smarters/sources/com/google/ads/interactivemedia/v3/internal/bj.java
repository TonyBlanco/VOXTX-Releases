package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class bj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bf f21539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int[] f21541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean[] f21542e;

    public bj(bf bfVar, boolean z9, int[] iArr, boolean[] zArr) {
        int i9 = bfVar.f21163a;
        this.f21538a = i9;
        af.u(i9 == iArr.length && i9 == zArr.length);
        this.f21539b = bfVar;
        this.f21540c = z9 && i9 > 1;
        this.f21541d = (int[]) iArr.clone();
        this.f21542e = (boolean[]) zArr.clone();
    }

    public final int a() {
        return this.f21539b.f21165c;
    }

    public final C1333s b(int i9) {
        return this.f21539b.b(i9);
    }

    public final boolean c() {
        for (boolean z9 : this.f21542e) {
            if (z9) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(int i9) {
        return this.f21542e[i9];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bj.class == obj.getClass()) {
            bj bjVar = (bj) obj;
            if (this.f21540c == bjVar.f21540c && this.f21539b.equals(bjVar.f21539b) && Arrays.equals(this.f21541d, bjVar.f21541d) && Arrays.equals(this.f21542e, bjVar.f21542e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f21539b.hashCode() * 31) + (this.f21540c ? 1 : 0)) * 31) + Arrays.hashCode(this.f21541d)) * 31) + Arrays.hashCode(this.f21542e);
    }
}
