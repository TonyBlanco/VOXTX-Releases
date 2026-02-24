package kotlinx.coroutines.internal;

import G8.H;
import G8.InterfaceC0566d0;
import G8.S;
import G8.V;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends H implements Runnable, V {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H f43757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ V f43759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f43760g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f43761h;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public i(H h9, int i9) {
        this.f43757d = h9;
        this.f43758e = i9;
        V v9 = h9 instanceof V ? (V) h9 : null;
        this.f43759f = v9 == null ? S.a() : v9;
        this.f43760g = new n(false);
        this.f43761h = new Object();
    }

    @Override // G8.H
    public void c0(o8.g gVar, Runnable runnable) {
        if (f0(runnable) || !g0()) {
            return;
        }
        this.f43757d.c0(this, this);
    }

    public final boolean f0(Runnable runnable) {
        this.f43760g.a(runnable);
        return this.runningWorkers >= this.f43758e;
    }

    public final boolean g0() {
        synchronized (this.f43761h) {
            if (this.runningWorkers >= this.f43758e) {
                return false;
            }
            this.runningWorkers++;
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        r1 = r4.f43761h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        monitor-enter(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        r4.runningWorkers--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
    
        if (r4.f43760g.c() != 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        monitor-exit(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        r4.runningWorkers++;
        r2 = k8.q.f43674a;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r4 = this;
            r0 = 0
        L1:
            r1 = 0
        L2:
            kotlinx.coroutines.internal.n r2 = r4.f43760g
            java.lang.Object r2 = r2.d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L2a
            r2.run()     // Catch: java.lang.Throwable -> L10
            goto L16
        L10:
            r2 = move-exception
            o8.h r3 = o8.h.f46144a
            G8.K.a(r3, r2)
        L16:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L2
            G8.H r2 = r4.f43757d
            boolean r2 = r2.d0(r4)
            if (r2 == 0) goto L2
            G8.H r0 = r4.f43757d
            r0.c0(r4, r4)
            return
        L2a:
            java.lang.Object r1 = r4.f43761h
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + (-1)
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            kotlinx.coroutines.internal.n r2 = r4.f43760g     // Catch: java.lang.Throwable -> L47
            int r2 = r2.c()     // Catch: java.lang.Throwable -> L47
            if (r2 != 0) goto L3d
            monitor-exit(r1)
            return
        L3d:
            int r2 = r4.runningWorkers     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch: java.lang.Throwable -> L47
            k8.q r2 = k8.q.f43674a     // Catch: java.lang.Throwable -> L47
            monitor-exit(r1)
            goto L1
        L47:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.i.run():void");
    }

    @Override // G8.V
    public InterfaceC0566d0 t(long j9, Runnable runnable, o8.g gVar) {
        return this.f43759f.t(j9, runnable, gVar);
    }
}
