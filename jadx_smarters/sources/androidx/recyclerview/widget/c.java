package androidx.recyclerview.widget;

import P.L;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c extends n {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f16901s;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f16902h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f16903i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f16904j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f16905k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f16906l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f16907m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f16908n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f16909o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f16910p = new ArrayList();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f16911q = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f16912r = new ArrayList();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f16913a;

        public a(ArrayList arrayList) {
            this.f16913a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (j jVar : this.f16913a) {
                c.this.U(jVar.f16947a, jVar.f16948b, jVar.f16949c, jVar.f16950d, jVar.f16951e);
            }
            this.f16913a.clear();
            c.this.f16907m.remove(this.f16913a);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f16915a;

        public b(ArrayList arrayList) {
            this.f16915a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f16915a.iterator();
            while (it.hasNext()) {
                c.this.T((i) it.next());
            }
            this.f16915a.clear();
            c.this.f16908n.remove(this.f16915a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$c, reason: collision with other inner class name */
    public class RunnableC0192c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f16917a;

        public RunnableC0192c(ArrayList arrayList) {
            this.f16917a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f16917a.iterator();
            while (it.hasNext()) {
                c.this.S((RecyclerView.D) it.next());
            }
            this.f16917a.clear();
            c.this.f16906l.remove(this.f16917a);
        }
    }

    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.D f16919a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f16920c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f16921d;

        public d(RecyclerView.D d9, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f16919a = d9;
            this.f16920c = viewPropertyAnimator;
            this.f16921d = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f16920c.setListener(null);
            this.f16921d.setAlpha(1.0f);
            c.this.H(this.f16919a);
            c.this.f16911q.remove(this.f16919a);
            c.this.X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.I(this.f16919a);
        }
    }

    public class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.D f16923a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f16924c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f16925d;

        public e(RecyclerView.D d9, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f16923a = d9;
            this.f16924c = view;
            this.f16925d = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f16924c.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f16925d.setListener(null);
            c.this.B(this.f16923a);
            c.this.f16909o.remove(this.f16923a);
            c.this.X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.C(this.f16923a);
        }
    }

    public class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ RecyclerView.D f16927a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f16928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f16929d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f16930e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f16931f;

        public f(RecyclerView.D d9, int i9, View view, int i10, ViewPropertyAnimator viewPropertyAnimator) {
            this.f16927a = d9;
            this.f16928c = i9;
            this.f16929d = view;
            this.f16930e = i10;
            this.f16931f = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f16928c != 0) {
                this.f16929d.setTranslationX(0.0f);
            }
            if (this.f16930e != 0) {
                this.f16929d.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f16931f.setListener(null);
            c.this.F(this.f16927a);
            c.this.f16910p.remove(this.f16927a);
            c.this.X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.G(this.f16927a);
        }
    }

    public class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f16933a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f16934c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f16935d;

        public g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f16933a = iVar;
            this.f16934c = viewPropertyAnimator;
            this.f16935d = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f16934c.setListener(null);
            this.f16935d.setAlpha(1.0f);
            this.f16935d.setTranslationX(0.0f);
            this.f16935d.setTranslationY(0.0f);
            c.this.D(this.f16933a.f16941a, true);
            c.this.f16912r.remove(this.f16933a.f16941a);
            c.this.X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.E(this.f16933a.f16941a, true);
        }
    }

    public class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f16937a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewPropertyAnimator f16938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f16939d;

        public h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f16937a = iVar;
            this.f16938c = viewPropertyAnimator;
            this.f16939d = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f16938c.setListener(null);
            this.f16939d.setAlpha(1.0f);
            this.f16939d.setTranslationX(0.0f);
            this.f16939d.setTranslationY(0.0f);
            c.this.D(this.f16937a.f16942b, false);
            c.this.f16912r.remove(this.f16937a.f16942b);
            c.this.X();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.E(this.f16937a.f16942b, false);
        }
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.D f16941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.D f16942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16943c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16944d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f16945e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f16946f;

        public i(RecyclerView.D d9, RecyclerView.D d10) {
            this.f16941a = d9;
            this.f16942b = d10;
        }

        public i(RecyclerView.D d9, RecyclerView.D d10, int i9, int i10, int i11, int i12) {
            this(d9, d10);
            this.f16943c = i9;
            this.f16944d = i10;
            this.f16945e = i11;
            this.f16946f = i12;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f16941a + ", newHolder=" + this.f16942b + ", fromX=" + this.f16943c + ", fromY=" + this.f16944d + ", toX=" + this.f16945e + ", toY=" + this.f16946f + '}';
        }
    }

    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.D f16947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f16949c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16950d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f16951e;

        public j(RecyclerView.D d9, int i9, int i10, int i11, int i12) {
            this.f16947a = d9;
            this.f16948b = i9;
            this.f16949c = i10;
            this.f16950d = i11;
            this.f16951e = i12;
        }
    }

    @Override // androidx.recyclerview.widget.n
    public boolean A(RecyclerView.D d9) {
        b0(d9);
        this.f16902h.add(d9);
        return true;
    }

    public void S(RecyclerView.D d9) {
        View view = d9.f16733a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f16909o.add(d9);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(l()).setListener(new e(d9, view, viewPropertyAnimatorAnimate)).start();
    }

    public void T(i iVar) {
        RecyclerView.D d9 = iVar.f16941a;
        View view = d9 == null ? null : d9.f16733a;
        RecyclerView.D d10 = iVar.f16942b;
        View view2 = d10 != null ? d10.f16733a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f16912r.add(iVar.f16941a);
            duration.translationX(iVar.f16945e - iVar.f16943c);
            duration.translationY(iVar.f16946f - iVar.f16944d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f16912r.add(iVar.f16942b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    public void U(RecyclerView.D d9, int i9, int i10, int i11, int i12) {
        View view = d9.f16733a;
        int i13 = i11 - i9;
        int i14 = i12 - i10;
        if (i13 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i14 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f16910p.add(d9);
        viewPropertyAnimatorAnimate.setDuration(n()).setListener(new f(d9, i13, view, i14, viewPropertyAnimatorAnimate)).start();
    }

    public final void V(RecyclerView.D d9) {
        View view = d9.f16733a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f16911q.add(d9);
        viewPropertyAnimatorAnimate.setDuration(o()).alpha(0.0f).setListener(new d(d9, viewPropertyAnimatorAnimate, view)).start();
    }

    public void W(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.D) list.get(size)).f16733a.animate().cancel();
        }
    }

    public void X() {
        if (p()) {
            return;
        }
        i();
    }

    public final void Y(List list, RecyclerView.D d9) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (a0(iVar, d9) && iVar.f16941a == null && iVar.f16942b == null) {
                list.remove(iVar);
            }
        }
    }

    public final void Z(i iVar) {
        RecyclerView.D d9 = iVar.f16941a;
        if (d9 != null) {
            a0(iVar, d9);
        }
        RecyclerView.D d10 = iVar.f16942b;
        if (d10 != null) {
            a0(iVar, d10);
        }
    }

    public final boolean a0(i iVar, RecyclerView.D d9) {
        boolean z9 = false;
        if (iVar.f16942b == d9) {
            iVar.f16942b = null;
        } else {
            if (iVar.f16941a != d9) {
                return false;
            }
            iVar.f16941a = null;
            z9 = true;
        }
        d9.f16733a.setAlpha(1.0f);
        d9.f16733a.setTranslationX(0.0f);
        d9.f16733a.setTranslationY(0.0f);
        D(d9, z9);
        return true;
    }

    public final void b0(RecyclerView.D d9) {
        if (f16901s == null) {
            f16901s = new ValueAnimator().getInterpolator();
        }
        d9.f16733a.animate().setInterpolator(f16901s);
        j(d9);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean g(RecyclerView.D d9, List list) {
        return !list.isEmpty() || super.g(d9, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void j(RecyclerView.D d9) {
        View view = d9.f16733a;
        view.animate().cancel();
        int size = this.f16904j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) this.f16904j.get(size)).f16947a == d9) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                F(d9);
                this.f16904j.remove(size);
            }
        }
        Y(this.f16905k, d9);
        if (this.f16902h.remove(d9)) {
            view.setAlpha(1.0f);
            H(d9);
        }
        if (this.f16903i.remove(d9)) {
            view.setAlpha(1.0f);
            B(d9);
        }
        for (int size2 = this.f16908n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f16908n.get(size2);
            Y(arrayList, d9);
            if (arrayList.isEmpty()) {
                this.f16908n.remove(size2);
            }
        }
        for (int size3 = this.f16907m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f16907m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((j) arrayList2.get(size4)).f16947a == d9) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    F(d9);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f16907m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f16906l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f16906l.get(size5);
            if (arrayList3.remove(d9)) {
                view.setAlpha(1.0f);
                B(d9);
                if (arrayList3.isEmpty()) {
                    this.f16906l.remove(size5);
                }
            }
        }
        this.f16911q.remove(d9);
        this.f16909o.remove(d9);
        this.f16912r.remove(d9);
        this.f16910p.remove(d9);
        X();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void k() {
        int size = this.f16904j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f16904j.get(size);
            View view = jVar.f16947a.f16733a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            F(jVar.f16947a);
            this.f16904j.remove(size);
        }
        for (int size2 = this.f16902h.size() - 1; size2 >= 0; size2--) {
            H((RecyclerView.D) this.f16902h.get(size2));
            this.f16902h.remove(size2);
        }
        int size3 = this.f16903i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.D d9 = (RecyclerView.D) this.f16903i.get(size3);
            d9.f16733a.setAlpha(1.0f);
            B(d9);
            this.f16903i.remove(size3);
        }
        for (int size4 = this.f16905k.size() - 1; size4 >= 0; size4--) {
            Z((i) this.f16905k.get(size4));
        }
        this.f16905k.clear();
        if (p()) {
            for (int size5 = this.f16907m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f16907m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f16947a.f16733a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    F(jVar2.f16947a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f16907m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f16906l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f16906l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.D d10 = (RecyclerView.D) arrayList2.get(size8);
                    d10.f16733a.setAlpha(1.0f);
                    B(d10);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f16906l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f16908n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f16908n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    Z((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f16908n.remove(arrayList3);
                    }
                }
            }
            W(this.f16911q);
            W(this.f16910p);
            W(this.f16909o);
            W(this.f16912r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public boolean p() {
        return (this.f16903i.isEmpty() && this.f16905k.isEmpty() && this.f16904j.isEmpty() && this.f16902h.isEmpty() && this.f16910p.isEmpty() && this.f16911q.isEmpty() && this.f16909o.isEmpty() && this.f16912r.isEmpty() && this.f16907m.isEmpty() && this.f16906l.isEmpty() && this.f16908n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void v() {
        boolean z9 = !this.f16902h.isEmpty();
        boolean z10 = !this.f16904j.isEmpty();
        boolean z11 = !this.f16905k.isEmpty();
        boolean z12 = !this.f16903i.isEmpty();
        if (z9 || z10 || z12 || z11) {
            Iterator it = this.f16902h.iterator();
            while (it.hasNext()) {
                V((RecyclerView.D) it.next());
            }
            this.f16902h.clear();
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f16904j);
                this.f16907m.add(arrayList);
                this.f16904j.clear();
                a aVar = new a(arrayList);
                if (z9) {
                    L.l0(((j) arrayList.get(0)).f16947a.f16733a, aVar, o());
                } else {
                    aVar.run();
                }
            }
            if (z11) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f16905k);
                this.f16908n.add(arrayList2);
                this.f16905k.clear();
                b bVar = new b(arrayList2);
                if (z9) {
                    L.l0(((i) arrayList2.get(0)).f16941a.f16733a, bVar, o());
                } else {
                    bVar.run();
                }
            }
            if (z12) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f16903i);
                this.f16906l.add(arrayList3);
                this.f16903i.clear();
                RunnableC0192c runnableC0192c = new RunnableC0192c(arrayList3);
                if (z9 || z10 || z11) {
                    L.l0(((RecyclerView.D) arrayList3.get(0)).f16733a, runnableC0192c, (z9 ? o() : 0L) + Math.max(z10 ? n() : 0L, z11 ? m() : 0L));
                } else {
                    runnableC0192c.run();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.n
    public boolean x(RecyclerView.D d9) {
        b0(d9);
        d9.f16733a.setAlpha(0.0f);
        this.f16903i.add(d9);
        return true;
    }

    @Override // androidx.recyclerview.widget.n
    public boolean y(RecyclerView.D d9, RecyclerView.D d10, int i9, int i10, int i11, int i12) {
        if (d9 == d10) {
            return z(d9, i9, i10, i11, i12);
        }
        float translationX = d9.f16733a.getTranslationX();
        float translationY = d9.f16733a.getTranslationY();
        float alpha = d9.f16733a.getAlpha();
        b0(d9);
        int i13 = (int) ((i11 - i9) - translationX);
        int i14 = (int) ((i12 - i10) - translationY);
        d9.f16733a.setTranslationX(translationX);
        d9.f16733a.setTranslationY(translationY);
        d9.f16733a.setAlpha(alpha);
        if (d10 != null) {
            b0(d10);
            d10.f16733a.setTranslationX(-i13);
            d10.f16733a.setTranslationY(-i14);
            d10.f16733a.setAlpha(0.0f);
        }
        this.f16905k.add(new i(d9, d10, i9, i10, i11, i12));
        return true;
    }

    @Override // androidx.recyclerview.widget.n
    public boolean z(RecyclerView.D d9, int i9, int i10, int i11, int i12) {
        View view = d9.f16733a;
        int translationX = i9 + ((int) view.getTranslationX());
        int translationY = i10 + ((int) d9.f16733a.getTranslationY());
        b0(d9);
        int i13 = i11 - translationX;
        int i14 = i12 - translationY;
        if (i13 == 0 && i14 == 0) {
            F(d9);
            return false;
        }
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        this.f16904j.add(new j(d9, translationX, translationY, i11, i12));
        return true;
    }
}
