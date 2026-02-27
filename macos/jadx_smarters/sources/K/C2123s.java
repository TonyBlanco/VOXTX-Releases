package k;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import c.AbstractC1238a;

/* JADX INFO: renamed from: k.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2123s extends RatingBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f43399a;

    public C2123s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1238a.f17733J);
    }

    public C2123s(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        Z.a(this, getContext());
        r rVar = new r(this);
        this.f43399a = rVar;
        rVar.c(attributeSet, i9);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        Bitmap bitmapB = this.f43399a.b();
        if (bitmapB != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), i9, 0), getMeasuredHeight());
        }
    }
}
