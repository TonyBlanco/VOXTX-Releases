package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class tj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te f24592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CopyOnWriteArrayList f24593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f24594d;

    public tj() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    private tj(CopyOnWriteArrayList copyOnWriteArrayList, int i9, te teVar, long j9) {
        this.f24593c = copyOnWriteArrayList;
        this.f24591a = i9;
        this.f24592b = teVar;
        this.f24594d = j9;
    }

    private final long t(long j9) {
        long jX = cq.x(j9);
        if (jX == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f24594d + jX;
    }

    public final tj a(int i9, te teVar, long j9) {
        return new tj(this.f24593c, i9, teVar, j9);
    }

    public final void b(Handler handler, tk tkVar) {
        af.s(handler);
        af.s(tkVar);
        this.f24593c.add(new uc(handler, tkVar));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.ads.interactivemedia.v3.internal.tk, java.lang.Object] */
    public final void c(tb tbVar) {
        for (uc ucVar : this.f24593c) {
            ?? r22 = ucVar.f24692b;
            cq.at((Handler) ucVar.f24691a, new jg(this, (tk) r22, tbVar, 2));
        }
    }

    public final void d(sw swVar, int i9) {
        p(swVar, i9, -1, null, 0, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.ads.interactivemedia.v3.internal.tk, java.lang.Object] */
    public final void e(sw swVar, tb tbVar) {
        for (uc ucVar : this.f24593c) {
            ?? r42 = ucVar.f24692b;
            cq.at((Handler) ucVar.f24691a, new ti(this, (tk) r42, swVar, tbVar, 1));
        }
    }

    public final void f(sw swVar, int i9) {
        q(swVar, i9, -1, null, 0, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.ads.interactivemedia.v3.internal.tk, java.lang.Object] */
    public final void g(sw swVar, tb tbVar) {
        for (uc ucVar : this.f24593c) {
            ?? r42 = ucVar.f24692b;
            cq.at((Handler) ucVar.f24691a, new ti(this, (tk) r42, swVar, tbVar, 3));
        }
    }

    public final void h(sw swVar, int i9, IOException iOException, boolean z9) {
        r(swVar, i9, -1, null, 0, -9223372036854775807L, -9223372036854775807L, iOException, z9);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.ads.interactivemedia.v3.internal.tk, java.lang.Object] */
    public final void i(final sw swVar, final tb tbVar, final IOException iOException, final boolean z9) {
        for (uc ucVar : this.f24593c) {
            final ?? r42 = ucVar.f24692b;
            cq.at((Handler) ucVar.f24691a, new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.th
                @Override // java.lang.Runnable
                public final void run() {
                    tj tjVar = this.f24580a;
                    r42.ah(tjVar.f24591a, tjVar.f24592b, swVar, tbVar, iOException, z9);
                }
            });
        }
    }

    public final void j(sw swVar, int i9) {
        s(swVar, i9, -1, null, 0, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [com.google.ads.interactivemedia.v3.internal.tk, java.lang.Object] */
    public final void k(sw swVar, tb tbVar) {
        for (uc ucVar : this.f24593c) {
            ?? r42 = ucVar.f24692b;
            cq.at((Handler) ucVar.f24691a, new ti(this, (tk) r42, swVar, tbVar, 2));
        }
    }

    public final void l(tk tkVar) {
        for (uc ucVar : this.f24593c) {
            if (ucVar.f24692b == tkVar) {
                this.f24593c.remove(ucVar);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.ads.interactivemedia.v3.internal.tk, java.lang.Object] */
    public final void m(tb tbVar) {
        te teVar = this.f24592b;
        af.s(teVar);
        for (uc ucVar : this.f24593c) {
            ?? r22 = ucVar.f24692b;
            cq.at((Handler) ucVar.f24691a, new ti(this, (tk) r22, teVar, tbVar, 0));
        }
    }

    public final void n(int i9, long j9, long j10) {
        m(new tb(1, i9, null, 3, t(j9), t(j10)));
    }

    public final void o(int i9, C1333s c1333s, int i10, long j9) {
        c(new tb(1, i9, c1333s, i10, t(j9), -9223372036854775807L));
    }

    public final void p(sw swVar, int i9, int i10, C1333s c1333s, int i11, long j9, long j10) {
        e(swVar, new tb(i9, i10, c1333s, i11, t(j9), t(j10)));
    }

    public final void q(sw swVar, int i9, int i10, C1333s c1333s, int i11, long j9, long j10) {
        g(swVar, new tb(i9, i10, c1333s, i11, t(j9), t(j10)));
    }

    public final void r(sw swVar, int i9, int i10, C1333s c1333s, int i11, long j9, long j10, IOException iOException, boolean z9) {
        i(swVar, new tb(i9, i10, c1333s, i11, t(j9), t(j10)), iOException, z9);
    }

    public final void s(sw swVar, int i9, int i10, C1333s c1333s, int i11, long j9, long j10) {
        k(swVar, new tb(i9, i10, c1333s, i11, t(j9), t(j10)));
    }
}
