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
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: n3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2252e implements InterfaceC1672i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InterfaceC1678o f44997d = new InterfaceC1678o() { // from class: n3.d
        @Override // d3.InterfaceC1678o
        public /* synthetic */ InterfaceC1672i[] a(Uri uri, Map map) {
            return AbstractC1677n.a(this, uri, map);
        }

        @Override // d3.InterfaceC1678o
        public final InterfaceC1672i[] b() {
            return C2252e.e();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2253f f44998a = new C2253f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M f44999b = new M(Http2.INITIAL_MAX_FRAME_SIZE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45000c;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InterfaceC1672i[] e() {
        return new InterfaceC1672i[]{new C2252e()};
    }

    @Override // d3.InterfaceC1672i
    public void a(long j9, long j10) {
        this.f45000c = false;
        this.f44998a.c();
    }

    @Override // d3.InterfaceC1672i
    public void b(InterfaceC1674k interfaceC1674k) {
        this.f44998a.f(interfaceC1674k, new I.d(0, 1));
        interfaceC1674k.q();
        interfaceC1674k.n(new g.b(-9223372036854775807L));
    }

    @Override // d3.InterfaceC1672i
    public int d(InterfaceC1673j interfaceC1673j, d3.t tVar) {
        int i9 = interfaceC1673j.read(this.f44999b.e(), 0, Http2.INITIAL_MAX_FRAME_SIZE);
        if (i9 == -1) {
            return -1;
        }
        this.f44999b.U(0);
        this.f44999b.T(i9);
        if (!this.f45000c) {
            this.f44998a.e(0L, 4);
            this.f45000c = true;
        }
        this.f44998a.b(this.f44999b);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
    
        r9.f();
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0046, code lost:
    
        if ((r4 - r3) < 8192) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        return false;
     */
    @Override // d3.InterfaceC1672i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean h(d3.InterfaceC1673j r9) {
        /*
            r8 = this;
            d4.M r0 = new d4.M
            r1 = 10
            r0.<init>(r1)
            r2 = 0
            r3 = 0
        L9:
            byte[] r4 = r0.e()
            r9.s(r4, r2, r1)
            r0.U(r2)
            int r4 = r0.K()
            r5 = 4801587(0x494433, float:6.728456E-39)
            if (r4 == r5) goto L65
            r9.f()
            r9.n(r3)
            r4 = r3
        L23:
            r1 = 0
        L24:
            byte[] r5 = r0.e()
            r6 = 7
            r9.s(r5, r2, r6)
            r0.U(r2)
            int r5 = r0.N()
            r6 = 44096(0xac40, float:6.1792E-41)
            if (r5 == r6) goto L4d
            r6 = 44097(0xac41, float:6.1793E-41)
            if (r5 == r6) goto L4d
            r9.f()
            int r4 = r4 + 1
            int r1 = r4 - r3
            r5 = 8192(0x2000, float:1.148E-41)
            if (r1 < r5) goto L49
            return r2
        L49:
            r9.n(r4)
            goto L23
        L4d:
            r6 = 1
            int r1 = r1 + r6
            r7 = 4
            if (r1 < r7) goto L53
            return r6
        L53:
            byte[] r6 = r0.e()
            int r5 = Q2.AbstractC1017c.e(r6, r5)
            r6 = -1
            if (r5 != r6) goto L5f
            return r2
        L5f:
            int r5 = r5 + (-7)
            r9.n(r5)
            goto L24
        L65:
            r4 = 3
            r0.V(r4)
            int r4 = r0.G()
            int r5 = r4 + 10
            int r3 = r3 + r5
            r9.n(r4)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.C2252e.h(d3.j):boolean");
    }

    @Override // d3.InterfaceC1672i
    public void release() {
    }
}
