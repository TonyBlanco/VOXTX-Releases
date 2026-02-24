package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.AbstractC1180j;
import androidx.lifecycle.InterfaceC1184n;
import androidx.lifecycle.InterfaceC1186p;

/* JADX INFO: loaded from: classes.dex */
class FragmentStateAdapter$5 implements InterfaceC1184n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f17242a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Runnable f17243c;

    @Override // androidx.lifecycle.InterfaceC1184n
    public void b(InterfaceC1186p interfaceC1186p, AbstractC1180j.b bVar) {
        if (bVar == AbstractC1180j.b.ON_DESTROY) {
            this.f17242a.removeCallbacks(this.f17243c);
            interfaceC1186p.getLifecycle().c(this);
        }
    }
}
