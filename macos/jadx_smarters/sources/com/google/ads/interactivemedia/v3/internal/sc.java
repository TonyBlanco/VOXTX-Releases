package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class sc implements tl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zn f24489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private zh f24490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private zi f24491c;

    public sc(zn znVar) {
        this.f24489a = znVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tl
    public final int a(zy zyVar) throws IOException {
        zh zhVar = this.f24490b;
        af.s(zhVar);
        zi ziVar = this.f24491c;
        af.s(ziVar);
        return zhVar.a(ziVar, zyVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tl
    public final long b() {
        zi ziVar = this.f24491c;
        if (ziVar != null) {
            return ziVar.d();
        }
        return -1L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tl
    public final void c() {
        zh zhVar = this.f24490b;
        if (zhVar instanceof aby) {
            ((aby) zhVar).f();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0044  */
    @Override // com.google.ads.interactivemedia.v3.internal.tl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(com.google.ads.interactivemedia.v3.internal.InterfaceC1310k r7, android.net.Uri r8, java.util.Map r9, long r10, long r12, com.google.ads.interactivemedia.v3.internal.zk r14) throws java.io.IOException {
        /*
            r6 = this;
            com.google.ads.interactivemedia.v3.internal.zb r8 = new com.google.ads.interactivemedia.v3.internal.zb
            r0 = r8
            r1 = r7
            r2 = r10
            r4 = r12
            r0.<init>(r1, r2, r4)
            r6.f24491c = r8
            com.google.ads.interactivemedia.v3.internal.zh r7 = r6.f24490b
            if (r7 == 0) goto L10
            return
        L10:
            com.google.ads.interactivemedia.v3.internal.zn r7 = r6.f24489a
            com.google.ads.interactivemedia.v3.internal.zh[] r7 = com.google.ads.interactivemedia.v3.internal.zm.a(r7)
            int r9 = r7.length
            r12 = 0
            r13 = 1
            if (r9 != r13) goto L20
            r7 = r7[r12]
            r6.f24490b = r7
            goto L76
        L20:
            r0 = 0
        L21:
            if (r0 >= r9) goto L72
            r1 = r7[r0]
            boolean r2 = r1.C(r8)     // Catch: java.lang.Throwable -> L34 java.io.EOFException -> L36
            if (r2 == 0) goto L38
            r6.f24490b = r1     // Catch: java.lang.Throwable -> L34 java.io.EOFException -> L36
            com.google.ads.interactivemedia.v3.internal.af.w(r13)
            r8.h()
            goto L72
        L34:
            r7 = move-exception
            goto L4e
        L36:
            goto L62
        L38:
            com.google.ads.interactivemedia.v3.internal.zh r1 = r6.f24490b
            if (r1 != 0) goto L44
            long r1 = r8.d()
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 != 0) goto L46
        L44:
            r1 = 1
            goto L47
        L46:
            r1 = 0
        L47:
            com.google.ads.interactivemedia.v3.internal.af.w(r1)
            r8.h()
            goto L6f
        L4e:
            com.google.ads.interactivemedia.v3.internal.zh r9 = r6.f24490b
            if (r9 != 0) goto L5a
            long r0 = r8.d()
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 != 0) goto L5b
        L5a:
            r12 = 1
        L5b:
            com.google.ads.interactivemedia.v3.internal.af.w(r12)
            r8.h()
            throw r7
        L62:
            com.google.ads.interactivemedia.v3.internal.zh r1 = r6.f24490b
            if (r1 != 0) goto L44
            long r1 = r8.d()
            int r3 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r3 != 0) goto L46
            goto L44
        L6f:
            int r0 = r0 + 1
            goto L21
        L72:
            com.google.ads.interactivemedia.v3.internal.zh r8 = r6.f24490b
            if (r8 == 0) goto L7c
        L76:
            com.google.ads.interactivemedia.v3.internal.zh r7 = r6.f24490b
            r7.b(r14)
            return
        L7c:
            com.google.ads.interactivemedia.v3.internal.un r8 = new com.google.ads.interactivemedia.v3.internal.un
            java.lang.String r7 = com.google.ads.interactivemedia.v3.internal.cq.L(r7)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "None of the available extractors ("
            r9.append(r10)
            r9.append(r7)
            java.lang.String r7 = ") could read the stream."
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r8.<init>(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.sc.d(com.google.ads.interactivemedia.v3.internal.k, android.net.Uri, java.util.Map, long, long, com.google.ads.interactivemedia.v3.internal.zk):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tl
    public final void e() {
        if (this.f24490b != null) {
            this.f24490b = null;
        }
        this.f24491c = null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tl
    public final void f(long j9, long j10) {
        zh zhVar = this.f24490b;
        af.s(zhVar);
        zhVar.d(j9, j10);
    }
}
