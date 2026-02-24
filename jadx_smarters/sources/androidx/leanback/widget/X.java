package androidx.leanback.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import g0.AbstractC1801f;

/* JADX INFO: loaded from: classes.dex */
public abstract class X {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f15607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f15608b;
    }

    public static Object a(ViewGroup viewGroup) {
        viewGroup.setLayoutMode(1);
        LayoutInflater.from(viewGroup.getContext()).inflate(g0.h.f41059l, viewGroup, true);
        a aVar = new a();
        aVar.f15607a = viewGroup.findViewById(AbstractC1801f.f41036t);
        aVar.f15608b = viewGroup.findViewById(AbstractC1801f.f41034r);
        return aVar;
    }

    public static void b(ViewGroup viewGroup) {
        viewGroup.setLayoutMode(1);
    }

    public static void c(Object obj, float f9) {
        a aVar = (a) obj;
        aVar.f15607a.setAlpha(1.0f - f9);
        aVar.f15608b.setAlpha(f9);
    }

    public static boolean d() {
        return true;
    }
}
