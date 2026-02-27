package androidx.fragment.app;

import L.e;
import P.H;
import P.L;
import P.O;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.C;
import androidx.fragment.app.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s.C2695a;

/* JADX INFO: renamed from: androidx.fragment.app.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1143c extends C {

    /* JADX INFO: renamed from: androidx.fragment.app.c$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14960a;

        static {
            int[] iArr = new int[C.e.c.values().length];
            f14960a = iArr;
            try {
                iArr[C.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14960a[C.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14960a[C.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f14960a[C.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f14961a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C.e f14962c;

        public b(List list, C.e eVar) {
            this.f14961a = list;
            this.f14962c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f14961a.contains(this.f14962c)) {
                this.f14961a.remove(this.f14962c);
                C1143c.this.s(this.f14962c);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$c, reason: collision with other inner class name */
    public class C0171c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f14964a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f14965c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f14966d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C.e f14967e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ k f14968f;

        public C0171c(ViewGroup viewGroup, View view, boolean z9, C.e eVar, k kVar) {
            this.f14964a = viewGroup;
            this.f14965c = view;
            this.f14966d = z9;
            this.f14967e = eVar;
            this.f14968f = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f14964a.endViewTransition(this.f14965c);
            if (this.f14966d) {
                this.f14967e.e().applyState(this.f14965c);
            }
            this.f14968f.a();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$d */
    public class d implements e.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Animator f14970a;

        public d(Animator animator) {
            this.f14970a = animator;
        }

        @Override // L.e.b
        public void a() {
            this.f14970a.end();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$e */
    public class e implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f14972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f14973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f14974c;

        /* JADX INFO: renamed from: androidx.fragment.app.c$e$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f14972a.endViewTransition(eVar.f14973b);
                e.this.f14974c.a();
            }
        }

        public e(ViewGroup viewGroup, View view, k kVar) {
            this.f14972a = viewGroup;
            this.f14973b = view;
            this.f14974c = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f14972a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$f */
    public class f implements e.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f14977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f14978b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f14979c;

        public f(View view, ViewGroup viewGroup, k kVar) {
            this.f14977a = view;
            this.f14978b = viewGroup;
            this.f14979c = kVar;
        }

        @Override // L.e.b
        public void a() {
            this.f14977a.clearAnimation();
            this.f14978b.endViewTransition(this.f14977a);
            this.f14979c.a();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$g */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C.e f14981a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C.e f14982c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f14983d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C2695a f14984e;

        public g(C.e eVar, C.e eVar2, boolean z9, C2695a c2695a) {
            this.f14981a = eVar;
            this.f14982c = eVar2;
            this.f14983d = z9;
            this.f14984e = c2695a;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.f(this.f14981a.f(), this.f14982c.f(), this.f14983d, this.f14984e, false);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$h */
    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z f14986a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f14987c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Rect f14988d;

        public h(z zVar, View view, Rect rect) {
            this.f14986a = zVar;
            this.f14987c = view;
            this.f14988d = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14986a.k(this.f14987c, this.f14988d);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$i */
    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f14990a;

        public i(ArrayList arrayList) {
            this.f14990a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.A(this.f14990a, 4);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$j */
    public class j implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f14992a;

        public j(m mVar) {
            this.f14992a = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f14992a.a();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$k */
    public static class k extends l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f14994c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f14995d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public f.d f14996e;

        public k(C.e eVar, L.e eVar2, boolean z9) {
            super(eVar, eVar2);
            this.f14995d = false;
            this.f14994c = z9;
        }

        public f.d e(Context context) {
            if (this.f14995d) {
                return this.f14996e;
            }
            f.d dVarC = androidx.fragment.app.f.c(context, b().f(), b().e() == C.e.c.VISIBLE, this.f14994c);
            this.f14996e = dVarC;
            this.f14995d = true;
            return dVarC;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$l */
    public static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C.e f14997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final L.e f14998b;

        public l(C.e eVar, L.e eVar2) {
            this.f14997a = eVar;
            this.f14998b = eVar2;
        }

        public void a() {
            this.f14997a.d(this.f14998b);
        }

        public C.e b() {
            return this.f14997a;
        }

        public L.e c() {
            return this.f14998b;
        }

        public boolean d() {
            C.e.c cVar;
            C.e.c cVarFrom = C.e.c.from(this.f14997a.f().mView);
            C.e.c cVarE = this.f14997a.e();
            return cVarFrom == cVarE || !(cVarFrom == (cVar = C.e.c.VISIBLE) || cVarE == cVar);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$m */
    public static class m extends l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f14999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f15000d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f15001e;

        public m(C.e eVar, L.e eVar2, boolean z9, boolean z10) {
            boolean allowReturnTransitionOverlap;
            Object sharedElementReturnTransition;
            super(eVar, eVar2);
            if (eVar.e() == C.e.c.VISIBLE) {
                Fragment fragmentF = eVar.f();
                this.f14999c = z9 ? fragmentF.getReenterTransition() : fragmentF.getEnterTransition();
                Fragment fragmentF2 = eVar.f();
                allowReturnTransitionOverlap = z9 ? fragmentF2.getAllowReturnTransitionOverlap() : fragmentF2.getAllowEnterTransitionOverlap();
            } else {
                Fragment fragmentF3 = eVar.f();
                this.f14999c = z9 ? fragmentF3.getReturnTransition() : fragmentF3.getExitTransition();
                allowReturnTransitionOverlap = true;
            }
            this.f15000d = allowReturnTransitionOverlap;
            if (z10) {
                Fragment fragmentF4 = eVar.f();
                sharedElementReturnTransition = z9 ? fragmentF4.getSharedElementReturnTransition() : fragmentF4.getSharedElementEnterTransition();
            } else {
                sharedElementReturnTransition = null;
            }
            this.f15001e = sharedElementReturnTransition;
        }

        public z e() {
            z zVarF = f(this.f14999c);
            z zVarF2 = f(this.f15001e);
            if (zVarF == null || zVarF2 == null || zVarF == zVarF2) {
                return zVarF != null ? zVarF : zVarF2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f14999c + " which uses a different Transition  type than its shared element transition " + this.f15001e);
        }

        public final z f(Object obj) {
            if (obj == null) {
                return null;
            }
            z zVar = x.f15188b;
            if (zVar != null && zVar.e(obj)) {
                return zVar;
            }
            z zVar2 = x.f15189c;
            if (zVar2 != null && zVar2.e(obj)) {
                return zVar2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        public Object g() {
            return this.f15001e;
        }

        public Object h() {
            return this.f14999c;
        }

        public boolean i() {
            return this.f15001e != null;
        }

        public boolean j() {
            return this.f15000d;
        }
    }

    public C1143c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    @Override // androidx.fragment.app.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(java.util.List r11, boolean r12) {
        /*
            r10 = this;
            java.util.Iterator r0 = r11.iterator()
            r1 = 0
            r6 = r1
            r7 = r6
        L7:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L44
            java.lang.Object r1 = r0.next()
            androidx.fragment.app.C$e r1 = (androidx.fragment.app.C.e) r1
            androidx.fragment.app.Fragment r3 = r1.f()
            android.view.View r3 = r3.mView
            androidx.fragment.app.C$e$c r3 = androidx.fragment.app.C.e.c.from(r3)
            int[] r4 = androidx.fragment.app.C1143c.a.f14960a
            androidx.fragment.app.C$e$c r5 = r1.e()
            int r5 = r5.ordinal()
            r4 = r4[r5]
            if (r4 == r2) goto L3c
            r2 = 2
            if (r4 == r2) goto L3c
            r2 = 3
            if (r4 == r2) goto L3c
            r2 = 4
            if (r4 == r2) goto L36
            goto L7
        L36:
            androidx.fragment.app.C$e$c r2 = androidx.fragment.app.C.e.c.VISIBLE
            if (r3 == r2) goto L7
            r7 = r1
            goto L7
        L3c:
            androidx.fragment.app.C$e$c r2 = androidx.fragment.app.C.e.c.VISIBLE
            if (r3 != r2) goto L7
            if (r6 != 0) goto L7
            r6 = r1
            goto L7
        L44:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r11)
            java.util.Iterator r11 = r11.iterator()
        L57:
            boolean r4 = r11.hasNext()
            if (r4 == 0) goto L96
            java.lang.Object r4 = r11.next()
            androidx.fragment.app.C$e r4 = (androidx.fragment.app.C.e) r4
            L.e r5 = new L.e
            r5.<init>()
            r4.j(r5)
            androidx.fragment.app.c$k r8 = new androidx.fragment.app.c$k
            r8.<init>(r4, r5, r12)
            r0.add(r8)
            L.e r5 = new L.e
            r5.<init>()
            r4.j(r5)
            androidx.fragment.app.c$m r8 = new androidx.fragment.app.c$m
            r9 = 0
            if (r12 == 0) goto L84
            if (r4 != r6) goto L87
        L82:
            r9 = 1
            goto L87
        L84:
            if (r4 != r7) goto L87
            goto L82
        L87:
            r8.<init>(r4, r5, r12, r9)
            r3.add(r8)
            androidx.fragment.app.c$b r5 = new androidx.fragment.app.c$b
            r5.<init>(r1, r4)
            r4.a(r5)
            goto L57
        L96:
            r2 = r10
            r4 = r1
            r5 = r12
            java.util.Map r11 = r2.x(r3, r4, r5, r6, r7)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            boolean r12 = r11.containsValue(r12)
            r10.w(r0, r1, r12, r11)
            java.util.Iterator r11 = r1.iterator()
        Laa:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto Lba
            java.lang.Object r12 = r11.next()
            androidx.fragment.app.C$e r12 = (androidx.fragment.app.C.e) r12
            r10.s(r12)
            goto Laa
        Lba:
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C1143c.f(java.util.List, boolean):void");
    }

    public void s(C.e eVar) {
        eVar.e().applyState(eVar.f().mView);
    }

    public void t(ArrayList arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (O.a(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = viewGroup.getChildAt(i9);
            if (childAt.getVisibility() == 0) {
                t(arrayList, childAt);
            }
        }
    }

    public void u(Map map, View view) {
        String strM = L.M(view);
        if (strM != null) {
            map.put(strM, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = viewGroup.getChildAt(i9);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    public void v(C2695a c2695a, Collection collection) {
        Iterator it = c2695a.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(L.M((View) ((Map.Entry) it.next()).getValue()))) {
                it.remove();
            }
        }
    }

    public final void w(List list, List list2, boolean z9, Map map) {
        StringBuilder sb;
        String str;
        f.d dVarE;
        ViewGroup viewGroupM = m();
        Context context = viewGroupM.getContext();
        ArrayList<k> arrayList = new ArrayList();
        Iterator it = list.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (kVar.d() || (dVarE = kVar.e(context)) == null) {
                kVar.a();
            } else {
                Animator animator = dVarE.f15023b;
                if (animator == null) {
                    arrayList.add(kVar);
                } else {
                    C.e eVarB = kVar.b();
                    Fragment fragmentF = eVarB.f();
                    if (Boolean.TRUE.equals(map.get(eVarB))) {
                        if (androidx.fragment.app.m.F0(2)) {
                            Log.v("FragmentManager", "Ignoring Animator set on " + fragmentF + " as this Fragment was involved in a Transition.");
                        }
                        kVar.a();
                    } else {
                        boolean z11 = eVarB.e() == C.e.c.GONE;
                        if (z11) {
                            list2.remove(eVarB);
                        }
                        View view = fragmentF.mView;
                        viewGroupM.startViewTransition(view);
                        animator.addListener(new C0171c(viewGroupM, view, z11, eVarB, kVar));
                        animator.setTarget(view);
                        animator.start();
                        kVar.c().d(new d(animator));
                        z10 = true;
                    }
                }
            }
        }
        for (k kVar2 : arrayList) {
            C.e eVarB2 = kVar2.b();
            Fragment fragmentF2 = eVarB2.f();
            if (z9) {
                if (androidx.fragment.app.m.F0(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(fragmentF2);
                    str = " as Animations cannot run alongside Transitions.";
                    sb.append(str);
                    Log.v("FragmentManager", sb.toString());
                }
                kVar2.a();
            } else if (z10) {
                if (androidx.fragment.app.m.F0(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(fragmentF2);
                    str = " as Animations cannot run alongside Animators.";
                    sb.append(str);
                    Log.v("FragmentManager", sb.toString());
                }
                kVar2.a();
            } else {
                View view2 = fragmentF2.mView;
                Animation animation = (Animation) O.h.f(((f.d) O.h.f(kVar2.e(context))).f15022a);
                if (eVarB2.e() != C.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar2.a();
                } else {
                    viewGroupM.startViewTransition(view2);
                    f.e eVar = new f.e(animation, viewGroupM, view2);
                    eVar.setAnimationListener(new e(viewGroupM, view2, kVar2));
                    view2.startAnimation(eVar);
                }
                kVar2.c().d(new f(view2, viewGroupM, kVar2));
            }
        }
    }

    public final Map x(List list, List list2, boolean z9, C.e eVar, C.e eVar2) {
        View view;
        Object obj;
        ArrayList arrayList;
        Object obj2;
        ArrayList arrayList2;
        C.e eVar3;
        C.e eVar4;
        View view2;
        Object objN;
        C2695a c2695a;
        ArrayList arrayList3;
        C.e eVar5;
        ArrayList arrayList4;
        Rect rect;
        View view3;
        z zVar;
        C.e eVar6;
        View view4;
        boolean z10 = z9;
        C.e eVar7 = eVar;
        C.e eVar8 = eVar2;
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        z zVar2 = null;
        while (it.hasNext()) {
            m mVar = (m) it.next();
            if (!mVar.d()) {
                z zVarE = mVar.e();
                if (zVar2 == null) {
                    zVar2 = zVarE;
                } else if (zVarE != null && zVar2 != zVarE) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (zVar2 == null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                m mVar2 = (m) it2.next();
                map.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return map;
        }
        View view5 = new View(m().getContext());
        Rect rect2 = new Rect();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        C2695a c2695a2 = new C2695a();
        Iterator it3 = list.iterator();
        Object obj3 = null;
        View view6 = null;
        boolean z11 = false;
        while (it3.hasNext()) {
            m mVar3 = (m) it3.next();
            if (!mVar3.i() || eVar7 == null || eVar8 == null) {
                c2695a = c2695a2;
                arrayList3 = arrayList6;
                eVar5 = eVar7;
                arrayList4 = arrayList5;
                rect = rect2;
                view3 = view5;
                zVar = zVar2;
                eVar6 = eVar8;
                view6 = view6;
            } else {
                Object objB = zVar2.B(zVar2.g(mVar3.g()));
                ArrayList<String> sharedElementSourceNames = eVar2.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementSourceNames2 = eVar.f().getSharedElementSourceNames();
                ArrayList<String> sharedElementTargetNames = eVar.f().getSharedElementTargetNames();
                View view7 = view6;
                int i9 = 0;
                while (i9 < sharedElementTargetNames.size()) {
                    int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i9));
                    ArrayList<String> arrayList7 = sharedElementTargetNames;
                    if (iIndexOf != -1) {
                        sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i9));
                    }
                    i9++;
                    sharedElementTargetNames = arrayList7;
                }
                ArrayList<String> sharedElementTargetNames2 = eVar2.f().getSharedElementTargetNames();
                Fragment fragmentF = eVar.f();
                if (z10) {
                    fragmentF.getEnterTransitionCallback();
                    eVar2.f().getExitTransitionCallback();
                } else {
                    fragmentF.getExitTransitionCallback();
                    eVar2.f().getEnterTransitionCallback();
                }
                int i10 = 0;
                for (int size = sharedElementSourceNames.size(); i10 < size; size = size) {
                    c2695a2.put(sharedElementSourceNames.get(i10), sharedElementTargetNames2.get(i10));
                    i10++;
                }
                C2695a c2695a3 = new C2695a();
                u(c2695a3, eVar.f().mView);
                c2695a3.q(sharedElementSourceNames);
                c2695a2.q(c2695a3.keySet());
                C2695a c2695a4 = new C2695a();
                u(c2695a4, eVar2.f().mView);
                c2695a4.q(sharedElementTargetNames2);
                c2695a4.q(c2695a2.values());
                x.x(c2695a2, c2695a4);
                v(c2695a3, c2695a2.keySet());
                v(c2695a4, c2695a2.values());
                if (c2695a2.isEmpty()) {
                    arrayList5.clear();
                    arrayList6.clear();
                    c2695a = c2695a2;
                    arrayList3 = arrayList6;
                    eVar5 = eVar7;
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    zVar = zVar2;
                    view6 = view7;
                    obj3 = null;
                    eVar6 = eVar8;
                } else {
                    x.f(eVar2.f(), eVar.f(), z10, c2695a3, true);
                    c2695a = c2695a2;
                    ArrayList arrayList8 = arrayList6;
                    H.a(m(), new g(eVar2, eVar, z9, c2695a4));
                    arrayList5.addAll(c2695a3.values());
                    if (sharedElementSourceNames.isEmpty()) {
                        view6 = view7;
                    } else {
                        view6 = (View) c2695a3.get((String) sharedElementSourceNames.get(0));
                        zVar2.v(objB, view6);
                    }
                    arrayList3 = arrayList8;
                    arrayList3.addAll(c2695a4.values());
                    if (!sharedElementTargetNames2.isEmpty() && (view4 = (View) c2695a4.get((String) sharedElementTargetNames2.get(0))) != null) {
                        H.a(m(), new h(zVar2, view4, rect2));
                        z11 = true;
                    }
                    zVar2.z(objB, view5, arrayList5);
                    arrayList4 = arrayList5;
                    rect = rect2;
                    view3 = view5;
                    zVar = zVar2;
                    zVar2.t(objB, null, null, null, null, objB, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar5 = eVar;
                    map.put(eVar5, bool);
                    eVar6 = eVar2;
                    map.put(eVar6, bool);
                    obj3 = objB;
                }
            }
            eVar7 = eVar5;
            arrayList5 = arrayList4;
            rect2 = rect;
            view5 = view3;
            eVar8 = eVar6;
            c2695a2 = c2695a;
            z10 = z9;
            arrayList6 = arrayList3;
            zVar2 = zVar;
        }
        View view8 = view6;
        C2695a c2695a5 = c2695a2;
        ArrayList arrayList9 = arrayList6;
        C.e eVar9 = eVar7;
        ArrayList arrayList10 = arrayList5;
        Rect rect3 = rect2;
        View view9 = view5;
        z zVar3 = zVar2;
        C.e eVar10 = eVar8;
        ArrayList arrayList11 = new ArrayList();
        Iterator it4 = list.iterator();
        Object obj4 = null;
        Object objN2 = null;
        while (it4.hasNext()) {
            m mVar4 = (m) it4.next();
            if (mVar4.d()) {
                map.put(mVar4.b(), Boolean.FALSE);
                mVar4.a();
            } else {
                Object objG = zVar3.g(mVar4.h());
                C.e eVarB = mVar4.b();
                boolean z12 = obj3 != null && (eVarB == eVar9 || eVarB == eVar10);
                if (objG == null) {
                    if (!z12) {
                        map.put(eVarB, Boolean.FALSE);
                        mVar4.a();
                    }
                    arrayList2 = arrayList9;
                    arrayList = arrayList10;
                    view = view9;
                    objN = obj4;
                    eVar3 = eVar10;
                    view2 = view8;
                } else {
                    ArrayList arrayList12 = new ArrayList();
                    Object obj5 = obj4;
                    t(arrayList12, eVarB.f().mView);
                    if (z12) {
                        if (eVarB == eVar9) {
                            arrayList12.removeAll(arrayList10);
                        } else {
                            arrayList12.removeAll(arrayList9);
                        }
                    }
                    if (arrayList12.isEmpty()) {
                        zVar3.a(objG, view9);
                        arrayList2 = arrayList9;
                        arrayList = arrayList10;
                        view = view9;
                        eVar4 = eVarB;
                        obj2 = objN2;
                        eVar3 = eVar10;
                        obj = obj5;
                    } else {
                        zVar3.b(objG, arrayList12);
                        view = view9;
                        obj = obj5;
                        arrayList = arrayList10;
                        obj2 = objN2;
                        arrayList2 = arrayList9;
                        eVar3 = eVar10;
                        zVar3.t(objG, objG, arrayList12, null, null, null, null);
                        if (eVarB.e() == C.e.c.GONE) {
                            eVar4 = eVarB;
                            list2.remove(eVar4);
                            ArrayList arrayList13 = new ArrayList(arrayList12);
                            arrayList13.remove(eVar4.f().mView);
                            zVar3.r(objG, eVar4.f().mView, arrayList13);
                            H.a(m(), new i(arrayList12));
                        } else {
                            eVar4 = eVarB;
                        }
                    }
                    if (eVar4.e() == C.e.c.VISIBLE) {
                        arrayList11.addAll(arrayList12);
                        if (z11) {
                            zVar3.u(objG, rect3);
                        }
                        view2 = view8;
                    } else {
                        view2 = view8;
                        zVar3.v(objG, view2);
                    }
                    map.put(eVar4, Boolean.TRUE);
                    if (mVar4.j()) {
                        objN2 = zVar3.n(obj2, objG, null);
                        objN = obj;
                    } else {
                        objN = zVar3.n(obj, objG, null);
                        objN2 = obj2;
                    }
                }
                eVar10 = eVar3;
                obj4 = objN;
                view8 = view2;
                view9 = view;
                arrayList10 = arrayList;
                arrayList9 = arrayList2;
            }
        }
        ArrayList arrayList14 = arrayList9;
        ArrayList arrayList15 = arrayList10;
        C.e eVar11 = eVar10;
        Object objM = zVar3.m(objN2, obj4, obj3);
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            m mVar5 = (m) it5.next();
            if (!mVar5.d()) {
                Object objH = mVar5.h();
                C.e eVarB2 = mVar5.b();
                boolean z13 = obj3 != null && (eVarB2 == eVar9 || eVarB2 == eVar11);
                if (objH != null || z13) {
                    if (L.W(m())) {
                        zVar3.w(mVar5.b().f(), objM, mVar5.c(), new j(mVar5));
                    } else {
                        if (androidx.fragment.app.m.F0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + eVarB2);
                        }
                        mVar5.a();
                    }
                }
            }
        }
        if (!L.W(m())) {
            return map;
        }
        x.A(arrayList11, 4);
        ArrayList arrayListO = zVar3.o(arrayList14);
        zVar3.c(m(), objM);
        zVar3.y(m(), arrayList15, arrayList14, arrayListO, c2695a5);
        x.A(arrayList11, 0);
        zVar3.A(obj3, arrayList15, arrayList14);
        return map;
    }
}
