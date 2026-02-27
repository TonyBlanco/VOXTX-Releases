package androidx.lifecycle;

import androidx.lifecycle.AbstractC1180j;

/* JADX INFO: loaded from: classes.dex */
final class SavedStateHandleController implements InterfaceC1184n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15918a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15919c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B f15920d;

    public SavedStateHandleController(String str, B b9) {
        this.f15918a = str;
        this.f15920d = b9;
    }

    @Override // androidx.lifecycle.InterfaceC1184n
    public void b(InterfaceC1186p interfaceC1186p, AbstractC1180j.b bVar) {
        if (bVar == AbstractC1180j.b.ON_DESTROY) {
            this.f15919c = false;
            interfaceC1186p.getLifecycle().c(this);
        }
    }

    public void c(F0.c cVar, AbstractC1180j abstractC1180j) {
        if (this.f15919c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f15919c = true;
        abstractC1180j.a(this);
        cVar.h(this.f15918a, this.f15920d.d());
    }

    public B e() {
        return this.f15920d;
    }

    public boolean j() {
        return this.f15919c;
    }
}
