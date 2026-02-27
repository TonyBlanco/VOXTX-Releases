package e1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: renamed from: e1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1730a {
    public static int a(Context context, int i9) {
        return b(context, i9, 0);
    }

    public static int b(Context context, int i9, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i9});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, i10);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static void c(View view, Drawable drawable) {
        view.setBackground(drawable);
    }
}
