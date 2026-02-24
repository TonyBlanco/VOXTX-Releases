package D5;

import L4.a;
import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements a.InterfaceC0065a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f1452a;

    public e(f fVar) {
        this.f1452a = fVar;
    }

    @Override // M4.P2
    public final void a(String str, String str2, Bundle bundle, long j9) {
        if (str == null || !b.c(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j9);
        bundle2.putBundle("params", bundle);
        this.f1452a.f1453a.a(3, bundle2);
    }
}
