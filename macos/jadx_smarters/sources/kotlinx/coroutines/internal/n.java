package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import t.AbstractC2755b;

/* JADX INFO: loaded from: classes4.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43769a = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_cur");

    @NotNull
    private volatile /* synthetic */ Object _cur;

    public n(boolean z9) {
        this._cur = new o(8, z9);
    }

    public final boolean a(Object obj) {
        while (true) {
            o oVar = (o) this._cur;
            int iA = oVar.a(obj);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                AbstractC2755b.a(f43769a, this, oVar, oVar.i());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            o oVar = (o) this._cur;
            if (oVar.d()) {
                return;
            } else {
                AbstractC2755b.a(f43769a, this, oVar, oVar.i());
            }
        }
    }

    public final int c() {
        return ((o) this._cur).f();
    }

    public final Object d() {
        while (true) {
            o oVar = (o) this._cur;
            Object objJ = oVar.j();
            if (objJ != o.f43773h) {
                return objJ;
            }
            AbstractC2755b.a(f43769a, this, oVar, oVar.i());
        }
    }
}
