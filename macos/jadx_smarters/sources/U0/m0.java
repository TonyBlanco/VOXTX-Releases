package u0;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.view.Display;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import u0.AbstractC2808H;
import u0.C2806F;
import u0.C2809I;
import u0.C2812L;
import u0.d0;
import u0.e0;
import u0.f0;

/* JADX INFO: loaded from: classes.dex */
public abstract class m0 extends AbstractC2808H {

    public static class a extends d {
        public a(Context context, e eVar) {
            super(context, eVar);
        }

        @Override // u0.m0.d, u0.m0.c, u0.m0.b
        public void O(b.C0464b c0464b, C2806F.a aVar) {
            super.O(c0464b, aVar);
            aVar.i(c0.a(c0464b.f51127a));
        }
    }

    public static class b extends m0 implements d0.a, d0.e {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final ArrayList f51114t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final ArrayList f51115u;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final e f51116j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Object f51117k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Object f51118l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Object f51119m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Object f51120n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f51121o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f51122p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f51123q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final ArrayList f51124r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final ArrayList f51125s;

        public static final class a extends AbstractC2808H.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f51126a;

            public a(Object obj) {
                this.f51126a = obj;
            }

            @Override // u0.AbstractC2808H.e
            public void f(int i9) {
                d0.c.i(this.f51126a, i9);
            }

            @Override // u0.AbstractC2808H.e
            public void i(int i9) {
                d0.c.j(this.f51126a, i9);
            }
        }

        /* JADX INFO: renamed from: u0.m0$b$b, reason: collision with other inner class name */
        public static final class C0464b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f51127a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f51128b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public C2806F f51129c;

            public C0464b(Object obj, String str) {
                this.f51127a = obj;
                this.f51128b = str;
            }
        }

        public static final class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C2812L.h f51130a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f51131b;

            public c(C2812L.h hVar, Object obj) {
                this.f51130a = hVar;
                this.f51131b = obj;
            }
        }

        static {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
            ArrayList arrayList = new ArrayList();
            f51114t = arrayList;
            arrayList.add(intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
            ArrayList arrayList2 = new ArrayList();
            f51115u = arrayList2;
            arrayList2.add(intentFilter2);
        }

        public b(Context context, e eVar) {
            super(context);
            this.f51124r = new ArrayList();
            this.f51125s = new ArrayList();
            this.f51116j = eVar;
            Object objE = d0.e(context);
            this.f51117k = objE;
            this.f51118l = G();
            this.f51119m = H();
            this.f51120n = d0.b(objE, context.getResources().getString(t0.j.f50597s), false);
            T();
        }

        @Override // u0.m0
        public void A(C2812L.h hVar) {
            if (hVar.r() == this) {
                int I9 = I(d0.g(this.f51117k, 8388611));
                if (I9 < 0 || !((C0464b) this.f51124r.get(I9)).f51128b.equals(hVar.e())) {
                    return;
                }
                hVar.I();
                return;
            }
            Object objC = d0.c(this.f51117k, this.f51120n);
            c cVar = new c(hVar, objC);
            d0.c.k(objC, cVar);
            d0.d.f(objC, this.f51119m);
            U(cVar);
            this.f51125s.add(cVar);
            d0.a(this.f51117k, objC);
        }

        @Override // u0.m0
        public void B(C2812L.h hVar) {
            int iK;
            if (hVar.r() == this || (iK = K(hVar)) < 0) {
                return;
            }
            U((c) this.f51125s.get(iK));
        }

        @Override // u0.m0
        public void C(C2812L.h hVar) {
            int iK;
            if (hVar.r() == this || (iK = K(hVar)) < 0) {
                return;
            }
            c cVar = (c) this.f51125s.remove(iK);
            d0.c.k(cVar.f51131b, null);
            d0.d.f(cVar.f51131b, null);
            d0.i(this.f51117k, cVar.f51131b);
        }

        @Override // u0.m0
        public void D(C2812L.h hVar) {
            Object obj;
            if (hVar.C()) {
                if (hVar.r() != this) {
                    int iK = K(hVar);
                    if (iK < 0) {
                        return;
                    } else {
                        obj = ((c) this.f51125s.get(iK)).f51131b;
                    }
                } else {
                    int iJ = J(hVar.e());
                    if (iJ < 0) {
                        return;
                    } else {
                        obj = ((C0464b) this.f51124r.get(iJ)).f51127a;
                    }
                }
                Q(obj);
            }
        }

        public final boolean E(Object obj) {
            if (N(obj) != null || I(obj) >= 0) {
                return false;
            }
            C0464b c0464b = new C0464b(obj, F(obj));
            S(c0464b);
            this.f51124r.add(c0464b);
            return true;
        }

        public final String F(Object obj) {
            String str = L() == obj ? "DEFAULT_ROUTE" : String.format(Locale.US, "ROUTE_%08x", Integer.valueOf(M(obj).hashCode()));
            if (J(str) < 0) {
                return str;
            }
            int i9 = 2;
            while (true) {
                String str2 = String.format(Locale.US, "%s_%d", str, Integer.valueOf(i9));
                if (J(str2) < 0) {
                    return str2;
                }
                i9++;
            }
        }

        public abstract Object G();

        public Object H() {
            return d0.d(this);
        }

        public int I(Object obj) {
            int size = this.f51124r.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (((C0464b) this.f51124r.get(i9)).f51127a == obj) {
                    return i9;
                }
            }
            return -1;
        }

        public int J(String str) {
            int size = this.f51124r.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (((C0464b) this.f51124r.get(i9)).f51128b.equals(str)) {
                    return i9;
                }
            }
            return -1;
        }

        public int K(C2812L.h hVar) {
            int size = this.f51125s.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (((c) this.f51125s.get(i9)).f51130a == hVar) {
                    return i9;
                }
            }
            return -1;
        }

        public abstract Object L();

        public String M(Object obj) {
            CharSequence charSequenceA = d0.c.a(obj, n());
            return charSequenceA != null ? charSequenceA.toString() : "";
        }

        public c N(Object obj) {
            Object objE = d0.c.e(obj);
            if (objE instanceof c) {
                return (c) objE;
            }
            return null;
        }

        public void O(C0464b c0464b, C2806F.a aVar) {
            int iD = d0.c.d(c0464b.f51127a);
            if ((iD & 1) != 0) {
                aVar.b(f51114t);
            }
            if ((iD & 2) != 0) {
                aVar.b(f51115u);
            }
            aVar.p(d0.c.c(c0464b.f51127a));
            aVar.o(d0.c.b(c0464b.f51127a));
            aVar.r(d0.c.f(c0464b.f51127a));
            aVar.t(d0.c.h(c0464b.f51127a));
            aVar.s(d0.c.g(c0464b.f51127a));
        }

        public void P() {
            C2809I.a aVar = new C2809I.a();
            int size = this.f51124r.size();
            for (int i9 = 0; i9 < size; i9++) {
                aVar.a(((C0464b) this.f51124r.get(i9)).f51129c);
            }
            w(aVar.c());
        }

        public abstract void Q(Object obj);

        public abstract void R();

        public void S(C0464b c0464b) {
            C2806F.a aVar = new C2806F.a(c0464b.f51128b, M(c0464b.f51127a));
            O(c0464b, aVar);
            c0464b.f51129c = aVar.e();
        }

        public final void T() {
            R();
            Iterator it = d0.f(this.f51117k).iterator();
            boolean zE = false;
            while (it.hasNext()) {
                zE |= E(it.next());
            }
            if (zE) {
                P();
            }
        }

        public void U(c cVar) {
            d0.d.a(cVar.f51131b, cVar.f51130a.m());
            d0.d.c(cVar.f51131b, cVar.f51130a.o());
            d0.d.b(cVar.f51131b, cVar.f51130a.n());
            d0.d.e(cVar.f51131b, cVar.f51130a.s());
            d0.d.h(cVar.f51131b, cVar.f51130a.u());
            d0.d.g(cVar.f51131b, cVar.f51130a.t());
        }

        @Override // u0.d0.e
        public void a(Object obj, int i9) {
            c cVarN = N(obj);
            if (cVarN != null) {
                cVarN.f51130a.H(i9);
            }
        }

        @Override // u0.d0.a
        public void b(Object obj, Object obj2) {
        }

        @Override // u0.d0.a
        public void c(Object obj, Object obj2, int i9) {
        }

        @Override // u0.d0.e
        public void d(Object obj, int i9) {
            c cVarN = N(obj);
            if (cVarN != null) {
                cVarN.f51130a.G(i9);
            }
        }

        @Override // u0.d0.a
        public void e(Object obj) {
            int I9;
            if (N(obj) != null || (I9 = I(obj)) < 0) {
                return;
            }
            S((C0464b) this.f51124r.get(I9));
            P();
        }

        @Override // u0.d0.a
        public void f(int i9, Object obj) {
        }

        @Override // u0.d0.a
        public void g(Object obj) {
            int I9;
            if (N(obj) != null || (I9 = I(obj)) < 0) {
                return;
            }
            this.f51124r.remove(I9);
            P();
        }

        @Override // u0.d0.a
        public void h(int i9, Object obj) {
            if (obj != d0.g(this.f51117k, 8388611)) {
                return;
            }
            c cVarN = N(obj);
            if (cVarN != null) {
                cVarN.f51130a.I();
                return;
            }
            int I9 = I(obj);
            if (I9 >= 0) {
                this.f51116j.c(((C0464b) this.f51124r.get(I9)).f51128b);
            }
        }

        @Override // u0.d0.a
        public void j(Object obj) {
            if (E(obj)) {
                P();
            }
        }

        @Override // u0.d0.a
        public void k(Object obj) {
            int I9;
            if (N(obj) != null || (I9 = I(obj)) < 0) {
                return;
            }
            C0464b c0464b = (C0464b) this.f51124r.get(I9);
            int iF = d0.c.f(obj);
            if (iF != c0464b.f51129c.t()) {
                c0464b.f51129c = new C2806F.a(c0464b.f51129c).r(iF).e();
                P();
            }
        }

        @Override // u0.AbstractC2808H
        public AbstractC2808H.e s(String str) {
            int iJ = J(str);
            if (iJ >= 0) {
                return new a(((C0464b) this.f51124r.get(iJ)).f51127a);
            }
            return null;
        }

        @Override // u0.AbstractC2808H
        public void u(C2807G c2807g) {
            boolean zD;
            int i9 = 0;
            if (c2807g != null) {
                List listE = c2807g.c().e();
                int size = listE.size();
                int i10 = 0;
                while (i9 < size) {
                    String str = (String) listE.get(i9);
                    i10 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i10 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i10 | 2 : i10 | 8388608;
                    i9++;
                }
                zD = c2807g.d();
                i9 = i10;
            } else {
                zD = false;
            }
            if (this.f51121o == i9 && this.f51122p == zD) {
                return;
            }
            this.f51121o = i9;
            this.f51122p = zD;
            T();
        }
    }

    public static class c extends b implements e0.a {
        public c(Context context, e eVar) {
            super(context, eVar);
        }

        @Override // u0.m0.b
        public Object G() {
            return e0.a(this);
        }

        @Override // u0.m0.b
        public void O(b.C0464b c0464b, C2806F.a aVar) {
            super.O(c0464b, aVar);
            if (!e0.c.b(c0464b.f51127a)) {
                aVar.j(false);
            }
            if (V(c0464b)) {
                aVar.g(1);
            }
            Display displayA = e0.c.a(c0464b.f51127a);
            if (displayA != null) {
                aVar.q(displayA.getDisplayId());
            }
        }

        public abstract boolean V(b.C0464b c0464b);

        @Override // u0.e0.a
        public void i(Object obj) {
            int I9 = I(obj);
            if (I9 >= 0) {
                b.C0464b c0464b = (b.C0464b) this.f51124r.get(I9);
                Display displayA = e0.c.a(obj);
                int displayId = displayA != null ? displayA.getDisplayId() : -1;
                if (displayId != c0464b.f51129c.r()) {
                    c0464b.f51129c = new C2806F.a(c0464b.f51129c).q(displayId).e();
                    P();
                }
            }
        }
    }

    public static class d extends c {
        public d(Context context, e eVar) {
            super(context, eVar);
        }

        @Override // u0.m0.b
        public Object L() {
            return f0.b(this.f51117k);
        }

        @Override // u0.m0.c, u0.m0.b
        public void O(b.C0464b c0464b, C2806F.a aVar) {
            super.O(c0464b, aVar);
            CharSequence charSequenceA = f0.a.a(c0464b.f51127a);
            if (charSequenceA != null) {
                aVar.h(charSequenceA.toString());
            }
        }

        @Override // u0.m0.b
        public void Q(Object obj) {
            d0.j(this.f51117k, 8388611, obj);
        }

        @Override // u0.m0.b
        public void R() {
            if (this.f51123q) {
                d0.h(this.f51117k, this.f51118l);
            }
            this.f51123q = true;
            f0.a(this.f51117k, this.f51121o, this.f51118l, (this.f51122p ? 1 : 0) | 2);
        }

        @Override // u0.m0.b
        public void U(b.c cVar) {
            super.U(cVar);
            f0.b.a(cVar.f51131b, cVar.f51130a.d());
        }

        @Override // u0.m0.c
        public boolean V(b.C0464b c0464b) {
            return f0.a.b(c0464b.f51127a);
        }
    }

    public interface e {
        void c(String str);
    }

    public m0(Context context) {
        super(context, new AbstractC2808H.d(new ComponentName("android", m0.class.getName())));
    }

    public static m0 z(Context context, e eVar) {
        return Build.VERSION.SDK_INT >= 24 ? new a(context, eVar) : new d(context, eVar);
    }

    public abstract void A(C2812L.h hVar);

    public abstract void B(C2812L.h hVar);

    public abstract void C(C2812L.h hVar);

    public abstract void D(C2812L.h hVar);
}
