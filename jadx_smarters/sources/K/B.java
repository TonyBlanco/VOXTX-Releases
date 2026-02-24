package k;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.amazonaws.services.s3.internal.Constants;
import com.google.android.gms.common.api.a;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class B {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RectF f43121l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static ConcurrentHashMap f43122m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static ConcurrentHashMap f43123n = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43124a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f43125b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f43126c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f43127d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f43128e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f43129f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f43130g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f43131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f43132i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f43133j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f f43134k;

    public static final class a {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i9, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i9, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }

        public static int b(TextView textView) {
            return textView.getMaxLines();
        }
    }

    public static final class b {
        public static boolean a(View view) {
            return view.isInLayout();
        }
    }

    public static final class c {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i9, int i10, TextView textView, TextPaint textPaint, f fVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i9);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i10 == -1) {
                i10 = a.e.API_PRIORITY_OTHER;
            }
            hyphenationFrequency.setMaxLines(i10);
            try {
                fVar.a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    public static class d extends f {
        @Override // k.B.f
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) B.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    public static class e extends d {
        @Override // k.B.d, k.B.f
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // k.B.f
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    public static class f {
        public void a(StaticLayout.Builder builder, TextView textView) {
        }

        public boolean b(TextView textView) {
            return ((Boolean) B.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public B(TextView textView) {
        this.f43132i = textView;
        this.f43133j = textView.getContext();
        int i9 = Build.VERSION.SDK_INT;
        this.f43134k = i9 >= 29 ? new e() : i9 >= 23 ? new d() : new f();
    }

    public static Method k(String str) {
        try {
            Method declaredMethod = (Method) f43122m.get(str);
            if (declaredMethod == null && (declaredMethod = TextView.class.getDeclaredMethod(str, null)) != null) {
                declaredMethod.setAccessible(true);
                f43122m.put(str, declaredMethod);
            }
            return declaredMethod;
        } catch (Exception e9) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e9);
            return null;
        }
    }

    public static Object m(Object obj, String str, Object obj2) {
        try {
            return k(str).invoke(obj, null);
        } catch (Exception e9) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e9);
            return obj2;
        }
    }

    public void a() {
        if (n()) {
            if (this.f43125b) {
                if (this.f43132i.getMeasuredHeight() <= 0 || this.f43132i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f43134k.b(this.f43132i) ? Constants.MB : (this.f43132i.getMeasuredWidth() - this.f43132i.getTotalPaddingLeft()) - this.f43132i.getTotalPaddingRight();
                int height = (this.f43132i.getHeight() - this.f43132i.getCompoundPaddingBottom()) - this.f43132i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f43121l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fE = e(rectF);
                        if (fE != this.f43132i.getTextSize()) {
                            t(0, fE);
                        }
                    } finally {
                    }
                }
            }
            this.f43125b = true;
        }
    }

    public final int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i9 : iArr) {
            if (i9 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i9)) < 0) {
                arrayList.add(Integer.valueOf(i9));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr2[i10] = ((Integer) arrayList.get(i10)).intValue();
        }
        return iArr2;
    }

    public final void c() {
        this.f43124a = 0;
        this.f43127d = -1.0f;
        this.f43128e = -1.0f;
        this.f43126c = -1.0f;
        this.f43129f = new int[0];
        this.f43125b = false;
    }

    public StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i9, int i10) {
        return Build.VERSION.SDK_INT >= 23 ? c.a(charSequence, alignment, i9, i10, this.f43132i, this.f43131h, this.f43134k) : a.a(charSequence, alignment, i9, this.f43132i, this.f43131h);
    }

    public final int e(RectF rectF) {
        int length = this.f43129f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i9 = 1;
        int i10 = length - 1;
        int i11 = 0;
        while (i9 <= i10) {
            int i12 = (i9 + i10) / 2;
            if (x(this.f43129f[i12], rectF)) {
                int i13 = i12 + 1;
                i11 = i9;
                i9 = i13;
            } else {
                i11 = i12 - 1;
                i10 = i11;
            }
        }
        return this.f43129f[i11];
    }

    public int f() {
        return Math.round(this.f43128e);
    }

    public int g() {
        return Math.round(this.f43127d);
    }

    public int h() {
        return Math.round(this.f43126c);
    }

    public int[] i() {
        return this.f43129f;
    }

    public int j() {
        return this.f43124a;
    }

    public void l(int i9) {
        TextPaint textPaint = this.f43131h;
        if (textPaint == null) {
            this.f43131h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f43131h.set(this.f43132i.getPaint());
        this.f43131h.setTextSize(i9);
    }

    public boolean n() {
        return y() && this.f43124a != 0;
    }

    public void o(AttributeSet attributeSet, int i9) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f43133j.obtainStyledAttributes(attributeSet, c.j.f18079g0, i9, 0);
        TextView textView = this.f43132i;
        P.L.q0(textView, textView.getContext(), c.j.f18079g0, attributeSet, typedArrayObtainStyledAttributes, i9, 0);
        if (typedArrayObtainStyledAttributes.hasValue(c.j.f18104l0)) {
            this.f43124a = typedArrayObtainStyledAttributes.getInt(c.j.f18104l0, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(c.j.f18099k0) ? typedArrayObtainStyledAttributes.getDimension(c.j.f18099k0, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(c.j.f18089i0) ? typedArrayObtainStyledAttributes.getDimension(c.j.f18089i0, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(c.j.f18084h0) ? typedArrayObtainStyledAttributes.getDimension(c.j.f18084h0, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(c.j.f18094j0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(c.j.f18094j0, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!y()) {
            this.f43124a = 0;
            return;
        }
        if (this.f43124a == 1) {
            if (!this.f43130g) {
                DisplayMetrics displayMetrics = this.f43133j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    public void p(int i9, int i10, int i11, int i12) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f43133j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i12, i9, displayMetrics), TypedValue.applyDimension(i12, i10, displayMetrics), TypedValue.applyDimension(i12, i11, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    public void q(int[] iArr, int i9) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i9 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f43133j.getResources().getDisplayMetrics();
                    for (int i10 = 0; i10 < length; i10++) {
                        iArrCopyOf[i10] = Math.round(TypedValue.applyDimension(i9, iArr[i10], displayMetrics));
                    }
                }
                this.f43129f = b(iArrCopyOf);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f43130g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    public void r(int i9) {
        if (y()) {
            if (i9 == 0) {
                c();
                return;
            }
            if (i9 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i9);
            }
            DisplayMetrics displayMetrics = this.f43133j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    public final void s(float f9) {
        if (f9 != this.f43132i.getPaint().getTextSize()) {
            this.f43132i.getPaint().setTextSize(f9);
            boolean zA = b.a(this.f43132i);
            if (this.f43132i.getLayout() != null) {
                this.f43125b = false;
                try {
                    Method methodK = k("nullLayouts");
                    if (methodK != null) {
                        methodK.invoke(this.f43132i, null);
                    }
                } catch (Exception e9) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e9);
                }
                if (zA) {
                    this.f43132i.forceLayout();
                } else {
                    this.f43132i.requestLayout();
                }
                this.f43132i.invalidate();
            }
        }
    }

    public void t(int i9, float f9) {
        Context context = this.f43133j;
        s(TypedValue.applyDimension(i9, f9, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public final boolean u() {
        if (y() && this.f43124a == 1) {
            if (!this.f43130g || this.f43129f.length == 0) {
                int iFloor = ((int) Math.floor((this.f43128e - this.f43127d) / this.f43126c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i9 = 0; i9 < iFloor; i9++) {
                    iArr[i9] = Math.round(this.f43127d + (i9 * this.f43126c));
                }
                this.f43129f = b(iArr);
            }
            this.f43125b = true;
        } else {
            this.f43125b = false;
        }
        return this.f43125b;
    }

    public final void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i9 = 0; i9 < length; i9++) {
                iArr[i9] = typedArray.getDimensionPixelSize(i9, -1);
            }
            this.f43129f = b(iArr);
            w();
        }
    }

    public final boolean w() {
        boolean z9 = this.f43129f.length > 0;
        this.f43130g = z9;
        if (z9) {
            this.f43124a = 1;
            this.f43127d = r0[0];
            this.f43128e = r0[r1 - 1];
            this.f43126c = -1.0f;
        }
        return z9;
    }

    public final boolean x(int i9, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f43132i.getText();
        TransformationMethod transformationMethod = this.f43132i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f43132i)) != null) {
            text = transformation;
        }
        int iB = a.b(this.f43132i);
        l(i9);
        StaticLayout staticLayoutD = d(text, (Layout.Alignment) m(this.f43132i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), iB);
        return (iB == -1 || (staticLayoutD.getLineCount() <= iB && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) && ((float) staticLayoutD.getHeight()) <= rectF.bottom;
    }

    public final boolean y() {
        return !(this.f43132i instanceof C2115j);
    }

    public final void z(float f9, float f10, float f11) {
        if (f9 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f9 + "px) is less or equal to (0px)");
        }
        if (f10 <= f9) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f10 + "px) is less or equal to minimum auto-size text size (" + f9 + "px)");
        }
        if (f11 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f11 + "px) is less or equal to (0px)");
        }
        this.f43124a = 1;
        this.f43127d = f9;
        this.f43128e = f10;
        this.f43126c = f11;
        this.f43130g = false;
    }
}
