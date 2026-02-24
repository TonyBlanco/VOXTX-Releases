package O2;

import B3.C;
import O2.InterfaceC0920t1;
import O2.InterfaceC0933y;
import P2.InterfaceC0986c;
import Q2.C1019e;
import android.content.Context;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import d4.C1691h;
import e4.C1737C;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class I1 extends AbstractC0889j implements InterfaceC0933y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0890j0 f5674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1691h f5675c;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC0933y.b f5676a;

        public a(Context context, G1 g12) {
            this.f5676a = new InterfaceC0933y.b(context, g12);
        }

        public I1 a() {
            return this.f5676a.k();
        }

        public a b(C.a aVar) {
            this.f5676a.u(aVar);
            return this;
        }

        public a c(Z3.C c9) {
            this.f5676a.w(c9);
            return this;
        }
    }

    public I1(InterfaceC0933y.b bVar) {
        C1691h c1691h = new C1691h();
        this.f5675c = c1691h;
        try {
            this.f5674b = new C0890j0(bVar, this);
            c1691h.f();
        } catch (Throwable th) {
            this.f5675c.f();
            throw th;
        }
    }

    @Override // O2.InterfaceC0920t1
    public void A(TextureView textureView) {
        y0();
        this.f5674b.A(textureView);
    }

    @Override // O2.InterfaceC0920t1
    public void B(InterfaceC0920t1.d dVar) {
        y0();
        this.f5674b.B(dVar);
    }

    @Override // O2.InterfaceC0920t1
    public InterfaceC0920t1.b D() {
        y0();
        return this.f5674b.D();
    }

    @Override // O2.InterfaceC0920t1
    public boolean E() {
        y0();
        return this.f5674b.E();
    }

    @Override // O2.InterfaceC0920t1
    public void F(boolean z9) {
        y0();
        this.f5674b.F(z9);
    }

    @Override // O2.InterfaceC0920t1
    public long H() {
        y0();
        return this.f5674b.H();
    }

    @Override // O2.InterfaceC0920t1
    public int J() {
        y0();
        return this.f5674b.J();
    }

    @Override // O2.InterfaceC0920t1
    public void K(TextureView textureView) {
        y0();
        this.f5674b.K(textureView);
    }

    @Override // O2.InterfaceC0920t1
    public C1737C L() {
        y0();
        return this.f5674b.L();
    }

    @Override // O2.InterfaceC0920t1
    public int N() {
        y0();
        return this.f5674b.N();
    }

    @Override // O2.InterfaceC0933y
    public void O(C1019e c1019e, boolean z9) {
        y0();
        this.f5674b.O(c1019e, z9);
    }

    @Override // O2.InterfaceC0920t1
    public long P() {
        y0();
        return this.f5674b.P();
    }

    @Override // O2.InterfaceC0933y
    public U2.e Q() {
        y0();
        return this.f5674b.Q();
    }

    @Override // O2.InterfaceC0920t1
    public long R() {
        y0();
        return this.f5674b.R();
    }

    @Override // O2.InterfaceC0933y
    public C0936z0 S() {
        y0();
        return this.f5674b.S();
    }

    @Override // O2.InterfaceC0920t1
    public void T(int i9, List list) {
        y0();
        this.f5674b.T(i9, list);
    }

    @Override // O2.InterfaceC0920t1
    public long U() {
        y0();
        return this.f5674b.U();
    }

    @Override // O2.InterfaceC0933y
    public void W(InterfaceC0986c interfaceC0986c) {
        y0();
        this.f5674b.W(interfaceC0986c);
    }

    @Override // O2.InterfaceC0920t1
    public int X() {
        y0();
        return this.f5674b.X();
    }

    @Override // O2.InterfaceC0920t1
    public void Y(SurfaceView surfaceView) {
        y0();
        this.f5674b.Y(surfaceView);
    }

    @Override // O2.InterfaceC0920t1
    public boolean Z() {
        y0();
        return this.f5674b.Z();
    }

    @Override // O2.InterfaceC0933y
    public C0936z0 a() {
        y0();
        return this.f5674b.a();
    }

    @Override // O2.InterfaceC0920t1
    public long a0() {
        y0();
        return this.f5674b.a0();
    }

    @Override // O2.InterfaceC0920t1
    public void b(C0917s1 c0917s1) {
        y0();
        this.f5674b.b(c0917s1);
    }

    @Override // O2.InterfaceC0920t1
    public C0917s1 c() {
        y0();
        return this.f5674b.c();
    }

    @Override // O2.InterfaceC0933y
    public U2.e c0() {
        y0();
        return this.f5674b.c0();
    }

    @Override // O2.InterfaceC0920t1
    public boolean d() {
        y0();
        return this.f5674b.d();
    }

    @Override // O2.InterfaceC0920t1
    public long e() {
        y0();
        return this.f5674b.e();
    }

    @Override // O2.InterfaceC0920t1
    public R0 e0() {
        y0();
        return this.f5674b.e0();
    }

    @Override // O2.InterfaceC0920t1
    public long f0() {
        y0();
        return this.f5674b.f0();
    }

    @Override // O2.InterfaceC0920t1
    public long getCurrentPosition() {
        y0();
        return this.f5674b.getCurrentPosition();
    }

    @Override // O2.InterfaceC0920t1
    public long getDuration() {
        y0();
        return this.f5674b.getDuration();
    }

    @Override // O2.InterfaceC0920t1
    public int getPlaybackState() {
        y0();
        return this.f5674b.getPlaybackState();
    }

    @Override // O2.InterfaceC0920t1
    public int getRepeatMode() {
        y0();
        return this.f5674b.getRepeatMode();
    }

    @Override // O2.InterfaceC0920t1
    public float getVolume() {
        y0();
        return this.f5674b.getVolume();
    }

    @Override // O2.InterfaceC0920t1
    public void h(List list, boolean z9) {
        y0();
        this.f5674b.h(list, z9);
    }

    @Override // O2.InterfaceC0920t1
    public void i(Z3.z zVar) {
        y0();
        this.f5674b.i(zVar);
    }

    @Override // O2.InterfaceC0920t1
    public void j(SurfaceView surfaceView) {
        y0();
        this.f5674b.j(surfaceView);
    }

    @Override // O2.InterfaceC0920t1
    public void l(InterfaceC0920t1.d dVar) {
        y0();
        this.f5674b.l(dVar);
    }

    @Override // O2.InterfaceC0920t1
    public void o(boolean z9) {
        y0();
        this.f5674b.o(z9);
    }

    @Override // O2.InterfaceC0920t1
    public V1 p() {
        y0();
        return this.f5674b.p();
    }

    @Override // O2.InterfaceC0920t1
    public void prepare() {
        y0();
        this.f5674b.prepare();
    }

    @Override // O2.AbstractC0889j
    public void q0(int i9, long j9, int i10, boolean z9) {
        y0();
        this.f5674b.q0(i9, j9, i10, z9);
    }

    @Override // O2.InterfaceC0920t1
    public P3.f r() {
        y0();
        return this.f5674b.r();
    }

    @Override // O2.InterfaceC0920t1
    public void release() {
        y0();
        this.f5674b.release();
    }

    @Override // O2.InterfaceC0920t1
    public int s() {
        y0();
        return this.f5674b.s();
    }

    @Override // O2.InterfaceC0920t1
    public void setRepeatMode(int i9) {
        y0();
        this.f5674b.setRepeatMode(i9);
    }

    @Override // O2.InterfaceC0920t1
    public int v() {
        y0();
        return this.f5674b.v();
    }

    @Override // O2.InterfaceC0920t1
    public Q1 w() {
        y0();
        return this.f5674b.w();
    }

    @Override // O2.InterfaceC0920t1
    public Looper x() {
        y0();
        return this.f5674b.x();
    }

    @Override // O2.InterfaceC0920t1
    public Z3.z y() {
        y0();
        return this.f5674b.y();
    }

    public final void y0() {
        this.f5675c.c();
    }

    @Override // O2.InterfaceC0920t1
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public C0927w n() {
        y0();
        return this.f5674b.n();
    }
}
