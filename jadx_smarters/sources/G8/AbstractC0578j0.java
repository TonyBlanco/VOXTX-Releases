package G8;

import G8.AbstractC0576i0;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: G8.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0578j0 extends AbstractC0574h0 {
    public abstract Thread r0();

    public void s0(long j9, AbstractC0576i0.b bVar) {
        Q.f2302i.D0(j9, bVar);
    }

    public final void t0() {
        Thread threadR0 = r0();
        if (Thread.currentThread() != threadR0) {
            AbstractC0563c.a();
            LockSupport.unpark(threadR0);
        }
    }
}
