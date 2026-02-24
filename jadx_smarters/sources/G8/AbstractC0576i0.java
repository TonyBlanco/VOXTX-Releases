package G8;

import G8.V;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t.AbstractC2755b;

/* JADX INFO: renamed from: G8.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC0576i0 extends AbstractC0578j0 implements V {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2339g = AtomicReferenceFieldUpdater.newUpdater(AbstractC0576i0.class, Object.class, "_queue");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2340h = AtomicReferenceFieldUpdater.newUpdater(AbstractC0576i0.class, Object.class, "_delayed");

    @NotNull
    private volatile /* synthetic */ Object _queue = null;

    @NotNull
    private volatile /* synthetic */ Object _delayed = null;

    @NotNull
    private volatile /* synthetic */ int _isCompleted = 0;

    /* JADX INFO: renamed from: G8.i0$a */
    public static final class a extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Runnable f2341d;

        public a(long j9, Runnable runnable) {
            super(j9);
            this.f2341d = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2341d.run();
        }

        @Override // G8.AbstractC0576i0.b
        public String toString() {
            return super.toString() + this.f2341d;
        }
    }

    /* JADX INFO: renamed from: G8.i0$b */
    public static abstract class b implements Runnable, Comparable, InterfaceC0566d0, kotlinx.coroutines.internal.E {

        @Nullable
        private volatile Object _heap;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f2342a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2343c = -1;

        public b(long j9) {
            this.f2342a = j9;
        }

        @Override // kotlinx.coroutines.internal.E
        public void a(kotlinx.coroutines.internal.D d9) {
            if (this._heap == AbstractC0582l0.f2345a) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = d9;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            long j9 = this.f2342a - bVar.f2342a;
            if (j9 > 0) {
                return 1;
            }
            return j9 < 0 ? -1 : 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0044 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:9:0x000d, B:19:0x0023, B:29:0x003b, B:31:0x0044, B:32:0x0046, B:22:0x0028, B:26:0x0032), top: B:41:0x000d, outer: #1 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final synchronized int d(long r8, G8.AbstractC0576i0.c r10, G8.AbstractC0576i0 r11) {
            /*
                r7 = this;
                monitor-enter(r7)
                java.lang.Object r0 = r7._heap     // Catch: java.lang.Throwable -> L1d
                kotlinx.coroutines.internal.y r1 = G8.AbstractC0582l0.b()     // Catch: java.lang.Throwable -> L1d
                if (r0 != r1) goto Lc
                monitor-exit(r7)
                r8 = 2
                return r8
            Lc:
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L1d
                kotlinx.coroutines.internal.E r0 = r10.b()     // Catch: java.lang.Throwable -> L26
                G8.i0$b r0 = (G8.AbstractC0576i0.b) r0     // Catch: java.lang.Throwable -> L26
                boolean r11 = G8.AbstractC0576i0.u0(r11)     // Catch: java.lang.Throwable -> L26
                if (r11 == 0) goto L1f
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L1d
                monitor-exit(r7)
                r8 = 1
                return r8
            L1d:
                r8 = move-exception
                goto L4f
            L1f:
                r1 = 0
                if (r0 != 0) goto L28
            L23:
                r10.f2344b = r8     // Catch: java.lang.Throwable -> L26
                goto L3b
            L26:
                r8 = move-exception
                goto L4d
            L28:
                long r3 = r0.f2342a     // Catch: java.lang.Throwable -> L26
                long r5 = r3 - r8
                int r11 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r11 < 0) goto L31
                goto L32
            L31:
                r8 = r3
            L32:
                long r3 = r10.f2344b     // Catch: java.lang.Throwable -> L26
                long r3 = r8 - r3
                int r11 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r11 <= 0) goto L3b
                goto L23
            L3b:
                long r8 = r7.f2342a     // Catch: java.lang.Throwable -> L26
                long r3 = r10.f2344b     // Catch: java.lang.Throwable -> L26
                long r8 = r8 - r3
                int r11 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
                if (r11 >= 0) goto L46
                r7.f2342a = r3     // Catch: java.lang.Throwable -> L26
            L46:
                r10.a(r7)     // Catch: java.lang.Throwable -> L26
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L1d
                monitor-exit(r7)
                r8 = 0
                return r8
            L4d:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L1d
                throw r8     // Catch: java.lang.Throwable -> L1d
            L4f:
                monitor-exit(r7)
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: G8.AbstractC0576i0.b.d(long, G8.i0$c, G8.i0):int");
        }

        @Override // G8.InterfaceC0566d0
        public final synchronized void dispose() {
            try {
                Object obj = this._heap;
                if (obj == AbstractC0582l0.f2345a) {
                    return;
                }
                c cVar = obj instanceof c ? (c) obj : null;
                if (cVar != null) {
                    cVar.g(this);
                }
                this._heap = AbstractC0582l0.f2345a;
            } catch (Throwable th) {
                throw th;
            }
        }

        public final boolean e(long j9) {
            return j9 - this.f2342a >= 0;
        }

        @Override // kotlinx.coroutines.internal.E
        public int getIndex() {
            return this.f2343c;
        }

        @Override // kotlinx.coroutines.internal.E
        public kotlinx.coroutines.internal.D h() {
            Object obj = this._heap;
            if (obj instanceof kotlinx.coroutines.internal.D) {
                return (kotlinx.coroutines.internal.D) obj;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.E
        public void i(int i9) {
            this.f2343c = i9;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f2342a + ']';
        }
    }

    /* JADX INFO: renamed from: G8.i0$c */
    public static final class c extends kotlinx.coroutines.internal.D {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f2344b;

        public c(long j9) {
            this.f2344b = j9;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean z0() {
        return this._isCompleted;
    }

    public boolean A0() {
        if (!n0()) {
            return false;
        }
        c cVar = (c) this._delayed;
        if (cVar != null && !cVar.d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof kotlinx.coroutines.internal.o) {
                return ((kotlinx.coroutines.internal.o) obj).g();
            }
            if (obj != AbstractC0582l0.f2346b) {
                return false;
            }
        }
        return true;
    }

    public final void B0() {
        b bVar;
        AbstractC0563c.a();
        long jNanoTime = System.nanoTime();
        while (true) {
            c cVar = (c) this._delayed;
            if (cVar == null || (bVar = (b) cVar.i()) == null) {
                return;
            } else {
                s0(jNanoTime, bVar);
            }
        }
    }

    public final void C0() {
        this._queue = null;
        this._delayed = null;
    }

    public final void D0(long j9, b bVar) {
        int iE0 = E0(j9, bVar);
        if (iE0 == 0) {
            if (H0(bVar)) {
                t0();
            }
        } else if (iE0 == 1) {
            s0(j9, bVar);
        } else if (iE0 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    public final int E0(long j9, b bVar) {
        if (z0()) {
            return 1;
        }
        c cVar = (c) this._delayed;
        if (cVar == null) {
            AbstractC2755b.a(f2340h, this, null, new c(j9));
            Object obj = this._delayed;
            kotlin.jvm.internal.l.b(obj);
            cVar = (c) obj;
        }
        return bVar.d(j9, cVar, this);
    }

    public final InterfaceC0566d0 F0(long j9, Runnable runnable) {
        long jC = AbstractC0582l0.c(j9);
        if (jC >= 4611686018427387903L) {
            return K0.f2297a;
        }
        AbstractC0563c.a();
        long jNanoTime = System.nanoTime();
        a aVar = new a(jC + jNanoTime, runnable);
        D0(jNanoTime, aVar);
        return aVar;
    }

    public final void G0(boolean z9) {
        this._isCompleted = z9 ? 1 : 0;
    }

    public final boolean H0(b bVar) {
        c cVar = (c) this._delayed;
        return (cVar != null ? (b) cVar.e() : null) == bVar;
    }

    @Override // G8.H
    public final void c0(o8.g gVar, Runnable runnable) {
        x0(runnable);
    }

    @Override // G8.AbstractC0574h0
    public long j0() {
        b bVar;
        if (super.j0() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof kotlinx.coroutines.internal.o)) {
                return obj == AbstractC0582l0.f2346b ? Long.MAX_VALUE : 0L;
            }
            if (!((kotlinx.coroutines.internal.o) obj).g()) {
                return 0L;
            }
        }
        c cVar = (c) this._delayed;
        if (cVar == null || (bVar = (b) cVar.e()) == null) {
            return Long.MAX_VALUE;
        }
        long j9 = bVar.f2342a;
        AbstractC0563c.a();
        return B8.h.d(j9 - System.nanoTime(), 0L);
    }

    @Override // G8.AbstractC0574h0
    public long o0() {
        kotlinx.coroutines.internal.E eH;
        if (p0()) {
            return 0L;
        }
        c cVar = (c) this._delayed;
        if (cVar != null && !cVar.d()) {
            AbstractC0563c.a();
            long jNanoTime = System.nanoTime();
            do {
                synchronized (cVar) {
                    try {
                        kotlinx.coroutines.internal.E eB = cVar.b();
                        eH = null;
                        if (eB != null) {
                            b bVar = (b) eB;
                            if (bVar.e(jNanoTime) ? y0(bVar) : false) {
                                eH = cVar.h(0);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (((b) eH) != null);
        }
        Runnable runnableW0 = w0();
        if (runnableW0 == null) {
            return j0();
        }
        runnableW0.run();
        return 0L;
    }

    @Override // G8.AbstractC0574h0
    public void shutdown() {
        U0.f2306a.c();
        G0(true);
        v0();
        while (o0() <= 0) {
        }
        B0();
    }

    public InterfaceC0566d0 t(long j9, Runnable runnable, o8.g gVar) {
        return V.a.a(this, j9, runnable, gVar);
    }

    public final void v0() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                if (AbstractC2755b.a(f2339g, this, null, AbstractC0582l0.f2346b)) {
                    return;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.o) {
                ((kotlinx.coroutines.internal.o) obj).d();
                return;
            } else {
                if (obj == AbstractC0582l0.f2346b) {
                    return;
                }
                kotlinx.coroutines.internal.o oVar = new kotlinx.coroutines.internal.o(8, true);
                oVar.a((Runnable) obj);
                if (AbstractC2755b.a(f2339g, this, obj, oVar)) {
                    return;
                }
            }
        }
    }

    public final Runnable w0() {
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof kotlinx.coroutines.internal.o) {
                kotlinx.coroutines.internal.o oVar = (kotlinx.coroutines.internal.o) obj;
                Object objJ = oVar.j();
                if (objJ != kotlinx.coroutines.internal.o.f43773h) {
                    return (Runnable) objJ;
                }
                AbstractC2755b.a(f2339g, this, obj, oVar.i());
            } else {
                if (obj == AbstractC0582l0.f2346b) {
                    return null;
                }
                if (AbstractC2755b.a(f2339g, this, obj, null)) {
                    return (Runnable) obj;
                }
            }
        }
    }

    public void x0(Runnable runnable) {
        if (y0(runnable)) {
            t0();
        } else {
            Q.f2302i.x0(runnable);
        }
    }

    public final boolean y0(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (z0()) {
                return false;
            }
            if (obj == null) {
                if (AbstractC2755b.a(f2339g, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.o) {
                kotlinx.coroutines.internal.o oVar = (kotlinx.coroutines.internal.o) obj;
                int iA = oVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    AbstractC2755b.a(f2339g, this, obj, oVar.i());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == AbstractC0582l0.f2346b) {
                    return false;
                }
                kotlinx.coroutines.internal.o oVar2 = new kotlinx.coroutines.internal.o(8, true);
                oVar2.a((Runnable) obj);
                oVar2.a(runnable);
                if (AbstractC2755b.a(f2339g, this, obj, oVar2)) {
                    return true;
                }
            }
        }
    }
}
