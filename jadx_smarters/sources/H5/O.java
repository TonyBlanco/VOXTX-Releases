package H5;

import com.google.android.gms.common.api.internal.ComponentCallbacks2C1355c;

/* JADX INFO: loaded from: classes3.dex */
public final class O implements ComponentCallbacks2C1355c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M f2635a;

    public O(M m9) {
        this.f2635a = m9;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C1355c.a
    public final void a(boolean z9) {
        if (z9) {
            this.f2635a.f2630c = true;
            this.f2635a.b();
        } else {
            this.f2635a.f2630c = false;
            if (this.f2635a.e()) {
                this.f2635a.f2629b.c();
            }
        }
    }
}
