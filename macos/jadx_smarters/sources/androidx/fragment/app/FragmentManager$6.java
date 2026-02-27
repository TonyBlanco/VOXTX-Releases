package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1180j;
import androidx.lifecycle.InterfaceC1184n;
import androidx.lifecycle.InterfaceC1186p;

/* JADX INFO: loaded from: classes.dex */
class FragmentManager$6 implements InterfaceC1184n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f14940a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC1180j f14941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f14942d;

    @Override // androidx.lifecycle.InterfaceC1184n
    public void b(InterfaceC1186p interfaceC1186p, AbstractC1180j.b bVar) {
        if (bVar == AbstractC1180j.b.ON_START && ((Bundle) this.f14942d.f15068j.get(this.f14940a)) != null) {
            throw null;
        }
        if (bVar == AbstractC1180j.b.ON_DESTROY) {
            this.f14941c.c(this);
            this.f14942d.f15069k.remove(this.f14940a);
        }
    }
}
