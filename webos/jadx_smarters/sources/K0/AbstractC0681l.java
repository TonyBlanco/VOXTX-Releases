package K0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s.C2695a;
import s.C2700f;

/* JADX INFO: renamed from: K0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0681l implements Cloneable {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int[] f3508G = {2, 1, 3, 4};

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final AbstractC0676g f3509H = new a();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static ThreadLocal f3510I = new ThreadLocal();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public e f3514D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C2695a f3515E;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ArrayList f3536u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f3537v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f3517a = getClass().getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f3518c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f3519d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TimeInterpolator f3520e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f3521f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f3522g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f3523h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f3524i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f3525j = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ArrayList f3526k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ArrayList f3527l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f3528m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f3529n = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ArrayList f3530o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f3531p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public t f3532q = new t();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public t f3533r = new t();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0685p f3534s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int[] f3535t = f3508G;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3538w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ArrayList f3539x = new ArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f3540y = 0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f3541z = false;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f3511A = false;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ArrayList f3512B = null;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ArrayList f3513C = new ArrayList();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public AbstractC0676g f3516F = f3509H;

    /* JADX INFO: renamed from: K0.l$a */
    public class a extends AbstractC0676g {
        @Override // K0.AbstractC0676g
        public Path a(float f9, float f10, float f11, float f12) {
            Path path = new Path();
            path.moveTo(f9, f10);
            path.lineTo(f11, f12);
            return path;
        }
    }

    /* JADX INFO: renamed from: K0.l$b */
    public class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2695a f3542a;

        public b(C2695a c2695a) {
            this.f3542a = c2695a;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3542a.remove(animator);
            AbstractC0681l.this.f3539x.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AbstractC0681l.this.f3539x.add(animator);
        }
    }

    /* JADX INFO: renamed from: K0.l$c */
    public class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC0681l.this.p();
            animator.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: K0.l$d */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f3545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f3546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public s f3547c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public P f3548d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public AbstractC0681l f3549e;

        public d(View view, String str, AbstractC0681l abstractC0681l, P p9, s sVar) {
            this.f3545a = view;
            this.f3546b = str;
            this.f3547c = sVar;
            this.f3548d = p9;
            this.f3549e = abstractC0681l;
        }
    }

    /* JADX INFO: renamed from: K0.l$e */
    public static abstract class e {
    }

    /* JADX INFO: renamed from: K0.l$f */
    public interface f {
        void a(AbstractC0681l abstractC0681l);

        void b(AbstractC0681l abstractC0681l);

        void c(AbstractC0681l abstractC0681l);

        void d(AbstractC0681l abstractC0681l);

        void e(AbstractC0681l abstractC0681l);
    }

    public static boolean I(s sVar, s sVar2, String str) {
        Object obj = sVar.f3568a.get(str);
        Object obj2 = sVar2.f3568a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void e(t tVar, View view, s sVar) {
        tVar.f3571a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f3572b.indexOfKey(id) >= 0) {
                tVar.f3572b.put(id, null);
            } else {
                tVar.f3572b.put(id, view);
            }
        }
        String strM = P.L.M(view);
        if (strM != null) {
            if (tVar.f3574d.containsKey(strM)) {
                tVar.f3574d.put(strM, null);
            } else {
                tVar.f3574d.put(strM, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f3573c.i(itemIdAtPosition) < 0) {
                    P.L.B0(view, true);
                    tVar.f3573c.k(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) tVar.f3573c.g(itemIdAtPosition);
                if (view2 != null) {
                    P.L.B0(view2, false);
                    tVar.f3573c.k(itemIdAtPosition, null);
                }
            }
        }
    }

    public static C2695a y() {
        C2695a c2695a = (C2695a) f3510I.get();
        if (c2695a != null) {
            return c2695a;
        }
        C2695a c2695a2 = new C2695a();
        f3510I.set(c2695a2);
        return c2695a2;
    }

    public List A() {
        return this.f3521f;
    }

    public List B() {
        return this.f3523h;
    }

    public List C() {
        return this.f3524i;
    }

    public List D() {
        return this.f3522g;
    }

    public String[] E() {
        return null;
    }

    public s F(View view, boolean z9) {
        C0685p c0685p = this.f3534s;
        if (c0685p != null) {
            return c0685p.F(view, z9);
        }
        return (s) (z9 ? this.f3532q : this.f3533r).f3571a.get(view);
    }

    public boolean G(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] strArrE = E();
        if (strArrE == null) {
            Iterator it = sVar.f3568a.keySet().iterator();
            while (it.hasNext()) {
                if (I(sVar, sVar2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrE) {
            if (!I(sVar, sVar2, str)) {
            }
        }
        return false;
        return true;
    }

    public boolean H(View view) {
        ArrayList arrayList;
        ArrayList arrayList2;
        int id = view.getId();
        ArrayList arrayList3 = this.f3525j;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList arrayList4 = this.f3526k;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList arrayList5 = this.f3527l;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (((Class) this.f3527l.get(i9)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f3528m != null && P.L.M(view) != null && this.f3528m.contains(P.L.M(view))) {
            return false;
        }
        if ((this.f3521f.size() == 0 && this.f3522g.size() == 0 && (((arrayList = this.f3524i) == null || arrayList.isEmpty()) && ((arrayList2 = this.f3523h) == null || arrayList2.isEmpty()))) || this.f3521f.contains(Integer.valueOf(id)) || this.f3522g.contains(view)) {
            return true;
        }
        ArrayList arrayList6 = this.f3523h;
        if (arrayList6 != null && arrayList6.contains(P.L.M(view))) {
            return true;
        }
        if (this.f3524i != null) {
            for (int i10 = 0; i10 < this.f3524i.size(); i10++) {
                if (((Class) this.f3524i.get(i10)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void J(C2695a c2695a, C2695a c2695a2, SparseArray sparseArray, SparseArray sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i9 = 0; i9 < size; i9++) {
            View view2 = (View) sparseArray.valueAt(i9);
            if (view2 != null && H(view2) && (view = (View) sparseArray2.get(sparseArray.keyAt(i9))) != null && H(view)) {
                s sVar = (s) c2695a.get(view2);
                s sVar2 = (s) c2695a2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.f3536u.add(sVar);
                    this.f3537v.add(sVar2);
                    c2695a.remove(view2);
                    c2695a2.remove(view);
                }
            }
        }
    }

    public final void K(C2695a c2695a, C2695a c2695a2) {
        s sVar;
        for (int size = c2695a.size() - 1; size >= 0; size--) {
            View view = (View) c2695a.j(size);
            if (view != null && H(view) && (sVar = (s) c2695a2.remove(view)) != null && H(sVar.f3569b)) {
                this.f3536u.add((s) c2695a.m(size));
                this.f3537v.add(sVar);
            }
        }
    }

    public final void L(C2695a c2695a, C2695a c2695a2, C2700f c2700f, C2700f c2700f2) {
        View view;
        int iN = c2700f.n();
        for (int i9 = 0; i9 < iN; i9++) {
            View view2 = (View) c2700f.o(i9);
            if (view2 != null && H(view2) && (view = (View) c2700f2.g(c2700f.j(i9))) != null && H(view)) {
                s sVar = (s) c2695a.get(view2);
                s sVar2 = (s) c2695a2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.f3536u.add(sVar);
                    this.f3537v.add(sVar2);
                    c2695a.remove(view2);
                    c2695a2.remove(view);
                }
            }
        }
    }

    public final void M(C2695a c2695a, C2695a c2695a2, C2695a c2695a3, C2695a c2695a4) {
        View view;
        int size = c2695a3.size();
        for (int i9 = 0; i9 < size; i9++) {
            View view2 = (View) c2695a3.o(i9);
            if (view2 != null && H(view2) && (view = (View) c2695a4.get(c2695a3.j(i9))) != null && H(view)) {
                s sVar = (s) c2695a.get(view2);
                s sVar2 = (s) c2695a2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.f3536u.add(sVar);
                    this.f3537v.add(sVar2);
                    c2695a.remove(view2);
                    c2695a2.remove(view);
                }
            }
        }
    }

    public final void N(t tVar, t tVar2) {
        C2695a c2695a = new C2695a(tVar.f3571a);
        C2695a c2695a2 = new C2695a(tVar2.f3571a);
        int i9 = 0;
        while (true) {
            int[] iArr = this.f3535t;
            if (i9 >= iArr.length) {
                d(c2695a, c2695a2);
                return;
            }
            int i10 = iArr[i9];
            if (i10 == 1) {
                K(c2695a, c2695a2);
            } else if (i10 == 2) {
                M(c2695a, c2695a2, tVar.f3574d, tVar2.f3574d);
            } else if (i10 == 3) {
                J(c2695a, c2695a2, tVar.f3572b, tVar2.f3572b);
            } else if (i10 == 4) {
                L(c2695a, c2695a2, tVar.f3573c, tVar2.f3573c);
            }
            i9++;
        }
    }

    public void O(View view) {
        if (this.f3511A) {
            return;
        }
        for (int size = this.f3539x.size() - 1; size >= 0; size--) {
            AbstractC0670a.b((Animator) this.f3539x.get(size));
        }
        ArrayList arrayList = this.f3512B;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.f3512B.clone();
            int size2 = arrayList2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                ((f) arrayList2.get(i9)).b(this);
            }
        }
        this.f3541z = true;
    }

    public void P(ViewGroup viewGroup) {
        d dVar;
        this.f3536u = new ArrayList();
        this.f3537v = new ArrayList();
        N(this.f3532q, this.f3533r);
        C2695a c2695aY = y();
        int size = c2695aY.size();
        P pD = A.d(viewGroup);
        for (int i9 = size - 1; i9 >= 0; i9--) {
            Animator animator = (Animator) c2695aY.j(i9);
            if (animator != null && (dVar = (d) c2695aY.get(animator)) != null && dVar.f3545a != null && pD.equals(dVar.f3548d)) {
                s sVar = dVar.f3547c;
                View view = dVar.f3545a;
                s sVarF = F(view, true);
                s sVarU = u(view, true);
                if (sVarF == null && sVarU == null) {
                    sVarU = (s) this.f3533r.f3571a.get(view);
                }
                if ((sVarF != null || sVarU != null) && dVar.f3549e.G(sVar, sVarU)) {
                    if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        c2695aY.remove(animator);
                    }
                }
            }
        }
        o(viewGroup, this.f3532q, this.f3533r, this.f3536u, this.f3537v);
        U();
    }

    public AbstractC0681l Q(f fVar) {
        ArrayList arrayList = this.f3512B;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.f3512B.size() == 0) {
            this.f3512B = null;
        }
        return this;
    }

    public AbstractC0681l R(View view) {
        this.f3522g.remove(view);
        return this;
    }

    public void S(View view) {
        if (this.f3541z) {
            if (!this.f3511A) {
                for (int size = this.f3539x.size() - 1; size >= 0; size--) {
                    AbstractC0670a.c((Animator) this.f3539x.get(size));
                }
                ArrayList arrayList = this.f3512B;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f3512B.clone();
                    int size2 = arrayList2.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        ((f) arrayList2.get(i9)).e(this);
                    }
                }
            }
            this.f3541z = false;
        }
    }

    public final void T(Animator animator, C2695a c2695a) {
        if (animator != null) {
            animator.addListener(new b(c2695a));
            f(animator);
        }
    }

    public void U() {
        b0();
        C2695a c2695aY = y();
        for (Animator animator : this.f3513C) {
            if (c2695aY.containsKey(animator)) {
                b0();
                T(animator, c2695aY);
            }
        }
        this.f3513C.clear();
        p();
    }

    public AbstractC0681l V(long j9) {
        this.f3519d = j9;
        return this;
    }

    public void W(e eVar) {
        this.f3514D = eVar;
    }

    public AbstractC0681l X(TimeInterpolator timeInterpolator) {
        this.f3520e = timeInterpolator;
        return this;
    }

    public void Y(AbstractC0676g abstractC0676g) {
        if (abstractC0676g == null) {
            abstractC0676g = f3509H;
        }
        this.f3516F = abstractC0676g;
    }

    public void Z(AbstractC0684o abstractC0684o) {
    }

    public AbstractC0681l a0(long j9) {
        this.f3518c = j9;
        return this;
    }

    public AbstractC0681l b(f fVar) {
        if (this.f3512B == null) {
            this.f3512B = new ArrayList();
        }
        this.f3512B.add(fVar);
        return this;
    }

    public void b0() {
        if (this.f3540y == 0) {
            ArrayList arrayList = this.f3512B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f3512B.clone();
                int size = arrayList2.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((f) arrayList2.get(i9)).a(this);
                }
            }
            this.f3511A = false;
        }
        this.f3540y++;
    }

    public AbstractC0681l c(View view) {
        this.f3522g.add(view);
        return this;
    }

    public String c0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.f3519d != -1) {
            str2 = str2 + "dur(" + this.f3519d + ") ";
        }
        if (this.f3518c != -1) {
            str2 = str2 + "dly(" + this.f3518c + ") ";
        }
        if (this.f3520e != null) {
            str2 = str2 + "interp(" + this.f3520e + ") ";
        }
        if (this.f3521f.size() <= 0 && this.f3522g.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.f3521f.size() > 0) {
            for (int i9 = 0; i9 < this.f3521f.size(); i9++) {
                if (i9 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f3521f.get(i9);
            }
        }
        if (this.f3522g.size() > 0) {
            for (int i10 = 0; i10 < this.f3522g.size(); i10++) {
                if (i10 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.f3522g.get(i10);
            }
        }
        return str3 + ")";
    }

    public void cancel() {
        for (int size = this.f3539x.size() - 1; size >= 0; size--) {
            ((Animator) this.f3539x.get(size)).cancel();
        }
        ArrayList arrayList = this.f3512B;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.f3512B.clone();
        int size2 = arrayList2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            ((f) arrayList2.get(i9)).d(this);
        }
    }

    public final void d(C2695a c2695a, C2695a c2695a2) {
        for (int i9 = 0; i9 < c2695a.size(); i9++) {
            s sVar = (s) c2695a.o(i9);
            if (H(sVar.f3569b)) {
                this.f3536u.add(sVar);
                this.f3537v.add(null);
            }
        }
        for (int i10 = 0; i10 < c2695a2.size(); i10++) {
            s sVar2 = (s) c2695a2.o(i10);
            if (H(sVar2.f3569b)) {
                this.f3537v.add(sVar2);
                this.f3536u.add(null);
            }
        }
    }

    public void f(Animator animator) {
        if (animator == null) {
            p();
            return;
        }
        if (q() >= 0) {
            animator.setDuration(q());
        }
        if (z() >= 0) {
            animator.setStartDelay(z() + animator.getStartDelay());
        }
        if (t() != null) {
            animator.setInterpolator(t());
        }
        animator.addListener(new c());
        animator.start();
    }

    public abstract void g(s sVar);

    public final void h(View view, boolean z9) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList arrayList = this.f3525j;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList arrayList2 = this.f3526k;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList arrayList3 = this.f3527l;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        if (((Class) this.f3527l.get(i9)).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    s sVar = new s(view);
                    if (z9) {
                        j(sVar);
                    } else {
                        g(sVar);
                    }
                    sVar.f3570c.add(this);
                    i(sVar);
                    e(z9 ? this.f3532q : this.f3533r, view, sVar);
                }
                if (view instanceof ViewGroup) {
                    ArrayList arrayList4 = this.f3529n;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList arrayList5 = this.f3530o;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList arrayList6 = this.f3531p;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i10 = 0; i10 < size2; i10++) {
                                    if (((Class) this.f3531p.get(i10)).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                                h(viewGroup.getChildAt(i11), z9);
                            }
                        }
                    }
                }
            }
        }
    }

    public void i(s sVar) {
    }

    public abstract void j(s sVar);

    public void k(ViewGroup viewGroup, boolean z9) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C2695a c2695a;
        l(z9);
        if ((this.f3521f.size() > 0 || this.f3522g.size() > 0) && (((arrayList = this.f3523h) == null || arrayList.isEmpty()) && ((arrayList2 = this.f3524i) == null || arrayList2.isEmpty()))) {
            for (int i9 = 0; i9 < this.f3521f.size(); i9++) {
                View viewFindViewById = viewGroup.findViewById(((Integer) this.f3521f.get(i9)).intValue());
                if (viewFindViewById != null) {
                    s sVar = new s(viewFindViewById);
                    if (z9) {
                        j(sVar);
                    } else {
                        g(sVar);
                    }
                    sVar.f3570c.add(this);
                    i(sVar);
                    e(z9 ? this.f3532q : this.f3533r, viewFindViewById, sVar);
                }
            }
            for (int i10 = 0; i10 < this.f3522g.size(); i10++) {
                View view = (View) this.f3522g.get(i10);
                s sVar2 = new s(view);
                if (z9) {
                    j(sVar2);
                } else {
                    g(sVar2);
                }
                sVar2.f3570c.add(this);
                i(sVar2);
                e(z9 ? this.f3532q : this.f3533r, view, sVar2);
            }
        } else {
            h(viewGroup, z9);
        }
        if (z9 || (c2695a = this.f3515E) == null) {
            return;
        }
        int size = c2695a.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList3.add(this.f3532q.f3574d.remove((String) this.f3515E.j(i11)));
        }
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = (View) arrayList3.get(i12);
            if (view2 != null) {
                this.f3532q.f3574d.put((String) this.f3515E.o(i12), view2);
            }
        }
    }

    public void l(boolean z9) {
        t tVar;
        if (z9) {
            this.f3532q.f3571a.clear();
            this.f3532q.f3572b.clear();
            tVar = this.f3532q;
        } else {
            this.f3533r.f3571a.clear();
            this.f3533r.f3572b.clear();
            tVar = this.f3533r;
        }
        tVar.f3573c.d();
    }

    @Override // 
    /* JADX INFO: renamed from: m */
    public AbstractC0681l clone() {
        try {
            AbstractC0681l abstractC0681l = (AbstractC0681l) super.clone();
            abstractC0681l.f3513C = new ArrayList();
            abstractC0681l.f3532q = new t();
            abstractC0681l.f3533r = new t();
            abstractC0681l.f3536u = null;
            abstractC0681l.f3537v = null;
            return abstractC0681l;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator n(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    public void o(ViewGroup viewGroup, t tVar, t tVar2, ArrayList arrayList, ArrayList arrayList2) {
        View view;
        Animator animator;
        s sVar;
        int i9;
        Animator animator2;
        s sVar2;
        C2695a c2695aY = y();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            s sVar3 = (s) arrayList.get(i10);
            s sVar4 = (s) arrayList2.get(i10);
            if (sVar3 != null && !sVar3.f3570c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f3570c.contains(this)) {
                sVar4 = null;
            }
            if ((sVar3 != null || sVar4 != null) && (sVar3 == null || sVar4 == null || G(sVar3, sVar4))) {
                Animator animatorN = n(viewGroup, sVar3, sVar4);
                if (animatorN != null) {
                    if (sVar4 != null) {
                        View view2 = sVar4.f3569b;
                        String[] strArrE = E();
                        if (strArrE != null && strArrE.length > 0) {
                            sVar2 = new s(view2);
                            s sVar5 = (s) tVar2.f3571a.get(view2);
                            if (sVar5 != null) {
                                int i11 = 0;
                                while (i11 < strArrE.length) {
                                    Map map = sVar2.f3568a;
                                    Animator animator3 = animatorN;
                                    String str = strArrE[i11];
                                    map.put(str, sVar5.f3568a.get(str));
                                    i11++;
                                    animatorN = animator3;
                                    strArrE = strArrE;
                                }
                            }
                            Animator animator4 = animatorN;
                            int size2 = c2695aY.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size2) {
                                    animator2 = animator4;
                                    break;
                                }
                                d dVar = (d) c2695aY.get((Animator) c2695aY.j(i12));
                                if (dVar.f3547c != null && dVar.f3545a == view2 && dVar.f3546b.equals(v()) && dVar.f3547c.equals(sVar2)) {
                                    animator2 = null;
                                    break;
                                }
                                i12++;
                            }
                        } else {
                            animator2 = animatorN;
                            sVar2 = null;
                        }
                        view = view2;
                        animator = animator2;
                        sVar = sVar2;
                    } else {
                        view = sVar3.f3569b;
                        animator = animatorN;
                        sVar = null;
                    }
                    if (animator != null) {
                        i9 = size;
                        c2695aY.put(animator, new d(view, v(), this, A.d(viewGroup), sVar));
                        this.f3513C.add(animator);
                    }
                    i10++;
                    size = i9;
                }
                i9 = size;
                i10++;
                size = i9;
            }
            i9 = size;
            i10++;
            size = i9;
        }
        if (sparseIntArray.size() != 0) {
            for (int i13 = 0; i13 < sparseIntArray.size(); i13++) {
                Animator animator5 = (Animator) this.f3513C.get(sparseIntArray.keyAt(i13));
                animator5.setStartDelay((((long) sparseIntArray.valueAt(i13)) - Long.MAX_VALUE) + animator5.getStartDelay());
            }
        }
    }

    public void p() {
        int i9 = this.f3540y - 1;
        this.f3540y = i9;
        if (i9 == 0) {
            ArrayList arrayList = this.f3512B;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f3512B.clone();
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((f) arrayList2.get(i10)).c(this);
                }
            }
            for (int i11 = 0; i11 < this.f3532q.f3573c.n(); i11++) {
                View view = (View) this.f3532q.f3573c.o(i11);
                if (view != null) {
                    P.L.B0(view, false);
                }
            }
            for (int i12 = 0; i12 < this.f3533r.f3573c.n(); i12++) {
                View view2 = (View) this.f3533r.f3573c.o(i12);
                if (view2 != null) {
                    P.L.B0(view2, false);
                }
            }
            this.f3511A = true;
        }
    }

    public long q() {
        return this.f3519d;
    }

    public e s() {
        return this.f3514D;
    }

    public TimeInterpolator t() {
        return this.f3520e;
    }

    public String toString() {
        return c0("");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x002d, code lost:
    
        if (r3 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x002f, code lost:
    
        if (r7 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        r6 = r5.f3537v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0034, code lost:
    
        r6 = r5.f3536u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:
    
        return (K0.s) r6.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public K0.s u(android.view.View r6, boolean r7) {
        /*
            r5 = this;
            K0.p r0 = r5.f3534s
            if (r0 == 0) goto L9
            K0.s r6 = r0.u(r6, r7)
            return r6
        L9:
            if (r7 == 0) goto Le
            java.util.ArrayList r0 = r5.f3536u
            goto L10
        Le:
            java.util.ArrayList r0 = r5.f3537v
        L10:
            r1 = 0
            if (r0 != 0) goto L14
            return r1
        L14:
            int r2 = r0.size()
            r3 = 0
        L19:
            if (r3 >= r2) goto L2c
            java.lang.Object r4 = r0.get(r3)
            K0.s r4 = (K0.s) r4
            if (r4 != 0) goto L24
            return r1
        L24:
            android.view.View r4 = r4.f3569b
            if (r4 != r6) goto L29
            goto L2d
        L29:
            int r3 = r3 + 1
            goto L19
        L2c:
            r3 = -1
        L2d:
            if (r3 < 0) goto L3d
            if (r7 == 0) goto L34
            java.util.ArrayList r6 = r5.f3537v
            goto L36
        L34:
            java.util.ArrayList r6 = r5.f3536u
        L36:
            java.lang.Object r6 = r6.get(r3)
            r1 = r6
            K0.s r1 = (K0.s) r1
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.AbstractC0681l.u(android.view.View, boolean):K0.s");
    }

    public String v() {
        return this.f3517a;
    }

    public AbstractC0676g w() {
        return this.f3516F;
    }

    public AbstractC0684o x() {
        return null;
    }

    public long z() {
        return this.f3518c;
    }
}
