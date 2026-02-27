package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class mc extends me implements li {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final mf f23773a;

    public mc(C1333s c1333s, List list, mf mfVar, List list2, List list3, List list4) {
        super(c1333s, list, mfVar, list2);
        this.f23773a = mfVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.li
    public final long a(long j9, long j10) {
        return this.f23773a.a(j9, j10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.li
    public final long b(long j9, long j10) {
        return this.f23773a.d(j9, j10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.li
    public final long c(long j9, long j10) {
        return this.f23773a.b(j9, j10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.li
    public final long d() {
        return this.f23773a.f23781a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.li
    public final long e(long j9, long j10) {
        mf mfVar = this.f23773a;
        if (mfVar.f23783c != null) {
            return -9223372036854775807L;
        }
        long jB = mfVar.b(j9, j10) + mfVar.a(j9, j10);
        return (mfVar.f(jB) + mfVar.d(jB, j9)) - mfVar.f23784d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.li
    public final long f(long j9) {
        return this.f23773a.c(j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.li
    public final long g(long j9, long j10) {
        return this.f23773a.e(j9, j10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.li
    public final long h(long j9) {
        return this.f23773a.f(j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.li
    public final mb i(long j9) {
        return this.f23773a.g(this, j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.li
    public final boolean j() {
        return this.f23773a.h();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.me
    public final li k() {
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.me
    public final mb l() {
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.me
    public final void m() {
    }
}
