package G8;

import java.lang.reflect.InvocationTargetException;
import k8.AbstractC2152a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class K {
    public static final void a(o8.g gVar, Throwable th) {
        try {
            I i9 = (I) gVar.a(I.f2294a0);
            if (i9 != null) {
                i9.j(gVar, th);
            } else {
                J.a(gVar, th);
            }
        } catch (Throwable th2) {
            J.a(gVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        AbstractC2152a.a(runtimeException, th);
        return runtimeException;
    }
}
