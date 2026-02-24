package G8;

import java.lang.reflect.InvocationTargetException;
import kotlinx.coroutines.internal.C2160a;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: renamed from: G8.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0574h0 extends H {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f2336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f2337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C2160a f2338f;

    public static /* synthetic */ void g0(AbstractC0574h0 abstractC0574h0, boolean z9, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decrementUseCount");
        }
        if ((i9 & 1) != 0) {
            z9 = false;
        }
        abstractC0574h0.f0(z9);
    }

    public static /* synthetic */ void l0(AbstractC0574h0 abstractC0574h0, boolean z9, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
        }
        if ((i9 & 1) != 0) {
            z9 = false;
        }
        abstractC0574h0.k0(z9);
    }

    public final void f0(boolean z9) {
        long jH0 = this.f2336d - h0(z9);
        this.f2336d = jH0;
        if (jH0 <= 0 && this.f2337e) {
            shutdown();
        }
    }

    public final long h0(boolean z9) {
        if (z9) {
            return IjkMediaMeta.AV_CH_WIDE_RIGHT;
        }
        return 1L;
    }

    public final void i0(Z z9) {
        C2160a c2160a = this.f2338f;
        if (c2160a == null) {
            c2160a = new C2160a();
            this.f2338f = c2160a;
        }
        c2160a.a(z9);
    }

    public long j0() {
        C2160a c2160a = this.f2338f;
        return (c2160a == null || c2160a.c()) ? Long.MAX_VALUE : 0L;
    }

    public final void k0(boolean z9) {
        this.f2336d += h0(z9);
        if (z9) {
            return;
        }
        this.f2337e = true;
    }

    public final boolean m0() {
        return this.f2336d >= h0(true);
    }

    public final boolean n0() {
        C2160a c2160a = this.f2338f;
        if (c2160a != null) {
            return c2160a.c();
        }
        return true;
    }

    public abstract long o0();

    public final boolean p0() throws IllegalAccessException, InvocationTargetException {
        Z z9;
        C2160a c2160a = this.f2338f;
        if (c2160a == null || (z9 = (Z) c2160a.d()) == null) {
            return false;
        }
        z9.run();
        return true;
    }

    public boolean q0() {
        return false;
    }

    public abstract void shutdown();
}
