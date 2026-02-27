package Z2;

import C3.b;
import C3.n;
import O2.Q1;
import a4.InterfaceC1088b;
import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import b4.C1221l;
import b4.C1227s;
import b4.r;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdPodInfo;
import com.google.ads.interactivemedia.v3.api.AdsLoader;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import d4.AbstractC1684a;
import d4.k0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import s5.AbstractC2743y;
import v5.AbstractC2882b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f11057a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f11058b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f11059c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f11060d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f11061e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f11062f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Boolean f11063g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f11064h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Set f11065i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Collection f11066j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final AdErrorEvent.AdErrorListener f11067k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final AdEvent.AdEventListener f11068l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final VideoAdPlayer.VideoAdPlayerCallback f11069m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final ImaSdkSettings f11070n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f11071o;

        public a(long j9, int i9, int i10, boolean z9, boolean z10, int i11, Boolean bool, List list, Set set, Collection collection, AdErrorEvent.AdErrorListener adErrorListener, AdEvent.AdEventListener adEventListener, VideoAdPlayer.VideoAdPlayerCallback videoAdPlayerCallback, ImaSdkSettings imaSdkSettings, boolean z11) {
            this.f11057a = j9;
            this.f11058b = i9;
            this.f11059c = i10;
            this.f11060d = z9;
            this.f11061e = z10;
            this.f11062f = i11;
            this.f11063g = bool;
            this.f11064h = list;
            this.f11065i = set;
            this.f11066j = collection;
            this.f11067k = adErrorListener;
            this.f11068l = adEventListener;
            this.f11069m = videoAdPlayerCallback;
            this.f11070n = imaSdkSettings;
            this.f11071o = z11;
        }
    }

    public interface b {
        AdsLoader a(Context context, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer);

        AdDisplayContainer b(ViewGroup viewGroup, VideoAdPlayer videoAdPlayer);

        ImaSdkSettings c();

        FriendlyObstruction d(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str);

        AdsRenderingSettings e();

        AdsRequest f();

        AdDisplayContainer g(Context context, VideoAdPlayer videoAdPlayer);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC1088b f11072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ImaSdkSettings f11073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AdEvent.AdEventListener f11074c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AdErrorEvent.AdErrorListener f11075d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AbstractC2743y f11076e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f11077f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f11078g;

        public c(InterfaceC1088b interfaceC1088b, ImaSdkSettings imaSdkSettings, AdEvent.AdEventListener adEventListener, AdErrorEvent.AdErrorListener adErrorListener, List list, boolean z9, boolean z10) {
            this.f11073b = imaSdkSettings;
            this.f11072a = interfaceC1088b;
            this.f11074c = adEventListener;
            this.f11075d = adErrorListener;
            this.f11076e = AbstractC2743y.r(list);
            this.f11077f = z9;
            this.f11078g = z10;
        }
    }

    public static C3.b a(long j9, long j10, int i9, long j11, int i10, C3.b bVar) {
        C3.b bVarZ = bVar;
        AbstractC1684a.a(i9 > 0);
        long jF = n.f(j9, -1, bVarZ);
        int iG = bVarZ.g(jF, -9223372036854775807L);
        if (iG == -1) {
            long[] jArrV = v(new long[i10 - (i9 - 1)], 0, j10, j11);
            C3.b bVarA = n.a(bVar, j9, k0.n1(jArrV), jArrV);
            int iG2 = bVarA.g(jF, -9223372036854775807L);
            return iG2 != -1 ? bVarA.r(iG2, 0).z(iG2, i10) : bVarA;
        }
        b.C0010b c0010bE = bVarZ.e(iG);
        long[] jArrCopyOf = Arrays.copyOf(c0010bE.f1063g, c0010bE.f1059c);
        int iJ = j(c0010bE);
        if (c0010bE.f1060d < i10 || iJ == c0010bE.f1059c) {
            int i11 = iJ + 1;
            int iMax = Math.max(i10, i11);
            bVarZ = bVarZ.l(iG, iMax).z(iG, iMax);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, iMax);
            jArrCopyOf[iJ] = j11;
            Arrays.fill(jArrCopyOf, i11, iMax, 0L);
        }
        v(jArrCopyOf, iJ, j10, Math.max(j10, jArrCopyOf[iJ]));
        return bVarZ.m(iG, jArrCopyOf).r(iG, iJ).u(iG, k0.n1(jArrCopyOf));
    }

    public static C3.b b(int i9, long j9, int i10, long j10, int i11, C3.b bVar) {
        AbstractC1684a.a(i10 < i11);
        long[] jArrV = v(new long[i11], i10, j10, j9);
        return bVar.l(i9, jArrV.length).m(i9, jArrV);
    }

    public static Pair c(int i9, int i10, Q1 q12, C3.b bVar) {
        Q1.d dVarS = q12.s(i9, new Q1.d());
        AbstractC1684a.a(dVarS.i());
        Q1.b bVar2 = new Q1.b();
        q12.l(i10, bVar2, true);
        long jL = l(dVarS.f5749g, dVarS.f5760r) + bVar2.f5720f;
        int iG = bVar.g(jL, -9223372036854775807L);
        if (iG != -1) {
            b.C0010b c0010bE = bVar.e(iG);
            int i11 = 0;
            while (true) {
                int[] iArr = c0010bE.f1062f;
                if (i11 >= iArr.length) {
                    break;
                }
                int i12 = iArr[i11];
                if (i12 == 1 || i12 == 0) {
                    break;
                }
                i11++;
            }
            return new Pair(Integer.valueOf(iG), Integer.valueOf(i11));
        }
        throw new IllegalStateException(String.format("No unplayed ad group found before or at the start time us %d of the period with index %d", Long.valueOf(jL), Integer.valueOf(i10)));
    }

    public static Pair d(int i9, C3.b bVar, Q1 q12) {
        int i10;
        C3.b bVar2 = bVar;
        Q1 q13 = q12;
        Q1.d dVarS = q13.s(0, new Q1.d());
        AbstractC1684a.a(q12.u() == 1);
        long jL = dVarS.i() ? l(dVarS.f5749g, dVarS.f5760r) - dVarS.f5760r : 0L;
        Q1.b bVar3 = new Q1.b();
        int i11 = bVar2.f1047f;
        int i12 = 0;
        while (i11 < bVar2.f1044c) {
            b.C0010b c0010bE = bVar2.e(i11);
            long jN1 = k0.n1(c0010bE.f1063g);
            int i13 = i12;
            long j9 = 0;
            int i14 = 0;
            while (true) {
                if (i12 >= Math.min(q12.n(), i9 + 1)) {
                    i10 = i11;
                    break;
                }
                q13.l(i12, bVar3, true);
                i10 = i11;
                long j10 = c0010bE.f1058a;
                if (jL >= j10) {
                    long j11 = bVar3.f5719e;
                    if (jL + j9 + j11 > j10 + jN1) {
                        jL += Math.min(j9, c0010bE.f1064h);
                        break;
                    }
                    if (i12 == i9) {
                        return new Pair(Integer.valueOf(i10), Integer.valueOf(i14));
                    }
                    j9 += j11;
                    i14++;
                } else {
                    jL += bVar3.f5719e;
                }
                i13++;
                i12++;
                q13 = q12;
                i11 = i10;
            }
            i11 = i10 + 1;
            bVar2 = bVar;
            q13 = q12;
            i12 = i13;
        }
        throw new IllegalStateException();
    }

    public static long e(Q1 q12, AdPodInfo adPodInfo, int i9, Q1.d dVar, Q1.b bVar) {
        long j9;
        q12.k(i9, bVar);
        q12.s(bVar.f5718d, dVar);
        AbstractC1684a.a(dVar.i());
        int adPosition = i9 - (adPodInfo.getAdPosition() - 1);
        int totalAds = i9 + ((adPodInfo.getTotalAds() - r11) - 1);
        if (dVar.f5758p > adPosition || totalAds >= dVar.f5759q) {
            j9 = -9223372036854775807L;
            break;
        }
        Q1.b bVar2 = new Q1.b();
        j9 = 0;
        while (adPosition <= totalAds) {
            long j10 = q12.k(adPosition, bVar2).f5719e;
            if (j10 == -9223372036854775807L) {
                j9 = -9223372036854775807L;
                break;
            }
            j9 += j10;
            adPosition++;
        }
        return j9 != -9223372036854775807L ? j9 : r(adPodInfo.getMaxDuration());
    }

    public static long[] f(List list) {
        if (list.isEmpty()) {
            return new long[]{0};
        }
        int size = list.size();
        long[] jArr = new long[size];
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            double dFloatValue = ((Float) list.get(i10)).floatValue();
            if (dFloatValue == -1.0d) {
                jArr[size - 1] = Long.MIN_VALUE;
            } else {
                jArr[i9] = Math.round(dFloatValue * 1000000.0d);
                i9++;
            }
        }
        Arrays.sort(jArr, 0, i9);
        return jArr;
    }

    public static AdsRequest g(b bVar, C1227s c1227s) {
        AdsRequest adsRequestF = bVar.f();
        if ("data".equals(c1227s.f17598a.getScheme())) {
            C1221l c1221l = new C1221l();
            try {
                c1221l.a(c1227s);
                k0.E(r.b(c1221l));
            } finally {
                c1221l.close();
            }
        } else {
            c1227s.f17598a.toString();
        }
        return adsRequestF;
    }

    public static FriendlyObstructionPurpose h(int i9) {
        return i9 != 1 ? i9 != 2 ? i9 != 4 ? FriendlyObstructionPurpose.OTHER : FriendlyObstructionPurpose.NOT_VISIBLE : FriendlyObstructionPurpose.CLOSE_AD : FriendlyObstructionPurpose.VIDEO_CONTROLS;
    }

    public static Looper i() {
        return Looper.getMainLooper();
    }

    public static int j(b.C0010b c0010b) {
        int i9 = 0;
        while (true) {
            int[] iArr = c0010b.f1062f;
            if (i9 >= iArr.length) {
                return iArr.length;
            }
            if (iArr[i9] == 0) {
                return i9;
            }
            i9++;
        }
    }

    public static String k(VideoProgressUpdate videoProgressUpdate) {
        return VideoProgressUpdate.VIDEO_TIME_NOT_READY.equals(videoProgressUpdate) ? "not ready" : k0.D("%d ms of %d ms", Long.valueOf(videoProgressUpdate.getCurrentTimeMs()), Long.valueOf(videoProgressUpdate.getDurationMs()));
    }

    public static long l(long j9, long j10) {
        return k0.P0(j9) + (j10 % 1000);
    }

    public static C3.b m(int i9, Q1 q12, C3.b bVar) {
        C3.b bVarB = bVar;
        Q1.b bVarK = q12.k(i9, new Q1.b());
        Q1.d dVarS = q12.s(bVarK.f5718d, new Q1.d());
        long jL = l(dVarS.f5749g, dVarS.f5760r) + bVarK.f5720f;
        int iG = bVarB.g(jL, -9223372036854775807L);
        int i10 = -1;
        if (iG != -1) {
            b.C0010b c0010bE = bVarB.e(iG);
            if (c0010bE.f1058a + c0010bE.f1064h > jL) {
                long j9 = 0;
                int i11 = 0;
                while (true) {
                    int[] iArr = c0010bE.f1062f;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    int i12 = iArr[i11];
                    if (i12 == 1) {
                        i10 = i11;
                    }
                    long j10 = c0010bE.f1058a;
                    if (jL <= j10 + j9) {
                        if (jL == j10 + j9) {
                            if (i12 == 1 || i12 == 3) {
                                return bVarB;
                            }
                            if (i12 == 0 && i10 == i11 - 1) {
                                long j11 = bVarK.f5719e;
                                if (j11 == -9223372036854775807L) {
                                    return bVarB;
                                }
                                C3.b bVarW = w(iG, i11, j11, bVarB);
                                return bVarW.u(iG, k0.n1(bVarW.e(iG).f1063g));
                            }
                        }
                        C3.b bVarO = o(iG, false, bVarB);
                        long j12 = bVarK.f5719e;
                        return j12 != -9223372036854775807L ? a(jL, j12, 1, j12, 1, bVarO) : bVarO;
                    }
                    if (i12 == 1 || i12 == 0) {
                        bVarB = bVarB.B(iG, i11);
                    }
                    j9 += c0010bE.f1063g[i11];
                    i11++;
                }
            } else {
                return o(iG, true, bVarB);
            }
        }
        return bVarB;
    }

    public static boolean n(AdError adError) {
        return adError.getErrorCode() == AdError.AdErrorCode.VAST_LINEAR_ASSET_MISMATCH || adError.getErrorCode() == AdError.AdErrorCode.UNKNOWN_ERROR;
    }

    public static C3.b o(int i9, boolean z9, C3.b bVar) {
        b.C0010b c0010bE = bVar.e(i9);
        int length = c0010bE.f1063g.length;
        long[] jArr = new long[length];
        for (int i10 = 0; i10 < length; i10++) {
            jArr[i10] = z9 ? c0010bE.f1063g[i10] : 0L;
            int i11 = c0010bE.f1062f[i10];
            if (i11 == 1 || i11 == 0) {
                bVar = bVar.B(i9, i10);
            }
        }
        return bVar.m(i9, jArr).u(i9, k0.n1(jArr));
    }

    public static C3.b p(Q1 q12, C3.b bVar) {
        int i9;
        Q1.d dVarS = q12.s(0, new Q1.d());
        if (dVarS.f5758p == dVarS.f5759q || bVar.f1044c < 2) {
            return bVar;
        }
        Q1.b bVar2 = new Q1.b();
        int i10 = dVarS.f5759q;
        if (q12.k(i10, bVar2).f5719e == -9223372036854775807L) {
            i10--;
            q12.k(i10, bVar2);
        }
        long jL = l(dVarS.f5749g, dVarS.f5760r);
        int iG = bVar.g(bVar2.f5720f + jL, -9223372036854775807L);
        if (iG == -1) {
            return bVar;
        }
        b.C0010b c0010bE = bVar.e(iG);
        long j9 = jL - dVarS.f5760r;
        long j10 = c0010bE.f1058a;
        if (c0010bE.f1064h + j10 <= j9) {
            return bVar;
        }
        int i11 = 0;
        while (j10 < j9) {
            if (c0010bE.f1062f[i11] == 1) {
                return bVar;
            }
            j10 += c0010bE.f1063g[i11];
            i11++;
        }
        int i12 = dVarS.f5758p;
        while (true) {
            if (i12 > i10) {
                i12 = -1;
                break;
            }
            if (c0010bE.f1058a <= j9) {
                break;
            }
            j9 += q12.k(i12, bVar2).f5719e;
            i12++;
        }
        AbstractC1684a.g(i12 != -1);
        for (int i13 = i11; i13 < c0010bE.f1063g.length && (i9 = (i13 - i11) + i12) <= i10; i13++) {
            q12.k(i9, bVar2);
            long j11 = bVar2.f5719e;
            if (j11 != c0010bE.f1063g[i13]) {
                bVar = w(iG, i13, j11, bVar);
            }
        }
        return bVar.u(iG, k0.n1(bVar.e(iG).f1063g));
    }

    public static long q(double d9) {
        return AbstractC2882b.c(BigDecimal.valueOf(d9).scaleByPowerOfTen(3).doubleValue(), RoundingMode.HALF_UP);
    }

    public static long r(double d9) {
        return AbstractC2882b.c(BigDecimal.valueOf(d9).scaleByPowerOfTen(6).doubleValue(), RoundingMode.HALF_UP);
    }

    public static C3.b s(b.C0010b c0010b, int i9, int i10, C3.b bVar) {
        int i11 = 0;
        AbstractC1684a.a(i10 > 0 && i10 < c0010b.f1059c);
        C3.b bVarW = bVar;
        for (int i12 = 0; i12 < c0010b.f1059c - i10; i12++) {
            bVarW = bVarW.w(i9);
        }
        b.C0010b c0010bE = bVarW.e(i9);
        long j9 = c0010bE.f1058a + c0010bE.f1064h;
        int[] iArrCopyOfRange = Arrays.copyOfRange(c0010b.f1062f, i10, c0010b.f1059c);
        long[] jArrCopyOfRange = Arrays.copyOfRange(c0010b.f1063g, i10, c0010b.f1059c);
        long jN1 = k0.n1(jArrCopyOfRange);
        C3.b bVarA = bVarW;
        while (i11 < iArrCopyOfRange.length && iArrCopyOfRange[i11] == 1) {
            int i13 = i11 + 1;
            bVarA = a(j9, jArrCopyOfRange[i11], i13, jN1, jArrCopyOfRange.length, bVarA);
            jN1 -= jArrCopyOfRange[i11];
            i11 = i13;
        }
        return bVarA;
    }

    public static C3.b t(Object obj, b.C0010b c0010b, long j9, long j10, boolean z9) {
        C3.b bVarL = new C3.b(AbstractC1684a.e(obj), 0).v(0, true).l(0, 1);
        if (z9) {
            bVarL = bVarL.x();
        }
        long j11 = 0;
        for (int i9 = 0; i9 < c0010b.f1059c; i9++) {
            long j12 = j10 != -9223372036854775807L ? j10 : c0010b.f1063g[i9];
            long j13 = j9 + j12;
            j11 += c0010b.f1063g[i9];
            if (j13 <= c0010b.f1058a + j11 + 10000) {
                C3.b bVarU = bVarL.m(0, j12).u(0, z9 ? j12 : 0L);
                int i10 = c0010b.f1062f[i9];
                return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? bVarU : bVarU.p(0, 0) : bVarU.A(0, 0) : bVarU.B(0, 0) : bVarU.r(0, 0);
            }
        }
        return bVarL;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0103, code lost:
    
        if (r4.i() == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0105, code lost:
    
        r17 = r17 + r19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static s5.AbstractC2717A u(C3.b r32, O2.Q1 r33) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Z2.m.u(C3.b, O2.Q1):s5.A");
    }

    public static long[] v(long[] jArr, int i9, long j9, long j10) {
        jArr[i9] = j9;
        int length = (i9 + 1) % jArr.length;
        if (jArr[length] == 0) {
            jArr[length] = Math.max(0L, j10 - j9);
        }
        return jArr;
    }

    public static C3.b w(int i9, int i10, long j9, C3.b bVar) {
        b.C0010b c0010bE = bVar.e(i9);
        AbstractC1684a.a(i10 < c0010bE.f1063g.length);
        long[] jArr = c0010bE.f1063g;
        return bVar.m(i9, v(Arrays.copyOf(jArr, jArr.length), i10, j9, c0010bE.f1063g[i10]));
    }
}
