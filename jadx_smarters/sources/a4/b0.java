package a4;

import P3.b;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import d4.AbstractC1684a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 {
    public static /* synthetic */ boolean c(Object obj) {
        return !(obj instanceof T3.b);
    }

    public static /* synthetic */ boolean d(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    public static void e(b.C0083b c0083b) {
        c0083b.b();
        if (c0083b.e() instanceof Spanned) {
            if (!(c0083b.e() instanceof Spannable)) {
                c0083b.o(SpannableString.valueOf(c0083b.e()));
            }
            g((Spannable) AbstractC1684a.e(c0083b.e()), new r5.n() { // from class: a4.Z
                @Override // r5.n
                public final boolean apply(Object obj) {
                    return b0.c(obj);
                }
            });
        }
        f(c0083b);
    }

    public static void f(b.C0083b c0083b) {
        c0083b.q(-3.4028235E38f, Integer.MIN_VALUE);
        if (c0083b.e() instanceof Spanned) {
            if (!(c0083b.e() instanceof Spannable)) {
                c0083b.o(SpannableString.valueOf(c0083b.e()));
            }
            g((Spannable) AbstractC1684a.e(c0083b.e()), new r5.n() { // from class: a4.a0
                @Override // r5.n
                public final boolean apply(Object obj) {
                    return b0.d(obj);
                }
            });
        }
    }

    public static void g(Spannable spannable, r5.n nVar) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (nVar.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    public static float h(int i9, float f9, int i10, int i11) {
        float f10;
        if (f9 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i9 == 0) {
            f10 = i11;
        } else {
            if (i9 != 1) {
                if (i9 != 2) {
                    return -3.4028235E38f;
                }
                return f9;
            }
            f10 = i10;
        }
        return f9 * f10;
    }
}
