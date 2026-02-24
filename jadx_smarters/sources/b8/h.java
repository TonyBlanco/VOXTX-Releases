package B8;

import B8.a;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h extends g {
    public static float b(float f9, float f10) {
        return f9 < f10 ? f10 : f9;
    }

    public static int c(int i9, int i10) {
        return i9 < i10 ? i10 : i9;
    }

    public static long d(long j9, long j10) {
        return j9 < j10 ? j10 : j9;
    }

    public static int e(int i9, int i10) {
        return i9 > i10 ? i10 : i9;
    }

    public static long f(long j9, long j10) {
        return j9 > j10 ? j10 : j9;
    }

    public static float g(float f9, float f10, float f11) {
        if (f10 <= f11) {
            return f9 < f10 ? f10 : f9 > f11 ? f11 : f9;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f11 + " is less than minimum " + f10 + '.');
    }

    public static int h(int i9, int i10, int i11) {
        if (i10 <= i11) {
            return i9 < i10 ? i10 : i9 > i11 ? i11 : i9;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i11 + " is less than minimum " + i10 + '.');
    }

    public static long i(long j9, long j10, long j11) {
        if (j10 <= j11) {
            return j9 < j10 ? j10 : j9 > j11 ? j11 : j9;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j11 + " is less than minimum " + j10 + '.');
    }

    public static a j(int i9, int i10) {
        return a.f756e.a(i9, i10, -1);
    }

    public static int k(c cVar, z8.c random) {
        l.e(cVar, "<this>");
        l.e(random, "random");
        try {
            return z8.d.d(random, cVar);
        } catch (IllegalArgumentException e9) {
            throw new NoSuchElementException(e9.getMessage());
        }
    }

    public static a l(a aVar, int i9) {
        l.e(aVar, "<this>");
        g.a(i9 > 0, Integer.valueOf(i9));
        a.C0007a c0007a = a.f756e;
        int iD = aVar.d();
        int iF = aVar.f();
        if (aVar.g() <= 0) {
            i9 = -i9;
        }
        return c0007a.a(iD, iF, i9);
    }

    public static c m(int i9, int i10) {
        return i10 <= Integer.MIN_VALUE ? c.f764f.a() : new c(i9, i10 - 1);
    }
}
