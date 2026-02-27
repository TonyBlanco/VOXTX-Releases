package P;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.PointerIcon;

/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointerIcon f6741a;

    public static class a {
        public static PointerIcon a(Bitmap bitmap, float f9, float f10) {
            return PointerIcon.create(bitmap, f9, f10);
        }

        public static PointerIcon b(Context context, int i9) {
            return PointerIcon.getSystemIcon(context, i9);
        }

        public static PointerIcon c(Resources resources, int i9) {
            return PointerIcon.load(resources, i9);
        }
    }

    public I(PointerIcon pointerIcon) {
        this.f6741a = pointerIcon;
    }

    public static I b(Context context, int i9) {
        return Build.VERSION.SDK_INT >= 24 ? new I(a.b(context, i9)) : new I(null);
    }

    public Object a() {
        return this.f6741a;
    }
}
