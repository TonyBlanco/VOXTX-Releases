package l3;

import d4.k0;
import okio.Segment;

/* JADX INFO: renamed from: l3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2179d {

    /* JADX INFO: renamed from: l3.d$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f43929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f43930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f43931c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long[] f43932d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f43933e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f43934f;

        public b(long[] jArr, int[] iArr, int i9, long[] jArr2, int[] iArr2, long j9) {
            this.f43929a = jArr;
            this.f43930b = iArr;
            this.f43931c = i9;
            this.f43932d = jArr2;
            this.f43933e = iArr2;
            this.f43934f = j9;
        }
    }

    public static b a(int i9, long[] jArr, int[] iArr, long j9) {
        int i10 = Segment.SIZE / i9;
        int iL = 0;
        for (int i11 : iArr) {
            iL += k0.l(i11, i10);
        }
        long[] jArr2 = new long[iL];
        int[] iArr2 = new int[iL];
        long[] jArr3 = new long[iL];
        int[] iArr3 = new int[iL];
        int i12 = 0;
        int i13 = 0;
        int iMax = 0;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            long j10 = jArr[i14];
            while (i15 > 0) {
                int iMin = Math.min(i10, i15);
                jArr2[i13] = j10;
                int i16 = i9 * iMin;
                iArr2[i13] = i16;
                iMax = Math.max(iMax, i16);
                jArr3[i13] = ((long) i12) * j9;
                iArr3[i13] = 1;
                j10 += (long) iArr2[i13];
                i12 += iMin;
                i15 -= iMin;
                i13++;
            }
        }
        return new b(jArr2, iArr2, iMax, jArr3, iArr3, j9 * ((long) i12));
    }
}
