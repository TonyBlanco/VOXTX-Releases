package D5;

import L4.a;
import M4.L2;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzjb;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements a.InterfaceC0065a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f1447a;

    public c(d dVar) {
        this.f1447a = dVar;
    }

    @Override // M4.P2
    public final void a(String str, String str2, Bundle bundle, long j9) {
        if (this.f1447a.f1448a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            zzjb zzjbVar = b.f1441a;
            String strA = L2.a(str2);
            if (strA != null) {
                str2 = strA;
            }
            bundle2.putString("events", str2);
            this.f1447a.f1449b.a(2, bundle2);
        }
    }
}
