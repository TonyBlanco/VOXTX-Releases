package i5;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: renamed from: i5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1892b {
    public static TypedValue a(Context context, int i9) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i9, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(Context context, int i9, boolean z9) {
        TypedValue typedValueA = a(context, i9);
        return (typedValueA == null || typedValueA.type != 18) ? z9 : typedValueA.data != 0;
    }

    public static int c(Context context, int i9, int i10) {
        TypedValue typedValueA = a(context, i9);
        return (typedValueA == null || typedValueA.type != 16) ? i10 : typedValueA.data;
    }

    public static int d(Context context, int i9, String str) {
        TypedValue typedValueA = a(context, i9);
        if (typedValueA != null) {
            return typedValueA.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i9)));
    }

    public static int e(View view, int i9) {
        return d(view.getContext(), i9, view.getClass().getCanonicalName());
    }
}
