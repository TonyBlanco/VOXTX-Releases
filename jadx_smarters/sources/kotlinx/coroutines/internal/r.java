package kotlinx.coroutines.internal;

import G8.I0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class r {
    public static final s a(Throwable th, String str) throws Throwable {
        if (th != null) {
            throw th;
        }
        d();
        throw new k8.c();
    }

    public static /* synthetic */ s b(Throwable th, String str, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            th = null;
        }
        if ((i9 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(I0 i02) {
        return i02.f0() instanceof s;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final I0 e(p pVar, List list) {
        try {
            return pVar.b(list);
        } catch (Throwable th) {
            return a(th, pVar.a());
        }
    }
}
