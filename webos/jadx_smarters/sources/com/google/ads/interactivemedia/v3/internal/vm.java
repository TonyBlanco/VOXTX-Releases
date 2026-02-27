package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class vm implements we {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final bf f24858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f24859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int[] f24860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1333s[] f24861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long[] f24862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f24863f;

    public vm(bf bfVar, int[] iArr) {
        int length = iArr.length;
        int i9 = 0;
        af.w(length > 0);
        af.s(bfVar);
        this.f24858a = bfVar;
        this.f24859b = length;
        this.f24861d = new C1333s[length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            this.f24861d[i10] = bfVar.b(iArr[i10]);
        }
        Arrays.sort(this.f24861d, vp.f24869b);
        this.f24860c = new int[this.f24859b];
        while (true) {
            int i11 = this.f24859b;
            if (i9 >= i11) {
                this.f24862e = new long[i11];
                return;
            } else {
                this.f24860c[i9] = bfVar.a(this.f24861d[i9]);
                i9++;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.we
    public int e(long j9, List list) {
        return list.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            vm vmVar = (vm) obj;
            if (this.f24858a == vmVar.f24858a && Arrays.equals(this.f24860c, vmVar.f24860c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.we
    public void f() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.we
    public void g() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.we
    public void h(float f9) {
    }

    public final int hashCode() {
        int i9 = this.f24863f;
        if (i9 != 0) {
            return i9;
        }
        int iIdentityHashCode = (System.identityHashCode(this.f24858a) * 31) + Arrays.hashCode(this.f24860c);
        this.f24863f = iIdentityHashCode;
        return iIdentityHashCode;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wh
    public final int j(int i9) {
        return this.f24860c[i9];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.we
    public final int k() {
        return this.f24860c[a()];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wh
    public final int l(int i9) {
        for (int i10 = 0; i10 < this.f24859b; i10++) {
            if (this.f24860c[i10] == i9) {
                return i10;
            }
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wh
    public final int m(C1333s c1333s) {
        for (int i9 = 0; i9 < this.f24859b; i9++) {
            if (this.f24861d[i9] == c1333s) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wh
    public final int n() {
        return this.f24860c.length;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wh
    public final C1333s o(int i9) {
        return this.f24861d[i9];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.we
    public final C1333s p() {
        return this.f24861d[a()];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wh
    public final bf q() {
        return this.f24858a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.we
    public final boolean r(int i9, long j9) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zS = s(i9, jElapsedRealtime);
        int i10 = 0;
        while (true) {
            if (i10 < this.f24859b) {
                if (zS) {
                    break;
                }
                zS = (i10 == i9 || s(i10, jElapsedRealtime)) ? false : true;
                i10++;
            } else if (!zS) {
                return false;
            }
        }
        long[] jArr = this.f24862e;
        jArr[i9] = Math.max(jArr[i9], cq.an(jElapsedRealtime, j9));
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.we
    public final boolean s(int i9, long j9) {
        return this.f24862e[i9] > j9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.we
    public final /* synthetic */ void t() {
    }
}
