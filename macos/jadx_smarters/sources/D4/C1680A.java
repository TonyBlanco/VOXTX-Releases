package d4;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import d4.C1701s;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: d4.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1680A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1688e f39627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1705w f39628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f39629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArraySet f39630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f39631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f39632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f39633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f39634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f39635i;

    /* JADX INFO: renamed from: d4.A$a */
    public interface a {
        void invoke(Object obj);
    }

    /* JADX INFO: renamed from: d4.A$b */
    public interface b {
        void a(Object obj, C1701s c1701s);
    }

    /* JADX INFO: renamed from: d4.A$c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f39636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C1701s.b f39637b = new C1701s.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f39638c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f39639d;

        public c(Object obj) {
            this.f39636a = obj;
        }

        public void a(int i9, a aVar) {
            if (this.f39639d) {
                return;
            }
            if (i9 != -1) {
                this.f39637b.a(i9);
            }
            this.f39638c = true;
            aVar.invoke(this.f39636a);
        }

        public void b(b bVar) {
            if (this.f39639d || !this.f39638c) {
                return;
            }
            C1701s c1701sE = this.f39637b.e();
            this.f39637b = new C1701s.b();
            this.f39638c = false;
            bVar.a(this.f39636a, c1701sE);
        }

        public void c(b bVar) {
            this.f39639d = true;
            if (this.f39638c) {
                this.f39638c = false;
                bVar.a(this.f39636a, this.f39637b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f39636a.equals(((c) obj).f39636a);
        }

        public int hashCode() {
            return this.f39636a.hashCode();
        }
    }

    public C1680A(Looper looper, InterfaceC1688e interfaceC1688e, b bVar) {
        this(new CopyOnWriteArraySet(), looper, interfaceC1688e, bVar, true);
    }

    public C1680A(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, InterfaceC1688e interfaceC1688e, b bVar, boolean z9) {
        this.f39627a = interfaceC1688e;
        this.f39630d = copyOnWriteArraySet;
        this.f39629c = bVar;
        this.f39633g = new Object();
        this.f39631e = new ArrayDeque();
        this.f39632f = new ArrayDeque();
        this.f39628b = interfaceC1688e.c(looper, new Handler.Callback() { // from class: d4.y
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f39835a.g(message);
            }
        });
        this.f39635i = z9;
    }

    public static /* synthetic */ void h(CopyOnWriteArraySet copyOnWriteArraySet, int i9, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i9, aVar);
        }
    }

    public void c(Object obj) {
        AbstractC1684a.e(obj);
        synchronized (this.f39633g) {
            try {
                if (this.f39634h) {
                    return;
                }
                this.f39630d.add(new c(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C1680A d(Looper looper, InterfaceC1688e interfaceC1688e, b bVar) {
        return new C1680A(this.f39630d, looper, interfaceC1688e, bVar, this.f39635i);
    }

    public C1680A e(Looper looper, b bVar) {
        return d(looper, this.f39627a, bVar);
    }

    public void f() {
        m();
        if (this.f39632f.isEmpty()) {
            return;
        }
        if (!this.f39628b.b(0)) {
            InterfaceC1705w interfaceC1705w = this.f39628b;
            interfaceC1705w.h(interfaceC1705w.a(0));
        }
        boolean z9 = !this.f39631e.isEmpty();
        this.f39631e.addAll(this.f39632f);
        this.f39632f.clear();
        if (z9) {
            return;
        }
        while (!this.f39631e.isEmpty()) {
            ((Runnable) this.f39631e.peekFirst()).run();
            this.f39631e.removeFirst();
        }
    }

    public final boolean g(Message message) {
        Iterator it = this.f39630d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(this.f39629c);
            if (this.f39628b.b(0)) {
                return true;
            }
        }
        return true;
    }

    public void i(final int i9, final a aVar) {
        m();
        final CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet(this.f39630d);
        this.f39632f.add(new Runnable() { // from class: d4.z
            @Override // java.lang.Runnable
            public final void run() {
                C1680A.h(copyOnWriteArraySet, i9, aVar);
            }
        });
    }

    public void j() {
        m();
        synchronized (this.f39633g) {
            this.f39634h = true;
        }
        Iterator it = this.f39630d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).c(this.f39629c);
        }
        this.f39630d.clear();
    }

    public void k(Object obj) {
        m();
        for (c cVar : this.f39630d) {
            if (cVar.f39636a.equals(obj)) {
                cVar.c(this.f39629c);
                this.f39630d.remove(cVar);
            }
        }
    }

    public void l(int i9, a aVar) {
        i(i9, aVar);
        f();
    }

    public final void m() {
        if (this.f39635i) {
            AbstractC1684a.g(Thread.currentThread() == this.f39628b.f().getThread());
        }
    }
}
