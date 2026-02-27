package B3;

import d3.InterfaceC1672i;
import d3.InterfaceC1673j;
import d3.InterfaceC1678o;
import d4.AbstractC1684a;
import k3.C2143f;

/* JADX INFO: renamed from: B3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0495c implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1678o f499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC1672i f500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1673j f501c;

    public C0495c(InterfaceC1678o interfaceC1678o) {
        this.f499a = interfaceC1678o;
    }

    @Override // B3.M
    public void a(long j9, long j10) {
        ((InterfaceC1672i) AbstractC1684a.e(this.f500b)).a(j9, j10);
    }

    @Override // B3.M
    public void b() {
        InterfaceC1672i interfaceC1672i = this.f500b;
        if (interfaceC1672i instanceof C2143f) {
            ((C2143f) interfaceC1672i).j();
        }
    }

    @Override // B3.M
    public int c(d3.t tVar) {
        return ((InterfaceC1672i) AbstractC1684a.e(this.f500b)).d((InterfaceC1673j) AbstractC1684a.e(this.f501c), tVar);
    }

    @Override // B3.M
    public long d() {
        InterfaceC1673j interfaceC1673j = this.f501c;
        if (interfaceC1673j != null) {
            return interfaceC1673j.getPosition();
        }
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    @Override // B3.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(b4.InterfaceC1220k r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, d3.InterfaceC1674k r15) throws B3.j0 {
        /*
            r7 = this;
            d3.c r6 = new d3.c
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f501c = r6
            d3.i r8 = r7.f500b
            if (r8 == 0) goto L10
            return
        L10:
            d3.o r8 = r7.f499a
            d3.i[] r8 = r8.a(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L20
            r8 = r8[r13]
            r7.f500b = r8
            goto L78
        L20:
            int r10 = r8.length
            r0 = 0
        L22:
            if (r0 >= r10) goto L74
            r1 = r8[r0]
            boolean r2 = r1.h(r6)     // Catch: java.lang.Throwable -> L35 java.io.EOFException -> L37
            if (r2 == 0) goto L39
            r7.f500b = r1     // Catch: java.lang.Throwable -> L35 java.io.EOFException -> L37
            d4.AbstractC1684a.g(r14)
            r6.f()
            goto L74
        L35:
            r8 = move-exception
            goto L50
        L37:
            goto L64
        L39:
            d3.i r1 = r7.f500b
            if (r1 != 0) goto L48
            long r1 = r6.getPosition()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L46
            goto L48
        L46:
            r1 = 0
            goto L49
        L48:
            r1 = 1
        L49:
            d4.AbstractC1684a.g(r1)
            r6.f()
            goto L71
        L50:
            d3.i r9 = r7.f500b
            if (r9 != 0) goto L5c
            long r9 = r6.getPosition()
            int r15 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r15 != 0) goto L5d
        L5c:
            r13 = 1
        L5d:
            d4.AbstractC1684a.g(r13)
            r6.f()
            throw r8
        L64:
            d3.i r1 = r7.f500b
            if (r1 != 0) goto L48
            long r1 = r6.getPosition()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 != 0) goto L46
            goto L48
        L71:
            int r0 = r0 + 1
            goto L22
        L74:
            d3.i r10 = r7.f500b
            if (r10 == 0) goto L7e
        L78:
            d3.i r8 = r7.f500b
            r8.b(r15)
            return
        L7e:
            B3.j0 r10 = new B3.j0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            java.lang.String r8 = d4.k0.O(r8)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            java.lang.Object r9 = d4.AbstractC1684a.e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.C0495c.e(b4.k, android.net.Uri, java.util.Map, long, long, d3.k):void");
    }

    @Override // B3.M
    public void release() {
        InterfaceC1672i interfaceC1672i = this.f500b;
        if (interfaceC1672i != null) {
            interfaceC1672i.release();
            this.f500b = null;
        }
        this.f501c = null;
    }
}
