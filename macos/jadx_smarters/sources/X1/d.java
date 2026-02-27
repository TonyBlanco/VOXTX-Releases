package x1;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements Serializable {
    public static d a() {
        return C2950a.l();
    }

    public static d d(Object obj) {
        return obj == null ? a() : new e(obj);
    }

    public static d h(Object obj) {
        return new e(g.b(obj));
    }

    public abstract d b(InterfaceC2951b interfaceC2951b);

    public abstract d c(c cVar);

    public abstract Object e();

    public abstract boolean f();

    public abstract d g(c cVar);

    public abstract Object i(Object obj);

    public abstract d j(d dVar);

    public abstract Object k();
}
