package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import g0.AbstractC1797b;

/* JADX INFO: loaded from: classes.dex */
class MediaRowFocusView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f15405a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f15406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15407d;

    public MediaRowFocusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15406c = new RectF();
        this.f15405a = a(context);
    }

    public final Paint a(Context context) {
        Paint paint = new Paint();
        paint.setColor(context.getResources().getColor(AbstractC1797b.f40963e));
        return paint;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        this.f15407d = height;
        int height2 = ((height * 2) - getHeight()) / 2;
        this.f15406c.set(0.0f, -height2, getWidth(), getHeight() + height2);
        RectF rectF = this.f15406c;
        int i9 = this.f15407d;
        canvas.drawRoundRect(rectF, i9, i9, this.f15405a);
    }
}
