package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.g;
import d3.u;

/* JADX INFO: loaded from: classes3.dex */
public class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f25409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25410c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f25411d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f25412e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f25413f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f25414g;

    public c(long j9, long j10, int i9, int i10, boolean z9) {
        long jD;
        this.f25408a = j9;
        this.f25409b = j10;
        this.f25410c = i10 == -1 ? 1 : i10;
        this.f25412e = i9;
        this.f25414g = z9;
        if (j9 == -1) {
            this.f25411d = -1L;
            jD = -9223372036854775807L;
        } else {
            this.f25411d = j9 - j10;
            jD = d(j9, j10, i9);
        }
        this.f25413f = jD;
    }

    public static long d(long j9, long j10, int i9) {
        return (Math.max(0L, j9 - j10) * 8000000) / ((long) i9);
    }

    public final long a(long j9) {
        long j10 = (j9 * ((long) this.f25412e)) / 8000000;
        int i9 = this.f25410c;
        long jMin = (j10 / ((long) i9)) * ((long) i9);
        long j11 = this.f25411d;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - ((long) i9));
        }
        return this.f25409b + Math.max(jMin, 0L);
    }

    public long b(long j9) {
        return d(j9, this.f25409b, this.f25412e);
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public g.a e(long j9) {
        if (this.f25411d == -1 && !this.f25414g) {
            return new g.a(new u(0L, this.f25409b));
        }
        long jA = a(j9);
        long jB = b(jA);
        u uVar = new u(jB, jA);
        if (this.f25411d != -1 && jB < j9) {
            int i9 = this.f25410c;
            if (((long) i9) + jA < this.f25408a) {
                long j10 = jA + ((long) i9);
                return new g.a(uVar, new u(b(j10), j10));
            }
        }
        return new g.a(uVar);
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public boolean g() {
        return this.f25411d != -1 || this.f25414g;
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public long i() {
        return this.f25413f;
    }
}
