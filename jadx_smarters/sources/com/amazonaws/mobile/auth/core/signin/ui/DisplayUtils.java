package com.amazonaws.mobile.auth.core.signin.ui;

import android.content.res.Resources;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.DisplayMetrics;

/* JADX INFO: loaded from: classes.dex */
public class DisplayUtils {
    private static int dpMultiplier;
    private static final DisplayMetrics metrics;

    static {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        metrics = displayMetrics;
        dpMultiplier = displayMetrics.densityDpi / 160;
    }

    public static int dp(int i9) {
        return i9 * dpMultiplier;
    }

    public static ShapeDrawable getRoundedRectangleBackground(int i9, int i10) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(getRoundedRectangleShape(i9));
        shapeDrawable.getPaint().setColor(i10);
        return shapeDrawable;
    }

    public static Shape getRoundedRectangleShape(int i9) {
        float f9 = i9;
        return new RoundRectShape(new float[]{f9, f9, f9, f9, f9, f9, f9, f9}, null, null);
    }
}
