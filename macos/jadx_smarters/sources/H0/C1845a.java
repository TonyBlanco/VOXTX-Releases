package h0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import g0.AbstractC1797b;
import g0.AbstractC1800e;
import g0.l;

/* JADX INFO: renamed from: h0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1845a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f41500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f41501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f41502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f41503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f41504e;

    public C1845a(int i9, float f9, float f10) {
        f9 = f9 > 1.0f ? 1.0f : f9;
        f9 = f9 < 0.0f ? 0.0f : f9;
        f10 = f10 > 1.0f ? 1.0f : f10;
        float f11 = f10 >= 0.0f ? f10 : 0.0f;
        Paint paint = new Paint();
        this.f41502c = paint;
        paint.setColor(Color.rgb(Color.red(i9), Color.green(i9), Color.blue(i9)));
        this.f41500a = f9;
        this.f41501b = f11;
        c(1.0f);
    }

    public static C1845a a(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(l.f41117k);
        int color = typedArrayObtainStyledAttributes.getColor(l.f41124o, context.getResources().getColor(AbstractC1797b.f40972n));
        float fraction = typedArrayObtainStyledAttributes.getFraction(l.f41121m, 1, 1, context.getResources().getFraction(AbstractC1800e.f41010h, 1, 0));
        float fraction2 = typedArrayObtainStyledAttributes.getFraction(l.f41123n, 1, 1, context.getResources().getFraction(AbstractC1800e.f41011i, 1, 1));
        typedArrayObtainStyledAttributes.recycle();
        return new C1845a(color, fraction, fraction2);
    }

    public Paint b() {
        return this.f41502c;
    }

    public void c(float f9) {
        float f10 = this.f41501b;
        float f11 = f10 + (f9 * (this.f41500a - f10));
        this.f41504e = f11;
        int i9 = (int) (f11 * 255.0f);
        this.f41503d = i9;
        this.f41502c.setAlpha(i9);
    }
}
