package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class OverlayListView extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16025a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BitmapDrawable f16026a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Rect f16028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Interpolator f16029d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f16030e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Rect f16031f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f16032g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f16035j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f16036k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f16037l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public InterfaceC0183a f16038m;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f16027b = 1.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f16033h = 1.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f16034i = 1.0f;

        /* JADX INFO: renamed from: androidx.mediarouter.app.OverlayListView$a$a, reason: collision with other inner class name */
        public interface InterfaceC0183a {
            void a();
        }

        public a(BitmapDrawable bitmapDrawable, Rect rect) {
            this.f16026a = bitmapDrawable;
            this.f16031f = rect;
            this.f16028c = new Rect(rect);
            BitmapDrawable bitmapDrawable2 = this.f16026a;
            if (bitmapDrawable2 != null) {
                bitmapDrawable2.setAlpha((int) (this.f16027b * 255.0f));
                this.f16026a.setBounds(this.f16028c);
            }
        }

        public BitmapDrawable a() {
            return this.f16026a;
        }

        public boolean b() {
            return this.f16036k;
        }

        public a c(float f9, float f10) {
            this.f16033h = f9;
            this.f16034i = f10;
            return this;
        }

        public a d(InterfaceC0183a interfaceC0183a) {
            this.f16038m = interfaceC0183a;
            return this;
        }

        public a e(long j9) {
            this.f16030e = j9;
            return this;
        }

        public a f(Interpolator interpolator) {
            this.f16029d = interpolator;
            return this;
        }

        public a g(int i9) {
            this.f16032g = i9;
            return this;
        }

        public void h(long j9) {
            this.f16035j = j9;
            this.f16036k = true;
        }

        public void i() {
            this.f16036k = true;
            this.f16037l = true;
            InterfaceC0183a interfaceC0183a = this.f16038m;
            if (interfaceC0183a != null) {
                interfaceC0183a.a();
            }
        }

        public boolean j(long j9) {
            if (this.f16037l) {
                return false;
            }
            float fMax = this.f16036k ? Math.max(0.0f, Math.min(1.0f, (j9 - this.f16035j) / this.f16030e)) : 0.0f;
            Interpolator interpolator = this.f16029d;
            float interpolation = interpolator == null ? fMax : interpolator.getInterpolation(fMax);
            int i9 = (int) (this.f16032g * interpolation);
            Rect rect = this.f16028c;
            Rect rect2 = this.f16031f;
            rect.top = rect2.top + i9;
            rect.bottom = rect2.bottom + i9;
            float f9 = this.f16033h;
            float f10 = f9 + ((this.f16034i - f9) * interpolation);
            this.f16027b = f10;
            BitmapDrawable bitmapDrawable = this.f16026a;
            if (bitmapDrawable != null && rect != null) {
                bitmapDrawable.setAlpha((int) (f10 * 255.0f));
                this.f16026a.setBounds(this.f16028c);
            }
            if (this.f16036k && fMax >= 1.0f) {
                this.f16037l = true;
                InterfaceC0183a interfaceC0183a = this.f16038m;
                if (interfaceC0183a != null) {
                    interfaceC0183a.a();
                }
            }
            return !this.f16037l;
        }
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f16025a = new ArrayList();
    }

    public void a(a aVar) {
        this.f16025a.add(aVar);
    }

    public void b() {
        for (a aVar : this.f16025a) {
            if (!aVar.b()) {
                aVar.h(getDrawingTime());
            }
        }
    }

    public void c() {
        Iterator it = this.f16025a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).i();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f16025a.size() > 0) {
            Iterator it = this.f16025a.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                BitmapDrawable bitmapDrawableA = aVar.a();
                if (bitmapDrawableA != null) {
                    bitmapDrawableA.draw(canvas);
                }
                if (!aVar.j(getDrawingTime())) {
                    it.remove();
                }
            }
        }
    }
}
