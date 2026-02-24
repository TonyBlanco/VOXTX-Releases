package F;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static int a(Context context, int i9, int i10) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i9, typedValue, true);
        return typedValue.resourceId != 0 ? i9 : i10;
    }

    public static boolean b(TypedArray typedArray, int i9, int i10, boolean z9) {
        return typedArray.getBoolean(i9, typedArray.getBoolean(i10, z9));
    }

    public static Drawable c(TypedArray typedArray, int i9, int i10) {
        Drawable drawable = typedArray.getDrawable(i9);
        return drawable == null ? typedArray.getDrawable(i10) : drawable;
    }

    public static int d(TypedArray typedArray, int i9, int i10, int i11) {
        return typedArray.getInt(i9, typedArray.getInt(i10, i11));
    }

    public static boolean e(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i9, boolean z9) {
        return !r(xmlPullParser, str) ? z9 : typedArray.getBoolean(i9, z9);
    }

    public static int f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i9, int i10) {
        return !r(xmlPullParser, str) ? i10 : typedArray.getColor(i9, i10);
    }

    public static ColorStateList g(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i9) {
        if (!r(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i9, typedValue);
        int i10 = typedValue.type;
        if (i10 != 2) {
            return (i10 < 28 || i10 > 31) ? c.d(typedArray.getResources(), typedArray.getResourceId(i9, 0), theme) : h(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i9 + ": " + typedValue);
    }

    public static ColorStateList h(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static d i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i9, int i10) {
        if (r(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i9, typedValue);
            int i11 = typedValue.type;
            if (i11 >= 28 && i11 <= 31) {
                return d.b(typedValue.data);
            }
            d dVarG = d.g(typedArray.getResources(), typedArray.getResourceId(i9, 0), theme);
            if (dVarG != null) {
                return dVarG;
            }
        }
        return d.b(i10);
    }

    public static float j(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i9, float f9) {
        return !r(xmlPullParser, str) ? f9 : typedArray.getFloat(i9, f9);
    }

    public static int k(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i9, int i10) {
        return !r(xmlPullParser, str) ? i10 : typedArray.getInt(i9, i10);
    }

    public static int l(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i9, int i10) {
        return !r(xmlPullParser, str) ? i10 : typedArray.getResourceId(i9, i10);
    }

    public static String m(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i9) {
        if (r(xmlPullParser, str)) {
            return typedArray.getString(i9);
        }
        return null;
    }

    public static int n(TypedArray typedArray, int i9, int i10, int i11) {
        return typedArray.getResourceId(i9, typedArray.getResourceId(i10, i11));
    }

    public static String o(TypedArray typedArray, int i9, int i10) {
        String string = typedArray.getString(i9);
        return string == null ? typedArray.getString(i10) : string;
    }

    public static CharSequence p(TypedArray typedArray, int i9, int i10) {
        CharSequence text = typedArray.getText(i9);
        return text == null ? typedArray.getText(i10) : text;
    }

    public static CharSequence[] q(TypedArray typedArray, int i9, int i10) {
        CharSequence[] textArray = typedArray.getTextArray(i9);
        return textArray == null ? typedArray.getTextArray(i10) : textArray;
    }

    public static boolean r(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray s(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static TypedValue t(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i9) {
        if (r(xmlPullParser, str)) {
            return typedArray.peekValue(i9);
        }
        return null;
    }
}
