package androidx.emoji2.text;

import android.os.Build;
import android.text.TextPaint;
import androidx.emoji2.text.e;

/* JADX INFO: loaded from: classes.dex */
public class d implements e.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f14782b = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextPaint f14783a;

    public d() {
        TextPaint textPaint = new TextPaint();
        this.f14783a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    public static StringBuilder b() {
        ThreadLocal threadLocal = f14782b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    @Override // androidx.emoji2.text.e.d
    public boolean a(CharSequence charSequence, int i9, int i10, int i11) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 < 23 && i11 > i12) {
            return false;
        }
        StringBuilder sbB = b();
        sbB.setLength(0);
        while (i9 < i10) {
            sbB.append(charSequence.charAt(i9));
            i9++;
        }
        return G.d.a(this.f14783a, sbB.toString());
    }
}
