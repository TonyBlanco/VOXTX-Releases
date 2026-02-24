package androidx.datastore.preferences.protobuf;

import d.AbstractC1617D;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class T implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O f14608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f14609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC1131p f14611d;

    public T(l0 l0Var, AbstractC1131p abstractC1131p, O o9) {
        this.f14609b = l0Var;
        this.f14610c = abstractC1131p.e(o9);
        this.f14611d = abstractC1131p;
        this.f14608a = o9;
    }

    private int j(l0 l0Var, Object obj) {
        return l0Var.i(l0Var.g(obj));
    }

    private void k(l0 l0Var, AbstractC1131p abstractC1131p, Object obj, d0 d0Var, C1130o c1130o) {
        Object objF = l0Var.f(obj);
        C1133s c1133sD = abstractC1131p.d(obj);
        while (d0Var.E() != Integer.MAX_VALUE) {
            try {
                if (!m(d0Var, c1130o, abstractC1131p, c1133sD, l0Var, objF)) {
                    return;
                }
            } finally {
                l0Var.o(obj, objF);
            }
        }
    }

    public static T l(l0 l0Var, AbstractC1131p abstractC1131p, O o9) {
        return new T(l0Var, abstractC1131p, o9);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void a(Object obj, Object obj2) {
        g0.F(this.f14609b, obj, obj2);
        if (this.f14610c) {
            g0.D(this.f14611d, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void b(Object obj, d0 d0Var, C1130o c1130o) {
        k(this.f14609b, this.f14611d, obj, d0Var, c1130o);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void c(Object obj) {
        this.f14609b.j(obj);
        this.f14611d.f(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public final boolean d(Object obj) {
        return this.f14611d.c(obj).k();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int e(Object obj) {
        int iJ = j(this.f14609b, obj);
        return this.f14610c ? iJ + this.f14611d.c(obj).f() : iJ;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public Object f() {
        return this.f14608a.e().r();
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public int g(Object obj) {
        int iHashCode = this.f14609b.g(obj).hashCode();
        return this.f14610c ? (iHashCode * 53) + this.f14611d.c(obj).hashCode() : iHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public void h(Object obj, s0 s0Var) {
        Iterator itN = this.f14611d.c(obj).n();
        if (itN.hasNext()) {
            AbstractC1617D.a(((Map.Entry) itN.next()).getKey());
            throw null;
        }
        n(this.f14609b, obj, s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.e0
    public boolean i(Object obj, Object obj2) {
        if (!this.f14609b.g(obj).equals(this.f14609b.g(obj2))) {
            return false;
        }
        if (this.f14610c) {
            return this.f14611d.c(obj).equals(this.f14611d.c(obj2));
        }
        return true;
    }

    public final boolean m(d0 d0Var, C1130o c1130o, AbstractC1131p abstractC1131p, C1133s c1133s, l0 l0Var, Object obj) throws C1140z {
        int tag = d0Var.getTag();
        if (tag != r0.f14751a) {
            if (r0.b(tag) != 2) {
                return d0Var.I();
            }
            Object objB = abstractC1131p.b(c1130o, this.f14608a, r0.a(tag));
            if (objB == null) {
                return l0Var.m(obj, d0Var);
            }
            abstractC1131p.h(d0Var, objB, c1130o, c1133s);
            return true;
        }
        Object objB2 = null;
        AbstractC1122g abstractC1122gP = null;
        int iH = 0;
        while (d0Var.E() != Integer.MAX_VALUE) {
            int tag2 = d0Var.getTag();
            if (tag2 == r0.f14753c) {
                iH = d0Var.h();
                objB2 = abstractC1131p.b(c1130o, this.f14608a, iH);
            } else if (tag2 == r0.f14754d) {
                if (objB2 != null) {
                    abstractC1131p.h(d0Var, objB2, c1130o, c1133s);
                } else {
                    abstractC1122gP = d0Var.p();
                }
            } else if (!d0Var.I()) {
                break;
            }
        }
        if (d0Var.getTag() != r0.f14752b) {
            throw C1140z.a();
        }
        if (abstractC1122gP != null) {
            if (objB2 != null) {
                abstractC1131p.i(abstractC1122gP, objB2, c1130o, c1133s);
            } else {
                l0Var.d(obj, iH, abstractC1122gP);
            }
        }
        return true;
    }

    public final void n(l0 l0Var, Object obj, s0 s0Var) {
        l0Var.s(l0Var.g(obj), s0Var);
    }
}
