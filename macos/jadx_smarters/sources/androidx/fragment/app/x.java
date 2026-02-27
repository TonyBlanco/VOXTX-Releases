package androidx.fragment.app;

import K0.C0674e;
import P.H;
import P.L;
import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import s.C2695a;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f15187a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z f15188b = new y();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final z f15189c = w();

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f15190a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Fragment f15191c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ L.e f15192d;

        public a(g gVar, Fragment fragment, L.e eVar) {
            this.f15190a = gVar;
            this.f15191c = fragment;
            this.f15192d = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15190a.b(this.f15191c, this.f15192d);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f15193a;

        public b(ArrayList arrayList) {
            this.f15193a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.A(this.f15193a, 4);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f15194a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Fragment f15195c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ L.e f15196d;

        public c(g gVar, Fragment fragment, L.e eVar) {
            this.f15194a = gVar;
            this.f15195c = fragment;
            this.f15196d = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f15194a.b(this.f15195c, this.f15196d);
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f15197a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ z f15198c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f15199d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Fragment f15200e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ArrayList f15201f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ ArrayList f15202g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ ArrayList f15203h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Object f15204i;

        public d(Object obj, z zVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f15197a = obj;
            this.f15198c = zVar;
            this.f15199d = view;
            this.f15200e = fragment;
            this.f15201f = arrayList;
            this.f15202g = arrayList2;
            this.f15203h = arrayList3;
            this.f15204i = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f15197a;
            if (obj != null) {
                this.f15198c.p(obj, this.f15199d);
                this.f15202g.addAll(x.k(this.f15198c, this.f15197a, this.f15200e, this.f15201f, this.f15199d));
            }
            if (this.f15203h != null) {
                if (this.f15204i != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f15199d);
                    this.f15198c.q(this.f15204i, this.f15203h, arrayList);
                }
                this.f15203h.clear();
                this.f15203h.add(this.f15199d);
            }
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f15205a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Fragment f15206c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f15207d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C2695a f15208e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ View f15209f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ z f15210g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Rect f15211h;

        public e(Fragment fragment, Fragment fragment2, boolean z9, C2695a c2695a, View view, z zVar, Rect rect) {
            this.f15205a = fragment;
            this.f15206c = fragment2;
            this.f15207d = z9;
            this.f15208e = c2695a;
            this.f15209f = view;
            this.f15210g = zVar;
            this.f15211h = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.f(this.f15205a, this.f15206c, this.f15207d, this.f15208e, false);
            View view = this.f15209f;
            if (view != null) {
                this.f15210g.k(view, this.f15211h);
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ z f15212a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C2695a f15213c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f15214d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ h f15215e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ArrayList f15216f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ View f15217g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Fragment f15218h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Fragment f15219i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean f15220j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ ArrayList f15221k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f15222l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Rect f15223m;

        public f(z zVar, C2695a c2695a, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z9, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f15212a = zVar;
            this.f15213c = c2695a;
            this.f15214d = obj;
            this.f15215e = hVar;
            this.f15216f = arrayList;
            this.f15217g = view;
            this.f15218h = fragment;
            this.f15219i = fragment2;
            this.f15220j = z9;
            this.f15221k = arrayList2;
            this.f15222l = obj2;
            this.f15223m = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            C2695a c2695aH = x.h(this.f15212a, this.f15213c, this.f15214d, this.f15215e);
            if (c2695aH != null) {
                this.f15216f.addAll(c2695aH.values());
                this.f15216f.add(this.f15217g);
            }
            x.f(this.f15218h, this.f15219i, this.f15220j, c2695aH, false);
            Object obj = this.f15214d;
            if (obj != null) {
                this.f15212a.A(obj, this.f15221k, this.f15216f);
                View viewS = x.s(c2695aH, this.f15215e, this.f15222l, this.f15220j);
                if (viewS != null) {
                    this.f15212a.k(viewS, this.f15223m);
                }
            }
        }
    }

    public interface g {
        void a(Fragment fragment, L.e eVar);

        void b(Fragment fragment, L.e eVar);
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Fragment f15224a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f15225b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C1141a f15226c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Fragment f15227d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f15228e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public C1141a f15229f;
    }

    public static void A(ArrayList arrayList, int i9) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((View) arrayList.get(size)).setVisibility(i9);
        }
    }

    public static void B(Context context, androidx.fragment.app.g gVar, ArrayList arrayList, ArrayList arrayList2, int i9, int i10, boolean z9, g gVar2) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i11 = i9; i11 < i10; i11++) {
            C1141a c1141a = (C1141a) arrayList.get(i11);
            if (((Boolean) arrayList2.get(i11)).booleanValue()) {
                e(c1141a, sparseArray, z9);
            } else {
                c(c1141a, sparseArray, z9);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i12 = 0; i12 < size; i12++) {
                int iKeyAt = sparseArray.keyAt(i12);
                C2695a c2695aD = d(iKeyAt, arrayList, arrayList2, i9, i10);
                h hVar = (h) sparseArray.valueAt(i12);
                if (gVar.d() && (viewGroup = (ViewGroup) gVar.c(iKeyAt)) != null) {
                    if (z9) {
                        o(viewGroup, hVar, view, c2695aD, gVar2);
                    } else {
                        n(viewGroup, hVar, view, c2695aD, gVar2);
                    }
                }
            }
        }
    }

    public static void a(ArrayList arrayList, C2695a c2695a, Collection collection) {
        for (int size = c2695a.size() - 1; size >= 0; size--) {
            View view = (View) c2695a.o(size);
            if (collection.contains(L.M(view))) {
                arrayList.add(view);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(androidx.fragment.app.C1141a r8, androidx.fragment.app.w.a r9, android.util.SparseArray r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.x.b(androidx.fragment.app.a, androidx.fragment.app.w$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static void c(C1141a c1141a, SparseArray sparseArray, boolean z9) {
        int size = c1141a.f15162c.size();
        for (int i9 = 0; i9 < size; i9++) {
            b(c1141a, (w.a) c1141a.f15162c.get(i9), sparseArray, false, z9);
        }
    }

    public static C2695a d(int i9, ArrayList arrayList, ArrayList arrayList2, int i10, int i11) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        C2695a c2695a = new C2695a();
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            C1141a c1141a = (C1141a) arrayList.get(i12);
            if (c1141a.F(i9)) {
                boolean zBooleanValue = ((Boolean) arrayList2.get(i12)).booleanValue();
                ArrayList arrayList5 = c1141a.f15175p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (zBooleanValue) {
                        arrayList3 = c1141a.f15175p;
                        arrayList4 = c1141a.f15176q;
                    } else {
                        ArrayList arrayList6 = c1141a.f15175p;
                        arrayList3 = c1141a.f15176q;
                        arrayList4 = arrayList6;
                    }
                    for (int i13 = 0; i13 < size; i13++) {
                        String str = (String) arrayList4.get(i13);
                        String str2 = (String) arrayList3.get(i13);
                        String str3 = (String) c2695a.remove(str2);
                        if (str3 != null) {
                            c2695a.put(str, str3);
                        } else {
                            c2695a.put(str, str2);
                        }
                    }
                }
            }
        }
        return c2695a;
    }

    public static void e(C1141a c1141a, SparseArray sparseArray, boolean z9) {
        if (c1141a.f14943t.n0().d()) {
            for (int size = c1141a.f15162c.size() - 1; size >= 0; size--) {
                b(c1141a, (w.a) c1141a.f15162c.get(size), sparseArray, true, z9);
            }
        }
    }

    public static void f(Fragment fragment, Fragment fragment2, boolean z9, C2695a c2695a, boolean z10) {
        if (z9) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }

    public static boolean g(z zVar, List list) {
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (!zVar.e(list.get(i9))) {
                return false;
            }
        }
        return true;
    }

    public static C2695a h(z zVar, C2695a c2695a, Object obj, h hVar) {
        ArrayList arrayList;
        Fragment fragment = hVar.f15224a;
        View view = fragment.getView();
        if (c2695a.isEmpty() || obj == null || view == null) {
            c2695a.clear();
            return null;
        }
        C2695a c2695a2 = new C2695a();
        zVar.j(c2695a2, view);
        C1141a c1141a = hVar.f15226c;
        if (hVar.f15225b) {
            fragment.getExitTransitionCallback();
            arrayList = c1141a.f15175p;
        } else {
            fragment.getEnterTransitionCallback();
            arrayList = c1141a.f15176q;
        }
        if (arrayList != null) {
            c2695a2.q(arrayList);
            c2695a2.q(c2695a.values());
        }
        x(c2695a, c2695a2);
        return c2695a2;
    }

    public static C2695a i(z zVar, C2695a c2695a, Object obj, h hVar) {
        ArrayList arrayList;
        if (c2695a.isEmpty() || obj == null) {
            c2695a.clear();
            return null;
        }
        Fragment fragment = hVar.f15227d;
        C2695a c2695a2 = new C2695a();
        zVar.j(c2695a2, fragment.requireView());
        C1141a c1141a = hVar.f15229f;
        if (hVar.f15228e) {
            fragment.getEnterTransitionCallback();
            arrayList = c1141a.f15176q;
        } else {
            fragment.getExitTransitionCallback();
            arrayList = c1141a.f15175p;
        }
        if (arrayList != null) {
            c2695a2.q(arrayList);
        }
        c2695a.q(c2695a2.keySet());
        return c2695a2;
    }

    public static z j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        z zVar = f15188b;
        if (zVar != null && g(zVar, arrayList)) {
            return zVar;
        }
        z zVar2 = f15189c;
        if (zVar2 != null && g(zVar2, arrayList)) {
            return zVar2;
        }
        if (zVar == null && zVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    public static ArrayList k(z zVar, Object obj, Fragment fragment, ArrayList arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        View view2 = fragment.getView();
        if (view2 != null) {
            zVar.f(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        zVar.b(obj, arrayList2);
        return arrayList2;
    }

    public static Object l(z zVar, ViewGroup viewGroup, View view, C2695a c2695a, h hVar, ArrayList arrayList, ArrayList arrayList2, Object obj, Object obj2) {
        Object objT;
        C2695a c2695a2;
        Object obj3;
        Rect rect;
        Fragment fragment = hVar.f15224a;
        Fragment fragment2 = hVar.f15227d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z9 = hVar.f15225b;
        if (c2695a.isEmpty()) {
            c2695a2 = c2695a;
            objT = null;
        } else {
            objT = t(zVar, fragment, fragment2, z9);
            c2695a2 = c2695a;
        }
        C2695a c2695aI = i(zVar, c2695a2, objT, hVar);
        if (c2695a.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(c2695aI.values());
            obj3 = objT;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z9, c2695aI, true);
        if (obj3 != null) {
            rect = new Rect();
            zVar.z(obj3, view, arrayList);
            z(zVar, obj3, obj2, c2695aI, hVar.f15228e, hVar.f15229f);
            if (obj != null) {
                zVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        H.a(viewGroup, new f(zVar, c2695a, obj3, hVar, arrayList2, view, fragment, fragment2, z9, arrayList, obj, rect));
        return obj3;
    }

    public static Object m(z zVar, ViewGroup viewGroup, View view, C2695a c2695a, h hVar, ArrayList arrayList, ArrayList arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = hVar.f15224a;
        Fragment fragment2 = hVar.f15227d;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z9 = hVar.f15225b;
        Object objT = c2695a.isEmpty() ? null : t(zVar, fragment, fragment2, z9);
        C2695a c2695aI = i(zVar, c2695a, objT, hVar);
        C2695a c2695aH = h(zVar, c2695a, objT, hVar);
        if (c2695a.isEmpty()) {
            if (c2695aI != null) {
                c2695aI.clear();
            }
            if (c2695aH != null) {
                c2695aH.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, c2695aI, c2695a.keySet());
            a(arrayList2, c2695aH, c2695a.values());
            obj3 = objT;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z9, c2695aI, true);
        if (obj3 != null) {
            arrayList2.add(view);
            zVar.z(obj3, view, arrayList);
            z(zVar, obj3, obj2, c2695aI, hVar.f15228e, hVar.f15229f);
            Rect rect2 = new Rect();
            View viewS = s(c2695aH, hVar, obj, z9);
            if (viewS != null) {
                zVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = viewS;
        } else {
            view2 = null;
            rect = null;
        }
        H.a(viewGroup, new e(fragment, fragment2, z9, c2695aH, view2, zVar, rect));
        return obj3;
    }

    public static void n(ViewGroup viewGroup, h hVar, View view, C2695a c2695a, g gVar) {
        Object obj;
        Fragment fragment = hVar.f15224a;
        Fragment fragment2 = hVar.f15227d;
        z zVarJ = j(fragment2, fragment);
        if (zVarJ == null) {
            return;
        }
        boolean z9 = hVar.f15225b;
        boolean z10 = hVar.f15228e;
        Object objQ = q(zVarJ, fragment, z9);
        Object objR = r(zVarJ, fragment2, z10);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Object objL = l(zVarJ, viewGroup, view, c2695a, hVar, arrayList, arrayList2, objQ, objR);
        if (objQ == null && objL == null) {
            obj = objR;
            if (obj == null) {
                return;
            }
        } else {
            obj = objR;
        }
        ArrayList arrayListK = k(zVarJ, obj, fragment2, arrayList, view);
        if (arrayListK == null || arrayListK.isEmpty()) {
            obj = null;
        }
        Object obj2 = obj;
        zVarJ.a(objQ, view);
        Object objU = u(zVarJ, objQ, obj2, objL, fragment, hVar.f15225b);
        if (fragment2 != null && arrayListK != null && (arrayListK.size() > 0 || arrayList.size() > 0)) {
            L.e eVar = new L.e();
            gVar.a(fragment2, eVar);
            zVarJ.w(fragment2, objU, eVar, new c(gVar, fragment2, eVar));
        }
        if (objU != null) {
            ArrayList arrayList3 = new ArrayList();
            zVarJ.t(objU, objQ, arrayList3, obj2, arrayListK, objL, arrayList2);
            y(zVarJ, viewGroup, fragment, view, arrayList2, objQ, arrayList3, obj2, arrayListK);
            zVarJ.x(viewGroup, arrayList2, c2695a);
            zVarJ.c(viewGroup, objU);
            zVarJ.s(viewGroup, arrayList2, c2695a);
        }
    }

    public static void o(ViewGroup viewGroup, h hVar, View view, C2695a c2695a, g gVar) {
        Object obj;
        Fragment fragment = hVar.f15224a;
        Fragment fragment2 = hVar.f15227d;
        z zVarJ = j(fragment2, fragment);
        if (zVarJ == null) {
            return;
        }
        boolean z9 = hVar.f15225b;
        boolean z10 = hVar.f15228e;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Object objQ = q(zVarJ, fragment, z9);
        Object objR = r(zVarJ, fragment2, z10);
        Object objM = m(zVarJ, viewGroup, view, c2695a, hVar, arrayList2, arrayList, objQ, objR);
        if (objQ == null && objM == null) {
            obj = objR;
            if (obj == null) {
                return;
            }
        } else {
            obj = objR;
        }
        ArrayList arrayListK = k(zVarJ, obj, fragment2, arrayList2, view);
        ArrayList arrayListK2 = k(zVarJ, objQ, fragment, arrayList, view);
        A(arrayListK2, 4);
        Object objU = u(zVarJ, objQ, obj, objM, fragment, z9);
        if (fragment2 != null && arrayListK != null && (arrayListK.size() > 0 || arrayList2.size() > 0)) {
            L.e eVar = new L.e();
            gVar.a(fragment2, eVar);
            zVarJ.w(fragment2, objU, eVar, new a(gVar, fragment2, eVar));
        }
        if (objU != null) {
            v(zVarJ, obj, fragment2, arrayListK);
            ArrayList arrayListO = zVarJ.o(arrayList);
            zVarJ.t(objU, objQ, arrayListK2, obj, arrayListK, objM, arrayList);
            zVarJ.c(viewGroup, objU);
            zVarJ.y(viewGroup, arrayList2, arrayList, arrayListO, c2695a);
            A(arrayListK2, 0);
            zVarJ.A(objM, arrayList2, arrayList);
        }
    }

    public static h p(h hVar, SparseArray sparseArray, int i9) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i9, hVar2);
        return hVar2;
    }

    public static Object q(z zVar, Fragment fragment, boolean z9) {
        if (fragment == null) {
            return null;
        }
        return zVar.g(z9 ? fragment.getReenterTransition() : fragment.getEnterTransition());
    }

    public static Object r(z zVar, Fragment fragment, boolean z9) {
        if (fragment == null) {
            return null;
        }
        return zVar.g(z9 ? fragment.getReturnTransition() : fragment.getExitTransition());
    }

    public static View s(C2695a c2695a, h hVar, Object obj, boolean z9) {
        ArrayList arrayList;
        C1141a c1141a = hVar.f15226c;
        if (obj == null || c2695a == null || (arrayList = c1141a.f15175p) == null || arrayList.isEmpty()) {
            return null;
        }
        return (View) c2695a.get((String) (z9 ? c1141a.f15175p : c1141a.f15176q).get(0));
    }

    public static Object t(z zVar, Fragment fragment, Fragment fragment2, boolean z9) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return zVar.B(zVar.g(z9 ? fragment2.getSharedElementReturnTransition() : fragment.getSharedElementEnterTransition()));
    }

    public static Object u(z zVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z9) {
        return (obj == null || obj2 == null || fragment == null) ? true : z9 ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap() ? zVar.n(obj2, obj, obj3) : zVar.m(obj2, obj, obj3);
    }

    public static void v(z zVar, Object obj, Fragment fragment, ArrayList arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            zVar.r(obj, fragment.getView(), arrayList);
            H.a(fragment.mContainer, new b(arrayList));
        }
    }

    public static z w() {
        try {
            return (z) C0674e.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void x(C2695a c2695a, C2695a c2695a2) {
        for (int size = c2695a.size() - 1; size >= 0; size--) {
            if (!c2695a2.containsKey((String) c2695a.o(size))) {
                c2695a.m(size);
            }
        }
    }

    public static void y(z zVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList arrayList, Object obj, ArrayList arrayList2, Object obj2, ArrayList arrayList3) {
        H.a(viewGroup, new d(obj, zVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    public static void z(z zVar, Object obj, Object obj2, C2695a c2695a, boolean z9, C1141a c1141a) {
        ArrayList arrayList = c1141a.f15175p;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = (View) c2695a.get((String) (z9 ? c1141a.f15176q : c1141a.f15175p).get(0));
        zVar.v(obj, view);
        if (obj2 != null) {
            zVar.v(obj2, view);
        }
    }
}
