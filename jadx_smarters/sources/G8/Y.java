package G8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.AbstractC2166g;
import o8.InterfaceC2372d;
import org.jetbrains.annotations.NotNull;
import p8.AbstractC2511b;
import p8.AbstractC2512c;

/* JADX INFO: loaded from: classes4.dex */
public final class Y extends kotlinx.coroutines.internal.x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2313e = AtomicIntegerFieldUpdater.newUpdater(Y.class, "_decision");

    @NotNull
    private volatile /* synthetic */ int _decision;

    public Y(o8.g gVar, InterfaceC2372d interfaceC2372d) {
        super(gVar, interfaceC2372d);
        this._decision = 0;
    }

    private final boolean Q0() {
        do {
            int i9 = this._decision;
            if (i9 != 0) {
                if (i9 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f2313e.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean R0() {
        do {
            int i9 = this._decision;
            if (i9 != 0) {
                if (i9 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f2313e.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // kotlinx.coroutines.internal.x, G8.E0
    public void D(Object obj) {
        K0(obj);
    }

    @Override // kotlinx.coroutines.internal.x, G8.AbstractC0559a
    public void K0(Object obj) {
        if (Q0()) {
            return;
        }
        AbstractC2166g.c(AbstractC2511b.c(this.f43785d), F.a(obj, this.f43785d), null, 2, null);
    }

    public final Object P0() {
        if (R0()) {
            return AbstractC2512c.d();
        }
        Object objH = F0.h(d0());
        if (objH instanceof B) {
            throw ((B) objH).f2261a;
        }
        return objH;
    }
}
