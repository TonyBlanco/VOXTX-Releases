package androidx.leanback.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class E implements InterfaceC1150e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map f15343a;

    public static class a implements InterfaceC1150e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f15344a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map f15345b;

        public a(View view) {
            this.f15344a = view;
        }

        @Override // androidx.leanback.widget.InterfaceC1150e
        public final Object c(Class cls) {
            Map map = this.f15345b;
            if (map == null) {
                return null;
            }
            return map.get(cls);
        }
    }

    public static void a(View view) {
        if (view == null || !view.hasTransientState()) {
            return;
        }
        view.animate().cancel();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i9 = 0; view.hasTransientState() && i9 < childCount; i9++) {
                a(viewGroup.getChildAt(i9));
            }
        }
    }

    public abstract void b(a aVar, Object obj);

    @Override // androidx.leanback.widget.InterfaceC1150e
    public final Object c(Class cls) {
        Map map = this.f15343a;
        if (map == null) {
            return null;
        }
        return map.get(cls);
    }

    public void d(a aVar, Object obj, List list) {
        b(aVar, obj);
    }

    public abstract a e(ViewGroup viewGroup);

    public abstract void f(a aVar);

    public void g(a aVar) {
    }

    public void h(a aVar) {
        a(aVar.f15344a);
    }
}
