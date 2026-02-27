package n3;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.g;
import d3.AbstractC1677n;
import d3.InterfaceC1672i;
import d3.InterfaceC1673j;
import d3.InterfaceC1674k;
import d3.InterfaceC1678o;
import d4.M;
import java.util.Map;
import n3.I;

/* JADX INFO: renamed from: n3.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2249b implements InterfaceC1672i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InterfaceC1678o f44981d = new InterfaceC1678o() { // from class: n3.a
        @Override // d3.InterfaceC1678o
        public /* synthetic */ InterfaceC1672i[] a(Uri uri, Map map) {
            return AbstractC1677n.a(this, uri, map);
        }

        @Override // d3.InterfaceC1678o
        public final InterfaceC1672i[] b() {
            return C2249b.e();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2250c f44982a = new C2250c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f44983b = new M(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44984c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC1672i[] e() {
        return new InterfaceC1672i[]{new C2249b()};
    }

    @Override // d3.InterfaceC1672i
    public void a(long j9, long j10) {
        this.f44984c = false;
        this.f44982a.c();
    }

    @Override // d3.InterfaceC1672i
    public void b(InterfaceC1674k interfaceC1674k) {
        this.f44982a.f(interfaceC1674k, new I.d(0, 1));
        interfaceC1674k.q();
        interfaceC1674k.n(new g.b(-9223372036854775807L));
    }

    @Override // d3.InterfaceC1672i
    public int d(InterfaceC1673j interfaceC1673j, d3.t tVar) {
        int i9 = interfaceC1673j.read(this.f44983b.e(), 0, 2786);
        if (i9 == -1) {
            return -1;
        }
        this.f44983b.U(0);
        this.f44983b.T(i9);
        if (!this.f44984c) {
            this.f44982a.e(0L, 4);
            this.f44984c = true;
        }
        this.f44982a.b(this.f44983b);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
    
        if ((r4 - r3) < 8192) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        r8.f();
        r4 = r4 + 1;
     */
    @Override // d3.InterfaceC1672i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean h(d3.InterfaceC1673j r8) {
        /*
            r7 = this;
            d4.M r0 = new d4.M
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.e()
            r8.s(r4, r2, r1)
            r0.U(r2)
            int r4 = r0.K()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L5f
            r8.f()
            r8.n(r3)
            r4 = r3
        L23:
            r1 = 0
        L24:
            byte[] r5 = r0.e()
            r6 = 6
            r8.s(r5, r2, r6)
            r0.U(r2)
            int r5 = r0.N()
            r6 = 2935(0xb77, float:4.113E-42)
            if (r5 == r6) goto L47
            r8.f()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.148E-41)
            if (r1 < r5) goto L43
            return r2
        L43:
            r8.n(r4)
            goto L23
        L47:
            r5 = 1
            int r1 = r1 + r5
            r6 = 4
            if (r1 < r6) goto L4d
            return r5
        L4d:
            byte[] r5 = r0.e()
            int r5 = Q2.AbstractC1016b.g(r5)
            r6 = -1
            if (r5 != r6) goto L59
            return r2
        L59:
            int r5 = r5 + (-6)
            r8.n(r5)
            goto L24
        L5f:
            r4 = 3
            r0.V(r4)
            int r4 = r0.G()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r8.n(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.C2249b.h(d3.j):boolean");
    }

    @Override // d3.InterfaceC1672i
    public void release() {
    }
}
