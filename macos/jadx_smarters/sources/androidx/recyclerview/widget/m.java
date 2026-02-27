package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static int a(RecyclerView.A a9, j jVar, View view, View view2, RecyclerView.o oVar, boolean z9) {
        if (oVar.h0() == 0 || a9.c() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z9) {
            return Math.abs(oVar.B0(view) - oVar.B0(view2)) + 1;
        }
        return Math.min(jVar.n(), jVar.d(view2) - jVar.g(view));
    }

    public static int b(RecyclerView.A a9, j jVar, View view, View view2, RecyclerView.o oVar, boolean z9, boolean z10) {
        if (oVar.h0() == 0 || a9.c() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z10 ? Math.max(0, (a9.c() - Math.max(oVar.B0(view), oVar.B0(view2))) - 1) : Math.max(0, Math.min(oVar.B0(view), oVar.B0(view2)));
        if (z9) {
            return Math.round((iMax * (Math.abs(jVar.d(view2) - jVar.g(view)) / (Math.abs(oVar.B0(view) - oVar.B0(view2)) + 1))) + (jVar.m() - jVar.g(view)));
        }
        return iMax;
    }

    public static int c(RecyclerView.A a9, j jVar, View view, View view2, RecyclerView.o oVar, boolean z9) {
        if (oVar.h0() == 0 || a9.c() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z9) {
            return a9.c();
        }
        return (int) (((jVar.d(view2) - jVar.g(view)) / (Math.abs(oVar.B0(view) - oVar.B0(view2)) + 1)) * a9.c());
    }
}
