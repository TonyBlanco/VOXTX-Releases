package O2;

import O2.InterfaceC0901n;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import d4.AbstractC1684a;
import java.io.IOException;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: renamed from: O2.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0927w extends C0909p1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final InterfaceC0901n.a f6344q = new InterfaceC0901n.a() { // from class: O2.v
        @Override // O2.InterfaceC0901n.a
        public final InterfaceC0901n a(Bundle bundle) {
            return C0927w.f(bundle);
        }
    };

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f6345r = d4.k0.A0(1001);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f6346s = d4.k0.A0(AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f6347t = d4.k0.A0(1003);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f6348u = d4.k0.A0(1004);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f6349v = d4.k0.A0(WebSocketProtocol.CLOSE_NO_STATUS_CODE);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f6350w = d4.k0.A0(1006);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f6351j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f6352k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f6353l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C0936z0 f6354m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f6355n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final B3.A f6356o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f6357p;

    public C0927w(int i9, Throwable th, int i10) {
        this(i9, th, null, i10, null, -1, null, 4, false);
    }

    public C0927w(int i9, Throwable th, String str, int i10, String str2, int i11, C0936z0 c0936z0, int i12, boolean z9) {
        this(m(i9, str, str2, i11, c0936z0, i12), th, i10, i9, str2, i11, c0936z0, i12, null, SystemClock.elapsedRealtime(), z9);
    }

    public C0927w(Bundle bundle) {
        super(bundle);
        this.f6351j = bundle.getInt(f6345r, 2);
        this.f6352k = bundle.getString(f6346s);
        this.f6353l = bundle.getInt(f6347t, -1);
        Bundle bundle2 = bundle.getBundle(f6348u);
        this.f6354m = bundle2 == null ? null : (C0936z0) C0936z0.f6446u0.a(bundle2);
        this.f6355n = bundle.getInt(f6349v, 4);
        this.f6357p = bundle.getBoolean(f6350w, false);
        this.f6356o = null;
    }

    public C0927w(String str, Throwable th, int i9, int i10, String str2, int i11, C0936z0 c0936z0, int i12, B3.A a9, long j9, boolean z9) {
        super(str, th, i9, j9);
        AbstractC1684a.a(!z9 || i10 == 1);
        AbstractC1684a.a(th != null || i10 == 3);
        this.f6351j = i10;
        this.f6352k = str2;
        this.f6353l = i11;
        this.f6354m = c0936z0;
        this.f6355n = i12;
        this.f6356o = a9;
        this.f6357p = z9;
    }

    public static /* synthetic */ C0927w f(Bundle bundle) {
        return new C0927w(bundle);
    }

    public static C0927w i(Throwable th, String str, int i9, C0936z0 c0936z0, int i10, boolean z9, int i11) {
        return new C0927w(1, th, null, i11, str, i9, c0936z0, c0936z0 == null ? 4 : i10, z9);
    }

    public static C0927w j(IOException iOException, int i9) {
        return new C0927w(0, iOException, i9);
    }

    public static C0927w k(RuntimeException runtimeException) {
        return l(runtimeException, 1000);
    }

    public static C0927w l(RuntimeException runtimeException, int i9) {
        return new C0927w(2, runtimeException, i9);
    }

    public static String m(int i9, String str, String str2, int i10, C0936z0 c0936z0, int i11) {
        String str3;
        if (i9 == 0) {
            str3 = "Source error";
        } else if (i9 != 1) {
            str3 = i9 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i10 + ", format=" + c0936z0 + ", format_supported=" + d4.k0.b0(i11);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    public C0927w g(B3.A a9) {
        return new C0927w((String) d4.k0.j(getMessage()), getCause(), this.f6177a, this.f6351j, this.f6352k, this.f6353l, this.f6354m, this.f6355n, a9, this.f6178c, this.f6357p);
    }

    @Override // O2.C0909p1, O2.InterfaceC0901n
    public Bundle h() {
        Bundle bundleH = super.h();
        bundleH.putInt(f6345r, this.f6351j);
        bundleH.putString(f6346s, this.f6352k);
        bundleH.putInt(f6347t, this.f6353l);
        C0936z0 c0936z0 = this.f6354m;
        if (c0936z0 != null) {
            bundleH.putBundle(f6348u, c0936z0.h());
        }
        bundleH.putInt(f6349v, this.f6355n);
        bundleH.putBoolean(f6350w, this.f6357p);
        return bundleH;
    }
}
