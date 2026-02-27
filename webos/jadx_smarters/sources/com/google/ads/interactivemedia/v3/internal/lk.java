package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class lk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final uv f23670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final me f23671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lt f23672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final li f23673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f23674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f23675f;

    public lk(long j9, me meVar, lt ltVar, uv uvVar, long j10, li liVar) {
        this.f23674e = j9;
        this.f23671b = meVar;
        this.f23672c = ltVar;
        this.f23675f = j10;
        this.f23670a = uvVar;
        this.f23673d = liVar;
    }

    public final long b(long j9) {
        return this.f23673d.c(this.f23674e, j9) + this.f23675f;
    }

    public final long c() {
        return this.f23673d.d() + this.f23675f;
    }

    public final long d(long j9) {
        return (b(j9) + this.f23673d.a(this.f23674e, j9)) - 1;
    }

    public final long e() {
        return this.f23673d.f(this.f23674e);
    }

    public final long f(long j9) {
        return h(j9) + this.f23673d.b(j9 - this.f23675f, this.f23674e);
    }

    public final long g(long j9) {
        return this.f23673d.g(j9, this.f23674e) + this.f23675f;
    }

    public final long h(long j9) {
        return this.f23673d.h(j9 - this.f23675f);
    }

    public final lk i(long j9, me meVar) throws sb {
        long jG;
        li liVarK = this.f23671b.k();
        li liVarK2 = meVar.k();
        if (liVarK == null) {
            return new lk(j9, meVar, this.f23672c, this.f23670a, this.f23675f, null);
        }
        if (!liVarK.j()) {
            return new lk(j9, meVar, this.f23672c, this.f23670a, this.f23675f, liVarK2);
        }
        long jF = liVarK.f(j9);
        if (jF == 0) {
            return new lk(j9, meVar, this.f23672c, this.f23670a, this.f23675f, liVarK2);
        }
        long jD = liVarK.d();
        long jH = liVarK.h(jD);
        long j10 = jF + jD;
        long j11 = (-1) + j10;
        long jH2 = liVarK.h(j11) + liVarK.b(j11, j9);
        long jD2 = liVarK2.d();
        long jH3 = liVarK2.h(jD2);
        long j12 = this.f23675f;
        if (jH2 == jH3) {
            jG = j12 + (j10 - jD2);
        } else {
            if (jH2 < jH3) {
                throw new sb();
            }
            jG = jH3 < jH ? j12 - (liVarK2.g(jH, j9) - jD) : j12 + (liVarK.g(jH3, j9) - jD2);
        }
        return new lk(j9, meVar, this.f23672c, this.f23670a, jG, liVarK2);
    }

    public final lk j(li liVar) {
        return new lk(this.f23674e, this.f23671b, this.f23672c, this.f23670a, this.f23675f, liVar);
    }

    public final lk k(lt ltVar) {
        return new lk(this.f23674e, this.f23671b, ltVar, this.f23670a, this.f23675f, this.f23673d);
    }

    public final mb l(long j9) {
        return this.f23673d.i(j9 - this.f23675f);
    }

    public final boolean m(long j9, long j10) {
        return this.f23673d.j() || j10 == -9223372036854775807L || f(j9) <= j10;
    }
}
