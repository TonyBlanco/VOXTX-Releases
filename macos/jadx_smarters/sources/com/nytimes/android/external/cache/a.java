package com.nytimes.android.external.cache;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import t.AbstractC2755b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements j {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f37933e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f37934f = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f37935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f37936h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f37937a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile e f37938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile i f37939d;

    public static abstract class b {
        public b() {
        }

        public abstract boolean a(a aVar, e eVar, e eVar2);

        public abstract boolean b(a aVar, Object obj, Object obj2);

        public abstract boolean c(a aVar, i iVar, i iVar2);

        public abstract void d(i iVar, i iVar2);

        public abstract void e(i iVar, Thread thread);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f37940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f37941b;

        public c(boolean z9, Throwable th) {
            this.f37940a = z9;
            this.f37941b = th;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f37942b = new d(new C0295a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f37943a;

        /* JADX INFO: renamed from: com.nytimes.android.external.cache.a$d$a, reason: collision with other inner class name */
        public class C0295a extends Throwable {
            public C0295a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            this.f37943a = (Throwable) o.a(th);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f37944d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f37945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f37946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e f37947c;

        public e(Runnable runnable, Executor executor) {
            this.f37945a = runnable;
            this.f37946b = executor;
        }
    }

    public static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f37948a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f37949b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f37950c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f37951d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f37952e;

        public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f37948a = atomicReferenceFieldUpdater;
            this.f37949b = atomicReferenceFieldUpdater2;
            this.f37950c = atomicReferenceFieldUpdater3;
            this.f37951d = atomicReferenceFieldUpdater4;
            this.f37952e = atomicReferenceFieldUpdater5;
        }

        @Override // com.nytimes.android.external.cache.a.b
        public boolean a(a aVar, e eVar, e eVar2) {
            return AbstractC2755b.a(this.f37951d, aVar, eVar, eVar2);
        }

        @Override // com.nytimes.android.external.cache.a.b
        public boolean b(a aVar, Object obj, Object obj2) {
            return AbstractC2755b.a(this.f37952e, aVar, obj, obj2);
        }

        @Override // com.nytimes.android.external.cache.a.b
        public boolean c(a aVar, i iVar, i iVar2) {
            return AbstractC2755b.a(this.f37950c, aVar, iVar, iVar2);
        }

        @Override // com.nytimes.android.external.cache.a.b
        public void d(i iVar, i iVar2) {
            this.f37949b.lazySet(iVar, iVar2);
        }

        @Override // com.nytimes.android.external.cache.a.b
        public void e(i iVar, Thread thread) {
            this.f37948a.lazySet(iVar, thread);
        }
    }

    public static final class g extends b {
        public g() {
            super();
        }

        @Override // com.nytimes.android.external.cache.a.b
        public boolean a(a aVar, e eVar, e eVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f37938c != eVar) {
                        return false;
                    }
                    aVar.f37938c = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.nytimes.android.external.cache.a.b
        public boolean b(a aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                try {
                    if (aVar.f37937a != obj) {
                        return false;
                    }
                    aVar.f37937a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.nytimes.android.external.cache.a.b
        public boolean c(a aVar, i iVar, i iVar2) {
            synchronized (aVar) {
                try {
                    if (aVar.f37939d != iVar) {
                        return false;
                    }
                    aVar.f37939d = iVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.nytimes.android.external.cache.a.b
        public void d(i iVar, i iVar2) {
            iVar.f37955b = iVar2;
        }

        @Override // com.nytimes.android.external.cache.a.b
        public void e(i iVar, Thread thread) {
            iVar.f37954a = thread;
        }
    }

    public static abstract class h extends a {
        @Override // com.nytimes.android.external.cache.a, com.nytimes.android.external.cache.j
        public final void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // com.nytimes.android.external.cache.a, java.util.concurrent.Future
        public final Object get() {
            return super.get();
        }

        @Override // com.nytimes.android.external.cache.a, java.util.concurrent.Future
        public final Object get(long j9, TimeUnit timeUnit) {
            return super.get(j9, timeUnit);
        }

        @Override // com.nytimes.android.external.cache.a, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // com.nytimes.android.external.cache.a, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }
    }

    public static final class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f37953c = new i(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Thread f37954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile i f37955b;

        public i() {
            a.f37935g.e(this, Thread.currentThread());
        }

        public i(boolean z9) {
        }

        public void a(i iVar) {
            a.f37935g.d(this, iVar);
        }

        public void b() {
            Thread thread = this.f37954a;
            if (thread != null) {
                this.f37954a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "d"), AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "c"), AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "a"));
        } catch (Throwable th) {
            Logger logger = f37934f;
            Level level = Level.SEVERE;
            logger.log(level, "UnsafeAtomicHelper is broken!");
            logger.log(level, "SafeAtomicHelper is broken!", th);
            gVar = new g();
        }
        f37935g = gVar;
        f37936h = new Object();
    }

    public static final CancellationException h(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static void m(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e9) {
            f37934f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e9);
        }
    }

    @Override // com.nytimes.android.external.cache.j
    public void addListener(Runnable runnable, Executor executor) {
        o.b(runnable, "Runnable was null.");
        o.b(executor, "Executor was null.");
        e eVar = this.f37938c;
        if (eVar != e.f37944d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f37947c = eVar;
                if (f37935g.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f37938c;
                }
            } while (eVar != e.f37944d);
        }
        m(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z9) {
        Object obj = this.f37937a;
        if (obj == null) {
            if (f37935g.b(this, obj, new c(z9, f37933e ? p() : null))) {
                if (z9) {
                    o();
                }
                k();
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f37937a;
        if (obj2 != null) {
            return n(obj2);
        }
        i iVar = this.f37939d;
        if (iVar != i.f37953c) {
            i iVar2 = new i();
            do {
                iVar2.a(iVar);
                if (f37935g.c(this, iVar, iVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            q(iVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f37937a;
                    } while (!(obj != null));
                    return n(obj);
                }
                iVar = this.f37939d;
            } while (iVar != i.f37953c);
        }
        return n(this.f37937a);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j9, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j9);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f37937a;
        if (obj != null) {
            return n(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f37939d;
            if (iVar != i.f37953c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f37935g.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                q(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f37937a;
                            if (obj2 != null) {
                                return n(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        q(iVar2);
                    } else {
                        iVar = this.f37939d;
                    }
                } while (iVar != i.f37953c);
            }
            return n(this.f37937a);
        }
        while (nanos > 0) {
            Object obj3 = this.f37937a;
            if (obj3 != null) {
                return n(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        throw new TimeoutException();
    }

    public final e i() {
        e eVar;
        do {
            eVar = this.f37938c;
        } while (!f37935g.a(this, eVar, e.f37944d));
        return eVar;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f37937a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f37937a != null;
    }

    public final i j() {
        i iVar;
        do {
            iVar = this.f37939d;
        } while (!f37935g.c(this, iVar, i.f37953c));
        return iVar;
    }

    public final void k() {
        for (i iVarJ = j(); iVarJ != null; iVarJ = iVarJ.f37955b) {
            iVarJ.b();
        }
        e eVarI = i();
        e eVar = null;
        while (eVarI != null) {
            e eVar2 = eVarI.f37947c;
            eVarI.f37947c = eVar;
            eVar = eVarI;
            eVarI = eVar2;
        }
        while (eVar != null) {
            m(eVar.f37945a, eVar.f37946b);
            eVar = eVar.f37947c;
        }
        l();
    }

    public void l() {
    }

    public final Object n(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw h("Task was cancelled.", ((c) obj).f37941b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f37943a);
        }
        if (obj == f37936h) {
            return null;
        }
        return obj;
    }

    public void o() {
    }

    public final Throwable p() {
        return new CancellationException("Future.cancel() was called.");
    }

    public final void q(i iVar) {
        iVar.f37954a = null;
        while (true) {
            i iVar2 = this.f37939d;
            if (iVar2 == i.f37953c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f37955b;
                if (iVar2.f37954a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f37955b = iVar4;
                    if (iVar3.f37954a == null) {
                        break;
                    }
                } else if (!f37935g.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    public boolean r(Object obj) {
        if (obj == null) {
            obj = f37936h;
        }
        if (!f37935g.b(this, null, obj)) {
            return false;
        }
        k();
        return true;
    }

    public boolean s(Throwable th) {
        if (!f37935g.b(this, null, new d((Throwable) o.a(th)))) {
            return false;
        }
        k();
        return true;
    }
}
