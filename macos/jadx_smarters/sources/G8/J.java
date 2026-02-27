package G8;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import k8.AbstractC2152a;
import k8.j;

/* JADX INFO: loaded from: classes4.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f2296a = D8.k.l(D8.i.c(ServiceLoader.load(I.class, I.class.getClassLoader()).iterator()));

    public static final void a(o8.g gVar, Throwable th) {
        Iterator it = f2296a.iterator();
        while (it.hasNext()) {
            try {
                ((I) it.next()).j(gVar, th);
            } catch (Throwable th2) {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, K.b(th, th2));
            }
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        try {
            j.a aVar = k8.j.f43666c;
            AbstractC2152a.a(th, new X(gVar));
            k8.j.b(k8.q.f43674a);
        } catch (Throwable th3) {
            j.a aVar2 = k8.j.f43666c;
            k8.j.b(k8.k.a(th3));
        }
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }
}
