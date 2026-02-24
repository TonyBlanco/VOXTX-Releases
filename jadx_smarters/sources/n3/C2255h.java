package n3;

import O2.C0897l1;
import android.net.Uri;
import com.google.android.exoplayer2.extractor.g;
import d3.AbstractC1677n;
import d3.InterfaceC1672i;
import d3.InterfaceC1673j;
import d3.InterfaceC1674k;
import d3.InterfaceC1678o;
import d4.AbstractC1684a;
import d4.L;
import d4.M;
import java.io.EOFException;
import java.util.Map;
import n3.I;

/* JADX INFO: renamed from: n3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2255h implements InterfaceC1672i {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final InterfaceC1678o f45014m = new InterfaceC1678o() { // from class: n3.g
        @Override // d3.InterfaceC1678o
        public /* synthetic */ InterfaceC1672i[] a(Uri uri, Map map) {
            return AbstractC1677n.a(this, uri, map);
        }

        @Override // d3.InterfaceC1678o
        public final InterfaceC1672i[] b() {
            return C2255h.i();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f45015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2256i f45016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f45017c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M f45018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final L f45019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC1674k f45020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f45021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f45022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f45023i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f45024j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f45025k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f45026l;

    public C2255h() {
        this(0);
    }

    public C2255h(int i9) {
        this.f45015a = (i9 & 2) != 0 ? i9 | 1 : i9;
        this.f45016b = new C2256i(true);
        this.f45017c = new M(2048);
        this.f45023i = -1;
        this.f45022h = -1L;
        M m9 = new M(10);
        this.f45018d = m9;
        this.f45019e = new L(m9.e());
    }

    private static int f(int i9, long j9) {
        return (int) ((((long) i9) * 8000000) / j9);
    }

    private com.google.android.exoplayer2.extractor.g g(long j9, boolean z9) {
        return new com.google.android.exoplayer2.extractor.c(j9, this.f45022h, f(this.f45023i, this.f45016b.k()), this.f45023i, z9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC1672i[] i() {
        return new InterfaceC1672i[]{new C2255h()};
    }

    @Override // d3.InterfaceC1672i
    public void a(long j9, long j10) {
        this.f45025k = false;
        this.f45016b.c();
        this.f45021g = j10;
    }

    @Override // d3.InterfaceC1672i
    public void b(InterfaceC1674k interfaceC1674k) {
        this.f45020f = interfaceC1674k;
        this.f45016b.f(interfaceC1674k, new I.d(0, 1));
        interfaceC1674k.q();
    }

    @Override // d3.InterfaceC1672i
    public int d(InterfaceC1673j interfaceC1673j, d3.t tVar) throws C0897l1 {
        AbstractC1684a.i(this.f45020f);
        long length = interfaceC1673j.getLength();
        int i9 = this.f45015a;
        if ((i9 & 2) != 0 || ((i9 & 1) != 0 && length != -1)) {
            e(interfaceC1673j);
        }
        int i10 = interfaceC1673j.read(this.f45017c.e(), 0, 2048);
        boolean z9 = i10 == -1;
        j(length, z9);
        if (z9) {
            return -1;
        }
        this.f45017c.U(0);
        this.f45017c.T(i10);
        if (!this.f45025k) {
            this.f45016b.e(this.f45021g, 4);
            this.f45025k = true;
        }
        this.f45016b.b(this.f45017c);
        return 0;
    }

    public final void e(InterfaceC1673j interfaceC1673j) throws C0897l1 {
        int iH;
        if (this.f45024j) {
            return;
        }
        this.f45023i = -1;
        interfaceC1673j.f();
        long j9 = 0;
        if (interfaceC1673j.getPosition() == 0) {
            k(interfaceC1673j);
        }
        int i9 = 0;
        int i10 = 0;
        do {
            try {
                if (!interfaceC1673j.d(this.f45018d.e(), 0, 2, true)) {
                    break;
                }
                this.f45018d.U(0);
                if (!C2256i.m(this.f45018d.N())) {
                    break;
                }
                if (!interfaceC1673j.d(this.f45018d.e(), 0, 4, true)) {
                    break;
                }
                this.f45019e.p(14);
                iH = this.f45019e.h(13);
                if (iH <= 6) {
                    this.f45024j = true;
                    throw C0897l1.a("Malformed ADTS stream", null);
                }
                j9 += (long) iH;
                i10++;
                if (i10 == 1000) {
                    break;
                }
            } catch (EOFException unused) {
            }
        } while (interfaceC1673j.r(iH - 6, true));
        i9 = i10;
        interfaceC1673j.f();
        if (i9 > 0) {
            this.f45023i = (int) (j9 / ((long) i9));
        } else {
            this.f45023i = -1;
        }
        this.f45024j = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0023  */
    @Override // d3.InterfaceC1672i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean h(d3.InterfaceC1673j r9) {
        /*
            r8 = this;
            int r0 = r8.k(r9)
            r1 = 0
            r3 = r0
            r2 = 0
            r4 = 0
        L8:
            d4.M r5 = r8.f45018d
            byte[] r5 = r5.e()
            r6 = 2
            r9.s(r5, r1, r6)
            d4.M r5 = r8.f45018d
            r5.U(r1)
            d4.M r5 = r8.f45018d
            int r5 = r5.N()
            boolean r5 = n3.C2256i.m(r5)
            if (r5 != 0) goto L2e
        L23:
            int r3 = r3 + 1
            r9.f()
            r9.n(r3)
            r2 = 0
            r4 = 0
            goto L5a
        L2e:
            r5 = 1
            int r2 = r2 + r5
            r6 = 4
            if (r2 < r6) goto L38
            r7 = 188(0xbc, float:2.63E-43)
            if (r4 <= r7) goto L38
            return r5
        L38:
            d4.M r5 = r8.f45018d
            byte[] r5 = r5.e()
            r9.s(r5, r1, r6)
            d4.L r5 = r8.f45019e
            r6 = 14
            r5.p(r6)
            d4.L r5 = r8.f45019e
            r6 = 13
            int r5 = r5.h(r6)
            r6 = 6
            if (r5 > r6) goto L54
            goto L23
        L54:
            int r6 = r5 + (-6)
            r9.n(r6)
            int r4 = r4 + r5
        L5a:
            int r5 = r3 - r0
            r6 = 8192(0x2000, float:1.148E-41)
            if (r5 < r6) goto L8
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.C2255h.h(d3.j):boolean");
    }

    public final void j(long j9, boolean z9) {
        if (this.f45026l) {
            return;
        }
        boolean z10 = (this.f45015a & 1) != 0 && this.f45023i > 0;
        if (z10 && this.f45016b.k() == -9223372036854775807L && !z9) {
            return;
        }
        if (!z10 || this.f45016b.k() == -9223372036854775807L) {
            this.f45020f.n(new g.b(-9223372036854775807L));
        } else {
            this.f45020f.n(g(j9, (this.f45015a & 2) != 0));
        }
        this.f45026l = true;
    }

    public final int k(InterfaceC1673j interfaceC1673j) {
        int i9 = 0;
        while (true) {
            interfaceC1673j.s(this.f45018d.e(), 0, 10);
            this.f45018d.U(0);
            if (this.f45018d.K() != 4801587) {
                break;
            }
            this.f45018d.V(3);
            int iG = this.f45018d.G();
            i9 += iG + 10;
            interfaceC1673j.n(iG);
        }
        interfaceC1673j.f();
        interfaceC1673j.n(i9);
        if (this.f45022h == -1) {
            this.f45022h = i9;
        }
        return i9;
    }

    @Override // d3.InterfaceC1672i
    public void release() {
    }
}
