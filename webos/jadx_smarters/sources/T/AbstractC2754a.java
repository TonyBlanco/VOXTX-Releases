package t;

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
import y5.InterfaceFutureC2987b;

/* JADX INFO: renamed from: t.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2754a implements InterfaceFutureC2987b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f50446e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f50447f = Logger.getLogger(AbstractC2754a.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f50448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f50449h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f50450a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile e f50451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile h f50452d;

    /* JADX INFO: renamed from: t.a$b */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(AbstractC2754a abstractC2754a, e eVar, e eVar2);

        public abstract boolean b(AbstractC2754a abstractC2754a, Object obj, Object obj2);

        public abstract boolean c(AbstractC2754a abstractC2754a, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* JADX INFO: renamed from: t.a$c */
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f50453c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f50454d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f50455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f50456b;

        static {
            if (AbstractC2754a.f50446e) {
                f50454d = null;
                f50453c = null;
            } else {
                f50454d = new c(false, null);
                f50453c = new c(true, null);
            }
        }

        public c(boolean z9, Throwable th) {
            this.f50455a = z9;
            this.f50456b = th;
        }
    }

    /* JADX INFO: renamed from: t.a$d */
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f50457b = new d(new C0453a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f50458a;

        /* JADX INFO: renamed from: t.a$d$a, reason: collision with other inner class name */
        public class C0453a extends Throwable {
            public C0453a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            this.f50458a = (Throwable) AbstractC2754a.d(th);
        }
    }

    /* JADX INFO: renamed from: t.a$e */
    public static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f50459d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f50460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f50461b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e f50462c;

        public e(Runnable runnable, Executor executor) {
            this.f50460a = runnable;
            this.f50461b = executor;
        }
    }

    /* JADX INFO: renamed from: t.a$f */
    public static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f50463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f50464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f50465c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f50466d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f50467e;

        public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f50463a = atomicReferenceFieldUpdater;
            this.f50464b = atomicReferenceFieldUpdater2;
            this.f50465c = atomicReferenceFieldUpdater3;
            this.f50466d = atomicReferenceFieldUpdater4;
            this.f50467e = atomicReferenceFieldUpdater5;
        }

        @Override // t.AbstractC2754a.b
        public boolean a(AbstractC2754a abstractC2754a, e eVar, e eVar2) {
            return AbstractC2755b.a(this.f50466d, abstractC2754a, eVar, eVar2);
        }

        @Override // t.AbstractC2754a.b
        public boolean b(AbstractC2754a abstractC2754a, Object obj, Object obj2) {
            return AbstractC2755b.a(this.f50467e, abstractC2754a, obj, obj2);
        }

        @Override // t.AbstractC2754a.b
        public boolean c(AbstractC2754a abstractC2754a, h hVar, h hVar2) {
            return AbstractC2755b.a(this.f50465c, abstractC2754a, hVar, hVar2);
        }

        @Override // t.AbstractC2754a.b
        public void d(h hVar, h hVar2) {
            this.f50464b.lazySet(hVar, hVar2);
        }

        @Override // t.AbstractC2754a.b
        public void e(h hVar, Thread thread) {
            this.f50463a.lazySet(hVar, thread);
        }
    }

    /* JADX INFO: renamed from: t.a$g */
    public static final class g extends b {
        public g() {
            super();
        }

        @Override // t.AbstractC2754a.b
        public boolean a(AbstractC2754a abstractC2754a, e eVar, e eVar2) {
            synchronized (abstractC2754a) {
                try {
                    if (abstractC2754a.f50451c != eVar) {
                        return false;
                    }
                    abstractC2754a.f50451c = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // t.AbstractC2754a.b
        public boolean b(AbstractC2754a abstractC2754a, Object obj, Object obj2) {
            synchronized (abstractC2754a) {
                try {
                    if (abstractC2754a.f50450a != obj) {
                        return false;
                    }
                    abstractC2754a.f50450a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // t.AbstractC2754a.b
        public boolean c(AbstractC2754a abstractC2754a, h hVar, h hVar2) {
            synchronized (abstractC2754a) {
                try {
                    if (abstractC2754a.f50452d != hVar) {
                        return false;
                    }
                    abstractC2754a.f50452d = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // t.AbstractC2754a.b
        public void d(h hVar, h hVar2) {
            hVar.f50470b = hVar2;
        }

        @Override // t.AbstractC2754a.b
        public void e(h hVar, Thread thread) {
            hVar.f50469a = thread;
        }
    }

    /* JADX INFO: renamed from: t.a$h */
    public static final class h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f50468c = new h(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Thread f50469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile h f50470b;

        public h() {
            AbstractC2754a.f50448g.e(this, Thread.currentThread());
        }

        public h(boolean z9) {
        }

        public void a(h hVar) {
            AbstractC2754a.f50448g.d(this, hVar);
        }

        public void b() {
            Thread thread = this.f50469a;
            if (thread != null) {
                this.f50469a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2754a.class, h.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2754a.class, e.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2754a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f50448g = gVar;
        if (th != null) {
            f50447f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f50449h = new Object();
    }

    private void a(StringBuilder sb) {
        String str = "]";
        try {
            Object objJ = j(this);
            sb.append("SUCCESS, result=[");
            sb.append(s(objJ));
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

    private static CancellationException c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static Object d(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void f(AbstractC2754a abstractC2754a) {
        abstractC2754a.o();
        abstractC2754a.b();
        e eVarE = abstractC2754a.e(null);
        while (eVarE != null) {
            e eVar = eVarE.f50462c;
            h(eVarE.f50460a, eVarE.f50461b);
            eVarE = eVar;
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e9) {
            f50447f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e9);
        }
    }

    private Object i(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f50456b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f50458a);
        }
        if (obj == f50449h) {
            return null;
        }
        return obj;
    }

    public static Object j(Future future) {
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

    private void o() {
        h hVar;
        do {
            hVar = this.f50452d;
        } while (!f50448g.c(this, hVar, h.f50468c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f50470b;
        }
    }

    @Override // y5.InterfaceFutureC2987b
    public final void addListener(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        e eVar = this.f50451c;
        if (eVar != e.f50459d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f50462c = eVar;
                if (f50448g.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f50451c;
                }
            } while (eVar != e.f50459d);
        }
        h(runnable, executor);
    }

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        Object obj = this.f50450a;
        if (obj == null) {
            if (f50448g.b(this, obj, f50446e ? new c(z9, new CancellationException("Future.cancel() was called.")) : z9 ? c.f50453c : c.f50454d)) {
                if (z9) {
                    l();
                }
                f(this);
                return true;
            }
        }
        return false;
    }

    public final e e(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f50451c;
        } while (!f50448g.a(this, eVar2, e.f50459d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f50462c;
            eVar4.f50462c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f50450a;
        if (obj2 != null) {
            return i(obj2);
        }
        h hVar = this.f50452d;
        if (hVar != h.f50468c) {
            h hVar2 = new h();
            do {
                hVar2.a(hVar);
                if (f50448g.c(this, hVar, hVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            p(hVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f50450a;
                    } while (!(obj != null));
                    return i(obj);
                }
                hVar = this.f50452d;
            } while (hVar != h.f50468c);
        }
        return i(this.f50450a);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j9, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j9);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f50450a;
        if (obj != null) {
            return i(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f50452d;
            if (hVar != h.f50468c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f50448g.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                p(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f50450a;
                            if (obj2 != null) {
                                return i(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        p(hVar2);
                    } else {
                        hVar = this.f50452d;
                    }
                } while (hVar != h.f50468c);
            }
            return i(this.f50450a);
        }
        while (nanos > 0) {
            Object obj3 = this.f50450a;
            if (obj3 != null) {
                return i(obj3);
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
        String str = "Waited " + j9 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j10 = -nanos;
            long jConvert = timeUnit.convert(j10, TimeUnit.NANOSECONDS);
            long nanos2 = j10 - timeUnit.toNanos(jConvert);
            boolean z9 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z9) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z9) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f50450a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f50450a != null;
    }

    public void l() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String n() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void p(h hVar) {
        hVar.f50469a = null;
        while (true) {
            h hVar2 = this.f50452d;
            if (hVar2 == h.f50468c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f50470b;
                if (hVar2.f50469a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f50470b = hVar4;
                    if (hVar3.f50469a == null) {
                        break;
                    }
                } else if (!f50448g.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    public boolean q(Object obj) {
        if (obj == null) {
            obj = f50449h;
        }
        if (!f50448g.b(this, null, obj)) {
            return false;
        }
        f(this);
        return true;
    }

    public boolean r(Throwable th) {
        if (!f50448g.b(this, null, new d((Throwable) d(th)))) {
            return false;
        }
        f(this);
        return true;
    }

    public final String s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public final boolean t() {
        Object obj = this.f50450a;
        return (obj instanceof c) && ((c) obj).f50455a;
    }

    public String toString() {
        String strN;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (!isCancelled()) {
            if (isDone()) {
                a(sb);
            } else {
                try {
                    strN = n();
                } catch (RuntimeException e9) {
                    strN = "Exception thrown from implementation: " + e9.getClass();
                }
                if (strN == null || strN.isEmpty()) {
                    str = isDone() ? "CANCELLED" : "PENDING";
                    a(sb);
                } else {
                    sb.append("PENDING, info=[");
                    sb.append(strN);
                    sb.append("]");
                }
            }
            sb.append("]");
            return sb.toString();
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }
}
