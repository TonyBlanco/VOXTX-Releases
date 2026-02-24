package K0;

import K0.AbstractC0681l;
import L.e;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: K0.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0674e extends androidx.fragment.app.z {

    /* JADX INFO: renamed from: K0.e$a */
    public class a extends AbstractC0681l.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f3487a;

        public a(Rect rect) {
            this.f3487a = rect;
        }
    }

    /* JADX INFO: renamed from: K0.e$b */
    public class b implements AbstractC0681l.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f3489a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3490c;

        public b(View view, ArrayList arrayList) {
            this.f3489a = view;
            this.f3490c = arrayList;
        }

        @Override // K0.AbstractC0681l.f
        public void a(AbstractC0681l abstractC0681l) {
            abstractC0681l.Q(this);
            abstractC0681l.b(this);
        }

        @Override // K0.AbstractC0681l.f
        public void b(AbstractC0681l abstractC0681l) {
        }

        @Override // K0.AbstractC0681l.f
        public void c(AbstractC0681l abstractC0681l) {
            abstractC0681l.Q(this);
            this.f3489a.setVisibility(8);
            int size = this.f3490c.size();
            for (int i9 = 0; i9 < size; i9++) {
                ((View) this.f3490c.get(i9)).setVisibility(0);
            }
        }

        @Override // K0.AbstractC0681l.f
        public void d(AbstractC0681l abstractC0681l) {
        }

        @Override // K0.AbstractC0681l.f
        public void e(AbstractC0681l abstractC0681l) {
        }
    }

    /* JADX INFO: renamed from: K0.e$c */
    public class c extends AbstractC0682m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f3492a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3493c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f3494d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3495e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Object f3496f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ ArrayList f3497g;

        public c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f3492a = obj;
            this.f3493c = arrayList;
            this.f3494d = obj2;
            this.f3495e = arrayList2;
            this.f3496f = obj3;
            this.f3497g = arrayList3;
        }

        @Override // K0.AbstractC0682m, K0.AbstractC0681l.f
        public void a(AbstractC0681l abstractC0681l) {
            Object obj = this.f3492a;
            if (obj != null) {
                C0674e.this.q(obj, this.f3493c, null);
            }
            Object obj2 = this.f3494d;
            if (obj2 != null) {
                C0674e.this.q(obj2, this.f3495e, null);
            }
            Object obj3 = this.f3496f;
            if (obj3 != null) {
                C0674e.this.q(obj3, this.f3497g, null);
            }
        }

        @Override // K0.AbstractC0681l.f
        public void c(AbstractC0681l abstractC0681l) {
            abstractC0681l.Q(this);
        }
    }

    /* JADX INFO: renamed from: K0.e$d */
    public class d implements e.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC0681l f3499a;

        public d(AbstractC0681l abstractC0681l) {
            this.f3499a = abstractC0681l;
        }

        @Override // L.e.b
        public void a() {
            this.f3499a.cancel();
        }
    }

    /* JADX INFO: renamed from: K0.e$e, reason: collision with other inner class name */
    public class C0055e implements AbstractC0681l.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f3501a;

        public C0055e(Runnable runnable) {
            this.f3501a = runnable;
        }

        @Override // K0.AbstractC0681l.f
        public void a(AbstractC0681l abstractC0681l) {
        }

        @Override // K0.AbstractC0681l.f
        public void b(AbstractC0681l abstractC0681l) {
        }

        @Override // K0.AbstractC0681l.f
        public void c(AbstractC0681l abstractC0681l) {
            this.f3501a.run();
        }

        @Override // K0.AbstractC0681l.f
        public void d(AbstractC0681l abstractC0681l) {
        }

        @Override // K0.AbstractC0681l.f
        public void e(AbstractC0681l abstractC0681l) {
        }
    }

    /* JADX INFO: renamed from: K0.e$f */
    public class f extends AbstractC0681l.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Rect f3503a;

        public f(Rect rect) {
            this.f3503a = rect;
        }
    }

    public static boolean C(AbstractC0681l abstractC0681l) {
        return (androidx.fragment.app.z.l(abstractC0681l.A()) && androidx.fragment.app.z.l(abstractC0681l.B()) && androidx.fragment.app.z.l(abstractC0681l.C())) ? false : true;
    }

    @Override // androidx.fragment.app.z
    public void A(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        C0685p c0685p = (C0685p) obj;
        if (c0685p != null) {
            c0685p.D().clear();
            c0685p.D().addAll(arrayList2);
            q(c0685p, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.z
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        C0685p c0685p = new C0685p();
        c0685p.f0((AbstractC0681l) obj);
        return c0685p;
    }

    @Override // androidx.fragment.app.z
    public void a(Object obj, View view) {
        if (obj != null) {
            ((AbstractC0681l) obj).c(view);
        }
    }

    @Override // androidx.fragment.app.z
    public void b(Object obj, ArrayList arrayList) {
        AbstractC0681l abstractC0681l = (AbstractC0681l) obj;
        if (abstractC0681l == null) {
            return;
        }
        int i9 = 0;
        if (abstractC0681l instanceof C0685p) {
            C0685p c0685p = (C0685p) abstractC0681l;
            int iI0 = c0685p.i0();
            while (i9 < iI0) {
                b(c0685p.h0(i9), arrayList);
                i9++;
            }
            return;
        }
        if (C(abstractC0681l) || !androidx.fragment.app.z.l(abstractC0681l.D())) {
            return;
        }
        int size = arrayList.size();
        while (i9 < size) {
            abstractC0681l.c((View) arrayList.get(i9));
            i9++;
        }
    }

    @Override // androidx.fragment.app.z
    public void c(ViewGroup viewGroup, Object obj) {
        AbstractC0683n.b(viewGroup, (AbstractC0681l) obj);
    }

    @Override // androidx.fragment.app.z
    public boolean e(Object obj) {
        return obj instanceof AbstractC0681l;
    }

    @Override // androidx.fragment.app.z
    public Object g(Object obj) {
        if (obj != null) {
            return ((AbstractC0681l) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.z
    public Object m(Object obj, Object obj2, Object obj3) {
        AbstractC0681l abstractC0681lN0 = (AbstractC0681l) obj;
        AbstractC0681l abstractC0681l = (AbstractC0681l) obj2;
        AbstractC0681l abstractC0681l2 = (AbstractC0681l) obj3;
        if (abstractC0681lN0 != null && abstractC0681l != null) {
            abstractC0681lN0 = new C0685p().f0(abstractC0681lN0).f0(abstractC0681l).n0(1);
        } else if (abstractC0681lN0 == null) {
            abstractC0681lN0 = abstractC0681l != null ? abstractC0681l : null;
        }
        if (abstractC0681l2 == null) {
            return abstractC0681lN0;
        }
        C0685p c0685p = new C0685p();
        if (abstractC0681lN0 != null) {
            c0685p.f0(abstractC0681lN0);
        }
        c0685p.f0(abstractC0681l2);
        return c0685p;
    }

    @Override // androidx.fragment.app.z
    public Object n(Object obj, Object obj2, Object obj3) {
        C0685p c0685p = new C0685p();
        if (obj != null) {
            c0685p.f0((AbstractC0681l) obj);
        }
        if (obj2 != null) {
            c0685p.f0((AbstractC0681l) obj2);
        }
        if (obj3 != null) {
            c0685p.f0((AbstractC0681l) obj3);
        }
        return c0685p;
    }

    @Override // androidx.fragment.app.z
    public void p(Object obj, View view) {
        if (obj != null) {
            ((AbstractC0681l) obj).R(view);
        }
    }

    @Override // androidx.fragment.app.z
    public void q(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        AbstractC0681l abstractC0681l = (AbstractC0681l) obj;
        int i9 = 0;
        if (abstractC0681l instanceof C0685p) {
            C0685p c0685p = (C0685p) abstractC0681l;
            int iI0 = c0685p.i0();
            while (i9 < iI0) {
                q(c0685p.h0(i9), arrayList, arrayList2);
                i9++;
            }
            return;
        }
        if (C(abstractC0681l)) {
            return;
        }
        List listD = abstractC0681l.D();
        if (listD.size() == arrayList.size() && listD.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i9 < size) {
                abstractC0681l.c((View) arrayList2.get(i9));
                i9++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                abstractC0681l.R((View) arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.z
    public void r(Object obj, View view, ArrayList arrayList) {
        ((AbstractC0681l) obj).b(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.z
    public void t(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3) {
        ((AbstractC0681l) obj).b(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.z
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((AbstractC0681l) obj).W(new f(rect));
        }
    }

    @Override // androidx.fragment.app.z
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((AbstractC0681l) obj).W(new a(rect));
        }
    }

    @Override // androidx.fragment.app.z
    public void w(Fragment fragment, Object obj, L.e eVar, Runnable runnable) {
        AbstractC0681l abstractC0681l = (AbstractC0681l) obj;
        eVar.d(new d(abstractC0681l));
        abstractC0681l.b(new C0055e(runnable));
    }

    @Override // androidx.fragment.app.z
    public void z(Object obj, View view, ArrayList arrayList) {
        C0685p c0685p = (C0685p) obj;
        List listD = c0685p.D();
        listD.clear();
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            androidx.fragment.app.z.d(listD, (View) arrayList.get(i9));
        }
        listD.add(view);
        arrayList.add(view);
        b(c0685p, arrayList);
    }
}
