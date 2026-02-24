package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bpg {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f21899e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile int f21900f = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f21901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f21902b = f21900f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f21903c = a.e.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    bpi f21904d;

    public static int F(int i9) {
        return (-(i9 & 1)) ^ (i9 >>> 1);
    }

    public static long G(long j9) {
        return (-(j9 & 1)) ^ (j9 >>> 1);
    }

    public static bpg H(byte[] bArr, int i9, int i10, boolean z9) {
        bpc bpcVar = new bpc(bArr, i9, i10);
        try {
            bpcVar.e(i10);
            return bpcVar;
        } catch (bqw e9) {
            throw new IllegalArgumentException(e9);
        }
    }

    public abstract void A(int i9);

    public abstract boolean C() throws IOException;

    public abstract boolean D() throws IOException;

    public abstract boolean E(int i9) throws IOException;

    public abstract double b() throws IOException;

    public abstract float c() throws IOException;

    public abstract int d();

    public abstract int e(int i9) throws bqw;

    public abstract int f() throws IOException;

    public abstract int g() throws IOException;

    public abstract int h() throws IOException;

    public abstract int k() throws IOException;

    public abstract int l() throws IOException;

    public abstract int m() throws IOException;

    public abstract int n() throws IOException;

    public abstract long o() throws IOException;

    public abstract long p() throws IOException;

    public abstract long t() throws IOException;

    public abstract long u() throws IOException;

    public abstract long v() throws IOException;

    public abstract bpb w() throws IOException;

    public abstract String x() throws IOException;

    public abstract String y() throws IOException;

    public abstract void z(int i9) throws bqw;
}
