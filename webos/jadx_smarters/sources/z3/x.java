package Z3;

import B3.g0;
import O2.InterfaceC0901n;
import android.os.Bundle;
import d4.AbstractC1684a;
import d4.k0;
import java.util.Collections;
import java.util.List;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public final class x implements InterfaceC0901n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f11263d = k0.A0(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f11264e = k0.A0(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final InterfaceC0901n.a f11265f = new InterfaceC0901n.a() { // from class: Z3.w
        @Override // O2.InterfaceC0901n.a
        public final InterfaceC0901n a(Bundle bundle) {
            return x.c(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f11266a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC2743y f11267c;

    public x(g0 g0Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= g0Var.f581a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f11266a = g0Var;
        this.f11267c = AbstractC2743y.r(list);
    }

    public static /* synthetic */ x c(Bundle bundle) {
        return new x((g0) g0.f580i.a((Bundle) AbstractC1684a.e(bundle.getBundle(f11263d))), w5.f.c((int[]) AbstractC1684a.e(bundle.getIntArray(f11264e))));
    }

    public int b() {
        return this.f11266a.f583d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return this.f11266a.equals(xVar.f11266a) && this.f11267c.equals(xVar.f11267c);
    }

    @Override // O2.InterfaceC0901n
    public Bundle h() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f11263d, this.f11266a.h());
        bundle.putIntArray(f11264e, w5.f.l(this.f11267c));
        return bundle;
    }

    public int hashCode() {
        return this.f11266a.hashCode() + (this.f11267c.hashCode() * 31);
    }
}
