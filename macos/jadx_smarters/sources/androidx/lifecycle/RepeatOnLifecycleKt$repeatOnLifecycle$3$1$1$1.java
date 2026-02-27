package androidx.lifecycle;

import G8.AbstractC0579k;
import G8.InterfaceC0585n;
import G8.InterfaceC0605x0;
import androidx.lifecycle.AbstractC1180j;
import k8.j;
import o8.InterfaceC2372d;
import p8.AbstractC2512c;

/* JADX INFO: loaded from: classes.dex */
final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements InterfaceC1184n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC1180j.b f15902a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.B f15903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ G8.L f15904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractC1180j.b f15905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0585n f15906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.sync.b f15907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w8.p f15908h;

    public static final class a extends q8.l implements w8.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f15909a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f15910c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f15911d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.sync.b f15912e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ w8.p f15913f;

        /* JADX INFO: renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a$a, reason: collision with other inner class name */
        public static final class C0181a extends q8.l implements w8.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f15914a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f15915c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ w8.p f15916d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0181a(w8.p pVar, InterfaceC2372d interfaceC2372d) {
                super(2, interfaceC2372d);
                this.f15916d = pVar;
            }

            @Override // w8.p
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(G8.L l9, InterfaceC2372d interfaceC2372d) {
                return ((C0181a) create(l9, interfaceC2372d)).invokeSuspend(k8.q.f43674a);
            }

            @Override // q8.AbstractC2642a
            public final InterfaceC2372d create(Object obj, InterfaceC2372d interfaceC2372d) {
                C0181a c0181a = new C0181a(this.f15916d, interfaceC2372d);
                c0181a.f15915c = obj;
                return c0181a;
            }

            @Override // q8.AbstractC2642a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objD = AbstractC2512c.d();
                int i9 = this.f15914a;
                if (i9 == 0) {
                    k8.k.b(obj);
                    G8.L l9 = (G8.L) this.f15915c;
                    w8.p pVar = this.f15916d;
                    this.f15914a = 1;
                    if (pVar.invoke(l9, this) == objD) {
                        return objD;
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k8.k.b(obj);
                }
                return k8.q.f43674a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlinx.coroutines.sync.b bVar, w8.p pVar, InterfaceC2372d interfaceC2372d) {
            super(2, interfaceC2372d);
            this.f15912e = bVar;
            this.f15913f = pVar;
        }

        @Override // w8.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(G8.L l9, InterfaceC2372d interfaceC2372d) {
            return ((a) create(l9, interfaceC2372d)).invokeSuspend(k8.q.f43674a);
        }

        @Override // q8.AbstractC2642a
        public final InterfaceC2372d create(Object obj, InterfaceC2372d interfaceC2372d) {
            return new a(this.f15912e, this.f15913f, interfaceC2372d);
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) throws Throwable {
            kotlinx.coroutines.sync.b bVar;
            w8.p pVar;
            kotlinx.coroutines.sync.b bVar2;
            Throwable th;
            Object objD = AbstractC2512c.d();
            int i9 = this.f15911d;
            try {
                if (i9 == 0) {
                    k8.k.b(obj);
                    bVar = this.f15912e;
                    pVar = this.f15913f;
                    this.f15909a = bVar;
                    this.f15910c = pVar;
                    this.f15911d = 1;
                    if (bVar.a(null, this) == objD) {
                        return objD;
                    }
                } else {
                    if (i9 != 1) {
                        if (i9 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar2 = (kotlinx.coroutines.sync.b) this.f15909a;
                        try {
                            k8.k.b(obj);
                            k8.q qVar = k8.q.f43674a;
                            bVar2.c(null);
                            return k8.q.f43674a;
                        } catch (Throwable th2) {
                            th = th2;
                            bVar2.c(null);
                            throw th;
                        }
                    }
                    pVar = (w8.p) this.f15910c;
                    kotlinx.coroutines.sync.b bVar3 = (kotlinx.coroutines.sync.b) this.f15909a;
                    k8.k.b(obj);
                    bVar = bVar3;
                }
                C0181a c0181a = new C0181a(pVar, null);
                this.f15909a = bVar;
                this.f15910c = null;
                this.f15911d = 2;
                if (G8.M.c(c0181a, this) == objD) {
                    return objD;
                }
                bVar2 = bVar;
                k8.q qVar2 = k8.q.f43674a;
                bVar2.c(null);
                return k8.q.f43674a;
            } catch (Throwable th3) {
                bVar2 = bVar;
                th = th3;
                bVar2.c(null);
                throw th;
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC1184n
    public final void b(InterfaceC1186p interfaceC1186p, AbstractC1180j.b event) {
        kotlin.jvm.internal.l.e(interfaceC1186p, "<anonymous parameter 0>");
        kotlin.jvm.internal.l.e(event, "event");
        if (event == this.f15902a) {
            this.f15903c.f43676a = AbstractC0579k.d(this.f15904d, null, null, new a(this.f15907g, this.f15908h, null), 3, null);
            return;
        }
        if (event == this.f15905e) {
            InterfaceC0605x0 interfaceC0605x0 = (InterfaceC0605x0) this.f15903c.f43676a;
            if (interfaceC0605x0 != null) {
                InterfaceC0605x0.a.a(interfaceC0605x0, null, 1, null);
            }
            this.f15903c.f43676a = null;
        }
        if (event == AbstractC1180j.b.ON_DESTROY) {
            InterfaceC0585n interfaceC0585n = this.f15906f;
            j.a aVar = k8.j.f43666c;
            interfaceC0585n.resumeWith(k8.j.b(k8.q.f43674a));
        }
    }
}
