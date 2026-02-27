package M4;

import android.util.Log;

/* JADX INFO: loaded from: classes3.dex */
public final class Q2 implements InterfaceC0822t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0776l2 f4436a;

    public Q2(R2 r22, C0776l2 c0776l2) {
        this.f4436a = c0776l2;
    }

    @Override // M4.InterfaceC0822t1
    public final boolean zza() {
        return this.f4436a.q() && Log.isLoggable(this.f4436a.d().D(), 3);
    }
}
