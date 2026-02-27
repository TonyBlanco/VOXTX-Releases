package androidx.work;

import G8.AbstractC0579k;
import G8.C0;
import G8.C0562b0;
import G8.H;
import G8.InterfaceC0605x0;
import G8.InterfaceC0608z;
import G8.L;
import G8.M;
import Q0.j;
import android.content.Context;
import androidx.work.ListenableWorker;
import b1.C1199c;
import k8.k;
import k8.q;
import o8.InterfaceC2372d;
import org.jetbrains.annotations.NotNull;
import p8.AbstractC2512c;
import q8.l;
import w8.p;
import y5.InterfaceFutureC2987b;

/* JADX INFO: loaded from: classes.dex */
public abstract class CoroutineWorker extends ListenableWorker {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC0608z f17244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1199c f17245h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final H f17246i;

    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (CoroutineWorker.this.v().isCancelled()) {
                InterfaceC0605x0.a.a(CoroutineWorker.this.w(), null, 1, null);
            }
        }
    }

    public static final class b extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f17248a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17249c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j f17250d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ CoroutineWorker f17251e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j jVar, CoroutineWorker coroutineWorker, InterfaceC2372d interfaceC2372d) {
            super(2, interfaceC2372d);
            this.f17250d = jVar;
            this.f17251e = coroutineWorker;
        }

        @Override // w8.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L l9, InterfaceC2372d interfaceC2372d) {
            return ((b) create(l9, interfaceC2372d)).invokeSuspend(q.f43674a);
        }

        @Override // q8.AbstractC2642a
        public final InterfaceC2372d create(Object obj, InterfaceC2372d interfaceC2372d) {
            return new b(this.f17250d, this.f17251e, interfaceC2372d);
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) throws Throwable {
            j jVar;
            Object objD = AbstractC2512c.d();
            int i9 = this.f17249c;
            if (i9 == 0) {
                k.b(obj);
                j jVar2 = this.f17250d;
                CoroutineWorker coroutineWorker = this.f17251e;
                this.f17248a = jVar2;
                this.f17249c = 1;
                Object objT = coroutineWorker.t(this);
                if (objT == objD) {
                    return objD;
                }
                jVar = jVar2;
                obj = objT;
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar = (j) this.f17248a;
                k.b(obj);
            }
            jVar.b(obj);
            return q.f43674a;
        }
    }

    public static final class c extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17252a;

        public c(InterfaceC2372d interfaceC2372d) {
            super(2, interfaceC2372d);
        }

        @Override // w8.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(L l9, InterfaceC2372d interfaceC2372d) {
            return ((c) create(l9, interfaceC2372d)).invokeSuspend(q.f43674a);
        }

        @Override // q8.AbstractC2642a
        public final InterfaceC2372d create(Object obj, InterfaceC2372d interfaceC2372d) {
            return CoroutineWorker.this.new c(interfaceC2372d);
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objD = AbstractC2512c.d();
            int i9 = this.f17252a;
            try {
                if (i9 == 0) {
                    k.b(obj);
                    CoroutineWorker coroutineWorker = CoroutineWorker.this;
                    this.f17252a = 1;
                    obj = coroutineWorker.r(this);
                    if (obj == objD) {
                        return objD;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k.b(obj);
                }
                CoroutineWorker.this.v().p((ListenableWorker.a) obj);
            } catch (Throwable th) {
                CoroutineWorker.this.v().q(th);
            }
            return q.f43674a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(@NotNull Context appContext, @NotNull WorkerParameters params) {
        super(appContext, params);
        kotlin.jvm.internal.l.e(appContext, "appContext");
        kotlin.jvm.internal.l.e(params, "params");
        this.f17244g = C0.b(null, 1, null);
        C1199c c1199cT = C1199c.t();
        kotlin.jvm.internal.l.d(c1199cT, "create()");
        this.f17245h = c1199cT;
        c1199cT.addListener(new a(), h().c());
        this.f17246i = C0562b0.a();
    }

    public static /* synthetic */ Object u(CoroutineWorker coroutineWorker, InterfaceC2372d interfaceC2372d) {
        throw new IllegalStateException("Not implemented");
    }

    @Override // androidx.work.ListenableWorker
    public final InterfaceFutureC2987b d() {
        InterfaceC0608z interfaceC0608zB = C0.b(null, 1, null);
        L lA = M.a(s().V(interfaceC0608zB));
        j jVar = new j(interfaceC0608zB, null, 2, null);
        AbstractC0579k.d(lA, null, null, new b(jVar, this, null), 3, null);
        return jVar;
    }

    @Override // androidx.work.ListenableWorker
    public final void m() {
        super.m();
        this.f17245h.cancel(false);
    }

    @Override // androidx.work.ListenableWorker
    public final InterfaceFutureC2987b p() {
        AbstractC0579k.d(M.a(s().V(this.f17244g)), null, null, new c(null), 3, null);
        return this.f17245h;
    }

    public abstract Object r(InterfaceC2372d interfaceC2372d);

    public H s() {
        return this.f17246i;
    }

    public Object t(InterfaceC2372d interfaceC2372d) {
        return u(this, interfaceC2372d);
    }

    public final C1199c v() {
        return this.f17245h;
    }

    public final InterfaceC0608z w() {
        return this.f17244g;
    }
}
