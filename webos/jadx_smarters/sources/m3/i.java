package m3;

import O2.C0936z0;
import com.google.android.exoplayer2.extractor.g;
import d3.InterfaceC1673j;
import d3.InterfaceC1674k;
import d3.t;
import d3.w;
import d4.AbstractC1684a;
import d4.M;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w f44364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1674k f44365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f44366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f44367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f44368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f44369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f44370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f44371i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f44373k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f44374l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f44375m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f44363a = new e();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f44372j = new b();

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C0936z0 f44376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g f44377b;
    }

    public static final class c implements g {
        public c() {
        }

        @Override // m3.g
        public long a(InterfaceC1673j interfaceC1673j) {
            return -1L;
        }

        @Override // m3.g
        public com.google.android.exoplayer2.extractor.g b() {
            return new g.b(-9223372036854775807L);
        }

        @Override // m3.g
        public void c(long j9) {
        }
    }

    public final void a() {
        AbstractC1684a.i(this.f44364b);
        k0.j(this.f44365c);
    }

    public long b(long j9) {
        return (j9 * 1000000) / ((long) this.f44371i);
    }

    public long c(long j9) {
        return (((long) this.f44371i) * j9) / 1000000;
    }

    public void d(InterfaceC1674k interfaceC1674k, w wVar) {
        this.f44365c = interfaceC1674k;
        this.f44364b = wVar;
        l(true);
    }

    public void e(long j9) {
        this.f44369g = j9;
    }

    public abstract long f(M m9);

    public final int g(InterfaceC1673j interfaceC1673j, t tVar) {
        a();
        int i9 = this.f44370h;
        if (i9 == 0) {
            return j(interfaceC1673j);
        }
        if (i9 == 1) {
            interfaceC1673j.q((int) this.f44368f);
            this.f44370h = 2;
            return 0;
        }
        if (i9 == 2) {
            k0.j(this.f44366d);
            return k(interfaceC1673j, tVar);
        }
        if (i9 == 3) {
            return -1;
        }
        throw new IllegalStateException();
    }

    public final boolean h(InterfaceC1673j interfaceC1673j) {
        while (this.f44363a.d(interfaceC1673j)) {
            this.f44373k = interfaceC1673j.getPosition() - this.f44368f;
            if (!i(this.f44363a.c(), this.f44368f, this.f44372j)) {
                return true;
            }
            this.f44368f = interfaceC1673j.getPosition();
        }
        this.f44370h = 3;
        return false;
    }

    public abstract boolean i(M m9, long j9, b bVar);

    public final int j(InterfaceC1673j interfaceC1673j) {
        if (!h(interfaceC1673j)) {
            return -1;
        }
        C0936z0 c0936z0 = this.f44372j.f44376a;
        this.f44371i = c0936z0.f6447A;
        if (!this.f44375m) {
            this.f44364b.d(c0936z0);
            this.f44375m = true;
        }
        g cVar = this.f44372j.f44377b;
        if (cVar != null) {
            this.f44366d = cVar;
        } else if (interfaceC1673j.getLength() == -1) {
            cVar = new c();
            this.f44366d = cVar;
        } else {
            f fVarB = this.f44363a.b();
            this.f44366d = new C2226a(this, this.f44368f, interfaceC1673j.getLength(), fVarB.f44356h + fVarB.f44357i, fVarB.f44351c, (fVarB.f44350b & 4) != 0);
        }
        this.f44370h = 2;
        this.f44363a.f();
        return 0;
    }

    public final int k(InterfaceC1673j interfaceC1673j, t tVar) {
        long jA = this.f44366d.a(interfaceC1673j);
        if (jA >= 0) {
            tVar.f39608a = jA;
            return 1;
        }
        if (jA < -1) {
            e(-(jA + 2));
        }
        if (!this.f44374l) {
            this.f44365c.n((com.google.android.exoplayer2.extractor.g) AbstractC1684a.i(this.f44366d.b()));
            this.f44374l = true;
        }
        if (this.f44373k <= 0 && !this.f44363a.d(interfaceC1673j)) {
            this.f44370h = 3;
            return -1;
        }
        this.f44373k = 0L;
        M mC = this.f44363a.c();
        long jF = f(mC);
        if (jF >= 0) {
            long j9 = this.f44369g;
            if (j9 + jF >= this.f44367e) {
                long jB = b(j9);
                this.f44364b.b(mC, mC.g());
                this.f44364b.f(jB, 1, mC.g(), 0, null);
                this.f44367e = -1L;
            }
        }
        this.f44369g += jF;
        return 0;
    }

    public void l(boolean z9) {
        int i9;
        if (z9) {
            this.f44372j = new b();
            this.f44368f = 0L;
            i9 = 0;
        } else {
            i9 = 1;
        }
        this.f44370h = i9;
        this.f44367e = -1L;
        this.f44369g = 0L;
    }

    public final void m(long j9, long j10) {
        this.f44363a.e();
        if (j9 == 0) {
            l(!this.f44374l);
        } else if (this.f44370h != 0) {
            this.f44367e = c(j10);
            ((g) k0.j(this.f44366d)).c(this.f44367e);
            this.f44370h = 2;
        }
    }
}
