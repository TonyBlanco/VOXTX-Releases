package t;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import y5.InterfaceFutureC2987b;

/* JADX INFO: renamed from: t.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2756c {

    /* JADX INFO: renamed from: t.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f50471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d f50472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C2757d f50473c = C2757d.u();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f50474d;

        public void a() {
            this.f50471a = null;
            this.f50472b = null;
            this.f50473c.q(null);
        }

        public boolean b(Object obj) {
            this.f50474d = true;
            d dVar = this.f50472b;
            boolean z9 = dVar != null && dVar.b(obj);
            if (z9) {
                d();
            }
            return z9;
        }

        public boolean c() {
            this.f50474d = true;
            d dVar = this.f50472b;
            boolean z9 = dVar != null && dVar.a(true);
            if (z9) {
                d();
            }
            return z9;
        }

        public final void d() {
            this.f50471a = null;
            this.f50472b = null;
            this.f50473c = null;
        }

        public void finalize() {
            C2757d c2757d;
            d dVar = this.f50472b;
            if (dVar != null && !dVar.isDone()) {
                dVar.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f50471a));
            }
            if (this.f50474d || (c2757d = this.f50473c) == null) {
                return;
            }
            c2757d.q(null);
        }
    }

    /* JADX INFO: renamed from: t.c$b */
    public static final class b extends Throwable {
        public b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: t.c$c, reason: collision with other inner class name */
    public interface InterfaceC0454c {
        Object attachCompleter(a aVar);
    }

    /* JADX INFO: renamed from: t.c$d */
    public static final class d implements InterfaceFutureC2987b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakReference f50475a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AbstractC2754a f50476c = new a();

        /* JADX INFO: renamed from: t.c$d$a */
        public class a extends AbstractC2754a {
            public a() {
            }

            @Override // t.AbstractC2754a
            public String n() {
                a aVar = (a) d.this.f50475a.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f50471a + "]";
            }
        }

        public d(a aVar) {
            this.f50475a = new WeakReference(aVar);
        }

        public boolean a(boolean z9) {
            return this.f50476c.cancel(z9);
        }

        @Override // y5.InterfaceFutureC2987b
        public void addListener(Runnable runnable, Executor executor) {
            this.f50476c.addListener(runnable, executor);
        }

        public boolean b(Object obj) {
            return this.f50476c.q(obj);
        }

        public boolean c(Throwable th) {
            return this.f50476c.r(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z9) {
            a aVar = (a) this.f50475a.get();
            boolean zCancel = this.f50476c.cancel(z9);
            if (zCancel && aVar != null) {
                aVar.a();
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f50476c.get();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j9, TimeUnit timeUnit) {
            return this.f50476c.get(j9, timeUnit);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f50476c.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f50476c.isDone();
        }

        public String toString() {
            return this.f50476c.toString();
        }
    }

    public static InterfaceFutureC2987b a(InterfaceC0454c interfaceC0454c) {
        a aVar = new a();
        d dVar = new d(aVar);
        aVar.f50472b = dVar;
        aVar.f50471a = interfaceC0454c.getClass();
        try {
            Object objAttachCompleter = interfaceC0454c.attachCompleter(aVar);
            if (objAttachCompleter != null) {
                aVar.f50471a = objAttachCompleter;
            }
        } catch (Exception e9) {
            dVar.c(e9);
        }
        return dVar;
    }
}
