package b1;

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
import t.AbstractC2755b;
import y5.InterfaceFutureC2987b;

/* JADX INFO: renamed from: b1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1197a implements InterfaceFutureC2987b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f17438e = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f17439f = Logger.getLogger(AbstractC1197a.class.getName());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f17440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f17441h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Object f17442a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile e f17443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile i f17444d;

    /* JADX INFO: renamed from: b1.a$b */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(AbstractC1197a abstractC1197a, e eVar, e eVar2);

        public abstract boolean b(AbstractC1197a abstractC1197a, Object obj, Object obj2);

        public abstract boolean c(AbstractC1197a abstractC1197a, i iVar, i iVar2);

        public abstract void d(i iVar, i iVar2);

        public abstract void e(i iVar, Thread thread);
    }

    /* JADX INFO: renamed from: b1.a$c */
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f17445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f17446d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f17447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f17448b;

        static {
            if (AbstractC1197a.f17438e) {
                f17446d = null;
                f17445c = null;
            } else {
                f17446d = new c(false, null);
                f17445c = new c(true, null);
            }
        }

        public c(boolean z9, Throwable th) {
            this.f17447a = z9;
            this.f17448b = th;
        }
    }

    /* JADX INFO: renamed from: b1.a$d */
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f17449b = new d(new C0209a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f17450a;

        /* JADX INFO: renamed from: b1.a$d$a, reason: collision with other inner class name */
        public class C0209a extends Throwable {
            public C0209a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            this.f17450a = (Throwable) AbstractC1197a.d(th);
        }
    }

    /* JADX INFO: renamed from: b1.a$e */
    public static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f17451d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f17452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f17453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e f17454c;

        public e(Runnable runnable, Executor executor) {
            this.f17452a = runnable;
            this.f17453b = executor;
        }
    }

    /* JADX INFO: renamed from: b1.a$f */
    public static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f17455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f17456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f17457c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f17458d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f17459e;

        public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f17455a = atomicReferenceFieldUpdater;
            this.f17456b = atomicReferenceFieldUpdater2;
            this.f17457c = atomicReferenceFieldUpdater3;
            this.f17458d = atomicReferenceFieldUpdater4;
            this.f17459e = atomicReferenceFieldUpdater5;
        }

        @Override // b1.AbstractC1197a.b
        public boolean a(AbstractC1197a abstractC1197a, e eVar, e eVar2) {
            return AbstractC2755b.a(this.f17458d, abstractC1197a, eVar, eVar2);
        }

        @Override // b1.AbstractC1197a.b
        public boolean b(AbstractC1197a abstractC1197a, Object obj, Object obj2) {
            return AbstractC2755b.a(this.f17459e, abstractC1197a, obj, obj2);
        }

        @Override // b1.AbstractC1197a.b
        public boolean c(AbstractC1197a abstractC1197a, i iVar, i iVar2) {
            return AbstractC2755b.a(this.f17457c, abstractC1197a, iVar, iVar2);
        }

        @Override // b1.AbstractC1197a.b
        public void d(i iVar, i iVar2) {
            this.f17456b.lazySet(iVar, iVar2);
        }

        @Override // b1.AbstractC1197a.b
        public void e(i iVar, Thread thread) {
            this.f17455a.lazySet(iVar, thread);
        }
    }

    /* JADX INFO: renamed from: b1.a$g */
    public static final class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC1197a f17460a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceFutureC2987b f17461c;

        public g(AbstractC1197a abstractC1197a, InterfaceFutureC2987b interfaceFutureC2987b) {
            this.f17460a = abstractC1197a;
            this.f17461c = interfaceFutureC2987b;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f17460a.f17442a != this) {
                return;
            }
            if (AbstractC1197a.f17440g.b(this.f17460a, this, AbstractC1197a.j(this.f17461c))) {
                AbstractC1197a.f(this.f17460a);
            }
        }
    }

    /* JADX INFO: renamed from: b1.a$h */
    public static final class h extends b {
        public h() {
            super();
        }

        @Override // b1.AbstractC1197a.b
        public boolean a(AbstractC1197a abstractC1197a, e eVar, e eVar2) {
            synchronized (abstractC1197a) {
                try {
                    if (abstractC1197a.f17443c != eVar) {
                        return false;
                    }
                    abstractC1197a.f17443c = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // b1.AbstractC1197a.b
        public boolean b(AbstractC1197a abstractC1197a, Object obj, Object obj2) {
            synchronized (abstractC1197a) {
                try {
                    if (abstractC1197a.f17442a != obj) {
                        return false;
                    }
                    abstractC1197a.f17442a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // b1.AbstractC1197a.b
        public boolean c(AbstractC1197a abstractC1197a, i iVar, i iVar2) {
            synchronized (abstractC1197a) {
                try {
                    if (abstractC1197a.f17444d != iVar) {
                        return false;
                    }
                    abstractC1197a.f17444d = iVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // b1.AbstractC1197a.b
        public void d(i iVar, i iVar2) {
            iVar.f17464b = iVar2;
        }

        @Override // b1.AbstractC1197a.b
        public void e(i iVar, Thread thread) {
            iVar.f17463a = thread;
        }
    }

    /* JADX INFO: renamed from: b1.a$i */
    public static final class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f17462c = new i(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Thread f17463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile i f17464b;

        public i() {
            AbstractC1197a.f17440g.e(this, Thread.currentThread());
        }

        public i(boolean z9) {
        }

        public void a(i iVar) {
            AbstractC1197a.f17440g.d(this, iVar);
        }

        public void b() {
            Thread thread = this.f17463a;
            if (thread != null) {
                this.f17463a = null;
                LockSupport.unpark(thread);
            }
        }
    }

    static {
        b hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1197a.class, i.class, "d"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1197a.class, e.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1197a.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        f17440g = hVar;
        if (th != null) {
            f17439f.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f17441h = new Object();
    }

    private void a(StringBuilder sb) {
        String str = "]";
        try {
            Object objK = k(this);
            sb.append("SUCCESS, result=[");
            sb.append(s(objK));
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

    public static void f(AbstractC1197a abstractC1197a) {
        e eVar = null;
        while (true) {
            abstractC1197a.n();
            abstractC1197a.b();
            e eVarE = abstractC1197a.e(eVar);
            while (eVarE != null) {
                eVar = eVarE.f17454c;
                Runnable runnable = eVarE.f17452a;
                if (runnable instanceof g) {
                    g gVar = (g) runnable;
                    abstractC1197a = gVar.f17460a;
                    if (abstractC1197a.f17442a == gVar) {
                        if (f17440g.b(abstractC1197a, gVar, j(gVar.f17461c))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    h(runnable, eVarE.f17453b);
                }
                eVarE = eVar;
            }
            return;
        }
    }

    private static void h(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e9) {
            f17439f.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e9);
        }
    }

    private Object i(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f17448b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f17450a);
        }
        if (obj == f17441h) {
            return null;
        }
        return obj;
    }

    public static Object j(InterfaceFutureC2987b interfaceFutureC2987b) {
        if (interfaceFutureC2987b instanceof AbstractC1197a) {
            Object obj = ((AbstractC1197a) interfaceFutureC2987b).f17442a;
            if (!(obj instanceof c)) {
                return obj;
            }
            c cVar = (c) obj;
            return cVar.f17447a ? cVar.f17448b != null ? new c(false, cVar.f17448b) : c.f17446d : obj;
        }
        boolean zIsCancelled = interfaceFutureC2987b.isCancelled();
        if ((!f17438e) && zIsCancelled) {
            return c.f17446d;
        }
        try {
            Object objK = k(interfaceFutureC2987b);
            return objK == null ? f17441h : objK;
        } catch (CancellationException e9) {
            if (zIsCancelled) {
                return new c(false, e9);
            }
            return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC2987b, e9));
        } catch (ExecutionException e10) {
            return new d(e10.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    private static Object k(Future future) {
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

    private void n() {
        i iVar;
        do {
            iVar = this.f17444d;
        } while (!f17440g.c(this, iVar, i.f17462c));
        while (iVar != null) {
            iVar.b();
            iVar = iVar.f17464b;
        }
    }

    private String s(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    @Override // y5.InterfaceFutureC2987b
    public final void addListener(Runnable runnable, Executor executor) {
        d(runnable);
        d(executor);
        e eVar = this.f17443c;
        if (eVar != e.f17451d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f17454c = eVar;
                if (f17440g.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f17443c;
                }
            } while (eVar != e.f17451d);
        }
        h(runnable, executor);
    }

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        Object obj = this.f17442a;
        if (!(obj == null) && !(obj instanceof g)) {
            return false;
        }
        c cVar = f17438e ? new c(z9, new CancellationException("Future.cancel() was called.")) : z9 ? c.f17445c : c.f17446d;
        boolean z10 = false;
        AbstractC1197a abstractC1197a = this;
        while (true) {
            if (f17440g.b(abstractC1197a, obj, cVar)) {
                if (z9) {
                    abstractC1197a.l();
                }
                f(abstractC1197a);
                if (!(obj instanceof g)) {
                    return true;
                }
                InterfaceFutureC2987b interfaceFutureC2987b = ((g) obj).f17461c;
                if (!(interfaceFutureC2987b instanceof AbstractC1197a)) {
                    interfaceFutureC2987b.cancel(z9);
                    return true;
                }
                abstractC1197a = (AbstractC1197a) interfaceFutureC2987b;
                obj = abstractC1197a.f17442a;
                if (!(obj == null) && !(obj instanceof g)) {
                    return true;
                }
                z10 = true;
            } else {
                obj = abstractC1197a.f17442a;
                if (!(obj instanceof g)) {
                    return z10;
                }
            }
        }
    }

    public final e e(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f17443c;
        } while (!f17440g.a(this, eVar2, e.f17451d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f17454c;
            eVar4.f17454c = eVar3;
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
        Object obj2 = this.f17442a;
        if ((obj2 != null) && (!(obj2 instanceof g))) {
            return i(obj2);
        }
        i iVar = this.f17444d;
        if (iVar != i.f17462c) {
            i iVar2 = new i();
            do {
                iVar2.a(iVar);
                if (f17440g.c(this, iVar, iVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            o(iVar2);
                            throw new InterruptedException();
                        }
                        obj = this.f17442a;
                    } while (!((obj != null) & (!(obj instanceof g))));
                    return i(obj);
                }
                iVar = this.f17444d;
            } while (iVar != i.f17462c);
        }
        return i(this.f17442a);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j9, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j9);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f17442a;
        if ((obj != null) && (!(obj instanceof g))) {
            return i(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            i iVar = this.f17444d;
            if (iVar != i.f17462c) {
                i iVar2 = new i();
                do {
                    iVar2.a(iVar);
                    if (f17440g.c(this, iVar, iVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                o(iVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f17442a;
                            if ((obj2 != null) && (!(obj2 instanceof g))) {
                                return i(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        o(iVar2);
                    } else {
                        iVar = this.f17444d;
                    }
                } while (iVar != i.f17462c);
            }
            return i(this.f17442a);
        }
        while (nanos > 0) {
            Object obj3 = this.f17442a;
            if ((obj3 != null) && (!(obj3 instanceof g))) {
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
        return this.f17442a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof g)) & (this.f17442a != null);
    }

    public void l() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String m() {
        Object obj = this.f17442a;
        if (obj instanceof g) {
            return "setFuture=[" + s(((g) obj).f17461c) + "]";
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void o(i iVar) {
        iVar.f17463a = null;
        while (true) {
            i iVar2 = this.f17444d;
            if (iVar2 == i.f17462c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f17464b;
                if (iVar2.f17463a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f17464b = iVar4;
                    if (iVar3.f17463a == null) {
                        break;
                    }
                } else if (!f17440g.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    public boolean p(Object obj) {
        if (obj == null) {
            obj = f17441h;
        }
        if (!f17440g.b(this, null, obj)) {
            return false;
        }
        f(this);
        return true;
    }

    public boolean q(Throwable th) {
        if (!f17440g.b(this, null, new d((Throwable) d(th)))) {
            return false;
        }
        f(this);
        return true;
    }

    public boolean r(InterfaceFutureC2987b interfaceFutureC2987b) {
        d dVar;
        d(interfaceFutureC2987b);
        Object obj = this.f17442a;
        if (obj == null) {
            if (interfaceFutureC2987b.isDone()) {
                if (!f17440g.b(this, null, j(interfaceFutureC2987b))) {
                    return false;
                }
                f(this);
                return true;
            }
            g gVar = new g(this, interfaceFutureC2987b);
            if (f17440g.b(this, null, gVar)) {
                try {
                    interfaceFutureC2987b.addListener(gVar, EnumC1198b.INSTANCE);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f17449b;
                    }
                    f17440g.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.f17442a;
        }
        if (obj instanceof c) {
            interfaceFutureC2987b.cancel(((c) obj).f17447a);
        }
        return false;
    }

    public String toString() {
        String strM;
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (!isCancelled()) {
            if (isDone()) {
                a(sb);
            } else {
                try {
                    strM = m();
                } catch (RuntimeException e9) {
                    strM = "Exception thrown from implementation: " + e9.getClass();
                }
                if (strM == null || strM.isEmpty()) {
                    str = isDone() ? "CANCELLED" : "PENDING";
                    a(sb);
                } else {
                    sb.append("PENDING, info=[");
                    sb.append(strM);
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
