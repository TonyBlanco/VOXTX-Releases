package androidx.leanback.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewOutlineProvider f15411a = new a();

    public static class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(1.0f);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public View f15412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f15413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f15414c;
    }

    public static Object a(View view, float f9, float f10, int i9) {
        if (i9 > 0) {
            I.a(view, true, i9);
        } else {
            view.setOutlineProvider(f15411a);
        }
        b bVar = new b();
        bVar.f15412a = view;
        bVar.f15413b = f9;
        bVar.f15414c = f10;
        view.setZ(f9);
        return bVar;
    }

    public static void b(Object obj, float f9) {
        b bVar = (b) obj;
        View view = bVar.f15412a;
        float f10 = bVar.f15413b;
        view.setZ(f10 + (f9 * (bVar.f15414c - f10)));
    }
}
