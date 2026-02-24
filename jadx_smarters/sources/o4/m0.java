package o4;

import java.util.HashSet;
import java.util.Iterator;
import n4.AbstractC2268e;
import n4.C2266d;

/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends AbstractC2268e.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2328e f45892a;

    public /* synthetic */ m0(C2328e c2328e, l0 l0Var) {
        this.f45892a = c2328e;
    }

    @Override // n4.AbstractC2268e.d
    public final void onActiveInputStateChanged(int i9) {
        Iterator it = new HashSet(this.f45892a.f45870e).iterator();
        while (it.hasNext()) {
            ((AbstractC2268e.d) it.next()).onActiveInputStateChanged(i9);
        }
    }

    @Override // n4.AbstractC2268e.d
    public final void onApplicationDisconnected(int i9) {
        C2328e.A(this.f45892a, i9);
        this.f45892a.h(i9);
        Iterator it = new HashSet(this.f45892a.f45870e).iterator();
        while (it.hasNext()) {
            ((AbstractC2268e.d) it.next()).onApplicationDisconnected(i9);
        }
    }

    @Override // n4.AbstractC2268e.d
    public final void onApplicationMetadataChanged(C2266d c2266d) {
        Iterator it = new HashSet(this.f45892a.f45870e).iterator();
        while (it.hasNext()) {
            ((AbstractC2268e.d) it.next()).onApplicationMetadataChanged(c2266d);
        }
    }

    @Override // n4.AbstractC2268e.d
    public final void onApplicationStatusChanged() {
        Iterator it = new HashSet(this.f45892a.f45870e).iterator();
        while (it.hasNext()) {
            ((AbstractC2268e.d) it.next()).onApplicationStatusChanged();
        }
    }

    @Override // n4.AbstractC2268e.d
    public final void onStandbyStateChanged(int i9) {
        Iterator it = new HashSet(this.f45892a.f45870e).iterator();
        while (it.hasNext()) {
            ((AbstractC2268e.d) it.next()).onStandbyStateChanged(i9);
        }
    }

    @Override // n4.AbstractC2268e.d
    public final void onVolumeChanged() {
        Iterator it = new HashSet(this.f45892a.f45870e).iterator();
        while (it.hasNext()) {
            ((AbstractC2268e.d) it.next()).onVolumeChanged();
        }
    }
}
