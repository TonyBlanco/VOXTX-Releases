package kotlinx.coroutines.internal;

import G8.I0;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f43779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final I0 f43780b;

    static {
        q qVar = new q();
        f43779a = qVar;
        z.e("kotlinx.coroutines.fast.service.loader", true);
        f43780b = qVar.a();
    }

    public final I0 a() {
        Object next;
        I0 i0E;
        try {
            List listL = D8.k.l(D8.i.c(ServiceLoader.load(p.class, p.class.getClassLoader()).iterator()));
            Iterator it = listL.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iC = ((p) next).c();
                    do {
                        Object next2 = it.next();
                        int iC2 = ((p) next2).c();
                        if (iC < iC2) {
                            next = next2;
                            iC = iC2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            p pVar = (p) next;
            if (pVar != null && (i0E = r.e(pVar, listL)) != null) {
                return i0E;
            }
            return r.b(null, null, 3, null);
        } catch (Throwable th) {
            return r.b(th, null, 2, null);
        }
    }
}
