package me.zhanghai.android.materialprogressbar.internal;

import android.content.Context;
import android.content.res.TypedArray;

/* JADX INFO: loaded from: classes4.dex */
public class ThemeUtils {
    private ThemeUtils() {
    }

    public static int getColorFromAttrRes(int i9, int i10, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i9});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, i10);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static float getFloatFromAttrRes(int i9, float f9, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{i9});
        try {
            return typedArrayObtainStyledAttributes.getFloat(0, f9);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
