package f5;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.common.api.a;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f40796n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static boolean f40797o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Constructor f40798p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static Object f40799q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CharSequence f40800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextPaint f40801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f40802c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f40804e;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f40811l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f40803d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Layout.Alignment f40805f = Layout.Alignment.ALIGN_NORMAL;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f40806g = a.e.API_PRIORITY_OTHER;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f40807h = 0.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f40808i = 1.0f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f40809j = f40796n;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f40810k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextUtils.TruncateAt f40812m = null;

    public static class a extends Exception {
        public a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    static {
        f40796n = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    public r(CharSequence charSequence, TextPaint textPaint, int i9) {
        this.f40800a = charSequence;
        this.f40801b = textPaint;
        this.f40802c = i9;
        this.f40804e = charSequence.length();
    }

    public static r c(CharSequence charSequence, TextPaint textPaint, int i9) {
        return new r(charSequence, textPaint, i9);
    }

    public StaticLayout a() throws a {
        if (this.f40800a == null) {
            this.f40800a = "";
        }
        int iMax = Math.max(0, this.f40802c);
        CharSequence charSequenceEllipsize = this.f40800a;
        if (this.f40806g == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f40801b, iMax, this.f40812m);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.f40804e);
        this.f40804e = iMin;
        if (Build.VERSION.SDK_INT < 23) {
            b();
            try {
                return (StaticLayout) ((Constructor) O.h.f(f40798p)).newInstance(charSequenceEllipsize, Integer.valueOf(this.f40803d), Integer.valueOf(this.f40804e), this.f40801b, Integer.valueOf(iMax), this.f40805f, O.h.f(f40799q), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.f40810k), null, Integer.valueOf(iMax), Integer.valueOf(this.f40806g));
            } catch (Exception e9) {
                throw new a(e9);
            }
        }
        if (this.f40811l && this.f40806g == 1) {
            this.f40805f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.f40803d, iMin, this.f40801b, iMax);
        builderObtain.setAlignment(this.f40805f);
        builderObtain.setIncludePad(this.f40810k);
        builderObtain.setTextDirection(this.f40811l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f40812m;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.f40806g);
        float f9 = this.f40807h;
        if (f9 != 0.0f || this.f40808i != 1.0f) {
            builderObtain.setLineSpacing(f9, this.f40808i);
        }
        if (this.f40806g > 1) {
            builderObtain.setHyphenationFrequency(this.f40809j);
        }
        return builderObtain.build();
    }

    public final void b() throws a {
        if (f40797o) {
            return;
        }
        try {
            f40799q = this.f40811l && Build.VERSION.SDK_INT >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Constructor declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            f40798p = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f40797o = true;
        } catch (Exception e9) {
            throw new a(e9);
        }
    }

    public r d(Layout.Alignment alignment) {
        this.f40805f = alignment;
        return this;
    }

    public r e(TextUtils.TruncateAt truncateAt) {
        this.f40812m = truncateAt;
        return this;
    }

    public r f(int i9) {
        this.f40809j = i9;
        return this;
    }

    public r g(boolean z9) {
        this.f40810k = z9;
        return this;
    }

    public r h(boolean z9) {
        this.f40811l = z9;
        return this;
    }

    public r i(float f9, float f10) {
        this.f40807h = f9;
        this.f40808i = f10;
        return this;
    }

    public r j(int i9) {
        this.f40806g = i9;
        return this;
    }
}
