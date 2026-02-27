package Q2;

import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f7761a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f7762b = {44100, 48000, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f7763c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f7764d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f7765e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f7766f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f7767g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f7768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f7769b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f7770c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7771d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7772e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f7773f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f7774g;

        /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean a(int r9) {
            /*
                r8 = this;
                boolean r0 = Q2.b0.a(r9)
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                int r0 = r9 >>> 19
                r2 = 3
                r0 = r0 & r2
                r3 = 1
                if (r0 != r3) goto L10
                return r1
            L10:
                int r4 = r9 >>> 17
                r4 = r4 & r2
                if (r4 != 0) goto L16
                return r1
            L16:
                int r5 = r9 >>> 12
                r6 = 15
                r5 = r5 & r6
                if (r5 == 0) goto Lac
                if (r5 != r6) goto L21
                goto Lac
            L21:
                int r6 = r9 >>> 10
                r6 = r6 & r2
                if (r6 != r2) goto L27
                return r1
            L27:
                r8.f7768a = r0
                java.lang.String[] r1 = Q2.b0.b()
                int r7 = 3 - r4
                r1 = r1[r7]
                r8.f7769b = r1
                int[] r1 = Q2.b0.c()
                r1 = r1[r6]
                r8.f7771d = r1
                r6 = 2
                if (r0 != r6) goto L42
                int r1 = r1 / r6
            L3f:
                r8.f7771d = r1
                goto L47
            L42:
                if (r0 != 0) goto L47
                int r1 = r1 / 4
                goto L3f
            L47:
                int r1 = r9 >>> 9
                r1 = r1 & r3
                int r7 = Q2.b0.d(r0, r4)
                r8.f7774g = r7
                if (r4 != r2) goto L70
                if (r0 != r2) goto L5c
                int[] r0 = Q2.b0.e()
                int r5 = r5 - r3
                r0 = r0[r5]
                goto L63
            L5c:
                int[] r0 = Q2.b0.f()
                int r5 = r5 - r3
                r0 = r0[r5]
            L63:
                r8.f7773f = r0
                int r0 = r0 * 12
                int r4 = r8.f7771d
                int r0 = r0 / r4
                int r0 = r0 + r1
                int r0 = r0 * 4
            L6d:
                r8.f7770c = r0
                goto La3
            L70:
                r7 = 144(0x90, float:2.02E-43)
                if (r0 != r2) goto L8e
                if (r4 != r6) goto L7e
                int[] r0 = Q2.b0.g()
                int r5 = r5 - r3
                r0 = r0[r5]
                goto L85
            L7e:
                int[] r0 = Q2.b0.h()
                int r5 = r5 - r3
                r0 = r0[r5]
            L85:
                r8.f7773f = r0
                int r0 = r0 * 144
                int r4 = r8.f7771d
                int r0 = r0 / r4
                int r0 = r0 + r1
                goto L6d
            L8e:
                int[] r0 = Q2.b0.i()
                int r5 = r5 - r3
                r0 = r0[r5]
                r8.f7773f = r0
                if (r4 != r3) goto L9b
                r7 = 72
            L9b:
                int r7 = r7 * r0
                int r0 = r8.f7771d
                int r7 = r7 / r0
                int r7 = r7 + r1
                r8.f7770c = r7
            La3:
                int r9 = r9 >> 6
                r9 = r9 & r2
                if (r9 != r2) goto La9
                r6 = 1
            La9:
                r8.f7772e = r6
                return r3
            Lac:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: Q2.b0.a.a(int):boolean");
        }
    }

    public static int j(int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        if (!l(i9) || (i10 = (i9 >>> 19) & 3) == 1 || (i11 = (i9 >>> 17) & 3) == 0 || (i12 = (i9 >>> 12) & 15) == 0 || i12 == 15 || (i13 = (i9 >>> 10) & 3) == 3) {
            return -1;
        }
        int i14 = f7762b[i13];
        if (i10 == 2) {
            i14 /= 2;
        } else if (i10 == 0) {
            i14 /= 4;
        }
        int i15 = (i9 >>> 9) & 1;
        if (i11 == 3) {
            return ((((i10 == 3 ? f7763c[i12 - 1] : f7764d[i12 - 1]) * 12) / i14) + i15) * 4;
        }
        int i16 = i10 == 3 ? i11 == 2 ? f7765e[i12 - 1] : f7766f[i12 - 1] : f7767g[i12 - 1];
        int i17 = IjkMediaMeta.FF_PROFILE_H264_HIGH_444;
        if (i10 == 3) {
            return ((i16 * IjkMediaMeta.FF_PROFILE_H264_HIGH_444) / i14) + i15;
        }
        if (i11 == 1) {
            i17 = 72;
        }
        return ((i17 * i16) / i14) + i15;
    }

    public static int k(int i9, int i10) {
        if (i10 == 1) {
            return i9 == 3 ? 1152 : 576;
        }
        if (i10 == 2) {
            return 1152;
        }
        if (i10 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    public static boolean l(int i9) {
        return (i9 & (-2097152)) == -2097152;
    }

    public static int m(int i9) {
        int i10;
        int i11;
        if (!l(i9) || (i10 = (i9 >>> 19) & 3) == 1 || (i11 = (i9 >>> 17) & 3) == 0) {
            return -1;
        }
        int i12 = (i9 >>> 12) & 15;
        int i13 = (i9 >>> 10) & 3;
        if (i12 == 0 || i12 == 15 || i13 == 3) {
            return -1;
        }
        return k(i10, i11);
    }
}
