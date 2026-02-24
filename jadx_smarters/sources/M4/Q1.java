package M4;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzbr;
import com.google.android.gms.internal.measurement.zzra;

/* JADX INFO: loaded from: classes3.dex */
public final class Q1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzbr f4433a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ServiceConnection f4434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ R1 f4435d;

    public Q1(R1 r12, zzbr zzbrVar, ServiceConnection serviceConnection) {
        this.f4435d = r12;
        this.f4433a = zzbrVar;
        this.f4434c = serviceConnection;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundleZzd;
        C0846x1 c0846x1R;
        String str;
        R1 r12 = this.f4435d;
        S1 s12 = r12.f4441c;
        String str2 = r12.f4440a;
        zzbr zzbrVar = this.f4433a;
        ServiceConnection serviceConnection = this.f4434c;
        s12.f4459a.f().h();
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str2);
        try {
            bundleZzd = zzbrVar.zzd(bundle);
        } catch (Exception e9) {
            s12.f4459a.d().r().b("Exception occurred while retrieving the Install Referrer", e9.getMessage());
        }
        if (bundleZzd == null) {
            s12.f4459a.d().r().a("Install Referrer Service returned a null response");
            bundleZzd = null;
        }
        s12.f4459a.f().h();
        C0776l2.t();
        if (bundleZzd != null) {
            long j9 = bundleZzd.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j9 == 0) {
                c0846x1R = s12.f4459a.d().w();
                str = "Service response is missing Install Referrer install timestamp";
            } else {
                String string = bundleZzd.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    c0846x1R = s12.f4459a.d().r();
                    str = "No referrer defined in Install Referrer response";
                } else {
                    s12.f4459a.d().v().b("InstallReferrer API result", string);
                    a5 a5VarN = s12.f4459a.N();
                    Uri uri = Uri.parse("?".concat(string));
                    zzra.zzc();
                    Bundle bundleV0 = a5VarN.v0(uri, s12.f4459a.z().B(null, AbstractC0781m1.f4933y0));
                    if (bundleV0 == null) {
                        c0846x1R = s12.f4459a.d().r();
                        str = "No campaign params defined in Install Referrer result";
                    } else {
                        String string2 = bundleV0.getString("medium");
                        if (string2 != null && !"(not set)".equalsIgnoreCase(string2) && !"organic".equalsIgnoreCase(string2)) {
                            long j10 = bundleZzd.getLong("referrer_click_timestamp_seconds", 0L) * 1000;
                            if (j10 == 0) {
                                c0846x1R = s12.f4459a.d().r();
                                str = "Install Referrer is missing click timestamp for ad campaign";
                            } else {
                                bundleV0.putLong("click_timestamp", j10);
                            }
                        }
                        if (j9 == s12.f4459a.F().f4405f.a()) {
                            s12.f4459a.d().v().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (s12.f4459a.o()) {
                            s12.f4459a.F().f4405f.b(j9);
                            s12.f4459a.d().v().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            bundleV0.putString("_cis", "referrer API v2");
                            s12.f4459a.I().t("auto", "_cmp", bundleV0, str2);
                        }
                    }
                }
            }
            c0846x1R.a(str);
        }
        B4.b.b().c(s12.f4459a.c(), serviceConnection);
    }
}
