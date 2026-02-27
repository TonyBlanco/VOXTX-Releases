package w4;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public class O {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final O f51639e = new O(true, 3, 1, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f51640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f51641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f51642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f51643d;

    public O(boolean z9, int i9, int i10, String str, Throwable th) {
        this.f51640a = z9;
        this.f51643d = i9;
        this.f51641b = str;
        this.f51642c = th;
    }

    public static O b() {
        return f51639e;
    }

    public static O c(String str) {
        return new O(false, 1, 5, str, null);
    }

    public static O d(String str, Throwable th) {
        return new O(false, 1, 5, str, th);
    }

    public static O f(int i9) {
        return new O(true, i9, 1, null, null);
    }

    public static O g(int i9, int i10, String str, Throwable th) {
        return new O(false, i9, i10, str, th);
    }

    public String a() {
        return this.f51641b;
    }

    public final void e() {
        if (this.f51640a || !Log.isLoggable("GoogleCertificatesRslt", 3)) {
            return;
        }
        if (this.f51642c != null) {
            Log.d("GoogleCertificatesRslt", a(), this.f51642c);
        } else {
            Log.d("GoogleCertificatesRslt", a());
        }
    }
}
