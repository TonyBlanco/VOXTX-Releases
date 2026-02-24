package me.zhanghai.android.materialprogressbar.internal;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.util.Property;

/* JADX INFO: loaded from: classes4.dex */
public class ObjectAnimatorCompat {
    private ObjectAnimatorCompat() {
    }

    public static <T> ObjectAnimator ofArgb(T t9, Property<T, Integer> property, int... iArr) {
        return ObjectAnimatorCompatLollipop.ofArgb(t9, property, iArr);
    }

    public static ObjectAnimator ofArgb(Object obj, String str, int... iArr) {
        return ObjectAnimatorCompatLollipop.ofArgb(obj, str, iArr);
    }

    public static <T> ObjectAnimator ofFloat(T t9, Property<T, Float> property, Property<T, Float> property2, Path path) {
        return ObjectAnimatorCompatLollipop.ofFloat(t9, property, property2, path);
    }

    public static ObjectAnimator ofFloat(Object obj, String str, String str2, Path path) {
        return ObjectAnimatorCompatLollipop.ofFloat(obj, str, str2, path);
    }

    public static <T> ObjectAnimator ofInt(T t9, Property<T, Integer> property, Property<T, Integer> property2, Path path) {
        return ObjectAnimatorCompatLollipop.ofInt(t9, property, property2, path);
    }

    public static ObjectAnimator ofInt(Object obj, String str, String str2, Path path) {
        return ObjectAnimatorCompatLollipop.ofInt(obj, str, str2, path);
    }
}
