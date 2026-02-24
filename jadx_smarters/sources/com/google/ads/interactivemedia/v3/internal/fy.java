package com.google.ads.interactivemedia.v3.internal;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* JADX INFO: loaded from: classes3.dex */
final class fy implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, yi, jj, em, ei, hp, ew {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f22932b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ gc f22933a;

    public /* synthetic */ fy(gc gcVar) {
        this.f22933a = gcVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ew
    public final void a() {
        this.f22933a.as();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jj
    public final void b(Exception exc) {
        this.f22933a.f22979p.x(exc);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jj
    public final void c(String str, long j9, long j10) {
        this.f22933a.f22979p.y(str, j9, j10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jj
    public final void d(String str) {
        this.f22933a.f22979p.z(str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jj
    public final void e(ep epVar) {
        this.f22933a.f22979p.A(epVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jj
    public final void f(ep epVar) {
        this.f22933a.f22979p.B(epVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jj
    public final void g(C1333s c1333s, eq eqVar) {
        this.f22933a.f22979p.C(c1333s, eqVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jj
    public final void h(long j9) {
        this.f22933a.f22979p.D(j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jj
    public final void i(Exception exc) {
        this.f22933a.f22979p.E(exc);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jj
    public final void j(int i9, long j9, long j10) {
        this.f22933a.f22979p.F(i9, j9, j10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yi
    public final void k(int i9, long j9) {
        this.f22933a.f22979p.G(i9, j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yi
    public final void l(Object obj, long j9) {
        this.f22933a.f22979p.H(obj, j9);
        gc gcVar = this.f22933a;
        if (gcVar.f22948I == obj) {
            gcVar.f22974k.g(26, fs.f22921c);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.jj
    public final void m(final boolean z9) {
        gc gcVar = this.f22933a;
        if (gcVar.f22958S == z9) {
            return;
        }
        gcVar.f22958S = z9;
        this.f22933a.f22974k.g(23, new bx() { // from class: com.google.ads.interactivemedia.v3.internal.fx
            @Override // com.google.ads.interactivemedia.v3.internal.bx
            public final void a(Object obj) {
                ((ax) obj).q(z9);
            }
        });
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yi
    public final void n(Exception exc) {
        this.f22933a.f22979p.I(exc);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yi
    public final void o(String str, long j9, long j10) {
        this.f22933a.f22979p.J(str, j9, j10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
        gc.I(this.f22933a, surfaceTexture);
        this.f22933a.am(i9, i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f22933a.ap(null);
        this.f22933a.am(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i9, int i10) {
        this.f22933a.am(i9, i10);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yi
    public final void p(String str) {
        this.f22933a.f22979p.K(str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yi
    public final void q(ep epVar) {
        this.f22933a.f22979p.L(epVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yi
    public final void r(ep epVar) {
        this.f22933a.f22979p.M(epVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yi
    public final void s(long j9, int i9) {
        this.f22933a.f22979p.N(j9, i9);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i9, int i10, int i11) {
        this.f22933a.am(i10, i11);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        gc gcVar = this.f22933a;
        if (gcVar.f22951L) {
            gcVar.ap(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        gc gcVar = this.f22933a;
        if (gcVar.f22951L) {
            gcVar.ap(null);
        }
        this.f22933a.am(0, 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yi
    public final void t(C1333s c1333s, eq eqVar) {
        this.f22933a.f22979p.O(c1333s, eqVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.yi
    public final void u(bl blVar) {
        this.f22933a.f22974k.g(25, new fw(blVar, 2));
    }
}
