package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class o extends i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Paint f14866f;

    public o(g gVar) {
        super(gVar);
    }

    public static Paint c() {
        if (f14866f == null) {
            TextPaint textPaint = new TextPaint();
            f14866f = textPaint;
            textPaint.setColor(e.b().c());
            f14866f.setStyle(Paint.Style.FILL);
        }
        return f14866f;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i9, int i10, float f9, int i11, int i12, int i13, Paint paint) {
        if (e.b().i()) {
            canvas.drawRect(f9, i11, f9 + b(), i13, c());
        }
        a().a(canvas, f9, i12, paint);
    }
}
