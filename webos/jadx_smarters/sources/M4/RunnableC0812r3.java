package M4;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzra;

/* JADX INFO: renamed from: M4.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0812r3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f5042a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f5043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f5044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f5045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0818s3 f5046f;

    public RunnableC0812r3(C0818s3 c0818s3, boolean z9, Uri uri, String str, String str2) {
        this.f5046f = c0818s3;
        this.f5042a = z9;
        this.f5043c = uri;
        this.f5044d = str;
        this.f5045e = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleV0;
        C0818s3 c0818s3 = this.f5046f;
        boolean z9 = this.f5042a;
        Uri uri = this.f5043c;
        String str = this.f5044d;
        String str2 = this.f5045e;
        c0818s3.f5058a.h();
        try {
            a5 a5VarN = c0818s3.f5058a.f4245a.N();
            zzra.zzc();
            C0749h c0749hZ = c0818s3.f5058a.f4245a.z();
            C0775l1 c0775l1 = AbstractC0781m1.f4931x0;
            boolean zB = c0749hZ.B(null, c0775l1);
            if (TextUtils.isEmpty(str2)) {
                bundleV0 = null;
            } else {
                if (!str2.contains("gclid") && !str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_id") && !str2.contains("dclid") && !str2.contains("srsltid")) {
                    if (zB && str2.contains("sfmc_id")) {
                        zB = true;
                    }
                    a5VarN.f4245a.d().q().a("Activity created with data 'referrer' without required params");
                    bundleV0 = null;
                }
                bundleV0 = a5VarN.v0(Uri.parse("https://google.com/search?".concat(str2)), zB);
                if (bundleV0 != null) {
                    bundleV0.putString("_cis", "referrer");
                }
            }
            if (z9) {
                a5 a5VarN2 = c0818s3.f5058a.f4245a.N();
                zzra.zzc();
                Bundle bundleV02 = a5VarN2.v0(uri, c0818s3.f5058a.f4245a.z().B(null, c0775l1));
                if (bundleV02 != null) {
                    bundleV02.putString("_cis", "intent");
                    if (!bundleV02.containsKey("gclid") && bundleV0 != null && bundleV0.containsKey("gclid")) {
                        bundleV02.putString("_cer", String.format("gclid=%s", bundleV0.getString("gclid")));
                    }
                    c0818s3.f5058a.u(str, "_cmp", bundleV02);
                    c0818s3.f5058a.f5074l.a(str, bundleV02);
                }
            }
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            c0818s3.f5058a.f4245a.d().q().b("Activity created with referrer", str2);
            if (c0818s3.f5058a.f4245a.z().B(null, AbstractC0781m1.f4889c0)) {
                if (bundleV0 != null) {
                    c0818s3.f5058a.u(str, "_cmp", bundleV0);
                    c0818s3.f5058a.f5074l.a(str, bundleV0);
                } else {
                    c0818s3.f5058a.f4245a.d().q().b("Referrer does not contain valid parameters", str2);
                }
                c0818s3.f5058a.K("auto", "_ldl", null, true);
                return;
            }
            if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                c0818s3.f5058a.f4245a.d().q().a("Activity created with data 'referrer' without required params");
            } else {
                if (TextUtils.isEmpty(str2)) {
                    return;
                }
                c0818s3.f5058a.K("auto", "_ldl", str2, true);
            }
        } catch (RuntimeException e9) {
            c0818s3.f5058a.f4245a.d().r().b("Throwable caught in handleReferrerForOnActivityCreated", e9);
        }
    }
}
