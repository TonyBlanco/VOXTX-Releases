package M4;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0776l2 f4725a;

    public h5(C0776l2 c0776l2) {
        this.f4725a = c0776l2;
    }

    public final void a(String str, Bundle bundle) {
        String string;
        this.f4725a.f().h();
        if (this.f4725a.o()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        this.f4725a.F().f4421v.b(string);
        this.f4725a.F().f4422w.b(this.f4725a.a().a());
    }

    public final void b() {
        this.f4725a.f().h();
        if (d()) {
            if (e()) {
                this.f4725a.F().f4421v.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                this.f4725a.I().u("auto", "_cmpx", bundle);
            } else {
                String strA = this.f4725a.F().f4421v.a();
                if (TextUtils.isEmpty(strA)) {
                    this.f4725a.d().t().a("Cache still valid but referrer not found");
                } else {
                    long jA = this.f4725a.F().f4422w.a() / 3600000;
                    Uri uri = Uri.parse(strA);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", (jA - 1) * 3600000);
                    Object obj = pair.first;
                    this.f4725a.I().u(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                this.f4725a.F().f4421v.b(null);
            }
            this.f4725a.F().f4422w.b(0L);
        }
    }

    public final void c() {
        if (d() && e()) {
            this.f4725a.F().f4421v.b(null);
        }
    }

    public final boolean d() {
        return this.f4725a.F().f4422w.a() > 0;
    }

    public final boolean e() {
        return d() && this.f4725a.a().a() - this.f4725a.F().f4422w.a() > this.f4725a.z().r(null, AbstractC0781m1.f4878U);
    }
}
