package com.journeyapps.barcodescanner;

import B6.k;
import B6.o;
import Y6.r;
import Y6.v;
import Y6.x;
import Z6.g;
import Z6.i;
import Z6.j;
import Z6.l;
import Z6.m;
import Z6.n;
import Z6.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final String f27987B = "a";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final f f27988A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f27989a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WindowManager f27990c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f27991d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f27992e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public SurfaceView f27993f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextureView f27994g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f27995h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r f27996i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f27997j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f27998k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public m f27999l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i f28000m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public v f28001n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public v f28002o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Rect f28003p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public v f28004q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Rect f28005r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Rect f28006s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public v f28007t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public double f28008u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public q f28009v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f28010w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final SurfaceHolder.Callback f28011x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Handler.Callback f28012y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Y6.q f28013z;

    /* JADX INFO: renamed from: com.journeyapps.barcodescanner.a$a, reason: collision with other inner class name */
    public class TextureViewSurfaceTextureListenerC0269a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC0269a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
            onSurfaceTextureSizeChanged(surfaceTexture, i9, i10);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i9, int i10) {
            a.this.f28004q = new v(i9, i10);
            a.this.C();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public class b implements SurfaceHolder.Callback {
        public b() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i9, int i10, int i11) {
            if (surfaceHolder == null) {
                Log.e(a.f27987B, "*** WARNING *** surfaceChanged() gave us a null surface!");
                return;
            }
            a.this.f28004q = new v(i10, i11);
            a.this.C();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            a.this.f28004q = null;
        }
    }

    public class c implements Handler.Callback {
        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i9 = message.what;
            if (i9 == k.f716j) {
                a.this.w((v) message.obj);
                return true;
            }
            if (i9 != k.f710d) {
                if (i9 != k.f709c) {
                    return false;
                }
                a.this.f27988A.b();
                return false;
            }
            Exception exc = (Exception) message.obj;
            if (!a.this.r()) {
                return false;
            }
            a.this.u();
            a.this.f27988A.c(exc);
            return false;
        }
    }

    public class d implements Y6.q {
        public d() {
        }

        @Override // Y6.q
        public void a(int i9) {
            a.this.f27991d.postDelayed(new Runnable() { // from class: Y6.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10687a.c();
                }
            }, 250L);
        }

        public final /* synthetic */ void c() {
            a.this.z();
        }
    }

    public class e implements f {
        public e() {
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void a() {
            Iterator it = a.this.f27998k.iterator();
            while (it.hasNext()) {
                ((f) it.next()).a();
            }
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void b() {
            Iterator it = a.this.f27998k.iterator();
            while (it.hasNext()) {
                ((f) it.next()).b();
            }
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void c(Exception exc) {
            Iterator it = a.this.f27998k.iterator();
            while (it.hasNext()) {
                ((f) it.next()).c(exc);
            }
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void d() {
            Iterator it = a.this.f27998k.iterator();
            while (it.hasNext()) {
                ((f) it.next()).d();
            }
        }

        @Override // com.journeyapps.barcodescanner.a.f
        public void e() {
            Iterator it = a.this.f27998k.iterator();
            while (it.hasNext()) {
                ((f) it.next()).e();
            }
        }
    }

    public interface f {
        void a();

        void b();

        void c(Exception exc);

        void d();

        void e();
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27992e = false;
        this.f27995h = false;
        this.f27997j = -1;
        this.f27998k = new ArrayList();
        this.f28000m = new i();
        this.f28005r = null;
        this.f28006s = null;
        this.f28007t = null;
        this.f28008u = 0.1d;
        this.f28009v = null;
        this.f28010w = false;
        this.f28011x = new b();
        this.f28012y = new c();
        this.f28013z = new d();
        this.f27988A = new e();
        p(context, attributeSet, 0, 0);
    }

    private int getDisplayRotation() {
        return this.f27990c.getDefaultDisplay().getRotation();
    }

    public final void A() {
        View view;
        if (this.f27992e) {
            TextureView textureView = new TextureView(getContext());
            this.f27994g = textureView;
            textureView.setSurfaceTextureListener(D());
            view = this.f27994g;
        } else {
            SurfaceView surfaceView = new SurfaceView(getContext());
            this.f27993f = surfaceView;
            surfaceView.getHolder().addCallback(this.f28011x);
            view = this.f27993f;
        }
        addView(view);
    }

    public final void B(j jVar) {
        if (this.f27995h || this.f27989a == null) {
            return;
        }
        Log.i(f27987B, "Starting preview");
        this.f27989a.z(jVar);
        this.f27989a.B();
        this.f27995h = true;
        x();
        this.f27988A.e();
    }

    public final void C() {
        Rect rect;
        j jVar;
        v vVar = this.f28004q;
        if (vVar == null || this.f28002o == null || (rect = this.f28003p) == null) {
            return;
        }
        if (this.f27993f == null || !vVar.equals(new v(rect.width(), this.f28003p.height()))) {
            TextureView textureView = this.f27994g;
            if (textureView == null || textureView.getSurfaceTexture() == null) {
                return;
            }
            if (this.f28002o != null) {
                this.f27994g.setTransform(l(new v(this.f27994g.getWidth(), this.f27994g.getHeight()), this.f28002o));
            }
            jVar = new j(this.f27994g.getSurfaceTexture());
        } else {
            jVar = new j(this.f27993f.getHolder());
        }
        B(jVar);
    }

    public final TextureView.SurfaceTextureListener D() {
        return new TextureViewSurfaceTextureListenerC0269a();
    }

    public g getCameraInstance() {
        return this.f27989a;
    }

    public i getCameraSettings() {
        return this.f28000m;
    }

    public Rect getFramingRect() {
        return this.f28005r;
    }

    public v getFramingRectSize() {
        return this.f28007t;
    }

    public double getMarginFraction() {
        return this.f28008u;
    }

    public Rect getPreviewFramingRect() {
        return this.f28006s;
    }

    public q getPreviewScalingStrategy() {
        q qVar = this.f28009v;
        return qVar != null ? qVar : this.f27994g != null ? new l() : new n();
    }

    public v getPreviewSize() {
        return this.f28002o;
    }

    public void i(f fVar) {
        this.f27998k.add(fVar);
    }

    public final void j() {
        v vVar;
        m mVar;
        v vVar2 = this.f28001n;
        if (vVar2 == null || (vVar = this.f28002o) == null || (mVar = this.f27999l) == null) {
            this.f28006s = null;
            this.f28005r = null;
            this.f28003p = null;
            throw new IllegalStateException("containerSize or previewSize is not set yet");
        }
        int i9 = vVar.f10736a;
        int i10 = vVar.f10737c;
        int i11 = vVar2.f10736a;
        int i12 = vVar2.f10737c;
        Rect rectD = mVar.d(vVar);
        if (rectD.width() <= 0 || rectD.height() <= 0) {
            return;
        }
        this.f28003p = rectD;
        this.f28005r = k(new Rect(0, 0, i11, i12), this.f28003p);
        Rect rect = new Rect(this.f28005r);
        Rect rect2 = this.f28003p;
        rect.offset(-rect2.left, -rect2.top);
        Rect rect3 = new Rect((rect.left * i9) / this.f28003p.width(), (rect.top * i10) / this.f28003p.height(), (rect.right * i9) / this.f28003p.width(), (rect.bottom * i10) / this.f28003p.height());
        this.f28006s = rect3;
        if (rect3.width() > 0 && this.f28006s.height() > 0) {
            this.f27988A.a();
            return;
        }
        this.f28006s = null;
        this.f28005r = null;
        Log.w(f27987B, "Preview frame is too small");
    }

    public Rect k(Rect rect, Rect rect2) {
        Rect rect3 = new Rect(rect);
        rect3.intersect(rect2);
        if (this.f28007t != null) {
            rect3.inset(Math.max(0, (rect3.width() - this.f28007t.f10736a) / 2), Math.max(0, (rect3.height() - this.f28007t.f10737c) / 2));
            return rect3;
        }
        int iMin = (int) Math.min(((double) rect3.width()) * this.f28008u, ((double) rect3.height()) * this.f28008u);
        rect3.inset(iMin, iMin);
        if (rect3.height() > rect3.width()) {
            rect3.inset(0, (rect3.height() - rect3.width()) / 2);
        }
        return rect3;
    }

    public Matrix l(v vVar, v vVar2) {
        float f9;
        float f10 = vVar.f10736a / vVar.f10737c;
        float f11 = vVar2.f10736a / vVar2.f10737c;
        float f12 = 1.0f;
        if (f10 < f11) {
            f12 = f11 / f10;
            f9 = 1.0f;
        } else {
            f9 = f10 / f11;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(f12, f9);
        int i9 = vVar.f10736a;
        int i10 = vVar.f10737c;
        matrix.postTranslate((i9 - (i9 * f12)) / 2.0f, (i10 - (i10 * f9)) / 2.0f);
        return matrix;
    }

    public final void m(v vVar) {
        this.f28001n = vVar;
        g gVar = this.f27989a;
        if (gVar == null || gVar.n() != null) {
            return;
        }
        m mVar = new m(getDisplayRotation(), vVar);
        this.f27999l = mVar;
        mVar.e(getPreviewScalingStrategy());
        this.f27989a.x(this.f27999l);
        this.f27989a.m();
        boolean z9 = this.f28010w;
        if (z9) {
            this.f27989a.A(z9);
        }
    }

    public g n() {
        g gVar = new g(getContext());
        gVar.w(this.f28000m);
        return gVar;
    }

    public final void o() {
        if (this.f27989a != null) {
            Log.w(f27987B, "initCamera called twice");
            return;
        }
        g gVarN = n();
        this.f27989a = gVarN;
        gVarN.y(this.f27991d);
        this.f27989a.u();
        this.f27997j = getDisplayRotation();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        A();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        m(new v(i11 - i9, i12 - i10));
        View view = this.f27993f;
        if (view != null) {
            Rect rect = this.f28003p;
            if (rect != null) {
                view.layout(rect.left, rect.top, rect.right, rect.bottom);
                return;
            }
        } else {
            view = this.f27994g;
            if (view == null) {
                return;
            }
        }
        view.layout(0, 0, getWidth(), getHeight());
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("super"));
        setTorch(bundle.getBoolean("torch"));
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", parcelableOnSaveInstanceState);
        bundle.putBoolean("torch", this.f28010w);
        return bundle;
    }

    public final void p(Context context, AttributeSet attributeSet, int i9, int i10) {
        if (getBackground() == null) {
            setBackgroundColor(DefaultRenderer.BACKGROUND_COLOR);
        }
        q(attributeSet);
        this.f27990c = (WindowManager) context.getSystemService("window");
        this.f27991d = new Handler(this.f28012y);
        this.f27996i = new r();
    }

    public void q(AttributeSet attributeSet) {
        q oVar;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, o.f725a);
        int dimension = (int) typedArrayObtainStyledAttributes.getDimension(o.f727c, -1.0f);
        int dimension2 = (int) typedArrayObtainStyledAttributes.getDimension(o.f726b, -1.0f);
        if (dimension > 0 && dimension2 > 0) {
            this.f28007t = new v(dimension, dimension2);
        }
        this.f27992e = typedArrayObtainStyledAttributes.getBoolean(o.f729e, true);
        int integer = typedArrayObtainStyledAttributes.getInteger(o.f728d, -1);
        if (integer == 1) {
            oVar = new l();
        } else {
            if (integer != 2) {
                if (integer == 3) {
                    oVar = new Z6.o();
                }
                typedArrayObtainStyledAttributes.recycle();
            }
            oVar = new n();
        }
        this.f28009v = oVar;
        typedArrayObtainStyledAttributes.recycle();
    }

    public boolean r() {
        return this.f27989a != null;
    }

    public boolean s() {
        g gVar = this.f27989a;
        return gVar == null || gVar.p();
    }

    public void setCameraSettings(i iVar) {
        this.f28000m = iVar;
    }

    public void setFramingRectSize(v vVar) {
        this.f28007t = vVar;
    }

    public void setMarginFraction(double d9) {
        if (d9 >= 0.5d) {
            throw new IllegalArgumentException("The margin fraction must be less than 0.5");
        }
        this.f28008u = d9;
    }

    public void setPreviewScalingStrategy(q qVar) {
        this.f28009v = qVar;
    }

    public void setTorch(boolean z9) {
        this.f28010w = z9;
        g gVar = this.f27989a;
        if (gVar != null) {
            gVar.A(z9);
        }
    }

    public void setUseTextureView(boolean z9) {
        this.f27992e = z9;
    }

    public boolean t() {
        return this.f27995h;
    }

    public void u() {
        TextureView textureView;
        SurfaceView surfaceView;
        x.a();
        Log.d(f27987B, "pause()");
        this.f27997j = -1;
        g gVar = this.f27989a;
        if (gVar != null) {
            gVar.l();
            this.f27989a = null;
            this.f27995h = false;
        } else {
            this.f27991d.sendEmptyMessage(k.f709c);
        }
        if (this.f28004q == null && (surfaceView = this.f27993f) != null) {
            surfaceView.getHolder().removeCallback(this.f28011x);
        }
        if (this.f28004q == null && (textureView = this.f27994g) != null) {
            textureView.setSurfaceTextureListener(null);
        }
        this.f28001n = null;
        this.f28002o = null;
        this.f28006s = null;
        this.f27996i.f();
        this.f27988A.d();
    }

    public void v() {
        g cameraInstance = getCameraInstance();
        u();
        long jNanoTime = System.nanoTime();
        while (cameraInstance != null && !cameraInstance.p() && System.nanoTime() - jNanoTime <= 2000000000) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public final void w(v vVar) {
        this.f28002o = vVar;
        if (this.f28001n != null) {
            j();
            requestLayout();
            C();
        }
    }

    public void x() {
    }

    public void y() {
        x.a();
        Log.d(f27987B, "resume()");
        o();
        if (this.f28004q != null) {
            C();
        } else {
            SurfaceView surfaceView = this.f27993f;
            if (surfaceView != null) {
                surfaceView.getHolder().addCallback(this.f28011x);
            } else {
                TextureView textureView = this.f27994g;
                if (textureView != null) {
                    if (textureView.isAvailable()) {
                        D().onSurfaceTextureAvailable(this.f27994g.getSurfaceTexture(), this.f27994g.getWidth(), this.f27994g.getHeight());
                    } else {
                        this.f27994g.setSurfaceTextureListener(D());
                    }
                }
            }
        }
        requestLayout();
        this.f27996i.e(getContext(), this.f28013z);
    }

    public final void z() {
        if (!r() || getDisplayRotation() == this.f27997j) {
            return;
        }
        u();
        y();
    }
}
