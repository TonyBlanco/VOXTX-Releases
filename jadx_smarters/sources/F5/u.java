package f5;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import k.d0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f40820a = {R4.b.f8676k};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f40821b = {R4.b.f8677l};

    public static void a(Context context) {
        e(context, f40820a, "Theme.AppCompat");
    }

    public static void b(Context context, AttributeSet attributeSet, int i9, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R4.l.f9222p7, i9, i10);
        boolean z9 = typedArrayObtainStyledAttributes.getBoolean(R4.l.f9240r7, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z9) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R4.b.f8684s, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }

    public static void c(Context context) {
        e(context, f40821b, "Theme.MaterialComponents");
    }

    public static void d(Context context, AttributeSet attributeSet, int[] iArr, int i9, int i10, int... iArr2) {
        boolean zF;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R4.l.f9222p7, i9, i10);
        if (!typedArrayObtainStyledAttributes.getBoolean(R4.l.f9249s7, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            zF = typedArrayObtainStyledAttributes.getResourceId(R4.l.f9231q7, -1) != -1;
        } else {
            zF = f(context, attributeSet, iArr, i9, i10, iArr2);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!zF) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void e(Context context, int[] iArr, String str) {
        if (g(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    public static boolean f(Context context, AttributeSet attributeSet, int[] iArr, int i9, int i10, int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i9, i10);
        for (int i11 : iArr2) {
            if (typedArrayObtainStyledAttributes.getResourceId(i11, -1) == -1) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static boolean g(Context context, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i9 = 0; i9 < iArr.length; i9++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i9)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    public static TypedArray h(Context context, AttributeSet attributeSet, int[] iArr, int i9, int i10, int... iArr2) {
        b(context, attributeSet, i9, i10);
        d(context, attributeSet, iArr, i9, i10, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i9, i10);
    }

    public static d0 i(Context context, AttributeSet attributeSet, int[] iArr, int i9, int i10, int... iArr2) {
        b(context, attributeSet, i9, i10);
        d(context, attributeSet, iArr, i9, i10, iArr2);
        return d0.v(context, attributeSet, iArr, i9, i10);
    }
}
