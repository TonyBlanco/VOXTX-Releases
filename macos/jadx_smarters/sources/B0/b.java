package B0;

import P.L;
import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f167a = new b();

    public static float e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f9 = 0.0f;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = recyclerView.getChildAt(i9);
            if (childAt != view) {
                float fY = L.y(childAt);
                if (fY > f9) {
                    f9 = fY;
                }
            }
        }
        return f9;
    }

    @Override // B0.a
    public void a(View view) {
        Object tag = view.getTag(A0.c.f27a);
        if (tag instanceof Float) {
            L.A0(view, ((Float) tag).floatValue());
        }
        view.setTag(A0.c.f27a, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // B0.a
    public void b(View view) {
    }

    @Override // B0.a
    public void c(Canvas canvas, RecyclerView recyclerView, View view, float f9, float f10, int i9, boolean z9) {
        if (z9 && view.getTag(A0.c.f27a) == null) {
            Float fValueOf = Float.valueOf(L.y(view));
            L.A0(view, e(recyclerView, view) + 1.0f);
            view.setTag(A0.c.f27a, fValueOf);
        }
        view.setTranslationX(f9);
        view.setTranslationY(f10);
    }

    @Override // B0.a
    public void d(Canvas canvas, RecyclerView recyclerView, View view, float f9, float f10, int i9, boolean z9) {
    }
}
