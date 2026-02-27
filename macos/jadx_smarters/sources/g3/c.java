package g3;

import O2.C0897l1;
import android.net.Uri;
import com.google.android.exoplayer2.extractor.FlacStreamMetadata;
import com.google.android.exoplayer2.extractor.d;
import com.google.android.exoplayer2.extractor.e;
import com.google.android.exoplayer2.extractor.g;
import d3.AbstractC1677n;
import d3.AbstractC1679p;
import d3.InterfaceC1672i;
import d3.InterfaceC1673j;
import d3.InterfaceC1674k;
import d3.InterfaceC1678o;
import d3.t;
import d3.w;
import d4.AbstractC1684a;
import d4.M;
import d4.k0;
import java.util.Map;
import q3.C2540a;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements InterfaceC1672i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final InterfaceC1678o f41318o = new InterfaceC1678o() { // from class: g3.b
        @Override // d3.InterfaceC1678o
        public /* synthetic */ InterfaceC1672i[] a(Uri uri, Map map) {
            return AbstractC1677n.a(this, uri, map);
        }

        @Override // d3.InterfaceC1678o
        public final InterfaceC1672i[] b() {
            return c.j();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f41319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f41320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f41321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC1679p.a f41322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC1674k f41323e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w f41324f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f41325g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C2540a f41326h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public FlacStreamMetadata f41327i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f41328j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f41329k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C1833a f41330l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f41331m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f41332n;

    public c() {
        this(0);
    }

    public c(int i9) {
        this.f41319a = new byte[42];
        this.f41320b = new M(new byte[32768], 0);
        this.f41321c = (i9 & 1) != 0;
        this.f41322d = new AbstractC1679p.a();
        this.f41325g = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC1672i[] j() {
        return new InterfaceC1672i[]{new c()};
    }

    @Override // d3.InterfaceC1672i
    public void a(long j9, long j10) {
        if (j9 == 0) {
            this.f41325g = 0;
        } else {
            C1833a c1833a = this.f41330l;
            if (c1833a != null) {
                c1833a.h(j10);
            }
        }
        this.f41332n = j10 != 0 ? -1L : 0L;
        this.f41331m = 0;
        this.f41320b.Q(0);
    }

    @Override // d3.InterfaceC1672i
    public void b(InterfaceC1674k interfaceC1674k) {
        this.f41323e = interfaceC1674k;
        this.f41324f = interfaceC1674k.e(0, 1);
        interfaceC1674k.q();
    }

    @Override // d3.InterfaceC1672i
    public int d(InterfaceC1673j interfaceC1673j, t tVar) throws C0897l1 {
        int i9 = this.f41325g;
        if (i9 == 0) {
            m(interfaceC1673j);
            return 0;
        }
        if (i9 == 1) {
            i(interfaceC1673j);
            return 0;
        }
        if (i9 == 2) {
            o(interfaceC1673j);
            return 0;
        }
        if (i9 == 3) {
            n(interfaceC1673j);
            return 0;
        }
        if (i9 == 4) {
            f(interfaceC1673j);
            return 0;
        }
        if (i9 == 5) {
            return l(interfaceC1673j, tVar);
        }
        throw new IllegalStateException();
    }

    public final long e(M m9, boolean z9) {
        boolean zD;
        AbstractC1684a.e(this.f41327i);
        int iF = m9.f();
        while (true) {
            if (iF > m9.g() - 16) {
                if (!z9) {
                    m9.U(iF);
                    return -1L;
                }
                while (iF <= m9.g() - this.f41328j) {
                    m9.U(iF);
                    try {
                        zD = AbstractC1679p.d(m9, this.f41327i, this.f41329k, this.f41322d);
                    } catch (IndexOutOfBoundsException unused) {
                        zD = false;
                    }
                    if (!(m9.f() <= m9.g() ? zD : false)) {
                        iF++;
                    }
                }
                m9.U(m9.g());
                return -1L;
            }
            m9.U(iF);
            if (AbstractC1679p.d(m9, this.f41327i, this.f41329k, this.f41322d)) {
                break;
            }
            iF++;
        }
        m9.U(iF);
        return this.f41322d.f39602a;
    }

    public final void f(InterfaceC1673j interfaceC1673j) {
        this.f41329k = d.b(interfaceC1673j);
        ((InterfaceC1674k) k0.j(this.f41323e)).n(g(interfaceC1673j.getPosition(), interfaceC1673j.getLength()));
        this.f41325g = 5;
    }

    public final g g(long j9, long j10) {
        AbstractC1684a.e(this.f41327i);
        FlacStreamMetadata flacStreamMetadata = this.f41327i;
        if (flacStreamMetadata.seekTable != null) {
            return new e(flacStreamMetadata, j9);
        }
        if (j10 == -1 || flacStreamMetadata.totalSamples <= 0) {
            return new g.b(flacStreamMetadata.getDurationUs());
        }
        C1833a c1833a = new C1833a(flacStreamMetadata, this.f41329k, j9, j10);
        this.f41330l = c1833a;
        return c1833a.b();
    }

    @Override // d3.InterfaceC1672i
    public boolean h(InterfaceC1673j interfaceC1673j) {
        d.c(interfaceC1673j, false);
        return d.a(interfaceC1673j);
    }

    public final void i(InterfaceC1673j interfaceC1673j) {
        byte[] bArr = this.f41319a;
        interfaceC1673j.s(bArr, 0, bArr.length);
        interfaceC1673j.f();
        this.f41325g = 2;
    }

    public final void k() {
        ((w) k0.j(this.f41324f)).f((this.f41332n * 1000000) / ((long) ((FlacStreamMetadata) k0.j(this.f41327i)).sampleRate), 1, this.f41331m, 0, null);
    }

    public final int l(InterfaceC1673j interfaceC1673j, t tVar) {
        boolean z9;
        AbstractC1684a.e(this.f41324f);
        AbstractC1684a.e(this.f41327i);
        C1833a c1833a = this.f41330l;
        if (c1833a != null && c1833a.d()) {
            return this.f41330l.c(interfaceC1673j, tVar);
        }
        if (this.f41332n == -1) {
            this.f41332n = AbstractC1679p.i(interfaceC1673j, this.f41327i);
            return 0;
        }
        int iG = this.f41320b.g();
        if (iG < 32768) {
            int i9 = interfaceC1673j.read(this.f41320b.e(), iG, 32768 - iG);
            z9 = i9 == -1;
            if (!z9) {
                this.f41320b.T(iG + i9);
            } else if (this.f41320b.a() == 0) {
                k();
                return -1;
            }
        } else {
            z9 = false;
        }
        int iF = this.f41320b.f();
        int i10 = this.f41331m;
        int i11 = this.f41328j;
        if (i10 < i11) {
            M m9 = this.f41320b;
            m9.V(Math.min(i11 - i10, m9.a()));
        }
        long jE = e(this.f41320b, z9);
        int iF2 = this.f41320b.f() - iF;
        this.f41320b.U(iF);
        this.f41324f.b(this.f41320b, iF2);
        this.f41331m += iF2;
        if (jE != -1) {
            k();
            this.f41331m = 0;
            this.f41332n = jE;
        }
        if (this.f41320b.a() < 16) {
            int iA = this.f41320b.a();
            System.arraycopy(this.f41320b.e(), this.f41320b.f(), this.f41320b.e(), 0, iA);
            this.f41320b.U(0);
            this.f41320b.T(iA);
        }
        return 0;
    }

    public final void m(InterfaceC1673j interfaceC1673j) {
        this.f41326h = d.d(interfaceC1673j, !this.f41321c);
        this.f41325g = 1;
    }

    public final void n(InterfaceC1673j interfaceC1673j) {
        d.a aVar = new d.a(this.f41327i);
        boolean zE = false;
        while (!zE) {
            zE = d.e(interfaceC1673j, aVar);
            this.f41327i = (FlacStreamMetadata) k0.j(aVar.f25415a);
        }
        AbstractC1684a.e(this.f41327i);
        this.f41328j = Math.max(this.f41327i.minFrameSize, 6);
        ((w) k0.j(this.f41324f)).d(this.f41327i.getFormat(this.f41319a, this.f41326h));
        this.f41325g = 4;
    }

    public final void o(InterfaceC1673j interfaceC1673j) throws C0897l1 {
        d.i(interfaceC1673j);
        this.f41325g = 3;
    }

    @Override // d3.InterfaceC1672i
    public void release() {
    }
}
