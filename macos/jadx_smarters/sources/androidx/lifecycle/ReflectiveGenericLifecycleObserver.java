package androidx.lifecycle;

import androidx.lifecycle.AbstractC1180j;
import androidx.lifecycle.C1172b;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
class ReflectiveGenericLifecycleObserver implements InterfaceC1184n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15900a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1172b.a f15901c;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f15900a = obj;
        this.f15901c = C1172b.f15925c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC1184n
    public void b(InterfaceC1186p interfaceC1186p, AbstractC1180j.b bVar) {
        this.f15901c.a(interfaceC1186p, bVar, this.f15900a);
    }
}
