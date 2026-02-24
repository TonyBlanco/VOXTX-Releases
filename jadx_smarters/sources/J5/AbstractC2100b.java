package j5;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;

/* JADX INFO: renamed from: j5.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2100b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f43042a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f43043b = {R.attr.state_pressed};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f43044c = {R.attr.state_hovered, R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f43045d = {R.attr.state_focused};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f43046e = {R.attr.state_hovered};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f43047f = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f43048g = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f43049h = {R.attr.state_selected, R.attr.state_focused};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f43050i = {R.attr.state_selected, R.attr.state_hovered};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f43051j = {R.attr.state_selected};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f43052k = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f43053l = AbstractC2100b.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        if (f43042a) {
            return new ColorStateList(new int[][]{f43051j, StateSet.NOTHING}, new int[]{c(colorStateList, f43047f), c(colorStateList, f43043b)});
        }
        int[] iArr = f43047f;
        int[] iArr2 = f43048g;
        int[] iArr3 = f43049h;
        int[] iArr4 = f43050i;
        int[] iArr5 = f43043b;
        int[] iArr6 = f43044c;
        int[] iArr7 = f43045d;
        int[] iArr8 = f43046e;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f43051j, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{c(colorStateList, iArr), c(colorStateList, iArr2), c(colorStateList, iArr3), c(colorStateList, iArr4), 0, c(colorStateList, iArr5), c(colorStateList, iArr6), c(colorStateList, iArr7), c(colorStateList, iArr8), 0});
    }

    public static int b(int i9) {
        return G.a.o(i9, Math.min(Color.alpha(i9) * 2, 255));
    }

    public static int c(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f43042a ? b(colorForState) : colorForState;
    }

    public static ColorStateList d(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 22 && i9 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f43052k, 0)) != 0) {
            Log.w(f43053l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean e(int[] iArr) {
        boolean z9 = false;
        boolean z10 = false;
        for (int i9 : iArr) {
            if (i9 == 16842910) {
                z9 = true;
            } else if (i9 == 16842908 || i9 == 16842919 || i9 == 16843623) {
                z10 = true;
            }
        }
        return z9 && z10;
    }
}
