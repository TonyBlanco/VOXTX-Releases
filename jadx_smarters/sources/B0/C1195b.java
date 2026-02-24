package b0;

import k8.k;
import k8.q;
import o8.InterfaceC2372d;
import p8.AbstractC2512c;
import q8.l;
import w8.p;

/* JADX INFO: renamed from: b0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1195b implements Y.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Y.f f17425a;

    /* JADX INFO: renamed from: b0.b$a */
    public static final class a extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17426a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f17427c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p f17428d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, InterfaceC2372d interfaceC2372d) {
            super(2, interfaceC2372d);
            this.f17428d = pVar;
        }

        @Override // w8.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, InterfaceC2372d interfaceC2372d) {
            return ((a) create(dVar, interfaceC2372d)).invokeSuspend(q.f43674a);
        }

        @Override // q8.AbstractC2642a
        public final InterfaceC2372d create(Object obj, InterfaceC2372d interfaceC2372d) {
            a aVar = new a(this.f17428d, interfaceC2372d);
            aVar.f17427c = obj;
            return aVar;
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objD = AbstractC2512c.d();
            int i9 = this.f17426a;
            if (i9 == 0) {
                k.b(obj);
                d dVar = (d) this.f17427c;
                p pVar = this.f17428d;
                this.f17426a = 1;
                obj = pVar.invoke(dVar, this);
                if (obj == objD) {
                    return objD;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k.b(obj);
            }
            d dVar2 = (d) obj;
            ((C1194a) dVar2).f();
            return dVar2;
        }
    }

    public C1195b(Y.f delegate) {
        kotlin.jvm.internal.l.e(delegate, "delegate");
        this.f17425a = delegate;
    }

    @Override // Y.f
    public Object a(p pVar, InterfaceC2372d interfaceC2372d) {
        return this.f17425a.a(new a(pVar, null), interfaceC2372d);
    }

    @Override // Y.f
    public kotlinx.coroutines.flow.b getData() {
        return this.f17425a.getData();
    }
}
