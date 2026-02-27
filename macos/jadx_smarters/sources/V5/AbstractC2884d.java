package v5;

import com.amazonaws.services.s3.internal.Constants;
import com.google.android.gms.common.api.a;
import java.math.RoundingMode;
import okhttp3.internal.http2.Http2Connection;
import r5.m;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: renamed from: v5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2884d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f51395a = {9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f51396b = {1, 10, 100, 1000, Constants.MAXIMUM_UPLOAD_PARTS, 100000, 1000000, 10000000, 100000000, Http2Connection.DEGRADED_PONG_TIMEOUT_NS};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f51397c = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, a.e.API_PRIORITY_OTHER};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f51398d = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int[] f51399e = {a.e.API_PRIORITY_OTHER, a.e.API_PRIORITY_OTHER, 65536, 2345, 477, 193, IjkMediaMeta.FF_PROFILE_H264_HIGH_10, 75, 58, 49, 43, 39, 37, 35, 34, 34, 33};

    /* JADX INFO: renamed from: v5.d$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51400a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f51400a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51400a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51400a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51400a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51400a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51400a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51400a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f51400a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static int a(int i9, int i10, RoundingMode roundingMode) {
        m.k(roundingMode);
        if (i10 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i11 = i9 / i10;
        int i12 = i9 - (i10 * i11);
        if (i12 == 0) {
            return i11;
        }
        int i13 = ((i9 ^ i10) >> 31) | 1;
        switch (a.f51400a[roundingMode.ordinal()]) {
            case 1:
                AbstractC2886f.b(i12 == 0);
                return i11;
            case 2:
                return i11;
            case 3:
                if (i13 >= 0) {
                    return i11;
                }
                break;
            case 4:
                break;
            case 5:
                if (i13 <= 0) {
                    return i11;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i12);
                int iAbs2 = iAbs - (Math.abs(i10) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i11 & 1) != 0))) {
                            return i11;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i11;
                }
            default:
                throw new AssertionError();
        }
        return i11 + i13;
    }

    public static int b(int i9, int i10) {
        if (i10 > 0) {
            int i11 = i9 % i10;
            return i11 >= 0 ? i11 : i11 + i10;
        }
        StringBuilder sb = new StringBuilder(31);
        sb.append("Modulus ");
        sb.append(i10);
        sb.append(" must be > 0");
        throw new ArithmeticException(sb.toString());
    }
}
