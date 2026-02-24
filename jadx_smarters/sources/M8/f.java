package M8;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f5244a = new c();

    public interface b {
        void a(ViewGroup viewGroup, View view, Rect rect);
    }

    public static class c implements b {
        public c() {
        }

        @Override // M8.f.b
        public void a(ViewGroup viewGroup, View view, Rect rect) {
            g.b(viewGroup, view, rect);
        }
    }

    public static void a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        b(viewGroup, view, rect);
    }

    public static void b(ViewGroup viewGroup, View view, Rect rect) {
        f5244a.a(viewGroup, view, rect);
    }
}
