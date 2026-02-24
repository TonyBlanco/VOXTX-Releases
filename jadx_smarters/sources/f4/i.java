package f4;

import O2.C0936z0;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.AbstractC1704v;
import d4.Y;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements e4.m, InterfaceC1773a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f40659j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public SurfaceTexture f40660k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f40663n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f40651a = new AtomicBoolean();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f40652c = new AtomicBoolean(true);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f40653d = new g();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C1775c f40654e = new C1775c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Y f40655f = new Y();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Y f40656g = new Y();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f40657h = new float[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f40658i = new float[16];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile int f40661l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f40662m = -1;

    @Override // e4.m
    public void a(long j9, long j10, C0936z0 c0936z0, MediaFormat mediaFormat) {
        this.f40655f.a(j10, Long.valueOf(j9));
        i(c0936z0.f6477w, c0936z0.f6478x, j10);
    }

    @Override // f4.InterfaceC1773a
    public void b(long j9, float[] fArr) {
        this.f40654e.e(j9, fArr);
    }

    @Override // f4.InterfaceC1773a
    public void c() {
        this.f40655f.c();
        this.f40654e.d();
        this.f40652c.set(true);
    }

    public void e(float[] fArr, boolean z9) {
        GLES20.glClear(Http2.INITIAL_MAX_FRAME_SIZE);
        try {
            AbstractC1704v.b();
        } catch (AbstractC1704v.a e9) {
            AbstractC1681B.e("SceneRenderer", "Failed to draw a frame", e9);
        }
        if (this.f40651a.compareAndSet(true, false)) {
            ((SurfaceTexture) AbstractC1684a.e(this.f40660k)).updateTexImage();
            try {
                AbstractC1704v.b();
            } catch (AbstractC1704v.a e10) {
                AbstractC1681B.e("SceneRenderer", "Failed to draw a frame", e10);
            }
            if (this.f40652c.compareAndSet(true, false)) {
                AbstractC1704v.j(this.f40657h);
            }
            long timestamp = this.f40660k.getTimestamp();
            Long l9 = (Long) this.f40655f.g(timestamp);
            if (l9 != null) {
                this.f40654e.c(this.f40657h, l9.longValue());
            }
            e eVar = (e) this.f40656g.j(timestamp);
            if (eVar != null) {
                this.f40653d.d(eVar);
            }
        }
        Matrix.multiplyMM(this.f40658i, 0, fArr, 0, this.f40657h, 0);
        this.f40653d.a(this.f40659j, this.f40658i, z9);
    }

    public SurfaceTexture f() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            AbstractC1704v.b();
            this.f40653d.b();
            AbstractC1704v.b();
            this.f40659j = AbstractC1704v.f();
        } catch (AbstractC1704v.a e9) {
            AbstractC1681B.e("SceneRenderer", "Failed to initialize the renderer", e9);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f40659j);
        this.f40660k = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: f4.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f40650a.g(surfaceTexture2);
            }
        });
        return this.f40660k;
    }

    public final /* synthetic */ void g(SurfaceTexture surfaceTexture) {
        this.f40651a.set(true);
    }

    public void h(int i9) {
        this.f40661l = i9;
    }

    public final void i(byte[] bArr, int i9, long j9) {
        byte[] bArr2 = this.f40663n;
        int i10 = this.f40662m;
        this.f40663n = bArr;
        if (i9 == -1) {
            i9 = this.f40661l;
        }
        this.f40662m = i9;
        if (i10 == i9 && Arrays.equals(bArr2, this.f40663n)) {
            return;
        }
        byte[] bArr3 = this.f40663n;
        e eVarA = bArr3 != null ? f.a(bArr3, this.f40662m) : null;
        if (eVarA == null || !g.c(eVarA)) {
            eVarA = e.b(this.f40662m);
        }
        this.f40656g.a(j9, eVarA);
    }
}
