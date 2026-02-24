package q1;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import k1.C2132a;
import l1.C2173b;

/* JADX INFO: renamed from: q1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2528a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C2528a f46773c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f46774a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AtomicInteger f46775b = new AtomicInteger();

    public static C2528a c() {
        if (f46773c == null) {
            synchronized (C2528a.class) {
                try {
                    if (f46773c == null) {
                        f46773c = new C2528a();
                    }
                } finally {
                }
            }
        }
        return f46773c;
    }

    public C2132a a(C2132a c2132a) {
        try {
            this.f46774a.add(c2132a);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
        try {
            c2132a.L(d());
            c2132a.J(c2132a.y() == k1.e.IMMEDIATE ? C2173b.b().a().b().submit(new RunnableC2531d(c2132a)) : C2173b.b().a().c().submit(new RunnableC2531d(c2132a)));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return c2132a;
    }

    public void b(C2132a c2132a) {
        try {
            this.f46774a.remove(c2132a);
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public int d() {
        return this.f46775b.incrementAndGet();
    }
}
