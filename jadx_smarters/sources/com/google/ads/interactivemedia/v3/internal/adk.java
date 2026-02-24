package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes3.dex */
public final class adk implements zh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final adl f19100a = new adl(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final cj f19101b = new cj(Http2.INITIAL_MAX_FRAME_SIZE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19102c;

    static {
        adj adjVar = adj.f19094a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        r17.h();
        r7 = r7 + (r2 ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if ((r7 - r6) < 8192) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004c, code lost:
    
        return false;
     */
    @Override // com.google.ads.interactivemedia.v3.internal.zh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C(com.google.ads.interactivemedia.v3.internal.zi r17) throws java.io.IOException {
        /*
            r16 = this;
            r0 = r17
            r1 = 2
            r2 = 1
            com.google.ads.interactivemedia.v3.internal.cj r3 = new com.google.ads.interactivemedia.v3.internal.cj
            r4 = 10
            r3.<init>(r4)
            r5 = 0
            r6 = 0
        Ld:
            byte[] r7 = r3.H()
            r0.f(r7, r5, r4)
            r3.F(r5)
            int r7 = r3.k()
            r8 = 4801587(0x494433, float:6.728456E-39)
            r9 = 3
            if (r7 == r8) goto L96
            r17.h()
            r0.e(r6)
            r7 = r6
        L28:
            r4 = 0
        L29:
            byte[] r8 = r3.H()
            r10 = 7
            r0.f(r8, r5, r10)
            r3.F(r5)
            int r8 = r3.m()
            r11 = 44096(0xac40, float:6.1792E-41)
            r12 = 44097(0xac41, float:6.1793E-41)
            if (r8 == r11) goto L51
            if (r8 == r12) goto L51
            r17.h()
            int r7 = r7 + r2
            int r4 = r7 - r6
            r8 = 8192(0x2000, float:1.148E-41)
            if (r4 < r8) goto L4d
            return r5
        L4d:
            r0.e(r7)
            goto L28
        L51:
            int r4 = r4 + r2
            r11 = 4
            if (r4 < r11) goto L56
            return r2
        L56:
            byte[] r13 = r3.H()
            int r14 = com.google.ads.interactivemedia.v3.internal.yq.f25194a
            int r14 = r13.length
            r15 = -1
            if (r14 >= r10) goto L62
            r2 = -1
            goto L8c
        L62:
            r14 = r13[r1]
            r14 = r14 & 255(0xff, float:3.57E-43)
            int r14 = r14 << 8
            r2 = r13[r9]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r14
            r14 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r14) goto L87
            r2 = r13[r11]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            r11 = 5
            r11 = r13[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 8
            r2 = r2 | r11
            r11 = 6
            r11 = r13[r11]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r2 = r2 | r11
            goto L88
        L87:
            r10 = 4
        L88:
            if (r8 != r12) goto L8b
            int r10 = r10 + r1
        L8b:
            int r2 = r2 + r10
        L8c:
            if (r2 != r15) goto L8f
            return r5
        L8f:
            int r2 = r2 + (-7)
            r0.e(r2)
            r2 = 1
            goto L29
        L96:
            r3.G(r9)
            int r2 = r3.h()
            int r7 = r2 + 10
            int r6 = r6 + r7
            r0.e(r2)
            r2 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.adk.C(com.google.ads.interactivemedia.v3.internal.zi):boolean");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final int a(zi ziVar, zy zyVar) throws IOException {
        int iA = ziVar.a(this.f19101b.H(), 0, Http2.INITIAL_MAX_FRAME_SIZE);
        if (iA == -1) {
            return -1;
        }
        this.f19101b.F(0);
        this.f19101b.E(iA);
        if (!this.f19102c) {
            this.f19100a.d(0L, 4);
            this.f19102c = true;
        }
        this.f19100a.a(this.f19101b);
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void b(zk zkVar) {
        this.f19100a.b(zkVar, new aet(0, 1));
        zkVar.n();
        zkVar.x(new aaa(-9223372036854775807L));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void d(long j9, long j10) {
        this.f19102c = false;
        this.f19100a.e();
    }
}
