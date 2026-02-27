package v5;

import java.math.RoundingMode;

/* JADX INFO: renamed from: v5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2882b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final double f51392a = Math.log(2.0d);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double[] f51393b = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* JADX INFO: renamed from: v5.b$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51394a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f51394a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f51394a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f51394a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f51394a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f51394a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f51394a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f51394a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f51394a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static boolean a(double d9) {
        return AbstractC2883c.b(d9) && (d9 == 0.0d || 52 - Long.numberOfTrailingZeros(AbstractC2883c.a(d9)) <= Math.getExponent(d9));
    }

    public static double b(double d9, RoundingMode roundingMode) {
        if (!AbstractC2883c.b(d9)) {
            throw new ArithmeticException("input is infinite or NaN");
        }
        switch (a.f51394a[roundingMode.ordinal()]) {
            case 1:
                AbstractC2886f.b(a(d9));
                return d9;
            case 2:
                return (d9 >= 0.0d || a(d9)) ? d9 : ((long) d9) - 1;
            case 3:
                return (d9 <= 0.0d || a(d9)) ? d9 : ((long) d9) + 1;
            case 4:
                return d9;
            case 5:
                if (a(d9)) {
                    return d9;
                }
                return ((long) d9) + ((long) (d9 > 0.0d ? 1 : -1));
            case 6:
                return Math.rint(d9);
            case 7:
                double dRint = Math.rint(d9);
                return Math.abs(d9 - dRint) == 0.5d ? d9 + Math.copySign(0.5d, d9) : dRint;
            case 8:
                double dRint2 = Math.rint(d9);
                return Math.abs(d9 - dRint2) == 0.5d ? d9 : dRint2;
            default:
                throw new AssertionError();
        }
    }

    public static long c(double d9, RoundingMode roundingMode) {
        double dB = b(d9, roundingMode);
        AbstractC2886f.a(((-9.223372036854776E18d) - dB < 1.0d) & (dB < 9.223372036854776E18d), d9, roundingMode);
        return (long) dB;
    }
}
