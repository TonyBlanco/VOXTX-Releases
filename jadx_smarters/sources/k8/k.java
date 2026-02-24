package k8;

import k8.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k {
    public static final Object a(Throwable exception) {
        kotlin.jvm.internal.l.e(exception, "exception");
        return new j.b(exception);
    }

    public static final void b(Object obj) throws Throwable {
        if (obj instanceof j.b) {
            throw ((j.b) obj).f43668a;
        }
    }
}
