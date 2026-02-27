package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.Constants;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public abstract class axz<V> extends azm implements azd<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final boolean f20895a;
    private static final Logger aX;
    private static final a aY;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f20896d;
    private volatile d listeners;
    private volatile Object value;
    private volatile k waiters;

    abstract class a {
        public abstract d a(axz axzVar, d dVar);

        public abstract k b(axz axzVar, k kVar);

        public abstract void c(k kVar, k kVar2);

        public abstract void d(k kVar, Thread thread);

        public abstract boolean e(axz axzVar, d dVar, d dVar2);

        public abstract boolean f(axz axzVar, Object obj, Object obj2);

        public abstract boolean g(axz axzVar, k kVar, k kVar2);
    }

    final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final b f20897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final b f20898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f20899c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Throwable f20900d;

        static {
            if (axz.f20895a) {
                f20898b = null;
                f20897a = null;
            } else {
                f20898b = new b(false, null);
                f20897a = new b(true, null);
            }
        }

        public b(boolean z9, Throwable th) {
            this.f20899c = z9;
            this.f20900d = th;
        }
    }

    final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final c f20901a = new c(new Throwable() { // from class: com.google.ads.interactivemedia.v3.internal.axz.c.1
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Throwable f20902b;

        public c(Throwable th) {
            atp.k(th);
            this.f20902b = th;
        }
    }

    final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d f20903a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Runnable f20904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Executor f20905c;
        d next;

        public d() {
            this.f20904b = null;
            this.f20905c = null;
        }

        public d(Runnable runnable, Executor executor) {
            this.f20904b = runnable;
            this.f20905c = executor;
        }
    }

    final class e extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<k, Thread> f20906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<k, k> f20907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<axz, k> f20908c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<axz, d> f20909d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicReferenceFieldUpdater<axz, Object> f20910e;

        public e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            this.f20906a = atomicReferenceFieldUpdater;
            this.f20907b = atomicReferenceFieldUpdater2;
            this.f20908c = atomicReferenceFieldUpdater3;
            this.f20909d = atomicReferenceFieldUpdater4;
            this.f20910e = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axz.a
        public final d a(axz axzVar, d dVar) {
            return this.f20909d.getAndSet(axzVar, dVar);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axz.a
        public final k b(axz axzVar, k kVar) {
            return this.f20908c.getAndSet(axzVar, kVar);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axz.a
        public final void c(k kVar, k kVar2) {
            this.f20907b.lazySet(kVar, kVar2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axz.a
        public final void d(k kVar, Thread thread) {
            this.f20906a.lazySet(kVar, thread);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axz.a
        public final boolean e(axz axzVar, d dVar, d dVar2) {
            return aya.a(this.f20909d, axzVar, dVar, dVar2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axz.a
        public final boolean f(axz axzVar, Object obj, Object obj2) {
            return aya.a(this.f20910e, axzVar, obj, obj2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axz.a
        public final boolean g(axz axzVar, k kVar, k kVar2) {
            return aya.a(this.f20908c, axzVar, kVar, kVar2);
        }
    }

    final class f<V> implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final axz<V> f20911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final azd<? extends V> f20912b;

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    final class g extends a {
        private g() {
        }

        public /* synthetic */ g(byte[] bArr) {
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axz.a
        public final d a(axz axzVar, d dVar) {
            d dVar2;
            synchronized (axzVar) {
                try {
                    dVar2 = axzVar.listeners;
                    if (dVar2 != dVar) {
                        axzVar.listeners = dVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return dVar2;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axz.a
        public final k b(axz axzVar, k kVar) {
            k kVar2;
            synchronized (axzVar) {
                try {
                    kVar2 = axzVar.waiters;
                    if (kVar2 != kVar) {
                        axzVar.waiters = kVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return kVar2;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axz.a
        public final void c(k kVar, k kVar2) {
            kVar.next = kVar2;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axz.a
        public final void d(k kVar, Thread thread) {
            kVar.thread = thread;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axz.a
        public final boolean e(axz axzVar, d dVar, d dVar2) {
            synchronized (axzVar) {
                try {
                    if (axzVar.listeners != dVar) {
                        return false;
                    }
                    axzVar.listeners = dVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axz.a
        public final boolean f(axz axzVar, Object obj, Object obj2) {
            synchronized (axzVar) {
                try {
                    if (axzVar.value != obj) {
                        return false;
                    }
                    axzVar.value = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axz.a
        public final boolean g(axz axzVar, k kVar, k kVar2) {
            synchronized (axzVar) {
                try {
                    if (axzVar.waiters != kVar) {
                        return false;
                    }
                    axzVar.waiters = kVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    interface h<V> extends azd<V> {
    }

    abstract class i<V> extends axz<V> implements h<V> {
    }

    final class j extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Unsafe f20913a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final long f20914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final long f20915c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final long f20916d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final long f20917e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final long f20918f;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e9) {
                    throw new RuntimeException("Could not initialize intrinsics", e9.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.ads.interactivemedia.v3.internal.axz.j.1
                    public static final Unsafe a() throws Exception {
                        for (Field field : Unsafe.class.getDeclaredFields()) {
                            field.setAccessible(true);
                            Object obj = field.get(null);
                            if (Unsafe.class.isInstance(obj)) {
                                return (Unsafe) Unsafe.class.cast(obj);
                            }
                        }
                        throw new NoSuchFieldError("the Unsafe");
                    }

                    @Override // java.security.PrivilegedExceptionAction
                    public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                        return a();
                    }
                });
            }
            try {
                f20915c = unsafe.objectFieldOffset(axz.class.getDeclaredField("waiters"));
                f20914b = unsafe.objectFieldOffset(axz.class.getDeclaredField("listeners"));
                f20916d = unsafe.objectFieldOffset(axz.class.getDeclaredField("value"));
                f20917e = unsafe.objectFieldOffset(k.class.getDeclaredField("thread"));
                f20918f = unsafe.objectFieldOffset(k.class.getDeclaredField("next"));
                f20913a = unsafe;
            } catch (NoSuchFieldException e10) {
                throw new RuntimeException(e10);
            } catch (RuntimeException e11) {
                throw e11;
            }
        }

        private j() {
        }

        public /* synthetic */ j(byte[] bArr) {
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axz.a
        public final d a(axz axzVar, d dVar) {
            d dVar2;
            do {
                dVar2 = axzVar.listeners;
                if (dVar == dVar2) {
                    return dVar2;
                }
            } while (!e(axzVar, dVar2, dVar));
            return dVar2;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axz.a
        public final k b(axz axzVar, k kVar) {
            k kVar2;
            do {
                kVar2 = axzVar.waiters;
                if (kVar == kVar2) {
                    return kVar2;
                }
            } while (!g(axzVar, kVar2, kVar));
            return kVar2;
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axz.a
        public final void c(k kVar, k kVar2) {
            f20913a.putObject(kVar, f20918f, kVar2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axz.a
        public final void d(k kVar, Thread thread) {
            f20913a.putObject(kVar, f20917e, thread);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axz.a
        public final boolean e(axz axzVar, d dVar, d dVar2) {
            return ayb.a(f20913a, axzVar, f20914b, dVar, dVar2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axz.a
        public final boolean f(axz axzVar, Object obj, Object obj2) {
            return ayb.a(f20913a, axzVar, f20916d, obj, obj2);
        }

        @Override // com.google.ads.interactivemedia.v3.internal.axz.a
        public final boolean g(axz axzVar, k kVar, k kVar2) {
            return ayb.a(f20913a, axzVar, f20915c, kVar, kVar2);
        }
    }

    final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final k f20919a = new k(null);
        volatile k next;
        volatile Thread thread;

        public k() {
            axz.aY.d(this, Thread.currentThread());
        }

        public k(byte[] bArr) {
        }

        public final void a(k kVar) {
            axz.aY.c(this, kVar);
        }
    }

    static {
        boolean z9;
        Throwable th;
        Throwable th2;
        a gVar;
        try {
            z9 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z9 = false;
        }
        f20895a = z9;
        aX = Logger.getLogger(axz.class.getName());
        byte[] bArr = null;
        try {
            gVar = new j(bArr);
            th2 = null;
            th = null;
        } catch (Error | RuntimeException e9) {
            try {
                th = null;
                th2 = e9;
                gVar = new e(AtomicReferenceFieldUpdater.newUpdater(k.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(k.class, k.class, "next"), AtomicReferenceFieldUpdater.newUpdater(axz.class, k.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(axz.class, d.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(axz.class, Object.class, "value"));
            } catch (Error | RuntimeException e10) {
                th = e10;
                th2 = e9;
                gVar = new g(bArr);
            }
        }
        aY = gVar;
        if (th != null) {
            Logger logger = aX;
            Level level = Level.SEVERE;
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            logger.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        f20896d = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static Object p(azd azdVar) {
        Throwable thF;
        if (azdVar instanceof h) {
            Object bVar = ((axz) azdVar).value;
            if (bVar instanceof b) {
                b bVar2 = (b) bVar;
                if (bVar2.f20899c) {
                    Throwable th = bVar2.f20900d;
                    bVar = th != null ? new b(false, th) : b.f20898b;
                }
            }
            bVar.getClass();
            return bVar;
        }
        if ((azdVar instanceof azm) && (thF = ((azm) azdVar).f()) != null) {
            return new c(thF);
        }
        boolean zIsCancelled = azdVar.isCancelled();
        if ((!f20895a) && zIsCancelled) {
            b bVar3 = b.f20898b;
            bVar3.getClass();
            return bVar3;
        }
        try {
            Object objQ = q(azdVar);
            if (!zIsCancelled) {
                return objQ == null ? f20896d : objQ;
            }
            return new b(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + azdVar));
        } catch (Error e9) {
            e = e9;
            return new c(e);
        } catch (CancellationException e10) {
            if (zIsCancelled) {
                return new b(false, e10);
            }
            azdVar.toString();
            return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(azdVar)), e10));
        } catch (RuntimeException e11) {
            e = e11;
            return new c(e);
        } catch (ExecutionException e12) {
            if (!zIsCancelled) {
                return new c(e12.getCause());
            }
            azdVar.toString();
            return new b(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(azdVar)), e12));
        }
    }

    private static Object q(Future future) throws ExecutionException {
        Object obj;
        boolean z9 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z9 = true;
            } catch (Throwable th) {
                if (z9) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void r(StringBuilder sb) {
        String hexString;
        String str = "]";
        try {
            Object objQ = q(this);
            sb.append("SUCCESS, result=[");
            if (objQ == null) {
                hexString = Constants.NULL_VERSION_ID;
            } else if (objQ == this) {
                hexString = "this future";
            } else {
                sb.append(objQ.getClass().getName());
                sb.append("@");
                hexString = Integer.toHexString(System.identityHashCode(objQ));
            }
            sb.append(hexString);
            sb.append("]");
        } catch (CancellationException unused) {
            str = "CANCELLED";
            sb.append(str);
        } catch (RuntimeException e9) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e9.getClass());
            str = " thrown from get()]";
            sb.append(str);
        } catch (ExecutionException e10) {
            sb.append("FAILURE, cause=[");
            sb.append(e10.getCause());
            sb.append(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void s(java.lang.StringBuilder r5) {
        /*
            r4 = this;
            int r0 = r5.length()
            java.lang.String r1 = "PENDING"
            r5.append(r1)
            java.lang.Object r1 = r4.value
            boolean r2 = r1 instanceof com.google.ads.interactivemedia.v3.internal.axz.f
            java.lang.String r3 = "]"
            if (r2 == 0) goto L21
            java.lang.String r2 = ", setFuture=["
            r5.append(r2)
            com.google.ads.interactivemedia.v3.internal.axz$f r1 = (com.google.ads.interactivemedia.v3.internal.axz.f) r1
            com.google.ads.interactivemedia.v3.internal.azd<? extends V> r1 = r1.f20912b
            r4.t(r5, r1)
        L1d:
            r5.append(r3)
            goto L49
        L21:
            java.lang.String r1 = r4.e()     // Catch: java.lang.StackOverflowError -> L2a java.lang.RuntimeException -> L2c
            java.lang.String r1 = com.google.ads.interactivemedia.v3.internal.atp.a(r1)     // Catch: java.lang.StackOverflowError -> L2a java.lang.RuntimeException -> L2c
            goto L3e
        L2a:
            r1 = move-exception
            goto L2d
        L2c:
            r1 = move-exception
        L2d:
            java.lang.Class r1 = r1.getClass()
            r1.toString()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Exception thrown from implementation: "
            java.lang.String r1 = r2.concat(r1)
        L3e:
            if (r1 == 0) goto L49
            java.lang.String r2 = ", info=["
            r5.append(r2)
            r5.append(r1)
            goto L1d
        L49:
            boolean r1 = r4.isDone()
            if (r1 == 0) goto L59
            int r1 = r5.length()
            r5.delete(r0, r1)
            r4.r(r5)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.axz.s(java.lang.StringBuilder):void");
    }

    private final void t(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (RuntimeException e9) {
            e = e9;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        } catch (StackOverflowError e10) {
            e = e10;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    private static void u(axz axzVar) {
        d dVar = null;
        while (true) {
            for (k kVarB = aY.b(axzVar, k.f20919a); kVarB != null; kVarB = kVarB.next) {
                Thread thread = kVarB.thread;
                if (thread != null) {
                    kVarB.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            axzVar.h();
            d dVar2 = dVar;
            d dVarA = aY.a(axzVar, d.f20903a);
            d dVar3 = dVar2;
            while (dVarA != null) {
                d dVar4 = dVarA.next;
                dVarA.next = dVar3;
                dVar3 = dVarA;
                dVarA = dVar4;
            }
            while (dVar3 != null) {
                dVar = dVar3.next;
                Runnable runnable = dVar3.f20904b;
                runnable.getClass();
                if (runnable instanceof f) {
                    f fVar = (f) runnable;
                    axzVar = fVar.f20911a;
                    if (axzVar.value == fVar) {
                        if (aY.f(axzVar, fVar, p(fVar.f20912b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = dVar3.f20905c;
                    executor.getClass();
                    v(runnable, executor);
                }
                dVar3 = dVar;
            }
            return;
        }
    }

    private static void v(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e9) {
            aX.logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e9);
        }
    }

    private final void w(k kVar) {
        kVar.thread = null;
        while (true) {
            k kVar2 = this.waiters;
            if (kVar2 != k.f20919a) {
                k kVar3 = null;
                while (kVar2 != null) {
                    k kVar4 = kVar2.next;
                    if (kVar2.thread != null) {
                        kVar3 = kVar2;
                    } else if (kVar3 != null) {
                        kVar3.next = kVar4;
                        if (kVar3.thread == null) {
                            break;
                        }
                    } else if (!aY.g(this, kVar2, kVar4)) {
                        break;
                    }
                    kVar2 = kVar4;
                }
                return;
            }
            return;
        }
    }

    private static final Object x(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            Throwable th = ((b) obj).f20900d;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f20902b);
        }
        if (obj == f20896d) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        b bVar;
        Object obj = this.value;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        if (f20895a) {
            bVar = new b(z9, new CancellationException("Future.cancel() was called."));
        } else {
            bVar = z9 ? b.f20897a : b.f20898b;
            bVar.getClass();
        }
        boolean z10 = false;
        axz<V> axzVar = this;
        while (true) {
            if (aY.f(axzVar, obj, bVar)) {
                if (z9) {
                    axzVar.i();
                }
                u(axzVar);
                if (!(obj instanceof f)) {
                    break;
                }
                azd<? extends V> azdVar = ((f) obj).f20912b;
                if (!(azdVar instanceof h)) {
                    azdVar.cancel(z9);
                    break;
                }
                axzVar = (axz) azdVar;
                obj = axzVar.value;
                if (!(obj == null) && !(obj instanceof f)) {
                    break;
                }
                z10 = true;
            } else {
                obj = axzVar.value;
                if (!(obj instanceof f)) {
                    return z10;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String e() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azm
    public final Throwable f() {
        if (!(this instanceof h)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof c) {
            return ((c) obj).f20902b;
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.azd
    public final void g(Runnable runnable, Executor executor) {
        d dVar;
        atp.l(runnable, "Runnable was null.");
        atp.l(executor, "Executor was null.");
        if (!isDone() && (dVar = this.listeners) != d.f20903a) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.next = dVar;
                if (aY.e(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.listeners;
                }
            } while (dVar != d.f20903a);
        }
        v(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof f))) {
            return x(obj2);
        }
        k kVar = this.waiters;
        if (kVar != k.f20919a) {
            k kVar2 = new k();
            do {
                kVar2.a(kVar);
                if (aY.g(this, kVar, kVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            w(kVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof f))));
                    return x(obj);
                }
                kVar = this.waiters;
            } while (kVar != k.f20919a);
        }
        Object obj3 = this.value;
        obj3.getClass();
        return x(obj3);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j9, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j9);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.value;
        boolean z9 = true;
        if ((obj != null) && (!(obj instanceof f))) {
            return x(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            k kVar = this.waiters;
            if (kVar != k.f20919a) {
                k kVar2 = new k();
                do {
                    kVar2.a(kVar);
                    if (aY.g(this, kVar, kVar2)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                w(kVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.value;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return x(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        w(kVar2);
                    } else {
                        kVar = this.waiters;
                    }
                } while (kVar != k.f20919a);
            }
            Object obj3 = this.value;
            obj3.getClass();
            return x(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.value;
            if ((obj4 != null) && (!(obj4 instanceof f))) {
                return x(obj4);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String strConcat = "Waited " + j9 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String strConcat2 = strConcat.concat(" (plus ");
            long j10 = -nanos;
            long jConvert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
            long nanos2 = j10 - timeUnit.toNanos(jConvert);
            if (jConvert != 0 && nanos2 <= 1000) {
                z9 = false;
            }
            if (jConvert > 0) {
                String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                if (z9) {
                    strConcat3 = strConcat3.concat(",");
                }
                strConcat2 = String.valueOf(strConcat3).concat(" ");
            }
            if (z9) {
                strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
            }
            strConcat = String.valueOf(strConcat2).concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(String.valueOf(strConcat).concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(strConcat + " for " + string);
    }

    public void h() {
    }

    public void i() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof f)) & (this.value != null);
    }

    public boolean j(Object obj) {
        if (obj == null) {
            obj = f20896d;
        }
        if (!aY.f(this, null, obj)) {
            return false;
        }
        u(this);
        return true;
    }

    public final boolean k() {
        Object obj = this.value;
        return (obj instanceof b) && ((b) obj).f20899c;
    }

    public final void o(Throwable th) {
        atp.k(th);
        if (aY.f(this, null, new c(th))) {
            u(this);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName().startsWith("com.google.common.util.concurrent.") ? getClass().getSimpleName() : getClass().getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            r(sb);
        } else {
            s(sb);
        }
        sb.append("]");
        return sb.toString();
    }
}
