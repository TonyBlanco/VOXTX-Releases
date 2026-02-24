package androidx.navigation;

import androidx.lifecycle.I;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.M;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;
import m0.AbstractC2215a;

/* JADX INFO: loaded from: classes.dex */
public class g extends I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final J.b f16372b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f16373a = new HashMap();

    public class a implements J.b {
        @Override // androidx.lifecycle.J.b
        public /* synthetic */ I a(Class cls, AbstractC2215a abstractC2215a) {
            return K.b(this, cls, abstractC2215a);
        }

        @Override // androidx.lifecycle.J.b
        public I b(Class cls) {
            return new g();
        }
    }

    public static g c(M m9) {
        return (g) new J(m9, f16372b).a(g.class);
    }

    public void b(UUID uuid) {
        M m9 = (M) this.f16373a.remove(uuid);
        if (m9 != null) {
            m9.a();
        }
    }

    public M d(UUID uuid) {
        M m9 = (M) this.f16373a.get(uuid);
        if (m9 != null) {
            return m9;
        }
        M m10 = new M();
        this.f16373a.put(uuid, m10);
        return m10;
    }

    @Override // androidx.lifecycle.I
    public void onCleared() {
        Iterator it = this.f16373a.values().iterator();
        while (it.hasNext()) {
            ((M) it.next()).a();
        }
        this.f16373a.clear();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.f16373a.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
