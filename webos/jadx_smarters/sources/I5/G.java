package I5;

import j6.InterfaceC2101a;
import j6.InterfaceC2102b;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class G implements InterfaceC0639e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f2853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f2854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f2855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f2856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f2857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f2858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC0639e f2859g;

    public static class a implements g6.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f2860a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g6.c f2861b;

        public a(Set set, g6.c cVar) {
            this.f2860a = set;
            this.f2861b = cVar;
        }
    }

    public G(C0637c c0637c, InterfaceC0639e interfaceC0639e) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (r rVar : c0637c.g()) {
            if (rVar.e()) {
                boolean zG = rVar.g();
                F fC = rVar.c();
                if (zG) {
                    hashSet4.add(fC);
                } else {
                    hashSet.add(fC);
                }
            } else if (rVar.d()) {
                hashSet3.add(rVar.c());
            } else {
                boolean zG2 = rVar.g();
                F fC2 = rVar.c();
                if (zG2) {
                    hashSet5.add(fC2);
                } else {
                    hashSet2.add(fC2);
                }
            }
        }
        if (!c0637c.k().isEmpty()) {
            hashSet.add(F.b(g6.c.class));
        }
        this.f2853a = Collections.unmodifiableSet(hashSet);
        this.f2854b = Collections.unmodifiableSet(hashSet2);
        this.f2855c = Collections.unmodifiableSet(hashSet3);
        this.f2856d = Collections.unmodifiableSet(hashSet4);
        this.f2857e = Collections.unmodifiableSet(hashSet5);
        this.f2858f = c0637c.k();
        this.f2859g = interfaceC0639e;
    }

    @Override // I5.InterfaceC0639e
    public Object a(Class cls) {
        if (!this.f2853a.contains(F.b(cls))) {
            throw new t(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object objA = this.f2859g.a(cls);
        return !cls.equals(g6.c.class) ? objA : new a(this.f2858f, (g6.c) objA);
    }

    @Override // I5.InterfaceC0639e
    public Object b(F f9) {
        if (this.f2853a.contains(f9)) {
            return this.f2859g.b(f9);
        }
        throw new t(String.format("Attempting to request an undeclared dependency %s.", f9));
    }

    @Override // I5.InterfaceC0639e
    public /* synthetic */ Set c(Class cls) {
        return AbstractC0638d.f(this, cls);
    }

    @Override // I5.InterfaceC0639e
    public Set d(F f9) {
        if (this.f2856d.contains(f9)) {
            return this.f2859g.d(f9);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Set<%s>.", f9));
    }

    @Override // I5.InterfaceC0639e
    public InterfaceC2102b e(F f9) {
        if (this.f2854b.contains(f9)) {
            return this.f2859g.e(f9);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<%s>.", f9));
    }

    @Override // I5.InterfaceC0639e
    public InterfaceC2102b f(F f9) {
        if (this.f2857e.contains(f9)) {
            return this.f2859g.f(f9);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", f9));
    }

    @Override // I5.InterfaceC0639e
    public InterfaceC2102b g(Class cls) {
        return e(F.b(cls));
    }

    @Override // I5.InterfaceC0639e
    public InterfaceC2101a h(F f9) {
        if (this.f2855c.contains(f9)) {
            return this.f2859g.h(f9);
        }
        throw new t(String.format("Attempting to request an undeclared dependency Deferred<%s>.", f9));
    }

    @Override // I5.InterfaceC0639e
    public InterfaceC2101a i(Class cls) {
        return h(F.b(cls));
    }
}
