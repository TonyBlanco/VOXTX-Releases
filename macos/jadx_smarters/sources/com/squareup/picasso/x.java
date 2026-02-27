package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.t;
import com.squareup.picasso.w;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class x {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicInteger f39200m = new AtomicInteger();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f39201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w.b f39202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f39203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f39205e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f39208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f39209i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f39210j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f39211k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f39212l;

    public x(t tVar, Uri uri, int i9) {
        if (tVar.f39141o) {
            throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
        }
        this.f39201a = tVar;
        this.f39202b = new w.b(uri, i9, tVar.f39138l);
    }

    public x a() {
        this.f39202b.b();
        return this;
    }

    public x b() {
        this.f39202b.c();
        return this;
    }

    public final w c(long j9) {
        int andIncrement = f39200m.getAndIncrement();
        w wVarA = this.f39202b.a();
        wVarA.f39167a = andIncrement;
        wVarA.f39168b = j9;
        boolean z9 = this.f39201a.f39140n;
        if (z9) {
            G.v("Main", "created", wVarA.g(), wVarA.toString());
        }
        w wVarP = this.f39201a.p(wVarA);
        if (wVarP != wVarA) {
            wVarP.f39167a = andIncrement;
            wVarP.f39168b = j9;
            if (z9) {
                G.v("Main", "changed", wVarP.d(), "into " + wVarP);
            }
        }
        return wVarP;
    }

    public x d(int i9) {
        if (i9 == 0) {
            throw new IllegalArgumentException("Error image resource invalid.");
        }
        if (this.f39211k != null) {
            throw new IllegalStateException("Error image already set.");
        }
        this.f39207g = i9;
        return this;
    }

    public x e() {
        this.f39204d = true;
        return this;
    }

    public final Drawable f() {
        return this.f39206f != 0 ? this.f39201a.f39131e.getResources().getDrawable(this.f39206f) : this.f39210j;
    }

    public void g(ImageView imageView) {
        h(imageView, null);
    }

    public void h(ImageView imageView, InterfaceC1611e interfaceC1611e) {
        Bitmap bitmapM;
        long jNanoTime = System.nanoTime();
        G.c();
        if (imageView == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (!this.f39202b.d()) {
            this.f39201a.c(imageView);
            if (this.f39205e) {
                u.d(imageView, f());
                return;
            }
            return;
        }
        if (this.f39204d) {
            if (this.f39202b.e()) {
                throw new IllegalStateException("Fit cannot be used with resize.");
            }
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width == 0 || height == 0) {
                if (this.f39205e) {
                    u.d(imageView, f());
                }
                this.f39201a.f(imageView, new h(this, imageView, interfaceC1611e));
                return;
            }
            this.f39202b.f(width, height);
        }
        w wVarC = c(jNanoTime);
        String strH = G.h(wVarC);
        if (!p.shouldReadFromMemoryCache(this.f39208h) || (bitmapM = this.f39201a.m(strH)) == null) {
            if (this.f39205e) {
                u.d(imageView, f());
            }
            this.f39201a.h(new l(this.f39201a, imageView, wVarC, this.f39208h, this.f39209i, this.f39207g, this.f39211k, strH, this.f39212l, interfaceC1611e, this.f39203c));
            return;
        }
        this.f39201a.c(imageView);
        t tVar = this.f39201a;
        Context context = tVar.f39131e;
        t.e eVar = t.e.MEMORY;
        u.c(imageView, context, bitmapM, eVar, this.f39203c, tVar.f39139m);
        if (this.f39201a.f39140n) {
            G.v("Main", "completed", wVarC.g(), "from " + eVar);
        }
        if (interfaceC1611e != null) {
            interfaceC1611e.onSuccess();
        }
    }

    public void i(C c9) {
        Bitmap bitmapM;
        long jNanoTime = System.nanoTime();
        G.c();
        if (c9 == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (this.f39204d) {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        if (!this.f39202b.d()) {
            this.f39201a.d(c9);
            c9.c(this.f39205e ? f() : null);
            return;
        }
        w wVarC = c(jNanoTime);
        String strH = G.h(wVarC);
        if (!p.shouldReadFromMemoryCache(this.f39208h) || (bitmapM = this.f39201a.m(strH)) == null) {
            c9.c(this.f39205e ? f() : null);
            this.f39201a.h(new D(this.f39201a, c9, wVarC, this.f39208h, this.f39209i, this.f39211k, strH, this.f39212l, this.f39207g));
        } else {
            this.f39201a.d(c9);
            c9.b(bitmapM, t.e.MEMORY);
        }
    }

    public x j(int i9) {
        if (!this.f39205e) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        }
        if (i9 == 0) {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        }
        if (this.f39210j != null) {
            throw new IllegalStateException("Placeholder image already set.");
        }
        this.f39206f = i9;
        return this;
    }

    public x k(int i9, int i10) {
        this.f39202b.f(i9, i10);
        return this;
    }

    public x l() {
        this.f39204d = false;
        return this;
    }
}
