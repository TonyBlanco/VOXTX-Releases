package androidx.lifecycle;

import G8.C0;
import androidx.lifecycle.AbstractC1180j;

/* JADX INFO: loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends AbstractC1181k implements InterfaceC1184n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1180j f15877a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o8.g f15878c;

    @Override // androidx.lifecycle.InterfaceC1184n
    public void b(InterfaceC1186p source, AbstractC1180j.b event) {
        kotlin.jvm.internal.l.e(source, "source");
        kotlin.jvm.internal.l.e(event, "event");
        if (c().b().compareTo(AbstractC1180j.c.DESTROYED) <= 0) {
            c().c(this);
            C0.d(t(), null, 1, null);
        }
    }

    public AbstractC1180j c() {
        return this.f15877a;
    }

    @Override // G8.L
    public o8.g t() {
        return this.f15878c;
    }
}
