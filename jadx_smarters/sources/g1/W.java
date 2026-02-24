package g1;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes.dex */
public final class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1816j f41151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F f41152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V f41153d = new V(this, true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V f41154e = new V(this, false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f41155f;

    public W(Context context, InterfaceC1816j interfaceC1816j, K k9, InterfaceC1804C interfaceC1804C, InterfaceC1819m interfaceC1819m, F f9) {
        this.f41150a = context;
        this.f41151b = interfaceC1816j;
        this.f41152c = f9;
    }

    public static /* bridge */ /* synthetic */ InterfaceC1804C a(W w9) {
        w9.getClass();
        return null;
    }

    public static /* bridge */ /* synthetic */ InterfaceC1819m e(W w9) {
        w9.getClass();
        return null;
    }

    public final InterfaceC1816j d() {
        return this.f41151b;
    }

    public final void f() {
        this.f41153d.c(this.f41150a);
        this.f41154e.c(this.f41150a);
    }

    public final void g(boolean z9) {
        IntentFilter intentFilter = new IntentFilter("TryRoom");
        IntentFilter intentFilter2 = new IntentFilter("TryRoom");
        intentFilter2.addAction("TryRoom");
        this.f41155f = z9;
        this.f41154e.a(this.f41150a, intentFilter2);
        if (this.f41155f) {
            this.f41153d.b(this.f41150a, intentFilter, "com.google.android.finsky.permission.PLAY_BILLING_LIBRARY_BROADCAST");
        } else {
            this.f41153d.a(this.f41150a, intentFilter);
        }
    }
}
