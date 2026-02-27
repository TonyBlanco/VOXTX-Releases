package kotlinx.coroutines.sync;

import G8.AbstractC0589p;
import G8.InterfaceC0566d0;
import G8.InterfaceC0585n;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k8.q;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.internal.AbstractC2162c;
import kotlinx.coroutines.internal.k;
import kotlinx.coroutines.internal.u;
import o8.InterfaceC2372d;
import org.jetbrains.annotations.NotNull;
import p8.AbstractC2512c;
import t.AbstractC2755b;
import w8.l;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements kotlinx.coroutines.sync.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43835a = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_state");

    @NotNull
    volatile /* synthetic */ Object _state;

    public final class a extends b {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final InterfaceC0585n f43836h;

        /* JADX INFO: renamed from: kotlinx.coroutines.sync.c$a$a, reason: collision with other inner class name */
        public static final class C0368a extends m implements l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f43838a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f43839c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0368a(c cVar, a aVar) {
                super(1);
                this.f43838a = cVar;
                this.f43839c = aVar;
            }

            public final void a(Throwable th) {
                this.f43838a.c(this.f43839c.f43841e);
            }

            @Override // w8.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Throwable) obj);
                return q.f43674a;
            }
        }

        public a(Object obj, InterfaceC0585n interfaceC0585n) {
            super(obj);
            this.f43836h = interfaceC0585n;
        }

        @Override // kotlinx.coroutines.sync.c.b
        public boolean B() {
            return A() && this.f43836h.f(q.f43674a, null, new C0368a(c.this, this)) != null;
        }

        @Override // kotlinx.coroutines.internal.m
        public String toString() {
            return "LockCont[" + this.f43841e + ", " + this.f43836h + "] for " + c.this;
        }

        @Override // kotlinx.coroutines.sync.c.b
        public void z() {
            this.f43836h.y(AbstractC0589p.f2355a);
        }
    }

    public abstract class b extends kotlinx.coroutines.internal.m implements InterfaceC0566d0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f43840g = AtomicIntegerFieldUpdater.newUpdater(b.class, "isTaken");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f43841e;

        @NotNull
        private volatile /* synthetic */ int isTaken = 0;

        public b(Object obj) {
            this.f43841e = obj;
        }

        public final boolean A() {
            return f43840g.compareAndSet(this, 0, 1);
        }

        public abstract boolean B();

        @Override // G8.InterfaceC0566d0
        public final void dispose() {
            u();
        }

        public abstract void z();
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.c$c, reason: collision with other inner class name */
    public static final class C0369c extends k {

        @NotNull
        public volatile Object owner;

        public C0369c(Object obj) {
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.internal.m
        public String toString() {
            return "LockedQueue[" + this.owner + ']';
        }
    }

    public static final class d extends AbstractC2162c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C0369c f43843b;

        public d(C0369c c0369c) {
            this.f43843b = c0369c;
        }

        @Override // kotlinx.coroutines.internal.AbstractC2162c
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void d(c cVar, Object obj) {
            AbstractC2755b.a(c.f43835a, cVar, this, obj == null ? kotlinx.coroutines.sync.d.f43851f : this.f43843b);
        }

        @Override // kotlinx.coroutines.internal.AbstractC2162c
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public Object g(c cVar) {
            if (this.f43843b.z()) {
                return null;
            }
            return kotlinx.coroutines.sync.d.f43847b;
        }
    }

    public static final class e extends m implements l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f43845c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Object obj) {
            super(1);
            this.f43845c = obj;
        }

        public final void a(Throwable th) {
            c.this.c(this.f43845c);
        }

        @Override // w8.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return q.f43674a;
        }
    }

    public c(boolean z9) {
        this._state = z9 ? kotlinx.coroutines.sync.d.f43850e : kotlinx.coroutines.sync.d.f43851f;
    }

    @Override // kotlinx.coroutines.sync.b
    public Object a(Object obj, InterfaceC2372d interfaceC2372d) {
        Object objD;
        return (!e(obj) && (objD = d(obj, interfaceC2372d)) == AbstractC2512c.d()) ? objD : q.f43674a;
    }

    @Override // kotlinx.coroutines.sync.b
    public boolean b() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof kotlinx.coroutines.sync.a) {
                return ((kotlinx.coroutines.sync.a) obj).f43834a != kotlinx.coroutines.sync.d.f43849d;
            }
            if (obj instanceof C0369c) {
                return true;
            }
            if (!(obj instanceof u)) {
                throw new IllegalStateException(("Illegal state " + obj).toString());
            }
            ((u) obj).c(this);
        }
    }

    @Override // kotlinx.coroutines.sync.b
    public void c(Object obj) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.sync.a) {
                kotlinx.coroutines.sync.a aVar = (kotlinx.coroutines.sync.a) obj2;
                if (obj == null) {
                    if (aVar.f43834a == kotlinx.coroutines.sync.d.f43849d) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else if (aVar.f43834a != obj) {
                    throw new IllegalStateException(("Mutex is locked by " + aVar.f43834a + " but expected " + obj).toString());
                }
                if (AbstractC2755b.a(f43835a, this, obj2, kotlinx.coroutines.sync.d.f43851f)) {
                    return;
                }
            } else if (obj2 instanceof u) {
                ((u) obj2).c(this);
            } else {
                if (!(obj2 instanceof C0369c)) {
                    throw new IllegalStateException(("Illegal state " + obj2).toString());
                }
                if (obj != null) {
                    C0369c c0369c = (C0369c) obj2;
                    if (c0369c.owner != obj) {
                        throw new IllegalStateException(("Mutex is locked by " + c0369c.owner + " but expected " + obj).toString());
                    }
                }
                C0369c c0369c2 = (C0369c) obj2;
                kotlinx.coroutines.internal.m mVarV = c0369c2.v();
                if (mVarV == null) {
                    d dVar = new d(c0369c2);
                    if (AbstractC2755b.a(f43835a, this, obj2, dVar) && dVar.c(this) == null) {
                        return;
                    }
                } else {
                    b bVar = (b) mVarV;
                    if (bVar.B()) {
                        Object obj3 = bVar.f43841e;
                        if (obj3 == null) {
                            obj3 = kotlinx.coroutines.sync.d.f43848c;
                        }
                        c0369c2.owner = obj3;
                        bVar.z();
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
    
        G8.AbstractC0591q.c(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        r7 = r0.r();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r7 != p8.AbstractC2512c.d()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0076, code lost:
    
        q8.AbstractC2649h.c(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
    
        if (r7 != p8.AbstractC2512c.d()) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        return k8.q.f43674a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.Object r7, o8.InterfaceC2372d r8) {
        /*
            r6 = this;
            o8.d r0 = p8.AbstractC2511b.c(r8)
            G8.o r0 = G8.AbstractC0591q.b(r0)
            kotlinx.coroutines.sync.c$a r1 = new kotlinx.coroutines.sync.c$a
            r1.<init>(r7, r0)
        Ld:
            java.lang.Object r2 = r6._state
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.a
            if (r3 == 0) goto L4a
            r3 = r2
            kotlinx.coroutines.sync.a r3 = (kotlinx.coroutines.sync.a) r3
            java.lang.Object r4 = r3.f43834a
            kotlinx.coroutines.internal.y r5 = kotlinx.coroutines.sync.d.f()
            if (r4 == r5) goto L2b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.c.f43835a
            kotlinx.coroutines.sync.c$c r5 = new kotlinx.coroutines.sync.c$c
            java.lang.Object r3 = r3.f43834a
            r5.<init>(r3)
            t.AbstractC2755b.a(r4, r6, r2, r5)
            goto Ld
        L2b:
            if (r7 != 0) goto L32
            kotlinx.coroutines.sync.a r3 = kotlinx.coroutines.sync.d.c()
            goto L37
        L32:
            kotlinx.coroutines.sync.a r3 = new kotlinx.coroutines.sync.a
            r3.<init>(r7)
        L37:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.sync.c.f43835a
            boolean r2 = t.AbstractC2755b.a(r4, r6, r2, r3)
            if (r2 == 0) goto Ld
            k8.q r1 = k8.q.f43674a
            kotlinx.coroutines.sync.c$e r2 = new kotlinx.coroutines.sync.c$e
            r2.<init>(r7)
            r0.u(r1, r2)
            goto L6c
        L4a:
            boolean r3 = r2 instanceof kotlinx.coroutines.sync.c.C0369c
            if (r3 == 0) goto L9e
            r3 = r2
            kotlinx.coroutines.sync.c$c r3 = (kotlinx.coroutines.sync.c.C0369c) r3
            java.lang.Object r4 = r3.owner
            if (r4 == r7) goto L83
            r3.i(r1)
            java.lang.Object r3 = r6._state
            if (r3 == r2) goto L69
            boolean r2 = r1.A()
            if (r2 != 0) goto L63
            goto L69
        L63:
            kotlinx.coroutines.sync.c$a r1 = new kotlinx.coroutines.sync.c$a
            r1.<init>(r7, r0)
            goto Ld
        L69:
            G8.AbstractC0591q.c(r0, r1)
        L6c:
            java.lang.Object r7 = r0.r()
            java.lang.Object r0 = p8.AbstractC2512c.d()
            if (r7 != r0) goto L79
            q8.AbstractC2649h.c(r8)
        L79:
            java.lang.Object r8 = p8.AbstractC2512c.d()
            if (r7 != r8) goto L80
            return r7
        L80:
            k8.q r7 = k8.q.f43674a
            return r7
        L83:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Already locked by "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
        L9e:
            boolean r3 = r2 instanceof kotlinx.coroutines.internal.u
            if (r3 == 0) goto La9
            kotlinx.coroutines.internal.u r2 = (kotlinx.coroutines.internal.u) r2
            r2.c(r6)
            goto Ld
        La9:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Illegal state "
            r8.append(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.c.d(java.lang.Object, o8.d):java.lang.Object");
    }

    public boolean e(Object obj) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof kotlinx.coroutines.sync.a) {
                if (((kotlinx.coroutines.sync.a) obj2).f43834a != kotlinx.coroutines.sync.d.f43849d) {
                    return false;
                }
                if (AbstractC2755b.a(f43835a, this, obj2, obj == null ? kotlinx.coroutines.sync.d.f43850e : new kotlinx.coroutines.sync.a(obj))) {
                    return true;
                }
            } else {
                if (obj2 instanceof C0369c) {
                    if (((C0369c) obj2).owner != obj) {
                        return false;
                    }
                    throw new IllegalStateException(("Already locked by " + obj).toString());
                }
                if (!(obj2 instanceof u)) {
                    throw new IllegalStateException(("Illegal state " + obj2).toString());
                }
                ((u) obj2).c(this);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        r1.append(r0);
        r1.append(']');
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        return r1.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r4 = this;
        L0:
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.a
            r2 = 93
            java.lang.String r3 = "Mutex["
            if (r1 == 0) goto L21
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            kotlinx.coroutines.sync.a r0 = (kotlinx.coroutines.sync.a) r0
            java.lang.Object r0 = r0.f43834a
        L16:
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            return r0
        L21:
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.u
            if (r1 == 0) goto L2b
            kotlinx.coroutines.internal.u r0 = (kotlinx.coroutines.internal.u) r0
            r0.c(r4)
            goto L0
        L2b:
            boolean r1 = r0 instanceof kotlinx.coroutines.sync.c.C0369c
            if (r1 == 0) goto L3c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            kotlinx.coroutines.sync.c$c r0 = (kotlinx.coroutines.sync.c.C0369c) r0
            java.lang.Object r0 = r0.owner
            goto L16
        L3c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Illegal state "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.c.toString():java.lang.String");
    }
}
