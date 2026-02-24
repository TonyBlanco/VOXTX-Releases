package H8;

import B8.h;
import G8.B0;
import G8.C0562b0;
import G8.InterfaceC0566d0;
import G8.K0;
import G8.V;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends e implements V {

    @Nullable
    private volatile d _immediate;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f2747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f2750g;

    public d(Handler handler, String str) {
        this(handler, str, false);
    }

    public /* synthetic */ d(Handler handler, String str, int i9, g gVar) {
        this(handler, (i9 & 2) != 0 ? null : str);
    }

    public d(Handler handler, String str, boolean z9) {
        super(null);
        this.f2747d = handler;
        this.f2748e = str;
        this.f2749f = z9;
        this._immediate = z9 ? this : null;
        d dVar = this._immediate;
        if (dVar == null) {
            dVar = new d(handler, str, true);
            this._immediate = dVar;
        }
        this.f2750g = dVar;
    }

    public static final void k0(d dVar, Runnable runnable) {
        dVar.f2747d.removeCallbacks(runnable);
    }

    @Override // G8.H
    public void c0(o8.g gVar, Runnable runnable) {
        if (this.f2747d.post(runnable)) {
            return;
        }
        i0(gVar, runnable);
    }

    @Override // G8.H
    public boolean d0(o8.g gVar) {
        return (this.f2749f && l.a(Looper.myLooper(), this.f2747d.getLooper())) ? false : true;
    }

    public boolean equals(Object obj) {
        return (obj instanceof d) && ((d) obj).f2747d == this.f2747d;
    }

    public int hashCode() {
        return System.identityHashCode(this.f2747d);
    }

    public final void i0(o8.g gVar, Runnable runnable) {
        B0.c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C0562b0.b().c0(gVar, runnable);
    }

    @Override // G8.I0
    /* JADX INFO: renamed from: j0, reason: merged with bridge method [inline-methods] */
    public d f0() {
        return this.f2750g;
    }

    @Override // G8.V
    public InterfaceC0566d0 t(long j9, final Runnable runnable, o8.g gVar) {
        if (this.f2747d.postDelayed(runnable, h.f(j9, 4611686018427387903L))) {
            return new InterfaceC0566d0() { // from class: H8.c
                @Override // G8.InterfaceC0566d0
                public final void dispose() {
                    d.k0(this.f2745a, runnable);
                }
            };
        }
        i0(gVar, runnable);
        return K0.f2297a;
    }

    @Override // G8.H
    public String toString() {
        String strG0 = g0();
        if (strG0 != null) {
            return strG0;
        }
        String string = this.f2748e;
        if (string == null) {
            string = this.f2747d.toString();
        }
        if (!this.f2749f) {
            return string;
        }
        return string + ".immediate";
    }
}
