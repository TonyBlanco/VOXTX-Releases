package g1;

import android.content.Context;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzhe;
import z2.AbstractC3015c;
import z2.C3014b;
import z2.InterfaceC3017e;
import z2.InterfaceC3018f;

/* JADX INFO: loaded from: classes.dex */
public final class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f41139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC3018f f41140b;

    public J(Context context) {
        try {
            C2.u.f(context);
            this.f41140b = C2.u.c().g(A2.a.f75g).a("PLAY_BILLING_LIBRARY", zzhe.class, C3014b.b("proto"), new InterfaceC3017e() { // from class: g1.I
                @Override // z2.InterfaceC3017e
                public final Object apply(Object obj) {
                    return ((zzhe) obj).zzc();
                }
            });
        } catch (Throwable unused) {
            this.f41139a = true;
        }
    }

    public final void a(zzhe zzheVar) {
        String str;
        if (this.f41139a) {
            str = "Skipping logging since initialization failed.";
        } else {
            try {
                this.f41140b.a(AbstractC3015c.e(zzheVar));
                return;
            } catch (Throwable unused) {
                str = "logging failed.";
            }
        }
        zzb.zzk("BillingLogger", str);
    }
}
