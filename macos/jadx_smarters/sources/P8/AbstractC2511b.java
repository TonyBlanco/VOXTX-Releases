package p8;

import k8.k;
import kotlin.jvm.internal.F;
import o8.InterfaceC2372d;
import o8.g;
import o8.h;
import q8.AbstractC2642a;
import q8.AbstractC2645d;
import q8.AbstractC2649h;
import q8.AbstractC2651j;
import w8.l;
import w8.p;

/* JADX INFO: renamed from: p8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2511b {

    /* JADX INFO: renamed from: p8.b$a */
    public static final class a extends AbstractC2651j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46688a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l f46689c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2372d interfaceC2372d, l lVar) {
            super(interfaceC2372d);
            this.f46689c = lVar;
            kotlin.jvm.internal.l.c(interfaceC2372d, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // q8.AbstractC2642a
        public Object invokeSuspend(Object obj) throws Throwable {
            int i9 = this.f46688a;
            if (i9 == 0) {
                this.f46688a = 1;
                k.b(obj);
                kotlin.jvm.internal.l.c(this.f46689c, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-0>, kotlin.Any?>");
                return ((l) F.b(this.f46689c, 1)).invoke(this);
            }
            if (i9 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f46688a = 2;
            k.b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: p8.b$b, reason: collision with other inner class name */
    public static final class C0412b extends AbstractC2645d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46690a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l f46691c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0412b(InterfaceC2372d interfaceC2372d, g gVar, l lVar) {
            super(interfaceC2372d, gVar);
            this.f46691c = lVar;
            kotlin.jvm.internal.l.c(interfaceC2372d, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // q8.AbstractC2642a
        public Object invokeSuspend(Object obj) throws Throwable {
            int i9 = this.f46690a;
            if (i9 == 0) {
                this.f46690a = 1;
                k.b(obj);
                kotlin.jvm.internal.l.c(this.f46691c, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-0>, kotlin.Any?>");
                return ((l) F.b(this.f46691c, 1)).invoke(this);
            }
            if (i9 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f46690a = 2;
            k.b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: p8.b$c */
    public static final class c extends AbstractC2651j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46692a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f46693c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f46694d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC2372d interfaceC2372d, p pVar, Object obj) {
            super(interfaceC2372d);
            this.f46693c = pVar;
            this.f46694d = obj;
            kotlin.jvm.internal.l.c(interfaceC2372d, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // q8.AbstractC2642a
        public Object invokeSuspend(Object obj) throws Throwable {
            int i9 = this.f46692a;
            if (i9 == 0) {
                this.f46692a = 1;
                k.b(obj);
                kotlin.jvm.internal.l.c(this.f46693c, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
                return ((p) F.b(this.f46693c, 2)).invoke(this.f46694d, this);
            }
            if (i9 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f46692a = 2;
            k.b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: p8.b$d */
    public static final class d extends AbstractC2645d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46695a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p f46696c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f46697d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC2372d interfaceC2372d, g gVar, p pVar, Object obj) {
            super(interfaceC2372d, gVar);
            this.f46696c = pVar;
            this.f46697d = obj;
            kotlin.jvm.internal.l.c(interfaceC2372d, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // q8.AbstractC2642a
        public Object invokeSuspend(Object obj) throws Throwable {
            int i9 = this.f46695a;
            if (i9 == 0) {
                this.f46695a = 1;
                k.b(obj);
                kotlin.jvm.internal.l.c(this.f46696c, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda-1>, kotlin.Any?>");
                return ((p) F.b(this.f46696c, 2)).invoke(this.f46697d, this);
            }
            if (i9 != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.f46695a = 2;
            k.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC2372d a(l lVar, InterfaceC2372d completion) {
        kotlin.jvm.internal.l.e(lVar, "<this>");
        kotlin.jvm.internal.l.e(completion, "completion");
        InterfaceC2372d interfaceC2372dA = AbstractC2649h.a(completion);
        if (lVar instanceof AbstractC2642a) {
            return ((AbstractC2642a) lVar).create(interfaceC2372dA);
        }
        g context = interfaceC2372dA.getContext();
        return context == h.f46144a ? new a(interfaceC2372dA, lVar) : new C0412b(interfaceC2372dA, context, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC2372d b(p pVar, Object obj, InterfaceC2372d completion) {
        kotlin.jvm.internal.l.e(pVar, "<this>");
        kotlin.jvm.internal.l.e(completion, "completion");
        InterfaceC2372d interfaceC2372dA = AbstractC2649h.a(completion);
        if (pVar instanceof AbstractC2642a) {
            return ((AbstractC2642a) pVar).create(obj, interfaceC2372dA);
        }
        g context = interfaceC2372dA.getContext();
        return context == h.f46144a ? new c(interfaceC2372dA, pVar, obj) : new d(interfaceC2372dA, context, pVar, obj);
    }

    public static InterfaceC2372d c(InterfaceC2372d interfaceC2372d) {
        InterfaceC2372d interfaceC2372dIntercepted;
        kotlin.jvm.internal.l.e(interfaceC2372d, "<this>");
        AbstractC2645d abstractC2645d = interfaceC2372d instanceof AbstractC2645d ? (AbstractC2645d) interfaceC2372d : null;
        return (abstractC2645d == null || (interfaceC2372dIntercepted = abstractC2645d.intercepted()) == null) ? interfaceC2372d : interfaceC2372dIntercepted;
    }
}
