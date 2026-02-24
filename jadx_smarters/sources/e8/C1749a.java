package e8;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import d8.AbstractC1715a;
import java.util.ArrayList;

/* JADX INFO: renamed from: e8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1749a extends AbstractC1715a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float[] f40466i = {1.0f, 1.0f, 1.0f};

    /* JADX INFO: renamed from: e8.a$a, reason: collision with other inner class name */
    public class C0323a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f40467a;

        public C0323a(int i9) {
            this.f40467a = i9;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C1749a.this.f40466i[this.f40467a] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C1749a.this.h();
        }
    }

    @Override // d8.AbstractC1715a
    public void b(Canvas canvas, Paint paint) {
        float fMin = (Math.min(e(), d()) - 8.0f) / 6.0f;
        float f9 = 2.0f * fMin;
        float fE = (e() / 2) - (f9 + 4.0f);
        float fD = d() / 2;
        for (int i9 = 0; i9 < 3; i9++) {
            canvas.save();
            float f10 = i9;
            canvas.translate((f9 * f10) + fE + (f10 * 4.0f), fD);
            float f11 = this.f40466i[i9];
            canvas.scale(f11, f11);
            canvas.drawCircle(0.0f, 0.0f, fMin, paint);
            canvas.restore();
        }
    }

    @Override // d8.AbstractC1715a
    public ArrayList g() {
        ArrayList arrayList = new ArrayList();
        int[] iArr = {120, 240, 360};
        for (int i9 = 0; i9 < 3; i9++) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.3f, 1.0f);
            valueAnimatorOfFloat.setDuration(750L);
            valueAnimatorOfFloat.setRepeatCount(-1);
            valueAnimatorOfFloat.setStartDelay(iArr[i9]);
            a(valueAnimatorOfFloat, new C0323a(i9));
            arrayList.add(valueAnimatorOfFloat);
        }
        return arrayList;
    }
}
