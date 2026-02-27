package i5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import e.AbstractC1726a;
import k.d0;

/* JADX INFO: renamed from: i5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1893c {
    public static ColorStateList a(Context context, TypedArray typedArray, int i9) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!typedArray.hasValue(i9) || (resourceId = typedArray.getResourceId(i9, 0)) == 0 || (colorStateListA = AbstractC1726a.a(context, resourceId)) == null) ? typedArray.getColorStateList(i9) : colorStateListA;
    }

    public static ColorStateList b(Context context, d0 d0Var, int i9) {
        int iN;
        ColorStateList colorStateListA;
        return (!d0Var.s(i9) || (iN = d0Var.n(i9, 0)) == 0 || (colorStateListA = AbstractC1726a.a(context, iN)) == null) ? d0Var.c(i9) : colorStateListA;
    }

    public static int c(Context context, TypedArray typedArray, int i9, int i10) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i9, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i9, i10);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i10);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable d(Context context, TypedArray typedArray, int i9) {
        int resourceId;
        Drawable drawableB;
        return (!typedArray.hasValue(i9) || (resourceId = typedArray.getResourceId(i9, 0)) == 0 || (drawableB = AbstractC1726a.b(context, resourceId)) == null) ? typedArray.getDrawable(i9) : drawableB;
    }

    public static int e(TypedArray typedArray, int i9, int i10) {
        return typedArray.hasValue(i9) ? i9 : i10;
    }

    public static C1894d f(Context context, TypedArray typedArray, int i9) {
        int resourceId;
        if (!typedArray.hasValue(i9) || (resourceId = typedArray.getResourceId(i9, 0)) == 0) {
            return null;
        }
        return new C1894d(context, resourceId);
    }

    public static boolean g(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static boolean h(Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }
}
