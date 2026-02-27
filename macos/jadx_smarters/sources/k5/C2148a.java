package k5;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: renamed from: k5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2148a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f43575i = new int[3];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float[] f43576j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f43577k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f43578l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f43579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f43580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f43581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f43585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Paint f43586h;

    public C2148a() {
        this(DefaultRenderer.BACKGROUND_COLOR);
    }

    public C2148a(int i9) {
        this.f43585g = new Path();
        this.f43586h = new Paint();
        this.f43579a = new Paint();
        d(i9);
        this.f43586h.setColor(0);
        Paint paint = new Paint(4);
        this.f43580b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f43581c = new Paint(paint);
    }

    public void a(Canvas canvas, Matrix matrix, RectF rectF, int i9, float f9, float f10) {
        boolean z9 = f10 < 0.0f;
        Path path = this.f43585g;
        if (z9) {
            int[] iArr = f43577k;
            iArr[0] = 0;
            iArr[1] = this.f43584f;
            iArr[2] = this.f43583e;
            iArr[3] = this.f43582d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f9, f10);
            path.close();
            float f11 = -i9;
            rectF.inset(f11, f11);
            int[] iArr2 = f43577k;
            iArr2[0] = 0;
            iArr2[1] = this.f43582d;
            iArr2[2] = this.f43583e;
            iArr2[3] = this.f43584f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f12 = 1.0f - (i9 / fWidth);
        float[] fArr = f43578l;
        fArr[1] = f12;
        fArr[2] = ((1.0f - f12) / 2.0f) + f12;
        this.f43580b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f43577k, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z9) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f43586h);
        }
        canvas.drawArc(rectF, f9, f10, true, this.f43580b);
        canvas.restore();
    }

    public void b(Canvas canvas, Matrix matrix, RectF rectF, int i9) {
        rectF.bottom += i9;
        rectF.offset(0.0f, -i9);
        int[] iArr = f43575i;
        iArr[0] = this.f43584f;
        iArr[1] = this.f43583e;
        iArr[2] = this.f43582d;
        Paint paint = this.f43581c;
        float f9 = rectF.left;
        paint.setShader(new LinearGradient(f9, rectF.top, f9, rectF.bottom, iArr, f43576j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f43581c);
        canvas.restore();
    }

    public Paint c() {
        return this.f43579a;
    }

    public void d(int i9) {
        this.f43582d = G.a.o(i9, 68);
        this.f43583e = G.a.o(i9, 20);
        this.f43584f = G.a.o(i9, 0);
        this.f43579a.setColor(this.f43582d);
    }
}
