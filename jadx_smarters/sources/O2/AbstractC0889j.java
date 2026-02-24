package O2;

import O2.Q1;
import com.google.android.gms.common.api.a;
import java.util.List;
import s5.AbstractC2743y;

/* JADX INFO: renamed from: O2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0889j implements InterfaceC0920t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q1.d f6007a = new Q1.d();

    @Override // O2.InterfaceC0920t1
    public final void C(int i9, long j9) {
        q0(i9, j9, 10, false);
    }

    @Override // O2.InterfaceC0920t1
    public final H0 G(int i9) {
        return w().s(i9, this.f6007a).f5746d;
    }

    @Override // O2.InterfaceC0920t1
    public final long I() {
        Q1 q1W = w();
        if (q1W.v()) {
            return -9223372036854775807L;
        }
        return q1W.s(X(), this.f6007a).f();
    }

    @Override // O2.InterfaceC0920t1
    public final boolean M() {
        return n0() != -1;
    }

    @Override // O2.InterfaceC0920t1
    public final boolean V() {
        Q1 q1W = w();
        return !q1W.v() && q1W.s(X(), this.f6007a).f5751i;
    }

    @Override // O2.InterfaceC0920t1
    public final void b0() {
        u0(P(), 12);
    }

    @Override // O2.InterfaceC0920t1
    public final void d0() {
        u0(-f0(), 11);
    }

    @Override // O2.InterfaceC0920t1
    public final H0 f() {
        Q1 q1W = w();
        if (q1W.v()) {
            return null;
        }
        return q1W.s(X(), this.f6007a).f5746d;
    }

    @Override // O2.InterfaceC0920t1
    public final void g() {
        s0(X(), 4);
    }

    @Override // O2.InterfaceC0920t1
    public final boolean g0() {
        Q1 q1W = w();
        return !q1W.v() && q1W.s(X(), this.f6007a).i();
    }

    public final void h0(int i9, H0 h02) {
        T(i9, AbstractC2743y.A(h02));
    }

    public final void i0(H0 h02) {
        j0(AbstractC2743y.A(h02));
    }

    @Override // O2.InterfaceC0920t1
    public final boolean isPlaying() {
        return getPlaybackState() == 3 && E() && v() == 0;
    }

    public final void j0(List list) {
        T(a.e.API_PRIORITY_OTHER, list);
    }

    @Override // O2.InterfaceC0920t1
    public final int k() {
        return w().u();
    }

    public final int k0() {
        long jU = U();
        long duration = getDuration();
        if (jU == -9223372036854775807L || duration == -9223372036854775807L) {
            return 0;
        }
        if (duration == 0) {
            return 100;
        }
        return d4.k0.r((int) ((jU * 100) / duration), 0, 100);
    }

    public final int l0() {
        return X();
    }

    @Override // O2.InterfaceC0920t1
    public final void m() {
        if (w().v() || d()) {
            return;
        }
        boolean zM = M();
        if (!g0() || V()) {
            if (!zM || getCurrentPosition() > H()) {
                r0(0L, 7);
                return;
            }
        } else if (!zM) {
            return;
        }
        v0(7);
    }

    public final int m0() {
        Q1 q1W = w();
        if (q1W.v()) {
            return -1;
        }
        return q1W.j(X(), o0(), Z());
    }

    public final int n0() {
        Q1 q1W = w();
        if (q1W.v()) {
            return -1;
        }
        return q1W.q(X(), o0(), Z());
    }

    public final int o0() {
        int repeatMode = getRepeatMode();
        if (repeatMode == 1) {
            return 0;
        }
        return repeatMode;
    }

    public final void p0(int i9) {
        q0(X(), -9223372036854775807L, i9, true);
    }

    @Override // O2.InterfaceC0920t1
    public final void pause() {
        o(false);
    }

    @Override // O2.InterfaceC0920t1
    public final void play() {
        o(true);
    }

    @Override // O2.InterfaceC0920t1
    public final boolean q() {
        return m0() != -1;
    }

    public abstract void q0(int i9, long j9, int i10, boolean z9);

    public final void r0(long j9, int i9) {
        q0(X(), j9, i9, false);
    }

    public final void s0(int i9, int i10) {
        q0(i9, -9223372036854775807L, i10, false);
    }

    @Override // O2.InterfaceC0920t1
    public final void seekTo(long j9) {
        r0(j9, 5);
    }

    @Override // O2.InterfaceC0920t1
    public final boolean t(int i9) {
        return D().c(i9);
    }

    public final void t0(int i9) {
        int iM0 = m0();
        if (iM0 == -1) {
            return;
        }
        if (iM0 == X()) {
            p0(i9);
        } else {
            s0(iM0, i9);
        }
    }

    @Override // O2.InterfaceC0920t1
    public final boolean u() {
        Q1 q1W = w();
        return !q1W.v() && q1W.s(X(), this.f6007a).f5752j;
    }

    public final void u0(long j9, int i9) {
        long currentPosition = getCurrentPosition() + j9;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        r0(Math.max(currentPosition, 0L), i9);
    }

    public final void v0(int i9) {
        int iN0 = n0();
        if (iN0 == -1) {
            return;
        }
        if (iN0 == X()) {
            p0(i9);
        } else {
            s0(iN0, i9);
        }
    }

    public final void w0(H0 h02, boolean z9) {
        h(AbstractC2743y.A(h02), z9);
    }

    public final void x0(float f9) {
        b(c().d(f9));
    }

    @Override // O2.InterfaceC0920t1
    public final void z() {
        if (w().v() || d()) {
            return;
        }
        if (q()) {
            t0(9);
        } else if (g0() && u()) {
            s0(X(), 9);
        }
    }
}
