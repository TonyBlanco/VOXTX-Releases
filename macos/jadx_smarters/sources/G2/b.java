package g2;

import Q1.a;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import e2.AbstractC1732b;
import g2.f;

/* JADX INFO: loaded from: classes.dex */
public class b extends AbstractC1732b implements f.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f41259a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f41260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f41261d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Q1.a f41262e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f41263f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f41264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f41266i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f41267j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f41268k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f41269l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f41270m;

    public static class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Q1.c f41271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f41272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Context f41273c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public S1.g f41274d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f41275e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f41276f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public a.InterfaceC0086a f41277g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public V1.b f41278h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Bitmap f41279i;

        public a(Q1.c cVar, byte[] bArr, Context context, S1.g gVar, int i9, int i10, a.InterfaceC0086a interfaceC0086a, V1.b bVar, Bitmap bitmap) {
            if (bitmap == null) {
                throw new NullPointerException("The first frame of the GIF must not be null");
            }
            this.f41271a = cVar;
            this.f41272b = bArr;
            this.f41278h = bVar;
            this.f41279i = bitmap;
            this.f41273c = context.getApplicationContext();
            this.f41274d = gVar;
            this.f41275e = i9;
            this.f41276f = i10;
            this.f41277g = interfaceC0086a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new b(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    public b(Context context, a.InterfaceC0086a interfaceC0086a, V1.b bVar, S1.g gVar, int i9, int i10, Q1.c cVar, byte[] bArr, Bitmap bitmap) {
        this(new a(cVar, bArr, context, gVar, i9, i10, interfaceC0086a, bVar, bitmap));
    }

    public b(a aVar) {
        this.f41260c = new Rect();
        this.f41267j = true;
        this.f41269l = -1;
        if (aVar == null) {
            throw new NullPointerException("GifState must not be null");
        }
        this.f41261d = aVar;
        Q1.a aVar2 = new Q1.a(aVar.f41277g);
        this.f41262e = aVar2;
        this.f41259a = new Paint();
        aVar2.n(aVar.f41271a, aVar.f41272b);
        f fVar = new f(aVar.f41273c, this, aVar2, aVar.f41275e, aVar.f41276f);
        this.f41263f = fVar;
        fVar.f(aVar.f41274d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public b(b bVar, Bitmap bitmap, S1.g gVar) {
        a aVar = bVar.f41261d;
        this(new a(aVar.f41271a, aVar.f41272b, aVar.f41273c, gVar, aVar.f41275e, aVar.f41276f, aVar.f41277g, aVar.f41278h, bitmap));
    }

    @Override // g2.f.c
    public void a(int i9) {
        if (getCallback() == null) {
            stop();
            i();
            return;
        }
        invalidateSelf();
        if (i9 == this.f41262e.f() - 1) {
            this.f41268k++;
        }
        int i10 = this.f41269l;
        if (i10 == -1 || this.f41268k < i10) {
            return;
        }
        stop();
    }

    @Override // e2.AbstractC1732b
    public boolean b() {
        return true;
    }

    @Override // e2.AbstractC1732b
    public void c(int i9) {
        if (i9 <= 0 && i9 != -1 && i9 != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (i9 != 0) {
            this.f41269l = i9;
        } else {
            int iJ = this.f41262e.j();
            this.f41269l = iJ != 0 ? iJ : -1;
        }
    }

    public byte[] d() {
        return this.f41261d.f41272b;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f41266i) {
            return;
        }
        if (this.f41270m) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), this.f41260c);
            this.f41270m = false;
        }
        Bitmap bitmapB = this.f41263f.b();
        if (bitmapB == null) {
            bitmapB = this.f41261d.f41279i;
        }
        canvas.drawBitmap(bitmapB, (Rect) null, this.f41260c, this.f41259a);
    }

    public Bitmap e() {
        return this.f41261d.f41279i;
    }

    public int f() {
        return this.f41262e.f();
    }

    public S1.g g() {
        return this.f41261d.f41274d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f41261d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f41261d.f41279i.getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f41261d.f41279i.getWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public void h() {
        this.f41266i = true;
        a aVar = this.f41261d;
        aVar.f41278h.a(aVar.f41279i);
        this.f41263f.a();
        this.f41263f.h();
    }

    public final void i() {
        this.f41263f.a();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f41264g;
    }

    public final void j() {
        this.f41268k = 0;
    }

    public final void k() {
        if (this.f41262e.f() != 1) {
            if (this.f41264g) {
                return;
            }
            this.f41264g = true;
            this.f41263f.g();
        }
        invalidateSelf();
    }

    public final void l() {
        this.f41264g = false;
        this.f41263f.h();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f41270m = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
        this.f41259a.setAlpha(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f41259a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z9, boolean z10) {
        this.f41267j = z9;
        if (!z9) {
            l();
        } else if (this.f41265h) {
            k();
        }
        return super.setVisible(z9, z10);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f41265h = true;
        j();
        if (this.f41267j) {
            k();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f41265h = false;
        l();
    }
}
