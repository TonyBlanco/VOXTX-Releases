package androidx.emoji2.text;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends ReplacementSpan {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f14837b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f14836a = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public short f14838c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public short f14839d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f14840e = 1.0f;

    public i(g gVar) {
        O.h.g(gVar, "metadata cannot be null");
        this.f14837b = gVar;
    }

    public final g a() {
        return this.f14837b;
    }

    public final int b() {
        return this.f14838c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i9, int i10, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f14836a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f14836a;
        this.f14840e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f14837b.e();
        this.f14839d = (short) (this.f14837b.e() * this.f14840e);
        short sI = (short) (this.f14837b.i() * this.f14840e);
        this.f14838c = sI;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f14836a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return sI;
    }
}
