package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.SystemClock;
import com.facebook.ads.AdError;
import java.io.FileNotFoundException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ws {
    public static final wt a(Context context, Map map, int i9, bn bnVar, boolean z9) {
        return new wt(context, map, AdError.SERVER_ERROR_CODE, bnVar, true);
    }

    public static wu b(we weVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iN = weVar.n();
        int i9 = 0;
        for (int i10 = 0; i10 < iN; i10++) {
            if (weVar.s(i10, jElapsedRealtime)) {
                i9++;
            }
        }
        return new wu(1, 0, iN, i9);
    }

    public static final int c(int i9) {
        return i9 == 7 ? 6 : 3;
    }

    public static final wv d(wu wuVar, bdz bdzVar) {
        int i9;
        Object obj = bdzVar.f21124a;
        if (!(obj instanceof dq) || ((i9 = ((dq) obj).f22734c) != 403 && i9 != 404 && i9 != 410 && i9 != 416 && i9 != 500 && i9 != 503)) {
            return null;
        }
        if (wuVar.a(1)) {
            return new wv(1, 300000L);
        }
        if (wuVar.a(2)) {
            return new wv(2, 60000L);
        }
        return null;
    }

    public static final long e(bdz bdzVar) {
        Object cause = bdzVar.f21124a;
        if ((cause instanceof as) || (cause instanceof FileNotFoundException) || (cause instanceof dn) || (cause instanceof xb)) {
            return -9223372036854775807L;
        }
        while (cause != null) {
            if ((cause instanceof cz) && ((cz) cause).f22673a == 2008) {
                return -9223372036854775807L;
            }
            cause = ((Throwable) cause).getCause();
        }
        return Math.min((bdzVar.f21125b - 1) * 1000, 5000);
    }

    public static final uh f(uh... uhVarArr) {
        return new sj(uhVarArr);
    }
}
