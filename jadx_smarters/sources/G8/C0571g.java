package G8;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: G8.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0571g extends AbstractC0559a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Thread f2332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC0574h0 f2333e;

    public C0571g(o8.g gVar, Thread thread, AbstractC0574h0 abstractC0574h0) {
        super(gVar, true, true);
        this.f2332d = thread;
        this.f2333e = abstractC0574h0;
    }

    @Override // G8.E0
    public void D(Object obj) {
        if (kotlin.jvm.internal.l.a(Thread.currentThread(), this.f2332d)) {
            return;
        }
        Thread thread = this.f2332d;
        AbstractC0563c.a();
        LockSupport.unpark(thread);
    }

    public final Object O0() throws Throwable {
        AbstractC0563c.a();
        try {
            AbstractC0574h0 abstractC0574h0 = this.f2333e;
            if (abstractC0574h0 != null) {
                AbstractC0574h0.l0(abstractC0574h0, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    AbstractC0574h0 abstractC0574h02 = this.f2333e;
                    long jO0 = abstractC0574h02 != null ? abstractC0574h02.o0() : Long.MAX_VALUE;
                    if (h0()) {
                        AbstractC0574h0 abstractC0574h03 = this.f2333e;
                        if (abstractC0574h03 != null) {
                            AbstractC0574h0.g0(abstractC0574h03, false, 1, null);
                        }
                        AbstractC0563c.a();
                        Object objH = F0.h(d0());
                        B b9 = objH instanceof B ? (B) objH : null;
                        if (b9 == null) {
                            return objH;
                        }
                        throw b9.f2261a;
                    }
                    AbstractC0563c.a();
                    LockSupport.parkNanos(this, jO0);
                } catch (Throwable th) {
                    AbstractC0574h0 abstractC0574h04 = this.f2333e;
                    if (abstractC0574h04 != null) {
                        AbstractC0574h0.g0(abstractC0574h04, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            G(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            AbstractC0563c.a();
            throw th2;
        }
    }

    @Override // G8.E0
    public boolean i0() {
        return true;
    }
}
