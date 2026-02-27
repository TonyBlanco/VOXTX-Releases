package androidx.lifecycle;

import androidx.lifecycle.AbstractC1180j;

/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements InterfaceC1184n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f15917a;

    public SavedStateHandleAttacher(D provider) {
        kotlin.jvm.internal.l.e(provider, "provider");
        this.f15917a = provider;
    }

    @Override // androidx.lifecycle.InterfaceC1184n
    public void b(InterfaceC1186p source, AbstractC1180j.b event) {
        kotlin.jvm.internal.l.e(source, "source");
        kotlin.jvm.internal.l.e(event, "event");
        if (event == AbstractC1180j.b.ON_CREATE) {
            source.getLifecycle().c(this);
            this.f15917a.d();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
        }
    }
}
