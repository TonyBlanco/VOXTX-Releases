package v4;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends t {
    public s(int i9, int i10, Bundle bundle) {
        super(i9, 2, bundle);
    }

    @Override // v4.t
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new u(4, "Invalid response to one way request", null));
        }
    }

    @Override // v4.t
    public final boolean b() {
        return true;
    }
}
