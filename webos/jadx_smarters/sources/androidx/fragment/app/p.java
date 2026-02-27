package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.I;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import androidx.lifecycle.M;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import m0.AbstractC2215a;

/* JADX INFO: loaded from: classes.dex */
public final class p extends I {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final J.b f15116h = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15120d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f15117a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f15118b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f15119c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15121e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15122f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15123g = false;

    public class a implements J.b {
        @Override // androidx.lifecycle.J.b
        public /* synthetic */ I a(Class cls, AbstractC2215a abstractC2215a) {
            return K.b(this, cls, abstractC2215a);
        }

        @Override // androidx.lifecycle.J.b
        public I b(Class cls) {
            return new p(true);
        }
    }

    public p(boolean z9) {
        this.f15120d = z9;
    }

    public static p f(M m9) {
        return (p) new J(m9, f15116h).a(p.class);
    }

    public void b(Fragment fragment) {
        if (this.f15123g) {
            if (m.F0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f15117a.containsKey(fragment.mWho)) {
                return;
            }
            this.f15117a.put(fragment.mWho, fragment);
            if (m.F0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public void c(Fragment fragment) {
        if (m.F0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        p pVar = (p) this.f15118b.get(fragment.mWho);
        if (pVar != null) {
            pVar.onCleared();
            this.f15118b.remove(fragment.mWho);
        }
        M m9 = (M) this.f15119c.get(fragment.mWho);
        if (m9 != null) {
            m9.a();
            this.f15119c.remove(fragment.mWho);
        }
    }

    public Fragment d(String str) {
        return (Fragment) this.f15117a.get(str);
    }

    public p e(Fragment fragment) {
        p pVar = (p) this.f15118b.get(fragment.mWho);
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p(this.f15120d);
        this.f15118b.put(fragment.mWho, pVar2);
        return pVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.f15117a.equals(pVar.f15117a) && this.f15118b.equals(pVar.f15118b) && this.f15119c.equals(pVar.f15119c);
    }

    public Collection g() {
        return new ArrayList(this.f15117a.values());
    }

    public M h(Fragment fragment) {
        M m9 = (M) this.f15119c.get(fragment.mWho);
        if (m9 != null) {
            return m9;
        }
        M m10 = new M();
        this.f15119c.put(fragment.mWho, m10);
        return m10;
    }

    public int hashCode() {
        return (((this.f15117a.hashCode() * 31) + this.f15118b.hashCode()) * 31) + this.f15119c.hashCode();
    }

    public boolean i() {
        return this.f15121e;
    }

    public void j(Fragment fragment) {
        if (this.f15123g) {
            if (m.F0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f15117a.remove(fragment.mWho) == null || !m.F0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    public void k(boolean z9) {
        this.f15123g = z9;
    }

    public boolean l(Fragment fragment) {
        if (this.f15117a.containsKey(fragment.mWho)) {
            return this.f15120d ? this.f15121e : !this.f15122f;
        }
        return true;
    }

    @Override // androidx.lifecycle.I
    public void onCleared() {
        if (m.F0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f15121e = true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f15117a.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f15118b.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f15119c.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
