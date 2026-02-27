package androidx.lifecycle;

import G8.InterfaceC0585n;
import androidx.lifecycle.AbstractC1180j;
import k8.j;

/* JADX INFO: loaded from: classes.dex */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 implements InterfaceC1184n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1180j.c f15921a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1180j f15922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0585n f15923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w8.a f15924e;

    @Override // androidx.lifecycle.InterfaceC1184n
    public void b(InterfaceC1186p source, AbstractC1180j.b event) {
        InterfaceC0585n interfaceC0585n;
        C1182l th;
        Object objB;
        kotlin.jvm.internal.l.e(source, "source");
        kotlin.jvm.internal.l.e(event, "event");
        if (event == AbstractC1180j.b.upTo(this.f15921a)) {
            this.f15922c.c(this);
            interfaceC0585n = this.f15923d;
            w8.a aVar = this.f15924e;
            try {
                j.a aVar2 = k8.j.f43666c;
                objB = k8.j.b(aVar.invoke());
            } catch (Throwable th2) {
                th = th2;
                j.a aVar3 = k8.j.f43666c;
                objB = k8.j.b(k8.k.a(th));
            }
            interfaceC0585n.resumeWith(objB);
        }
        if (event != AbstractC1180j.b.ON_DESTROY) {
            return;
        }
        this.f15922c.c(this);
        interfaceC0585n = this.f15923d;
        j.a aVar4 = k8.j.f43666c;
        th = new C1182l();
        objB = k8.j.b(k8.k.a(th));
        interfaceC0585n.resumeWith(objB);
    }
}
