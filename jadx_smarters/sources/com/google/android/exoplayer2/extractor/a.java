package com.google.android.exoplayer2.extractor;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.exoplayer2.extractor.g;
import d3.InterfaceC1673j;
import d3.t;
import d3.u;
import d4.AbstractC1684a;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0240a f25379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f25380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f25381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25382d;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.a$a, reason: collision with other inner class name */
    public static class C0240a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f25383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f25384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f25385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f25386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f25387e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f25388f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f25389g;

        public C0240a(d dVar, long j9, long j10, long j11, long j12, long j13, long j14) {
            this.f25383a = dVar;
            this.f25384b = j9;
            this.f25385c = j10;
            this.f25386d = j11;
            this.f25387e = j12;
            this.f25388f = j13;
            this.f25389g = j14;
        }

        @Override // com.google.android.exoplayer2.extractor.g
        public g.a e(long j9) {
            return new g.a(new u(j9, c.h(this.f25383a.a(j9), this.f25385c, this.f25386d, this.f25387e, this.f25388f, this.f25389g)));
        }

        @Override // com.google.android.exoplayer2.extractor.g
        public boolean g() {
            return true;
        }

        @Override // com.google.android.exoplayer2.extractor.g
        public long i() {
            return this.f25384b;
        }

        public long k(long j9) {
            return this.f25383a.a(j9);
        }
    }

    public static final class b implements d {
        @Override // com.google.android.exoplayer2.extractor.a.d
        public long a(long j9) {
            return j9;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f25390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f25391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f25392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f25393d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f25394e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f25395f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f25396g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f25397h;

        public c(long j9, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f25390a = j9;
            this.f25391b = j10;
            this.f25393d = j11;
            this.f25394e = j12;
            this.f25395f = j13;
            this.f25396g = j14;
            this.f25392c = j15;
            this.f25397h = h(j10, j11, j12, j13, j14, j15);
        }

        public static long h(long j9, long j10, long j11, long j12, long j13, long j14) {
            if (j12 + 1 >= j13 || j10 + 1 >= j11) {
                return j12;
            }
            long j15 = (long) ((j9 - j10) * ((j13 - j12) / (j11 - j10)));
            return k0.s(((j15 + j12) - j14) - (j15 / 20), j12, j13 - 1);
        }

        public final long i() {
            return this.f25396g;
        }

        public final long j() {
            return this.f25395f;
        }

        public final long k() {
            return this.f25397h;
        }

        public final long l() {
            return this.f25390a;
        }

        public final long m() {
            return this.f25391b;
        }

        public final void n() {
            this.f25397h = h(this.f25391b, this.f25393d, this.f25394e, this.f25395f, this.f25396g, this.f25392c);
        }

        public final void o(long j9, long j10) {
            this.f25394e = j9;
            this.f25396g = j10;
            n();
        }

        public final void p(long j9, long j10) {
            this.f25393d = j9;
            this.f25395f = j10;
            n();
        }
    }

    public interface d {
        long a(long j9);
    }

    public static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f25398d = new e(-3, -9223372036854775807L, -1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f25399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f25400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f25401c;

        public e(int i9, long j9, long j10) {
            this.f25399a = i9;
            this.f25400b = j9;
            this.f25401c = j10;
        }

        public static e d(long j9, long j10) {
            return new e(-1, j9, j10);
        }

        public static e e(long j9) {
            return new e(0, -9223372036854775807L, j9);
        }

        public static e f(long j9, long j10) {
            return new e(-2, j9, j10);
        }
    }

    public interface f {
        e a(InterfaceC1673j interfaceC1673j, long j9);

        void b();
    }

    public a(d dVar, f fVar, long j9, long j10, long j11, long j12, long j13, long j14, int i9) {
        this.f25380b = fVar;
        this.f25382d = i9;
        this.f25379a = new C0240a(dVar, j9, j10, j11, j12, j13, j14);
    }

    public c a(long j9) {
        return new c(j9, this.f25379a.k(j9), this.f25379a.f25385c, this.f25379a.f25386d, this.f25379a.f25387e, this.f25379a.f25388f, this.f25379a.f25389g);
    }

    public final g b() {
        return this.f25379a;
    }

    public int c(InterfaceC1673j interfaceC1673j, t tVar) {
        while (true) {
            c cVar = (c) AbstractC1684a.i(this.f25381c);
            long j9 = cVar.j();
            long jI = cVar.i();
            long jK = cVar.k();
            if (jI - j9 <= this.f25382d) {
                e(false, j9);
                return g(interfaceC1673j, j9, tVar);
            }
            if (!i(interfaceC1673j, jK)) {
                return g(interfaceC1673j, jK, tVar);
            }
            interfaceC1673j.f();
            e eVarA = this.f25380b.a(interfaceC1673j, cVar.m());
            int i9 = eVarA.f25399a;
            if (i9 == -3) {
                e(false, jK);
                return g(interfaceC1673j, jK, tVar);
            }
            if (i9 == -2) {
                cVar.p(eVarA.f25400b, eVarA.f25401c);
            } else {
                if (i9 != -1) {
                    if (i9 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(interfaceC1673j, eVarA.f25401c);
                    e(true, eVarA.f25401c);
                    return g(interfaceC1673j, eVarA.f25401c, tVar);
                }
                cVar.o(eVarA.f25400b, eVarA.f25401c);
            }
        }
    }

    public final boolean d() {
        return this.f25381c != null;
    }

    public final void e(boolean z9, long j9) {
        this.f25381c = null;
        this.f25380b.b();
        f(z9, j9);
    }

    public void f(boolean z9, long j9) {
    }

    public final int g(InterfaceC1673j interfaceC1673j, long j9, t tVar) {
        if (j9 == interfaceC1673j.getPosition()) {
            return 0;
        }
        tVar.f39608a = j9;
        return 1;
    }

    public final void h(long j9) {
        c cVar = this.f25381c;
        if (cVar == null || cVar.l() != j9) {
            this.f25381c = a(j9);
        }
    }

    public final boolean i(InterfaceC1673j interfaceC1673j, long j9) {
        long position = j9 - interfaceC1673j.getPosition();
        if (position < 0 || position > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        interfaceC1673j.q((int) position);
        return true;
    }
}
