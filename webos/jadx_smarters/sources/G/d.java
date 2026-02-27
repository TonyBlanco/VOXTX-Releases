package G;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f2108a = new ThreadLocal();

    public static class a {
        public static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    public static boolean a(Paint paint, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.a(paint, str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float fMeasureText = paint.measureText("\udfffd");
        float fMeasureText2 = paint.measureText("m");
        float fMeasureText3 = paint.measureText(str);
        float fMeasureText4 = 0.0f;
        if (fMeasureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (fMeasureText3 > fMeasureText2 * 2.0f) {
                return false;
            }
            int i9 = 0;
            while (i9 < length) {
                int iCharCount = Character.charCount(str.codePointAt(i9)) + i9;
                fMeasureText4 += paint.measureText(str, i9, iCharCount);
                i9 = iCharCount;
            }
            if (fMeasureText3 >= fMeasureText4) {
                return false;
            }
        }
        if (fMeasureText3 != fMeasureText) {
            return true;
        }
        O.d dVarB = b();
        paint.getTextBounds("\udfffd", 0, 2, (Rect) dVarB.f5400a);
        paint.getTextBounds(str, 0, length, (Rect) dVarB.f5401b);
        return !((Rect) dVarB.f5400a).equals(dVarB.f5401b);
    }

    public static O.d b() {
        ThreadLocal threadLocal = f2108a;
        O.d dVar = (O.d) threadLocal.get();
        if (dVar == null) {
            O.d dVar2 = new O.d(new Rect(), new Rect());
            threadLocal.set(dVar2);
            return dVar2;
        }
        ((Rect) dVar.f5400a).setEmpty();
        ((Rect) dVar.f5401b).setEmpty();
        return dVar;
    }
}
