package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import t.AbstractC2755b;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43829b = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "lastScheduledTask");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43830c = AtomicIntegerFieldUpdater.newUpdater(o.class, "producerIndex");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43831d = AtomicIntegerFieldUpdater.newUpdater(o.class, "consumerIndex");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43832e = AtomicIntegerFieldUpdater.newUpdater(o.class, "blockingTasksInBuffer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f43833a = new AtomicReferenceArray(128);

    @NotNull
    private volatile /* synthetic */ Object lastScheduledTask = null;

    @NotNull
    private volatile /* synthetic */ int producerIndex = 0;

    @NotNull
    private volatile /* synthetic */ int consumerIndex = 0;

    @NotNull
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public static /* synthetic */ h b(o oVar, h hVar, boolean z9, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z9 = false;
        }
        return oVar.a(hVar, z9);
    }

    public final h a(h hVar, boolean z9) {
        if (z9) {
            return c(hVar);
        }
        h hVar2 = (h) f43829b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return c(hVar2);
    }

    public final h c(h hVar) {
        if (hVar.f43818c.b() == 1) {
            f43832e.incrementAndGet(this);
        }
        if (e() == 127) {
            return hVar;
        }
        int i9 = this.producerIndex & 127;
        while (this.f43833a.get(i9) != null) {
            Thread.yield();
        }
        this.f43833a.lazySet(i9, hVar);
        f43830c.incrementAndGet(this);
        return null;
    }

    public final void d(h hVar) {
        if (hVar == null || hVar.f43818c.b() != 1) {
            return;
        }
        f43832e.decrementAndGet(this);
    }

    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int f() {
        return this.lastScheduledTask != null ? e() + 1 : e();
    }

    public final void g(d dVar) {
        h hVar = (h) f43829b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (j(dVar)) {
        }
    }

    public final h h() {
        h hVar = (h) f43829b.getAndSet(this, null);
        return hVar == null ? i() : hVar;
    }

    public final h i() {
        h hVar;
        while (true) {
            int i9 = this.consumerIndex;
            if (i9 - this.producerIndex == 0) {
                return null;
            }
            int i10 = i9 & 127;
            if (f43831d.compareAndSet(this, i9, i9 + 1) && (hVar = (h) this.f43833a.getAndSet(i10, null)) != null) {
                d(hVar);
                return hVar;
            }
        }
    }

    public final boolean j(d dVar) {
        h hVarI = i();
        if (hVarI == null) {
            return false;
        }
        dVar.a(hVarI);
        return true;
    }

    public final long k(o oVar) {
        int i9 = oVar.producerIndex;
        AtomicReferenceArray atomicReferenceArray = oVar.f43833a;
        for (int i10 = oVar.consumerIndex; i10 != i9; i10++) {
            int i11 = i10 & 127;
            if (oVar.blockingTasksInBuffer == 0) {
                break;
            }
            h hVar = (h) atomicReferenceArray.get(i11);
            if (hVar != null && hVar.f43818c.b() == 1 && n.a(atomicReferenceArray, i11, hVar, null)) {
                f43832e.decrementAndGet(oVar);
                b(this, hVar, false, 2, null);
                return -1L;
            }
        }
        return m(oVar, true);
    }

    public final long l(o oVar) {
        h hVarI = oVar.i();
        if (hVarI == null) {
            return m(oVar, false);
        }
        b(this, hVarI, false, 2, null);
        return -1L;
    }

    public final long m(o oVar, boolean z9) {
        h hVar;
        do {
            hVar = (h) oVar.lastScheduledTask;
            if (hVar == null) {
                return -2L;
            }
            if (z9 && hVar.f43818c.b() != 1) {
                return -2L;
            }
            long jA = l.f43825e.a() - hVar.f43817a;
            long j9 = l.f43821a;
            if (jA < j9) {
                return j9 - jA;
            }
        } while (!AbstractC2755b.a(f43829b, oVar, hVar, null));
        b(this, hVar, false, 2, null);
        return -1L;
    }
}
