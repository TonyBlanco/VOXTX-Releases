package G5;

import android.net.Uri;
import com.google.android.gms.internal.p001firebaseauthapi.zzat;
import java.util.HashMap;
import java.util.Set;

/* JADX INFO: renamed from: G5.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0538e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final zzat f2217g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f2221d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2222e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f2223f;

    static {
        HashMap map = new HashMap();
        map.put("recoverEmail", 2);
        map.put("resetPassword", 0);
        map.put("signIn", 4);
        map.put("verifyEmail", 1);
        map.put("verifyBeforeChangeEmail", 5);
        map.put("revertSecondFactorAddition", 6);
        f2217g = zzat.zza(map);
    }

    public C0538e(String str) {
        String strD = d(str, "apiKey");
        String strD2 = d(str, "oobCode");
        String strD3 = d(str, "mode");
        if (strD == null || strD2 == null || strD3 == null) {
            throw new IllegalArgumentException(String.format("%s, %s and %s are required in a valid action code URL", "apiKey", "oobCode", "mode"));
        }
        this.f2218a = com.google.android.gms.common.internal.r.g(strD);
        this.f2219b = com.google.android.gms.common.internal.r.g(strD2);
        this.f2220c = com.google.android.gms.common.internal.r.g(strD3);
        this.f2221d = d(str, "continueUrl");
        this.f2222e = d(str, "languageCode");
        this.f2223f = d(str, "tenantId");
    }

    public static C0538e b(String str) {
        com.google.android.gms.common.internal.r.g(str);
        try {
            return new C0538e(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static String d(String str, String str2) {
        Uri uri = Uri.parse(str);
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return uri.getQueryParameter(str2);
            }
            if (queryParameterNames.contains("link")) {
                return Uri.parse(com.google.android.gms.common.internal.r.g(uri.getQueryParameter("link"))).getQueryParameter(str2);
            }
            return null;
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }

    public String a() {
        return this.f2219b;
    }

    public final String c() {
        return this.f2223f;
    }
}
