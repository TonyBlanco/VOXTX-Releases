package q4;

import android.os.RemoteException;
import java.util.List;
import p4.C2433h;
import p4.X;
import t4.C2775b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2775b f46908a = new C2775b("MediaSessionUtils");

    public static int a(C2433h c2433h, long j9) {
        return j9 == 10000 ? c2433h.L() : j9 != 30000 ? c2433h.N() : c2433h.M();
    }

    public static int b(C2433h c2433h, long j9) {
        return j9 == 10000 ? c2433h.b0() : j9 != 30000 ? c2433h.d0() : c2433h.c0();
    }

    public static int c(C2433h c2433h, long j9) {
        return j9 == 10000 ? c2433h.Q() : j9 != 30000 ? c2433h.S() : c2433h.R();
    }

    public static int d(C2433h c2433h, long j9) {
        return j9 == 10000 ? c2433h.h0() : j9 != 30000 ? c2433h.j0() : c2433h.i0();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c A[PHI: r1
      0x002c: PHI (r1v5 java.lang.String) = (r1v3 java.lang.String), (r1v4 java.lang.String) binds: [B:18:0x002a, B:21:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String e(n4.C2281m r4) {
        /*
            java.lang.String r0 = "com.google.android.gms.cast.metadata.SUBTITLE"
            boolean r1 = r4.e(r0)
            if (r1 != 0) goto L3c
            int r1 = r4.I()
            r2 = 1
            if (r1 == r2) goto L3a
            r2 = 2
            if (r1 == r2) goto L37
            r2 = 3
            java.lang.String r3 = "com.google.android.gms.cast.metadata.ARTIST"
            if (r1 == r2) goto L1d
            r2 = 4
            if (r1 == r2) goto L1b
            goto L3c
        L1b:
            r0 = r3
            goto L3c
        L1d:
            boolean r1 = r4.e(r3)
            if (r1 == 0) goto L24
            goto L1b
        L24:
            java.lang.String r1 = "com.google.android.gms.cast.metadata.ALBUM_ARTIST"
            boolean r2 = r4.e(r1)
            if (r2 == 0) goto L2e
        L2c:
            r0 = r1
            goto L3c
        L2e:
            java.lang.String r1 = "com.google.android.gms.cast.metadata.COMPOSER"
            boolean r2 = r4.e(r1)
            if (r2 == 0) goto L3c
            goto L2c
        L37:
            java.lang.String r0 = "com.google.android.gms.cast.metadata.SERIES_TITLE"
            goto L3c
        L3a:
            java.lang.String r0 = "com.google.android.gms.cast.metadata.STUDIO"
        L3c:
            java.lang.String r4 = r4.J(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.x.e(n4.m):java.lang.String");
    }

    public static List f(X x9) {
        try {
            return x9.zzf();
        } catch (RemoteException e9) {
            f46908a.d(e9, "Unable to call %s on %s.", "getNotificationActions", X.class.getSimpleName());
            return null;
        }
    }

    public static int[] g(X x9) {
        try {
            return x9.zzg();
        } catch (RemoteException e9) {
            f46908a.d(e9, "Unable to call %s on %s.", "getCompactViewActionIndices", X.class.getSimpleName());
            return null;
        }
    }
}
