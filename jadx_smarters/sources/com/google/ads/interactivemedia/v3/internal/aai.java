package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class aai implements zh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f18642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f18643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f18644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f18645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f18646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f18647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f18648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f18649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f18650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f18651j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f18652k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f18653l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f18654m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f18655n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f18656o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f18657p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private zk f18658q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private aae f18659r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private aab f18660s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f18661t;

    static {
        aah aahVar = new zn() { // from class: com.google.ads.interactivemedia.v3.internal.aah
            @Override // com.google.ads.interactivemedia.v3.internal.zn
            public final zh[] a() {
                throw null;
            }
        };
        f18642a = new int[]{13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f18643b = iArr;
        f18644c = cq.ad("#!AMR\n");
        f18645d = cq.ad("#!AMR-WB\n");
        f18646e = iArr[8];
    }

    public aai() {
        this(null);
    }

    public aai(byte[] bArr) {
        this.f18648g = 0;
        this.f18647f = new byte[1];
        this.f18655n = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[Catch: EOFException -> 0x0095, TryCatch #0 {EOFException -> 0x0095, blocks: (B:4:0x0007, B:6:0x0018, B:20:0x0036, B:22:0x003f, B:21:0x003b, B:31:0x0061, B:32:0x007e, B:33:0x007f, B:34:0x0094), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b A[Catch: EOFException -> 0x0095, TryCatch #0 {EOFException -> 0x0095, blocks: (B:4:0x0007, B:6:0x0018, B:20:0x0036, B:22:0x003f, B:21:0x003b, B:31:0x0061, B:32:0x007e, B:33:0x007f, B:34:0x0094), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int f(com.google.ads.interactivemedia.v3.internal.zi r12) throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.f18652k
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L96
            r12.h()     // Catch: java.io.EOFException -> L95
            byte[] r0 = r11.f18647f     // Catch: java.io.EOFException -> L95
            r12.f(r0, r3, r2)     // Catch: java.io.EOFException -> L95
            byte[] r0 = r11.f18647f     // Catch: java.io.EOFException -> L95
            r0 = r0[r3]     // Catch: java.io.EOFException -> L95
            r4 = r0 & 131(0x83, float:1.84E-43)
            r5 = 0
            if (r4 > 0) goto L7f
            int r0 = r0 >> 3
            r0 = r0 & 15
            boolean r4 = r11.f18649h     // Catch: java.io.EOFException -> L95
            if (r4 == 0) goto L29
            r6 = 10
            if (r0 < r6) goto L34
            r6 = 13
            if (r0 <= r6) goto L29
            goto L34
        L29:
            if (r4 != 0) goto L5a
            r6 = 12
            if (r0 < r6) goto L34
            r6 = 14
            if (r0 > r6) goto L34
            goto L5a
        L34:
            if (r4 == 0) goto L3b
            int[] r4 = com.google.ads.interactivemedia.v3.internal.aai.f18643b     // Catch: java.io.EOFException -> L95
            r0 = r4[r0]     // Catch: java.io.EOFException -> L95
            goto L3f
        L3b:
            int[] r4 = com.google.ads.interactivemedia.v3.internal.aai.f18642a     // Catch: java.io.EOFException -> L95
            r0 = r4[r0]     // Catch: java.io.EOFException -> L95
        L3f:
            r11.f18651j = r0     // Catch: java.io.EOFException -> L95
            r11.f18652k = r0
            int r4 = r11.f18655n
            if (r4 != r1) goto L52
            long r4 = r12.d()
            r11.f18654m = r4
            int r0 = r11.f18651j
            r11.f18655n = r0
            r4 = r0
        L52:
            if (r4 != r0) goto L96
            int r0 = r11.f18656o
            int r0 = r0 + r2
            r11.f18656o = r0
            goto L96
        L5a:
            java.lang.String r12 = "WB"
            java.lang.String r3 = "NB"
            if (r2 == r4) goto L61
            r12 = r3
        L61:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L95
            r2.<init>()     // Catch: java.io.EOFException -> L95
            java.lang.String r3 = "Illegal AMR "
            r2.append(r3)     // Catch: java.io.EOFException -> L95
            r2.append(r12)     // Catch: java.io.EOFException -> L95
            java.lang.String r12 = " frame type "
            r2.append(r12)     // Catch: java.io.EOFException -> L95
            r2.append(r0)     // Catch: java.io.EOFException -> L95
            java.lang.String r12 = r2.toString()     // Catch: java.io.EOFException -> L95
            com.google.ads.interactivemedia.v3.internal.as r12 = com.google.ads.interactivemedia.v3.internal.as.a(r12, r5)     // Catch: java.io.EOFException -> L95
            throw r12     // Catch: java.io.EOFException -> L95
        L7f:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> L95
            r12.<init>()     // Catch: java.io.EOFException -> L95
            java.lang.String r2 = "Invalid padding bits for frame header "
            r12.append(r2)     // Catch: java.io.EOFException -> L95
            r12.append(r0)     // Catch: java.io.EOFException -> L95
            java.lang.String r12 = r12.toString()     // Catch: java.io.EOFException -> L95
            com.google.ads.interactivemedia.v3.internal.as r12 = com.google.ads.interactivemedia.v3.internal.as.a(r12, r5)     // Catch: java.io.EOFException -> L95
            throw r12     // Catch: java.io.EOFException -> L95
        L95:
            return r1
        L96:
            com.google.ads.interactivemedia.v3.internal.aae r0 = r11.f18659r
            int r4 = r11.f18652k
            int r12 = r0.a(r12, r4, r2)
            if (r12 != r1) goto La1
            return r1
        La1:
            int r0 = r11.f18652k
            int r0 = r0 - r12
            r11.f18652k = r0
            if (r0 <= 0) goto La9
            return r3
        La9:
            com.google.ads.interactivemedia.v3.internal.aae r4 = r11.f18659r
            long r0 = r11.f18657p
            long r5 = r11.f18650i
            long r5 = r5 + r0
            int r8 = r11.f18651j
            r9 = 0
            r10 = 0
            r7 = 1
            r4.f(r5, r7, r8, r9, r10)
            long r0 = r11.f18650i
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.f18650i = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.aai.f(com.google.ads.interactivemedia.v3.internal.zi):int");
    }

    private static boolean g(zi ziVar, byte[] bArr) throws IOException {
        ziVar.h();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        ziVar.f(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    private final boolean h(zi ziVar) throws IOException {
        int length;
        byte[] bArr = f18644c;
        if (g(ziVar, bArr)) {
            this.f18649h = false;
            length = bArr.length;
        } else {
            byte[] bArr2 = f18645d;
            if (!g(ziVar, bArr2)) {
                return false;
            }
            this.f18649h = true;
            length = bArr2.length;
        }
        ziVar.i(length);
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final boolean C(zi ziVar) throws IOException {
        return h(ziVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final int a(zi ziVar, zy zyVar) throws IOException {
        af.t(this.f18659r);
        int i9 = cq.f22640a;
        if (ziVar.d() == 0 && !h(ziVar)) {
            throw as.a("Could not find AMR header.", null);
        }
        if (!this.f18661t) {
            this.f18661t = true;
            boolean z9 = this.f18649h;
            String str = true != z9 ? "audio/3gpp" : "audio/amr-wb";
            int i10 = true != z9 ? 8000 : 16000;
            aae aaeVar = this.f18659r;
            r rVar = new r();
            rVar.ae(str);
            rVar.W(f18646e);
            rVar.H(1);
            rVar.af(i10);
            aaeVar.b(rVar.v());
        }
        int iF = f(ziVar);
        if (this.f18653l) {
            return iF;
        }
        aaa aaaVar = new aaa(-9223372036854775807L);
        this.f18660s = aaaVar;
        this.f18658q.x(aaaVar);
        this.f18653l = true;
        return iF;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void b(zk zkVar) {
        this.f18658q = zkVar;
        this.f18659r = zkVar.i(0, 1);
        zkVar.n();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void d(long j9, long j10) {
        this.f18650i = 0L;
        this.f18651j = 0;
        this.f18652k = 0;
        if (j9 != 0) {
            aab aabVar = this.f18660s;
            if (aabVar instanceof za) {
                this.f18657p = ((za) aabVar).B(j9);
                return;
            }
        }
        this.f18657p = 0L;
    }
}
