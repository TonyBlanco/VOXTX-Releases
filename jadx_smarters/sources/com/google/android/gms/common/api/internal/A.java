package com.google.android.gms.common.api.internal;

import android.app.Activity;
import s.C2696b;
import w4.C2914b;
import w4.C2920h;

/* JADX INFO: loaded from: classes3.dex */
public final class A extends b1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2696b f26457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1363g f26458g;

    public A(InterfaceC1369j interfaceC1369j, C1363g c1363g, C2920h c2920h) {
        super(interfaceC1369j, c2920h);
        this.f26457f = new C2696b();
        this.f26458g = c1363g;
        this.mLifecycleFragment.f("ConnectionlessLifecycleHelper", this);
    }

    public static void j(Activity activity, C1363g c1363g, C1353b c1353b) {
        InterfaceC1369j fragment = LifecycleCallback.getFragment(activity);
        A a9 = (A) fragment.g("ConnectionlessLifecycleHelper", A.class);
        if (a9 == null) {
            a9 = new A(fragment, c1363g, C2920h.q());
        }
        com.google.android.gms.common.internal.r.n(c1353b, "ApiKey cannot be null");
        a9.f26457f.add(c1353b);
        c1363g.a(a9);
    }

    @Override // com.google.android.gms.common.api.internal.b1
    public final void b(C2914b c2914b, int i9) {
        this.f26458g.F(c2914b, i9);
    }

    @Override // com.google.android.gms.common.api.internal.b1
    public final void c() {
        this.f26458g.G();
    }

    public final C2696b i() {
        return this.f26457f;
    }

    public final void k() {
        if (this.f26457f.isEmpty()) {
            return;
        }
        this.f26458g.a(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onResume() {
        super.onResume();
        k();
    }

    @Override // com.google.android.gms.common.api.internal.b1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStart() {
        super.onStart();
        k();
    }

    @Override // com.google.android.gms.common.api.internal.b1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onStop() {
        super.onStop();
        this.f26458g.b(this);
    }
}
