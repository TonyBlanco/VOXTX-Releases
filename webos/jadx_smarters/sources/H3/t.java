package H3;

import android.util.SparseArray;
import d4.Z;

/* JADX INFO: loaded from: classes3.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray f2595a = new SparseArray();

    public Z a(int i9) {
        Z z9 = (Z) this.f2595a.get(i9);
        if (z9 != null) {
            return z9;
        }
        Z z10 = new Z(9223372036854775806L);
        this.f2595a.put(i9, z10);
        return z10;
    }

    public void b() {
        this.f2595a.clear();
    }
}
