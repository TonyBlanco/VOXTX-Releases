package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class iy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final iy f23324a = new iy(new int[]{2});

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final avs f23325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f23326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f23327d;

    static {
        new iy(new int[]{2, 5, 6});
        avq avqVar = new avq();
        avqVar.a(5, 6);
        f23325b = avqVar.a(17, 6).a(7, 6).a(18, 6).a(6, 8).a(8, 8).a(14, 8).b();
    }

    public iy(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        this.f23326c = iArrCopyOf;
        Arrays.sort(iArrCopyOf);
        this.f23327d = 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair a(com.google.ads.interactivemedia.v3.internal.C1333s r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.f24467l
            com.google.ads.interactivemedia.v3.internal.af.s(r0)
            java.lang.String r1 = r10.f24464i
            int r0 = com.google.ads.interactivemedia.v3.internal.ar.a(r0, r1)
            com.google.ads.interactivemedia.v3.internal.avs r1 = com.google.ads.interactivemedia.v3.internal.iy.f23325b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            boolean r2 = r1.containsKey(r2)
            r3 = 0
            if (r2 != 0) goto L19
            return r3
        L19:
            r2 = 7
            r4 = 8
            r5 = 6
            r6 = 18
            if (r0 != r6) goto L2b
            boolean r0 = r9.c(r6)
            if (r0 != 0) goto L29
            r0 = 6
            goto L34
        L29:
            r0 = 18
        L2b:
            if (r0 != r4) goto L34
            boolean r7 = r9.c(r4)
            if (r7 != 0) goto L34
            r0 = 7
        L34:
            boolean r7 = r9.c(r0)
            if (r7 != 0) goto L3b
            return r3
        L3b:
            int r7 = r10.f24480y
            r8 = -1
            if (r7 == r8) goto L46
            if (r0 != r6) goto L43
            goto L46
        L43:
            if (r7 <= r4) goto L6e
            return r3
        L46:
            int r10 = r10.f24481z
            if (r10 != r8) goto L4d
            r10 = 48000(0xbb80, float:6.7262E-41)
        L4d:
            int r6 = com.google.ads.interactivemedia.v3.internal.cq.f22640a
            r7 = 29
            if (r6 < r7) goto L58
            int r7 = com.google.ads.interactivemedia.v3.internal.ix.a(r0, r10)
            goto L6e
        L58:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r6 = 0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r10 = r1.getOrDefault(r10, r6)
            java.lang.Integer r10 = (java.lang.Integer) r10
            com.google.ads.interactivemedia.v3.internal.af.s(r10)
            int r7 = r10.intValue()
        L6e:
            int r10 = com.google.ads.interactivemedia.v3.internal.cq.f22640a
            r1 = 28
            if (r10 > r1) goto L82
            if (r7 != r2) goto L77
            goto L83
        L77:
            r1 = 3
            if (r7 == r1) goto L80
            r1 = 4
            if (r7 == r1) goto L80
            r1 = 5
            if (r7 != r1) goto L82
        L80:
            r4 = 6
            goto L83
        L82:
            r4 = r7
        L83:
            r1 = 26
            if (r10 > r1) goto L95
            java.lang.String r10 = "fugu"
            java.lang.String r1 = com.google.ads.interactivemedia.v3.internal.cq.f22641b
            boolean r10 = r10.equals(r1)
            if (r10 == 0) goto L95
            r10 = 1
            if (r4 != r10) goto L95
            r4 = 2
        L95:
            int r10 = com.google.ads.interactivemedia.v3.internal.cq.f(r4)
            if (r10 != 0) goto L9c
            return r3
        L9c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            android.util.Pair r10 = android.util.Pair.create(r0, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.iy.a(com.google.ads.interactivemedia.v3.internal.s):android.util.Pair");
    }

    public final boolean c(int i9) {
        return Arrays.binarySearch(this.f23326c, i9) >= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iy) && Arrays.equals(this.f23326c, ((iy) obj).f23326c);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f23326c) * 31) + 8;
    }

    public final String toString() {
        return "AudioCapabilities[maxChannelCount=8, supportedEncodings=" + Arrays.toString(this.f23326c) + "]";
    }
}
