package kotlinx.coroutines.internal;

import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class B {
    public static final int a(String str, int i9, int i10, int i11) {
        return (int) z.c(str, i9, i10, i11);
    }

    public static final long b(String str, long j9, long j10, long j11) {
        String strD = z.d(str);
        if (strD == null) {
            return j9;
        }
        Long lK = E8.m.k(strD);
        if (lK == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strD + '\'').toString());
        }
        long jLongValue = lK.longValue();
        if (j10 <= jLongValue && jLongValue <= j11) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j10 + ".." + j11 + ", but is '" + jLongValue + '\'').toString());
    }

    public static final boolean c(String str, boolean z9) {
        String strD = z.d(str);
        return strD != null ? Boolean.parseBoolean(strD) : z9;
    }

    public static /* synthetic */ int d(String str, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 1;
        }
        if ((i12 & 8) != 0) {
            i11 = a.e.API_PRIORITY_OTHER;
        }
        return z.b(str, i9, i10, i11);
    }

    public static /* synthetic */ long e(String str, long j9, long j10, long j11, int i9, Object obj) {
        if ((i9 & 4) != 0) {
            j10 = 1;
        }
        long j12 = j10;
        if ((i9 & 8) != 0) {
            j11 = Long.MAX_VALUE;
        }
        return z.c(str, j9, j12, j11);
    }
}
