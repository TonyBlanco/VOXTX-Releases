package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class adu {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f19190d = {0, 0, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f19193c = new byte[128];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f19194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19195f;

    public final void a(byte[] bArr, int i9, int i10) {
        if (this.f19194e) {
            int i11 = i10 - i9;
            byte[] bArr2 = this.f19193c;
            int length = bArr2.length;
            int i12 = this.f19191a + i11;
            if (length < i12) {
                this.f19193c = Arrays.copyOf(bArr2, i12 + i12);
            }
            System.arraycopy(bArr, i9, this.f19193c, this.f19191a, i11);
            this.f19191a += i11;
        }
    }

    public final void b() {
        this.f19194e = false;
        this.f19191a = 0;
        this.f19195f = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(int r9, int r10) {
        /*
            r8 = this;
            int r0 = r8.f19195f
            r1 = 0
            r2 = 3
            r3 = 1
            if (r0 == 0) goto L45
            r4 = 181(0xb5, float:2.54E-43)
            r5 = 2
            java.lang.String r6 = "Unexpected start code value"
            java.lang.String r7 = "H263Reader"
            if (r0 == r3) goto L3f
            if (r0 == r5) goto L37
            if (r0 == r2) goto L22
            r0 = 179(0xb3, float:2.51E-43)
            if (r9 == r0) goto L1a
            if (r9 != r4) goto L4d
        L1a:
            int r9 = r8.f19191a
            int r9 = r9 - r10
            r8.f19191a = r9
            r8.f19194e = r1
            return r3
        L22:
            r9 = r9 & 240(0xf0, float:3.36E-43)
            r10 = 32
            if (r9 == r10) goto L2f
        L28:
            com.google.ads.interactivemedia.v3.internal.cd.e(r7, r6)
            r8.b()
            goto L4d
        L2f:
            int r9 = r8.f19191a
            r8.f19192b = r9
            r9 = 4
            r8.f19195f = r9
            goto L4d
        L37:
            r10 = 31
            if (r9 <= r10) goto L3c
            goto L28
        L3c:
            r8.f19195f = r2
            goto L4d
        L3f:
            if (r9 == r4) goto L42
            goto L28
        L42:
            r8.f19195f = r5
            goto L4d
        L45:
            r10 = 176(0xb0, float:2.47E-43)
            if (r9 != r10) goto L4d
            r8.f19195f = r3
            r8.f19194e = r3
        L4d:
            byte[] r9 = com.google.ads.interactivemedia.v3.internal.adu.f19190d
            r8.a(r9, r1, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.adu.c(int, int):boolean");
    }
}
