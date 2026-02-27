package I5;

import j$.util.concurrent.ConcurrentHashMap;
import j6.InterfaceC2102b;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class y implements InterfaceC2102b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Set f2920b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Set f2919a = Collections.newSetFromMap(new ConcurrentHashMap());

    public y(Collection collection) {
        this.f2919a.addAll(collection);
    }

    public static y b(Collection collection) {
        return new y((Set) collection);
    }

    public synchronized void a(InterfaceC2102b interfaceC2102b) {
        Set set;
        InterfaceC2102b interfaceC2102b2;
        try {
            if (this.f2920b == null) {
                set = this.f2919a;
                interfaceC2102b2 = interfaceC2102b;
            } else {
                set = this.f2920b;
                interfaceC2102b2 = interfaceC2102b.get();
            }
            set.add(interfaceC2102b2);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // j6.InterfaceC2102b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f2920b == null) {
            synchronized (this) {
                try {
                    if (this.f2920b == null) {
                        this.f2920b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } finally {
                }
            }
        }
        return Collections.unmodifiableSet(this.f2920b);
    }

    public final synchronized void d() {
        try {
            Iterator it = this.f2919a.iterator();
            while (it.hasNext()) {
                this.f2920b.add(((InterfaceC2102b) it.next()).get());
            }
            this.f2919a = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
