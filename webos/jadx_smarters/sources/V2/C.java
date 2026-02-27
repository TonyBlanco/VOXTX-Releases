package V2;

import V2.C1051h;
import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import com.facebook.ads.AdError;
import com.google.ads.interactivemedia.v3.internal.X0;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class C {

    public static final class a {
        public static boolean a(Throwable th) {
            return th instanceof DeniedByServerException;
        }

        public static boolean b(Throwable th) {
            return th instanceof NotProvisionedException;
        }
    }

    public static final class b {
        public static boolean a(Throwable th) {
            return th instanceof MediaDrm.MediaDrmStateException;
        }

        public static int b(Throwable th) {
            return k0.Z(k0.a0(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
        }
    }

    public static final class c {
        public static boolean a(Throwable th) {
            return X0.a(th);
        }
    }

    public static int a(Exception exc, int i9) {
        int i10 = k0.f39777a;
        if (i10 >= 21 && b.a(exc)) {
            return b.b(exc);
        }
        if (i10 >= 23 && c.a(exc)) {
            return 6006;
        }
        if (i10 >= 18 && a.b(exc)) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        if (i10 >= 18 && a.a(exc)) {
            return 6007;
        }
        if (exc instanceof W) {
            return AdError.MEDIAVIEW_MISSING_ERROR_CODE;
        }
        if (exc instanceof C1051h.e) {
            return AdError.AD_ASSETS_UNSUPPORTED_TYPE_ERROR_CODE;
        }
        if (exc instanceof N) {
            return 6008;
        }
        if (i9 == 1) {
            return 6006;
        }
        if (i9 == 2) {
            return 6004;
        }
        if (i9 == 3) {
            return AdError.ICONVIEW_MISSING_ERROR_CODE;
        }
        throw new IllegalArgumentException();
    }
}
