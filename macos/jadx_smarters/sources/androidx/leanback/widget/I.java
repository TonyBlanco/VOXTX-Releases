package androidx.leanback.widget;

import android.graphics.Outline;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SparseArray f15368a;

    public static final class a extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15369a;

        public a(int i9) {
            this.f15369a = i9;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f15369a);
            outline.setAlpha(1.0f);
        }
    }

    public static void a(View view, boolean z9, int i9) {
        if (z9) {
            if (f15368a == null) {
                f15368a = new SparseArray();
            }
            ViewOutlineProvider aVar = (ViewOutlineProvider) f15368a.get(i9);
            if (aVar == null) {
                aVar = new a(i9);
                if (f15368a.size() < 32) {
                    f15368a.put(i9, aVar);
                }
            }
            view.setOutlineProvider(aVar);
        } else {
            view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        }
        view.setClipToOutline(z9);
    }
}
