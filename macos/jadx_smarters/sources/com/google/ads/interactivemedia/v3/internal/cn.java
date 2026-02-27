package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class cn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f22631a = new long[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f22632b = new Object[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22634d;

    private final Object f() {
        af.w(this.f22634d > 0);
        Object[] objArr = this.f22632b;
        int i9 = this.f22633c;
        Object obj = objArr[i9];
        objArr[i9] = null;
        this.f22633c = (i9 + 1) % objArr.length;
        this.f22634d--;
        return obj;
    }

    public final synchronized int a() {
        return this.f22634d;
    }

    public final synchronized Object b() {
        if (this.f22634d == 0) {
            return null;
        }
        return f();
    }

    public final synchronized Object c(long j9) {
        Object objF;
        objF = null;
        while (this.f22634d > 0 && j9 - this.f22631a[this.f22633c] >= 0) {
            objF = f();
        }
        return objF;
    }

    public final synchronized void d(long j9, Object obj) {
        try {
            if (this.f22634d > 0) {
                if (j9 <= this.f22631a[((this.f22633c + r0) - 1) % this.f22632b.length]) {
                    e();
                }
            }
            int length = this.f22632b.length;
            if (this.f22634d >= length) {
                int i9 = length + length;
                long[] jArr = new long[i9];
                Object[] objArr = new Object[i9];
                int i10 = this.f22633c;
                int i11 = length - i10;
                System.arraycopy(this.f22631a, i10, jArr, 0, i11);
                System.arraycopy(this.f22632b, this.f22633c, objArr, 0, i11);
                int i12 = this.f22633c;
                if (i12 > 0) {
                    System.arraycopy(this.f22631a, 0, jArr, i11, i12);
                    System.arraycopy(this.f22632b, 0, objArr, i11, this.f22633c);
                }
                this.f22631a = jArr;
                this.f22632b = objArr;
                this.f22633c = 0;
            }
            int i13 = this.f22633c;
            int i14 = this.f22634d;
            Object[] objArr2 = this.f22632b;
            int length2 = (i13 + i14) % objArr2.length;
            this.f22631a[length2] = j9;
            objArr2[length2] = obj;
            this.f22634d = i14 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e() {
        this.f22633c = 0;
        this.f22634d = 0;
        Arrays.fill(this.f22632b, (Object) null);
    }
}
