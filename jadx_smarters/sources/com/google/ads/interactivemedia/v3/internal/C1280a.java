package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.ads.interactivemedia.v3.internal.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1280a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri[] f18616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f18617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f18618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f18619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18620g;

    public C1280a() {
        this(-1, new int[0], new Uri[0], new long[0]);
    }

    private C1280a(int i9, int[] iArr, Uri[] uriArr, long[] jArr) {
        af.u(iArr.length == uriArr.length);
        this.f18614a = 0L;
        this.f18615b = i9;
        this.f18617d = iArr;
        this.f18616c = uriArr;
        this.f18618e = jArr;
        this.f18619f = 0L;
        this.f18620g = false;
    }

    public final int a() {
        return b(-1);
    }

    public final int b(int i9) {
        int i10;
        int i11 = i9 + 1;
        while (true) {
            int[] iArr = this.f18617d;
            if (i11 >= iArr.length || (i10 = iArr[i11]) == 0 || i10 == 1) {
                break;
            }
            i11++;
        }
        return i11;
    }

    public final C1280a c() {
        int[] iArr = this.f18617d;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.f18618e;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        return new C1280a(0, iArrCopyOf, (Uri[]) Arrays.copyOf(this.f18616c, 0), jArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1280a.class == obj.getClass()) {
            C1280a c1280a = (C1280a) obj;
            if (this.f18615b == c1280a.f18615b && Arrays.equals(this.f18616c, c1280a.f18616c) && Arrays.equals(this.f18617d, c1280a.f18617d) && Arrays.equals(this.f18618e, c1280a.f18618e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f18615b * 961) + Arrays.hashCode(this.f18616c)) * 31) + Arrays.hashCode(this.f18617d)) * 31) + Arrays.hashCode(this.f18618e)) * 961;
    }
}
