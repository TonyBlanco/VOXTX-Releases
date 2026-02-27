package v4;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends t {
    public v(int i9, int i10, Bundle bundle) {
        super(i9, 1, bundle);
    }

    @Override // v4.t
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // v4.t
    public final boolean b() {
        return false;
    }
}
