package androidx.fragment.app;

import P.H;
import P.L;
import P.O;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f15246a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ArrayList f15247c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ArrayList f15248d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ArrayList f15249e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ArrayList f15250f;

        public a(int i9, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
            this.f15246a = i9;
            this.f15247c = arrayList;
            this.f15248d = arrayList2;
            this.f15249e = arrayList3;
            this.f15250f = arrayList4;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i9 = 0; i9 < this.f15246a; i9++) {
                L.K0((View) this.f15247c.get(i9), (String) this.f15248d.get(i9));
                L.K0((View) this.f15249e.get(i9), (String) this.f15250f.get(i9));
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f15252a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map f15253c;

        public b(ArrayList arrayList, Map map) {
            this.f15252a = arrayList;
            this.f15253c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f15252a.size();
            for (int i9 = 0; i9 < size; i9++) {
                View view = (View) this.f15252a.get(i9);
                String strM = L.M(view);
                if (strM != null) {
                    L.K0(view, z.i(this.f15253c, strM));
                }
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f15255a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Map f15256c;

        public c(ArrayList arrayList, Map map) {
            this.f15255a = arrayList;
            this.f15256c = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f15255a.size();
            for (int i9 = 0; i9 < size; i9++) {
                View view = (View) this.f15255a.get(i9);
                L.K0(view, (String) this.f15256c.get(L.M(view)));
            }
        }
    }

    public static void d(List list, View view) {
        int size = list.size();
        if (h(list, view, size)) {
            return;
        }
        if (L.M(view) != null) {
            list.add(view);
        }
        for (int i9 = size; i9 < list.size(); i9++) {
            View view2 = (View) list.get(i9);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (!h(list, childAt, size) && L.M(childAt) != null) {
                        list.add(childAt);
                    }
                }
            }
        }
    }

    public static boolean h(List list, View view, int i9) {
        for (int i10 = 0; i10 < i9; i10++) {
            if (list.get(i10) == view) {
                return true;
            }
        }
        return false;
    }

    public static String i(Map map, String str) {
        for (Map.Entry entry : map.entrySet()) {
            if (str.equals(entry.getValue())) {
                return (String) entry.getKey();
            }
        }
        return null;
    }

    public static boolean l(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void A(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object B(Object obj);

    public abstract void a(Object obj, View view);

    public abstract void b(Object obj, ArrayList arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public void f(ArrayList arrayList, View view) {
        if (view.getVisibility() == 0) {
            boolean z9 = view instanceof ViewGroup;
            Object obj = view;
            if (z9) {
                ViewGroup viewGroup = (ViewGroup) view;
                boolean zA = O.a(viewGroup);
                obj = viewGroup;
                if (!zA) {
                    int childCount = viewGroup.getChildCount();
                    for (int i9 = 0; i9 < childCount; i9++) {
                        f(arrayList, viewGroup.getChildAt(i9));
                    }
                    return;
                }
            }
            arrayList.add(obj);
        }
    }

    public abstract Object g(Object obj);

    public void j(Map map, View view) {
        if (view.getVisibility() == 0) {
            String strM = L.M(view);
            if (strM != null) {
                map.put(strM, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    j(map, viewGroup.getChildAt(i9));
                }
            }
        }
    }

    public void k(View view, Rect rect) {
        if (L.V(view)) {
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            view.getRootView().getLocationOnScreen(new int[2]);
            rectF.offset(r1[0], r1[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public abstract Object m(Object obj, Object obj2, Object obj3);

    public abstract Object n(Object obj, Object obj2, Object obj3);

    public ArrayList o(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            View view = (View) arrayList.get(i9);
            arrayList2.add(L.M(view));
            L.K0(view, null);
        }
        return arrayList2;
    }

    public abstract void p(Object obj, View view);

    public abstract void q(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract void r(Object obj, View view, ArrayList arrayList);

    public void s(ViewGroup viewGroup, ArrayList arrayList, Map map) {
        H.a(viewGroup, new c(arrayList, map));
    }

    public abstract void t(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2, Object obj4, ArrayList arrayList3);

    public abstract void u(Object obj, Rect rect);

    public abstract void v(Object obj, View view);

    public abstract void w(Fragment fragment, Object obj, L.e eVar, Runnable runnable);

    public void x(View view, ArrayList arrayList, Map map) {
        H.a(view, new b(arrayList, map));
    }

    public void y(View view, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Map map) {
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList();
        for (int i9 = 0; i9 < size; i9++) {
            View view2 = (View) arrayList.get(i9);
            String strM = L.M(view2);
            arrayList4.add(strM);
            if (strM != null) {
                L.K0(view2, null);
                String str = (String) map.get(strM);
                int i10 = 0;
                while (true) {
                    if (i10 >= size) {
                        break;
                    }
                    if (str.equals(arrayList3.get(i10))) {
                        L.K0((View) arrayList2.get(i10), strM);
                        break;
                    }
                    i10++;
                }
            }
        }
        H.a(view, new a(size, arrayList2, arrayList3, arrayList, arrayList4));
    }

    public abstract void z(Object obj, View view, ArrayList arrayList);
}
