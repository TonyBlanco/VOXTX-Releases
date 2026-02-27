package y5;

import com.amazonaws.services.s3.internal.Constants;
import com.google.ads.interactivemedia.v3.internal.F;
import j$.util.Objects;
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
import r5.m;
import r5.q;
import r5.s;
import sun.misc.Unsafe;
import t.AbstractC2755b;
import z5.AbstractC3057a;

/* JADX INFO: renamed from: y5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2986a extends AbstractC3057a implements InterfaceFutureC2987b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f52143e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f52144f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f52145g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f52146h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f52147a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile e f52148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile j f52149d;

    /* JADX INFO: renamed from: y5.a$b */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(AbstractC2986a abstractC2986a, e eVar, e eVar2);

        public abstract boolean b(AbstractC2986a abstractC2986a, Object obj, Object obj2);

        public abstract boolean c(AbstractC2986a abstractC2986a, j jVar, j jVar2);

        public abstract e d(AbstractC2986a abstractC2986a, e eVar);

        public abstract j e(AbstractC2986a abstractC2986a, j jVar);

        public abstract void f(j jVar, j jVar2);

        public abstract void g(j jVar, Thread thread);
    }

    /* JADX INFO: renamed from: y5.a$c */
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f52150c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f52151d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f52152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f52153b;

        static {
            if (AbstractC2986a.f52143e) {
                f52151d = null;
                f52150c = null;
            } else {
                f52151d = new c(false, null);
                f52150c = new c(true, null);
            }
        }

        public c(boolean z9, Throwable th) {
            this.f52152a = z9;
            this.f52153b = th;
        }
    }

    /* JADX INFO: renamed from: y5.a$d */
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f52154b = new d(new C0487a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f52155a;

        /* JADX INFO: renamed from: y5.a$d$a, reason: collision with other inner class name */
        public class C0487a extends Throwable {
            public C0487a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            this.f52155a = (Throwable) m.k(th);
        }
    }

    /* JADX INFO: renamed from: y5.a$e */
    public static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f52156d = new e();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f52157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f52158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e f52159c;

        public e() {
            this.f52157a = null;
            this.f52158b = null;
        }

        public e(Runnable runnable, Executor executor) {
            this.f52157a = runnable;
            this.f52158b = executor;
        }
    }

    /* JADX INFO: renamed from: y5.a$f */
    public static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f52160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f52161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f52162c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f52163d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f52164e;

        public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f52160a = atomicReferenceFieldUpdater;
            this.f52161b = atomicReferenceFieldUpdater2;
            this.f52162c = atomicReferenceFieldUpdater3;
            this.f52163d = atomicReferenceFieldUpdater4;
            this.f52164e = atomicReferenceFieldUpdater5;
        }

        @Override // y5.AbstractC2986a.b
        public boolean a(AbstractC2986a abstractC2986a, e eVar, e eVar2) {
            return AbstractC2755b.a(this.f52163d, abstractC2986a, eVar, eVar2);
        }

        @Override // y5.AbstractC2986a.b
        public boolean b(AbstractC2986a abstractC2986a, Object obj, Object obj2) {
            return AbstractC2755b.a(this.f52164e, abstractC2986a, obj, obj2);
        }

        @Override // y5.AbstractC2986a.b
        public boolean c(AbstractC2986a abstractC2986a, j jVar, j jVar2) {
            return AbstractC2755b.a(this.f52162c, abstractC2986a, jVar, jVar2);
        }

        @Override // y5.AbstractC2986a.b
        public e d(AbstractC2986a abstractC2986a, e eVar) {
            return (e) this.f52163d.getAndSet(abstractC2986a, eVar);
        }

        @Override // y5.AbstractC2986a.b
        public j e(AbstractC2986a abstractC2986a, j jVar) {
            return (j) this.f52162c.getAndSet(abstractC2986a, jVar);
        }

        @Override // y5.AbstractC2986a.b
        public void f(j jVar, j jVar2) {
            this.f52161b.lazySet(jVar, jVar2);
        }

        @Override // y5.AbstractC2986a.b
        public void g(j jVar, Thread thread) {
            this.f52160a.lazySet(jVar, thread);
        }
    }

    /* JADX INFO: renamed from: y5.a$g */
    public static final class g extends b {
        public g() {
            super();
        }

        @Override // y5.AbstractC2986a.b
        public boolean a(AbstractC2986a abstractC2986a, e eVar, e eVar2) {
            synchronized (abstractC2986a) {
                try {
                    if (abstractC2986a.f52148c != eVar) {
                        return false;
                    }
                    abstractC2986a.f52148c = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // y5.AbstractC2986a.b
        public boolean b(AbstractC2986a abstractC2986a, Object obj, Object obj2) {
            synchronized (abstractC2986a) {
                try {
                    if (abstractC2986a.f52147a != obj) {
                        return false;
                    }
                    abstractC2986a.f52147a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // y5.AbstractC2986a.b
        public boolean c(AbstractC2986a abstractC2986a, j jVar, j jVar2) {
            synchronized (abstractC2986a) {
                try {
                    if (abstractC2986a.f52149d != jVar) {
                        return false;
                    }
                    abstractC2986a.f52149d = jVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // y5.AbstractC2986a.b
        public e d(AbstractC2986a abstractC2986a, e eVar) {
            e eVar2;
            synchronized (abstractC2986a) {
                try {
                    eVar2 = abstractC2986a.f52148c;
                    if (eVar2 != eVar) {
                        abstractC2986a.f52148c = eVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return eVar2;
        }

        @Override // y5.AbstractC2986a.b
        public j e(AbstractC2986a abstractC2986a, j jVar) {
            j jVar2;
            synchronized (abstractC2986a) {
                try {
                    jVar2 = abstractC2986a.f52149d;
                    if (jVar2 != jVar) {
                        abstractC2986a.f52149d = jVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return jVar2;
        }

        @Override // y5.AbstractC2986a.b
        public void f(j jVar, j jVar2) {
            jVar.f52173b = jVar2;
        }

        @Override // y5.AbstractC2986a.b
        public void g(j jVar, Thread thread) {
            jVar.f52172a = thread;
        }
    }

    /* JADX INFO: renamed from: y5.a$h */
    public static abstract class h extends AbstractC2986a implements InterfaceFutureC2987b {
        @Override // y5.AbstractC2986a, y5.InterfaceFutureC2987b
        public final void addListener(Runnable runnable, Executor executor) {
            super.addListener(runnable, executor);
        }

        @Override // y5.AbstractC2986a, java.util.concurrent.Future
        public final boolean cancel(boolean z9) {
            return super.cancel(z9);
        }

        @Override // y5.AbstractC2986a, java.util.concurrent.Future
        public Object get() {
            return super.get();
        }

        @Override // y5.AbstractC2986a, java.util.concurrent.Future
        public final Object get(long j9, TimeUnit timeUnit) {
            return super.get(j9, timeUnit);
        }

        @Override // y5.AbstractC2986a, java.util.concurrent.Future
        public final boolean isCancelled() {
            return super.isCancelled();
        }

        @Override // y5.AbstractC2986a, java.util.concurrent.Future
        public final boolean isDone() {
            return super.isDone();
        }
    }

    /* JADX INFO: renamed from: y5.a$i */
    public static final class i extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Unsafe f52165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final long f52166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final long f52167c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f52168d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final long f52169e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final long f52170f;

        /* JADX INFO: renamed from: y5.a$i$a, reason: collision with other inner class name */
        public class C0488a implements PrivilegedExceptionAction {
            @Override // java.security.PrivilegedExceptionAction
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Unsafe run() throws IllegalAccessException {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (PrivilegedActionException e9) {
                    throw new RuntimeException("Could not initialize intrinsics", e9.getCause());
                }
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new C0488a());
            }
            try {
                f52167c = unsafe.objectFieldOffset(AbstractC2986a.class.getDeclaredField("d"));
                f52166b = unsafe.objectFieldOffset(AbstractC2986a.class.getDeclaredField("c"));
                f52168d = unsafe.objectFieldOffset(AbstractC2986a.class.getDeclaredField("a"));
                f52169e = unsafe.objectFieldOffset(j.class.getDeclaredField("a"));
                f52170f = unsafe.objectFieldOffset(j.class.getDeclaredField("b"));
                f52165a = unsafe;
            } catch (Exception e10) {
                s.e(e10);
                throw new RuntimeException(e10);
            }
        }

        public i() {
            super();
        }

        @Override // y5.AbstractC2986a.b
        public boolean a(AbstractC2986a abstractC2986a, e eVar, e eVar2) {
            return F.a(f52165a, abstractC2986a, f52166b, eVar, eVar2);
        }

        @Override // y5.AbstractC2986a.b
        public boolean b(AbstractC2986a abstractC2986a, Object obj, Object obj2) {
            return F.a(f52165a, abstractC2986a, f52168d, obj, obj2);
        }

        @Override // y5.AbstractC2986a.b
        public boolean c(AbstractC2986a abstractC2986a, j jVar, j jVar2) {
            return F.a(f52165a, abstractC2986a, f52167c, jVar, jVar2);
        }

        @Override // y5.AbstractC2986a.b
        public e d(AbstractC2986a abstractC2986a, e eVar) {
            e eVar2;
            do {
                eVar2 = abstractC2986a.f52148c;
                if (eVar == eVar2) {
                    return eVar2;
                }
            } while (!a(abstractC2986a, eVar2, eVar));
            return eVar2;
        }

        @Override // y5.AbstractC2986a.b
        public j e(AbstractC2986a abstractC2986a, j jVar) {
            j jVar2;
            do {
                jVar2 = abstractC2986a.f52149d;
                if (jVar == jVar2) {
                    return jVar2;
                }
            } while (!c(abstractC2986a, jVar2, jVar));
            return jVar2;
        }

        @Override // y5.AbstractC2986a.b
        public void f(j jVar, j jVar2) {
            f52165a.putObject(jVar, f52170f, jVar2);
        }

        @Override // y5.AbstractC2986a.b
        public void g(j jVar, Thread thread) {
            f52165a.putObject(jVar, f52169e, thread);
        }
    }

    /* JADX INFO: renamed from: y5.a$j */
    public static final class j {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f52171c = new j(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Thread f52172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile j f52173b;

        public j() {
            AbstractC2986a.f52145g.g(this, Thread.currentThread());
        }

        public j(boolean z9) {
        }

        public void a(j jVar) {
            AbstractC2986a.f52145g.f(this, jVar);
        }

        public void b() {
            Thread thread = this.f52172a;
            if (thread != null) {
                this.f52172a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.logging.Logger] */
    /* JADX WARN: Type inference failed for: r3v2, types: [y5.a$a] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v5 */
    static {
        boolean z9;
        b gVar;
        try {
            z9 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z9 = false;
        }
        f52143e = z9;
        f52144f = Logger.getLogger(AbstractC2986a.class.getName());
        ?? r32 = 0;
        r32 = 0;
        try {
            gVar = new i();
            th = null;
        } catch (Throwable th) {
            th = th;
            try {
                gVar = new f(AtomicReferenceFieldUpdater.newUpdater(j.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(j.class, j.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2986a.class, j.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2986a.class, e.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2986a.class, Object.class, "a"));
            } catch (Throwable th2) {
                gVar = new g();
                r32 = th2;
            }
        }
        f52145g = gVar;
        if (r32 != 0) {
            ?? r02 = f52144f;
            Level level = Level.SEVERE;
            r02.log(level, "UnsafeAtomicHelper is broken!", th);
            r02.log(level, "SafeAtomicHelper is broken!", r32);
        }
        f52146h = new Object();
    }

    public static CancellationException l(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static void n(AbstractC2986a abstractC2986a) {
        abstractC2986a.t();
        abstractC2986a.j();
        e eVarM = abstractC2986a.m(null);
        while (eVarM != null) {
            e eVar = eVarM.f52159c;
            Runnable runnable = eVarM.f52157a;
            Objects.requireNonNull(runnable);
            Executor executor = eVarM.f52158b;
            Objects.requireNonNull(executor);
            o(runnable, executor);
            eVarM = eVar;
        }
    }

    public static void o(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e9) {
            Logger logger = f52144f;
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 57 + strValueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(strValueOf);
            sb.append(" with executor ");
            sb.append(strValueOf2);
            logger.log(level, sb.toString(), (Throwable) e9);
        }
    }

    private static Object q(Future future) {
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

    @Override // y5.InterfaceFutureC2987b
    public void addListener(Runnable runnable, Executor executor) {
        e eVar;
        m.l(runnable, "Runnable was null.");
        m.l(executor, "Executor was null.");
        if (!isDone() && (eVar = this.f52148c) != e.f52156d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f52159c = eVar;
                if (f52145g.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f52148c;
                }
            } while (eVar != e.f52156d);
        }
        o(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z9) {
        c cVar;
        Object obj = this.f52147a;
        if (obj == null) {
            if (f52143e) {
                cVar = new c(z9, new CancellationException("Future.cancel() was called."));
            } else {
                cVar = z9 ? c.f52150c : c.f52151d;
                Objects.requireNonNull(cVar);
            }
            if (f52145g.b(this, obj, cVar)) {
                if (z9) {
                    r();
                }
                n(this);
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
        Object obj2 = this.f52147a;
        if (obj2 != null) {
            return p(obj2);
        }
        j jVar = this.f52149d;
        if (jVar != j.f52171c) {
            j jVar2 = new j();
            do {
                jVar2.a(jVar);
                if (f52145g.c(this, jVar, jVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            u(jVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f52147a;
                    } while (!(obj != null));
                    return p(obj);
                }
                jVar = this.f52149d;
            } while (jVar != j.f52171c);
        }
        Object obj3 = this.f52147a;
        Objects.requireNonNull(obj3);
        return p(obj3);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j9, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j9);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f52147a;
        if (obj != null) {
            return p(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            j jVar = this.f52149d;
            if (jVar != j.f52171c) {
                j jVar2 = new j();
                do {
                    jVar2.a(jVar);
                    if (f52145g.c(this, jVar, jVar2)) {
                        do {
                            AbstractC2989d.a(this, nanos);
                            if (Thread.interrupted()) {
                                u(jVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f52147a;
                            if (obj2 != null) {
                                return p(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        u(jVar2);
                    } else {
                        jVar = this.f52149d;
                    }
                } while (jVar != j.f52171c);
            }
            Object obj3 = this.f52147a;
            Objects.requireNonNull(obj3);
            return p(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f52147a;
            if (obj4 != null) {
                return p(obj4);
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
        String lowerCase2 = timeUnit.toString().toLowerCase(locale);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase2).length() + 28);
        sb.append("Waited ");
        sb.append(j9);
        sb.append(" ");
        sb.append(lowerCase2);
        String string3 = sb.toString();
        if (nanos + 1000 < 0) {
            String strConcat = String.valueOf(string3).concat(" (plus ");
            long j10 = -nanos;
            long jConvert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
            long nanos2 = j10 - timeUnit.toNanos(jConvert);
            boolean z9 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strValueOf = String.valueOf(strConcat);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 21 + String.valueOf(lowerCase).length());
                sb2.append(strValueOf);
                sb2.append(jConvert);
                sb2.append(" ");
                sb2.append(lowerCase);
                String string4 = sb2.toString();
                if (z9) {
                    string4 = String.valueOf(string4).concat(",");
                }
                strConcat = String.valueOf(string4).concat(" ");
            }
            if (z9) {
                String strValueOf2 = String.valueOf(strConcat);
                StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 33);
                sb3.append(strValueOf2);
                sb3.append(nanos2);
                sb3.append(" nanoseconds ");
                strConcat = sb3.toString();
            }
            string3 = String.valueOf(strConcat).concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(String.valueOf(string3).concat(" but future completed as timeout expired"));
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(string3).length() + 5 + String.valueOf(string).length());
        sb4.append(string3);
        sb4.append(" for ");
        sb4.append(string);
        throw new TimeoutException(sb4.toString());
    }

    public final void h(StringBuilder sb) {
        String str = "]";
        try {
            Object objQ = q(this);
            sb.append("SUCCESS, result=[");
            k(sb, objQ);
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

    public final void i(StringBuilder sb) {
        String string;
        int length = sb.length();
        sb.append("PENDING");
        try {
            string = q.a(s());
        } catch (RuntimeException | StackOverflowError e9) {
            String strValueOf = String.valueOf(e9.getClass());
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 38);
            sb2.append("Exception thrown from implementation: ");
            sb2.append(strValueOf);
            string = sb2.toString();
        }
        if (string != null) {
            sb.append(", info=[");
            sb.append(string);
            sb.append("]");
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            h(sb);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f52147a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f52147a != null;
    }

    public void j() {
    }

    public final void k(StringBuilder sb, Object obj) {
        String hexString;
        if (obj == null) {
            hexString = Constants.NULL_VERSION_ID;
        } else if (obj == this) {
            hexString = "this future";
        } else {
            sb.append(obj.getClass().getName());
            sb.append("@");
            hexString = Integer.toHexString(System.identityHashCode(obj));
        }
        sb.append(hexString);
    }

    public final e m(e eVar) {
        e eVar2 = eVar;
        e eVarD = f52145g.d(this, e.f52156d);
        while (eVarD != null) {
            e eVar3 = eVarD.f52159c;
            eVarD.f52159c = eVar2;
            eVar2 = eVarD;
            eVarD = eVar3;
        }
        return eVar2;
    }

    public final Object p(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw l("Task was cancelled.", ((c) obj).f52153b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f52155a);
        }
        return obj == f52146h ? AbstractC2988c.a() : obj;
    }

    public void r() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String s() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        long delay = ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS);
        StringBuilder sb = new StringBuilder(41);
        sb.append("remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    public final void t() {
        for (j jVarE = f52145g.e(this, j.f52171c); jVarE != null; jVarE = jVarE.f52173b) {
            jVarE.b();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName().startsWith("com.google.common.util.concurrent.") ? getClass().getSimpleName() : getClass().getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            h(sb);
        } else {
            i(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    public final void u(j jVar) {
        jVar.f52172a = null;
        while (true) {
            j jVar2 = this.f52149d;
            if (jVar2 == j.f52171c) {
                return;
            }
            j jVar3 = null;
            while (jVar2 != null) {
                j jVar4 = jVar2.f52173b;
                if (jVar2.f52172a != null) {
                    jVar3 = jVar2;
                } else if (jVar3 != null) {
                    jVar3.f52173b = jVar4;
                    if (jVar3.f52172a == null) {
                        break;
                    }
                } else if (!f52145g.c(this, jVar2, jVar4)) {
                    break;
                }
                jVar2 = jVar4;
            }
            return;
        }
    }

    public boolean v(Object obj) {
        if (obj == null) {
            obj = f52146h;
        }
        if (!f52145g.b(this, null, obj)) {
            return false;
        }
        n(this);
        return true;
    }

    public boolean w(Throwable th) {
        if (!f52145g.b(this, null, new d((Throwable) m.k(th)))) {
            return false;
        }
        n(this);
        return true;
    }
}
