package g5;

import G.e;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.TypedValue;
import i5.AbstractC1892b;
import org.apache.http.cookie.ClientCookie;

/* JADX INFO: renamed from: g5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1837a {
    public static float a(String[] strArr, int i9) {
        float f9 = Float.parseFloat(strArr[i9]);
        if (f9 >= 0.0f && f9 <= 1.0f) {
            return f9;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f9);
    }

    public static String b(String str, String str2) {
        return str.substring(str2.length() + 1, str.length() - 1);
    }

    public static boolean c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("(");
        return str.startsWith(sb.toString()) && str.endsWith(")");
    }

    public static int d(Context context, int i9, int i10) {
        return AbstractC1892b.c(context, i9, i10);
    }

    public static TimeInterpolator e(Context context, int i9, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i9, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be a string");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!c(strValueOf, "cubic-bezier")) {
            if (c(strValueOf, ClientCookie.PATH_ATTR)) {
                return R.a.b(e.e(b(strValueOf, ClientCookie.PATH_ATTR)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: " + strValueOf);
        }
        String[] strArrSplit = b(strValueOf, "cubic-bezier").split(",");
        if (strArrSplit.length == 4) {
            return R.a.a(a(strArrSplit, 0), a(strArrSplit, 1), a(strArrSplit, 2), a(strArrSplit, 3));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
    }
}
