package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class wr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f24989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f24990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f24991c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f24992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bdz[] f24993e;

    public wr() {
        af.u(true);
        af.u(true);
        this.f24992d = 0;
        this.f24993e = new bdz[100];
        this.f24989a = null;
    }

    public final synchronized int a() {
        return this.f24991c * 65536;
    }

    public final synchronized void b(wl wlVar) {
        while (wlVar != null) {
            try {
                bdz[] bdzVarArr = this.f24993e;
                int i9 = this.f24992d;
                this.f24992d = i9 + 1;
                bdzVarArr[i9] = wlVar.e();
                this.f24991c--;
                wlVar = wlVar.c();
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    public final synchronized void c() {
        d(0);
    }

    public final synchronized void d(int i9) {
        int i10 = this.f24990b;
        this.f24990b = i9;
        if (i9 < i10) {
            e();
        }
    }

    public final synchronized void e() {
        int iMax = Math.max(0, cq.c(this.f24990b, 65536) - this.f24991c);
        int i9 = this.f24992d;
        if (iMax >= i9) {
            return;
        }
        Arrays.fill(this.f24993e, iMax, i9, (Object) null);
        this.f24992d = iMax;
    }

    public final synchronized bdz f() {
        bdz bdzVar;
        try {
            this.f24991c++;
            int i9 = this.f24992d;
            if (i9 > 0) {
                bdz[] bdzVarArr = this.f24993e;
                int i10 = i9 - 1;
                this.f24992d = i10;
                bdzVar = bdzVarArr[i10];
                af.s(bdzVar);
                this.f24993e[this.f24992d] = null;
            } else {
                bdzVar = new bdz(new byte[65536], 0);
                int i11 = this.f24991c;
                bdz[] bdzVarArr2 = this.f24993e;
                int length = bdzVarArr2.length;
                if (i11 > length) {
                    this.f24993e = (bdz[]) Arrays.copyOf(bdzVarArr2, length + length);
                    return bdzVar;
                }
            }
            return bdzVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g(bdz bdzVar) {
        bdz[] bdzVarArr = this.f24993e;
        int i9 = this.f24992d;
        this.f24992d = i9 + 1;
        bdzVarArr[i9] = bdzVar;
        this.f24991c--;
        notifyAll();
    }
}
