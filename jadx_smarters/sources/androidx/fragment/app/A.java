package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1178h;
import androidx.lifecycle.AbstractC1180j;
import androidx.lifecycle.InterfaceC1179i;
import androidx.lifecycle.M;
import androidx.lifecycle.N;
import m0.AbstractC2215a;

/* JADX INFO: loaded from: classes.dex */
public class A implements InterfaceC1179i, F0.e, N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Fragment f14869a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f14870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.q f14871d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public F0.d f14872e = null;

    public A(Fragment fragment, M m9) {
        this.f14869a = fragment;
        this.f14870c = m9;
    }

    public void a(AbstractC1180j.b bVar) {
        this.f14871d.h(bVar);
    }

    public void b() {
        if (this.f14871d == null) {
            this.f14871d = new androidx.lifecycle.q(this);
            this.f14872e = F0.d.a(this);
        }
    }

    public boolean c() {
        return this.f14871d != null;
    }

    public void d(Bundle bundle) {
        this.f14872e.d(bundle);
    }

    public void e(Bundle bundle) {
        this.f14872e.e(bundle);
    }

    public void f(AbstractC1180j.c cVar) {
        this.f14871d.o(cVar);
    }

    @Override // androidx.lifecycle.InterfaceC1179i
    public /* synthetic */ AbstractC2215a getDefaultViewModelCreationExtras() {
        return AbstractC1178h.a(this);
    }

    @Override // androidx.lifecycle.InterfaceC1186p
    public AbstractC1180j getLifecycle() {
        b();
        return this.f14871d;
    }

    @Override // F0.e
    public F0.c getSavedStateRegistry() {
        b();
        return this.f14872e.b();
    }

    @Override // androidx.lifecycle.N
    public M getViewModelStore() {
        b();
        return this.f14870c;
    }
}
