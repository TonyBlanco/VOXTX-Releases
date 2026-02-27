package w4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.X;
import com.google.android.gms.common.internal.Y;
import com.google.android.gms.dynamite.DynamiteModule;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/* JADX INFO: loaded from: classes3.dex */
public abstract class E {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile Y f51621e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Context f51623g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C f51617a = new w(AbstractBinderC2912A.E("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C f51618b = new x(AbstractBinderC2912A.E("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C f51619c = new y(AbstractBinderC2912A.E("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C f51620d = new z(AbstractBinderC2912A.E("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f51622f = new Object();

    public static O a(String str, AbstractBinderC2912A abstractBinderC2912A, boolean z9, boolean z10) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return f(str, abstractBinderC2912A, z9, z10);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    public static O b(String str, boolean z9, boolean z10, boolean z11) {
        return g(str, z9, false, false, true);
    }

    public static /* synthetic */ String c(boolean z9, String str, AbstractBinderC2912A abstractBinderC2912A) {
        String str2 = (z9 || !f(str, abstractBinderC2912A, true, false).f51640a) ? "not allowed" : "debug cert rejected";
        MessageDigest messageDigestB = C4.a.b(MessageDigestAlgorithms.SHA_256);
        com.google.android.gms.common.internal.r.m(messageDigestB);
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str2, str, C4.j.a(messageDigestB.digest(abstractBinderC2912A.Z())), Boolean.valueOf(z9), "12451000.false");
    }

    public static synchronized void d(Context context) {
        if (f51623g != null) {
            Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
        } else if (context != null) {
            f51623g = context.getApplicationContext();
        }
    }

    public static boolean e() {
        boolean zZzi;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                h();
                zZzi = f51621e.zzi();
            } finally {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            }
        } catch (RemoteException | DynamiteModule.a e9) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e9);
            zZzi = false;
        }
        return zZzi;
    }

    public static O f(final String str, final AbstractBinderC2912A abstractBinderC2912A, final boolean z9, boolean z10) {
        try {
            h();
            com.google.android.gms.common.internal.r.m(f51623g);
            try {
                return f51621e.Q0(new J(str, abstractBinderC2912A, z9, z10), F4.b.Z(f51623g.getPackageManager())) ? O.b() : new M(new Callable() { // from class: w4.v
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return E.c(z9, str, abstractBinderC2912A);
                    }
                }, null);
            } catch (RemoteException e9) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e9);
                return O.d("module call", e9);
            }
        } catch (DynamiteModule.a e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            return O.d("module init: ".concat(String.valueOf(e10.getMessage())), e10);
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [F4.a, android.os.IBinder] */
    public static O g(String str, boolean z9, boolean z10, boolean z11, boolean z12) {
        String strConcat;
        O oD;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            com.google.android.gms.common.internal.r.m(f51623g);
            try {
                h();
                F f9 = new F(str, z9, false, F4.b.Z(f51623g), false, true);
                try {
                    H hZ0 = z12 ? f51621e.Z0(f9) : f51621e.j(f9);
                    if (hZ0.H()) {
                        oD = O.f(hZ0.I());
                    } else {
                        String strZza = hZ0.zza();
                        PackageManager.NameNotFoundException nameNotFoundException = hZ0.J() == 4 ? new PackageManager.NameNotFoundException() : null;
                        if (strZza == null) {
                            strZza = "error checking package certificate";
                        }
                        oD = O.g(hZ0.I(), hZ0.J(), strZza, nameNotFoundException);
                    }
                } catch (RemoteException e9) {
                    e = e9;
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                    strConcat = "module call";
                    oD = O.d(strConcat, e);
                }
            } catch (DynamiteModule.a e10) {
                e = e10;
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
                strConcat = "module init: ".concat(String.valueOf(e.getMessage()));
            }
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return oD;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            throw th;
        }
    }

    public static void h() {
        if (f51621e != null) {
            return;
        }
        com.google.android.gms.common.internal.r.m(f51623g);
        synchronized (f51622f) {
            try {
                if (f51621e == null) {
                    f51621e = X.A(DynamiteModule.e(f51623g, DynamiteModule.f26906f, "com.google.android.gms.googlecertificates").d("com.google.android.gms.common.GoogleCertificatesImpl"));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
