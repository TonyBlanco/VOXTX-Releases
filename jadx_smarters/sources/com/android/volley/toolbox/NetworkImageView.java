package com.android.volley.toolbox;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.volley.toolbox.a;
import h1.u;
import i1.l;

/* JADX INFO: loaded from: classes.dex */
public class NetworkImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18479a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Drawable f18481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Bitmap f18482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f18484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Bitmap f18485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.android.volley.toolbox.a f18486i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a.g f18487j;

    public class a implements a.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f18488a;

        /* JADX INFO: renamed from: com.android.volley.toolbox.NetworkImageView$a$a, reason: collision with other inner class name */
        public class RunnableC0236a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a.g f18490a;

            public RunnableC0236a(a.g gVar) {
                this.f18490a = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.b(this.f18490a, false);
            }
        }

        public a(boolean z9) {
            this.f18488a = z9;
        }

        @Override // h1.p.a
        public void a(u uVar) {
            if (NetworkImageView.this.f18483f != 0) {
                NetworkImageView networkImageView = NetworkImageView.this;
                networkImageView.setImageResource(networkImageView.f18483f);
            } else if (NetworkImageView.this.f18484g != null) {
                NetworkImageView networkImageView2 = NetworkImageView.this;
                networkImageView2.setImageDrawable(networkImageView2.f18484g);
            } else if (NetworkImageView.this.f18485h != null) {
                NetworkImageView networkImageView3 = NetworkImageView.this;
                networkImageView3.setImageBitmap(networkImageView3.f18485h);
            }
        }

        @Override // com.android.volley.toolbox.a.h
        public void b(a.g gVar, boolean z9) {
            if (z9 && this.f18488a) {
                NetworkImageView.this.post(new RunnableC0236a(gVar));
                return;
            }
            if (gVar.d() != null) {
                NetworkImageView.this.setImageBitmap(gVar.d());
                return;
            }
            if (NetworkImageView.this.f18480c != 0) {
                NetworkImageView networkImageView = NetworkImageView.this;
                networkImageView.setImageResource(networkImageView.f18480c);
            } else if (NetworkImageView.this.f18481d != null) {
                NetworkImageView networkImageView2 = NetworkImageView.this;
                networkImageView2.setImageDrawable(networkImageView2.f18481d);
            } else if (NetworkImageView.this.f18482e != null) {
                NetworkImageView networkImageView3 = NetworkImageView.this;
                networkImageView3.setImageBitmap(networkImageView3.f18482e);
            }
        }
    }

    public NetworkImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NetworkImageView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(boolean r9) {
        /*
            r8 = this;
            int r0 = r8.getWidth()
            int r1 = r8.getHeight()
            android.widget.ImageView$ScaleType r7 = r8.getScaleType()
            android.view.ViewGroup$LayoutParams r2 = r8.getLayoutParams()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2a
            android.view.ViewGroup$LayoutParams r2 = r8.getLayoutParams()
            int r2 = r2.width
            r5 = -2
            if (r2 != r5) goto L1f
            r2 = 1
            goto L20
        L1f:
            r2 = 0
        L20:
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()
            int r6 = r6.height
            if (r6 != r5) goto L2b
            r5 = 1
            goto L2c
        L2a:
            r2 = 0
        L2b:
            r5 = 0
        L2c:
            if (r2 == 0) goto L31
            if (r5 == 0) goto L31
            goto L32
        L31:
            r3 = 0
        L32:
            if (r0 != 0) goto L39
            if (r1 != 0) goto L39
            if (r3 != 0) goto L39
            return
        L39:
            java.lang.String r3 = r8.f18479a
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L4f
            com.android.volley.toolbox.a$g r9 = r8.f18487j
            if (r9 == 0) goto L4b
            r9.c()
            r9 = 0
            r8.f18487j = r9
        L4b:
            r8.h()
            return
        L4f:
            com.android.volley.toolbox.a$g r3 = r8.f18487j
            if (r3 == 0) goto L70
            java.lang.String r3 = r3.e()
            if (r3 == 0) goto L70
            com.android.volley.toolbox.a$g r3 = r8.f18487j
            java.lang.String r3 = r3.e()
            java.lang.String r6 = r8.f18479a
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L68
            return
        L68:
            com.android.volley.toolbox.a$g r3 = r8.f18487j
            r3.c()
            r8.h()
        L70:
            if (r2 == 0) goto L73
            r0 = 0
        L73:
            if (r5 == 0) goto L77
            r6 = 0
            goto L78
        L77:
            r6 = r1
        L78:
            com.android.volley.toolbox.a r2 = r8.f18486i
            java.lang.String r3 = r8.f18479a
            com.android.volley.toolbox.NetworkImageView$a r4 = new com.android.volley.toolbox.NetworkImageView$a
            r4.<init>(r9)
            r5 = r0
            com.android.volley.toolbox.a$g r9 = r2.g(r3, r4, r5, r6, r7)
            r8.f18487j = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.NetworkImageView.g(boolean):void");
    }

    public final void h() {
        int i9 = this.f18480c;
        if (i9 != 0) {
            setImageResource(i9);
            return;
        }
        Drawable drawable = this.f18481d;
        if (drawable != null) {
            setImageDrawable(drawable);
            return;
        }
        Bitmap bitmap = this.f18482e;
        if (bitmap == null) {
            bitmap = null;
        }
        setImageBitmap(bitmap);
    }

    public void i(String str, com.android.volley.toolbox.a aVar) {
        l.a();
        this.f18479a = str;
        this.f18486i = aVar;
        g(false);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        a.g gVar = this.f18487j;
        if (gVar != null) {
            gVar.c();
            setImageBitmap(null);
            this.f18487j = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onLayout(boolean z9, int i9, int i10, int i11, int i12) {
        super.onLayout(z9, i9, i10, i11, i12);
        g(true);
    }

    public void setDefaultImageBitmap(Bitmap bitmap) {
        this.f18480c = 0;
        this.f18481d = null;
        this.f18482e = bitmap;
    }

    public void setDefaultImageDrawable(Drawable drawable) {
        this.f18480c = 0;
        this.f18482e = null;
        this.f18481d = drawable;
    }

    public void setDefaultImageResId(int i9) {
        this.f18482e = null;
        this.f18481d = null;
        this.f18480c = i9;
    }

    public void setErrorImageBitmap(Bitmap bitmap) {
        this.f18483f = 0;
        this.f18484g = null;
        this.f18485h = bitmap;
    }

    public void setErrorImageDrawable(Drawable drawable) {
        this.f18483f = 0;
        this.f18485h = null;
        this.f18484g = drawable;
    }

    public void setErrorImageResId(int i9) {
        this.f18485h = null;
        this.f18484g = null;
        this.f18483f = i9;
    }
}
