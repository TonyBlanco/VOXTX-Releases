package J8;

import G8.B0;
import k8.q;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import o8.InterfaceC2372d;
import o8.g;
import p8.AbstractC2512c;
import q8.AbstractC2645d;
import q8.AbstractC2649h;
import q8.InterfaceC2646e;
import w8.p;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends AbstractC2645d implements kotlinx.coroutines.flow.c, InterfaceC2646e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.flow.c f3406a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o8.g f3407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o8.g f3409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC2372d f3410f;

    public static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3411a = new a();

        public a() {
            super(2);
        }

        public final Integer a(int i9, g.b bVar) {
            return Integer.valueOf(i9 + 1);
        }

        @Override // w8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public i(kotlinx.coroutines.flow.c cVar, o8.g gVar) {
        super(g.f3401a, o8.h.f46144a);
        this.f3406a = cVar;
        this.f3407c = gVar;
        this.f3408d = ((Number) gVar.l(0, a.f3411a)).intValue();
    }

    @Override // kotlinx.coroutines.flow.c
    public Object a(Object obj, InterfaceC2372d interfaceC2372d) {
        try {
            Object objD = d(interfaceC2372d, obj);
            if (objD == AbstractC2512c.d()) {
                AbstractC2649h.c(interfaceC2372d);
            }
            return objD == AbstractC2512c.d() ? objD : q.f43674a;
        } catch (Throwable th) {
            this.f3409e = new e(th, interfaceC2372d.getContext());
            throw th;
        }
    }

    public final void c(o8.g gVar, o8.g gVar2, Object obj) {
        if (gVar2 instanceof e) {
            h((e) gVar2, obj);
        }
        k.a(this, gVar);
    }

    public final Object d(InterfaceC2372d interfaceC2372d, Object obj) {
        o8.g context = interfaceC2372d.getContext();
        B0.i(context);
        o8.g gVar = this.f3409e;
        if (gVar != context) {
            c(context, gVar, obj);
            this.f3409e = context;
        }
        this.f3410f = interfaceC2372d;
        Object objE = j.f3412a.e(this.f3406a, obj, this);
        if (!l.a(objE, AbstractC2512c.d())) {
            this.f3410f = null;
        }
        return objE;
    }

    @Override // q8.AbstractC2642a, q8.InterfaceC2646e
    public InterfaceC2646e getCallerFrame() {
        InterfaceC2372d interfaceC2372d = this.f3410f;
        if (interfaceC2372d instanceof InterfaceC2646e) {
            return (InterfaceC2646e) interfaceC2372d;
        }
        return null;
    }

    @Override // q8.AbstractC2645d, o8.InterfaceC2372d
    public o8.g getContext() {
        o8.g gVar = this.f3409e;
        return gVar == null ? o8.h.f46144a : gVar;
    }

    @Override // q8.AbstractC2642a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final void h(e eVar, Object obj) {
        throw new IllegalStateException(E8.g.f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + eVar.f3399a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // q8.AbstractC2642a
    public Object invokeSuspend(Object obj) {
        Throwable thD = k8.j.d(obj);
        if (thD != null) {
            this.f3409e = new e(thD, getContext());
        }
        InterfaceC2372d interfaceC2372d = this.f3410f;
        if (interfaceC2372d != null) {
            interfaceC2372d.resumeWith(obj);
        }
        return AbstractC2512c.d();
    }

    @Override // q8.AbstractC2645d, q8.AbstractC2642a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
