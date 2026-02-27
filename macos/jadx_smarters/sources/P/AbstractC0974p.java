package P;

import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: renamed from: P.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0974p {

    /* JADX INFO: renamed from: P.p$a */
    public static class a {
        public static void a(int i9, int i10, int i11, Rect rect, int i12, int i13, Rect rect2, int i14) {
            Gravity.apply(i9, i10, i11, rect, i12, i13, rect2, i14);
        }

        public static void b(int i9, int i10, int i11, Rect rect, Rect rect2, int i12) {
            Gravity.apply(i9, i10, i11, rect, rect2, i12);
        }

        public static void c(int i9, Rect rect, Rect rect2, int i10) {
            Gravity.applyDisplay(i9, rect, rect2, i10);
        }
    }

    public static void a(int i9, int i10, int i11, Rect rect, Rect rect2, int i12) {
        a.b(i9, i10, i11, rect, rect2, i12);
    }

    public static int b(int i9, int i10) {
        return Gravity.getAbsoluteGravity(i9, i10);
    }
}
