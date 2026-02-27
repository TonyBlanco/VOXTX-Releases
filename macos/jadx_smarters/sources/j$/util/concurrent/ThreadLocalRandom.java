package j$.util.concurrent;

import com.google.android.gms.common.api.a;
import j$.util.stream.AbstractC2055y0;
import j$.util.stream.C1996m0;
import j$.util.stream.E;
import j$.util.stream.IntStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/* JADX INFO: loaded from: classes2.dex */
public class ThreadLocalRandom extends Random {
    private static final long serialVersionUID = -5851777807851030925L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f42294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f42295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f42296c;
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("rnd", Long.TYPE), new ObjectStreamField("initialized", Boolean.TYPE)};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal f42290d = new ThreadLocal();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicInteger f42291e = new AtomicInteger();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ThreadLocal f42292f = new v();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final AtomicLong f42293g = new AtomicLong(h(System.currentTimeMillis()) ^ h(System.nanoTime()));

    static {
        if (((Boolean) AccessController.doPrivileged(new w())).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            long j9 = ((long) seed[0]) & 255;
            for (int i9 = 1; i9 < 8; i9++) {
                j9 = (j9 << 8) | (((long) seed[i9]) & 255);
            }
            f42293g.set(j9);
        }
    }

    private ThreadLocalRandom() {
        this.f42296c = true;
    }

    /* synthetic */ ThreadLocalRandom(int i9) {
        this();
    }

    static final int a(int i9) {
        int i10 = i9 ^ (i9 << 13);
        int i11 = i10 ^ (i10 >>> 17);
        int i12 = i11 ^ (i11 << 5);
        ((ThreadLocalRandom) f42292f.get()).f42295b = i12;
        return i12;
    }

    static final int b() {
        return ((ThreadLocalRandom) f42292f.get()).f42295b;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f42292f.get();
        if (threadLocalRandom.f42295b == 0) {
            f();
        }
        return threadLocalRandom;
    }

    static final void f() {
        int iAddAndGet = f42291e.addAndGet(-1640531527);
        if (iAddAndGet == 0) {
            iAddAndGet = 1;
        }
        long jH = h(f42293g.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f42292f.get();
        threadLocalRandom.f42294a = jH;
        threadLocalRandom.f42295b = iAddAndGet;
    }

    private static int g(long j9) {
        long j10 = (j9 ^ (j9 >>> 33)) * (-49064778989728563L);
        return (int) (((j10 ^ (j10 >>> 33)) * (-4265267296055464877L)) >>> 32);
    }

    private static long h(long j9) {
        long j10 = (j9 ^ (j9 >>> 33)) * (-49064778989728563L);
        long j11 = (j10 ^ (j10 >>> 33)) * (-4265267296055464877L);
        return j11 ^ (j11 >>> 33);
    }

    private Object readResolve() {
        return current();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        ObjectOutputStream.PutField putFieldPutFields = objectOutputStream.putFields();
        putFieldPutFields.put("rnd", this.f42294a);
        putFieldPutFields.put("initialized", true);
        objectOutputStream.writeFields();
    }

    final double c(double d9, double d10) {
        double dNextLong = (nextLong() >>> 11) * 1.1102230246251565E-16d;
        if (d9 >= d10) {
            return dNextLong;
        }
        double d11 = ((d10 - d9) * dNextLong) + d9;
        return d11 >= d10 ? Double.longBitsToDouble(Double.doubleToLongBits(d10) - 1) : d11;
    }

    final int d(int i9, int i10) {
        int i11;
        int iG = g(i());
        if (i9 >= i10) {
            return iG;
        }
        int i12 = i10 - i9;
        int i13 = i12 - 1;
        if ((i12 & i13) == 0) {
            i11 = iG & i13;
        } else if (i12 > 0) {
            int iG2 = iG >>> 1;
            while (true) {
                int i14 = iG2 + i13;
                i11 = iG2 % i12;
                if (i14 - i11 >= 0) {
                    break;
                }
                iG2 = g(i()) >>> 1;
            }
        } else {
            while (true) {
                if (iG >= i9 && iG < i10) {
                    return iG;
                }
                iG = g(i());
            }
        }
        return i11 + i9;
    }

    @Override // java.util.Random
    public final DoubleStream doubles() {
        return E.k(AbstractC2055y0.K(new x(0L, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d)));
    }

    @Override // java.util.Random
    public final DoubleStream doubles(double d9, double d10) {
        if (d9 < d10) {
            return E.k(AbstractC2055y0.K(new x(0L, Long.MAX_VALUE, d9, d10)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j9) {
        if (j9 >= 0) {
            return E.k(AbstractC2055y0.K(new x(0L, j9, Double.MAX_VALUE, 0.0d)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final DoubleStream doubles(long j9, double d9, double d10) {
        if (j9 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (d9 < d10) {
            return E.k(AbstractC2055y0.K(new x(0L, j9, d9, d10)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    final long e(long j9, long j10) {
        long jH = h(i());
        if (j9 >= j10) {
            return jH;
        }
        long j11 = j10 - j9;
        long j12 = j11 - 1;
        if ((j11 & j12) == 0) {
            return (jH & j12) + j9;
        }
        if (j11 > 0) {
            while (true) {
                long j13 = jH >>> 1;
                long j14 = j13 + j12;
                long j15 = j13 % j11;
                if (j14 - j15 >= 0) {
                    return j15 + j9;
                }
                jH = h(i());
            }
        } else {
            while (true) {
                if (jH >= j9 && jH < j10) {
                    return jH;
                }
                jH = h(i());
            }
        }
    }

    final long i() {
        long j9 = this.f42294a - 7046029254386353131L;
        this.f42294a = j9;
        return j9;
    }

    @Override // java.util.Random
    public final IntStream ints() {
        return IntStream.Wrapper.convert(AbstractC2055y0.T(new y(0L, Long.MAX_VALUE, a.e.API_PRIORITY_OTHER, 0)));
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(int i9, int i10) {
        if (i9 < i10) {
            return IntStream.Wrapper.convert(AbstractC2055y0.T(new y(0L, Long.MAX_VALUE, i9, i10)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(long j9) {
        if (j9 >= 0) {
            return IntStream.Wrapper.convert(AbstractC2055y0.T(new y(0L, j9, a.e.API_PRIORITY_OTHER, 0)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final java.util.stream.IntStream ints(long j9, int i9, int i10) {
        if (j9 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (i9 < i10) {
            return IntStream.Wrapper.convert(AbstractC2055y0.T(new y(0L, j9, i9, i10)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final LongStream longs() {
        return C1996m0.k(AbstractC2055y0.V(new z(0L, Long.MAX_VALUE, Long.MAX_VALUE, 0L)));
    }

    @Override // java.util.Random
    public final LongStream longs(long j9) {
        if (j9 >= 0) {
            return C1996m0.k(AbstractC2055y0.V(new z(0L, j9, Long.MAX_VALUE, 0L)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    @Override // java.util.Random
    public final LongStream longs(long j9, long j10) {
        if (j9 < j10) {
            return C1996m0.k(AbstractC2055y0.V(new z(0L, Long.MAX_VALUE, j9, j10)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final LongStream longs(long j9, long j10, long j11) {
        if (j9 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        }
        if (j10 < j11) {
            return C1996m0.k(AbstractC2055y0.V(new z(0L, j9, j10, j11)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    protected final int next(int i9) {
        return nextInt() >>> (32 - i9);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return g(i()) < 0;
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return (h(i()) >>> 11) * 1.1102230246251565E-16d;
    }

    public final double nextDouble(double d9) {
        if (d9 <= 0.0d) {
            throw new IllegalArgumentException("bound must be positive");
        }
        double dH = (h(i()) >>> 11) * 1.1102230246251565E-16d * d9;
        return dH < d9 ? dH : Double.longBitsToDouble(Double.doubleToLongBits(d9) - 1);
    }

    public final double nextDouble(double d9, double d10) {
        if (d9 < d10) {
            return c(d9, d10);
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return (g(i()) >>> 8) * 5.9604645E-8f;
    }

    @Override // java.util.Random
    public final double nextGaussian() {
        ThreadLocal threadLocal = f42290d;
        Double d9 = (Double) threadLocal.get();
        if (d9 != null) {
            threadLocal.set(null);
            return d9.doubleValue();
        }
        while (true) {
            double dNextDouble = (nextDouble() * 2.0d) - 1.0d;
            double dNextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d10 = (dNextDouble2 * dNextDouble2) + (dNextDouble * dNextDouble);
            if (d10 < 1.0d && d10 != 0.0d) {
                double dSqrt = StrictMath.sqrt((StrictMath.log(d10) * (-2.0d)) / d10);
                threadLocal.set(Double.valueOf(dNextDouble2 * dSqrt));
                return dNextDouble * dSqrt;
            }
        }
    }

    @Override // java.util.Random
    public int nextInt() {
        return g(i());
    }

    @Override // java.util.Random
    public final int nextInt(int i9) {
        if (i9 <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        int iG = g(i());
        int i10 = i9 - 1;
        if ((i9 & i10) == 0) {
            return iG & i10;
        }
        while (true) {
            int i11 = iG >>> 1;
            int i12 = i11 + i10;
            int i13 = i11 % i9;
            if (i12 - i13 >= 0) {
                return i13;
            }
            iG = g(i());
        }
    }

    public int nextInt(int i9, int i10) {
        if (i9 < i10) {
            return d(i9, i10);
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final long nextLong() {
        return h(i());
    }

    public final long nextLong(long j9) {
        if (j9 <= 0) {
            throw new IllegalArgumentException("bound must be positive");
        }
        long jH = h(i());
        long j10 = j9 - 1;
        if ((j9 & j10) == 0) {
            return jH & j10;
        }
        while (true) {
            long j11 = jH >>> 1;
            long j12 = j11 + j10;
            long j13 = j11 % j9;
            if (j12 - j13 >= 0) {
                return j13;
            }
            jH = h(i());
        }
    }

    public final long nextLong(long j9, long j10) {
        if (j9 < j10) {
            return e(j9, j10);
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    @Override // java.util.Random
    public final void setSeed(long j9) {
        if (this.f42296c) {
            throw new UnsupportedOperationException();
        }
    }
}
