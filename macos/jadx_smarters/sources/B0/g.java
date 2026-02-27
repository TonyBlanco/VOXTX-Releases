package b0;

import k8.k;
import k8.q;
import o8.InterfaceC2372d;
import p8.AbstractC2512c;
import q8.l;
import w8.p;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    public static final class a extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17432a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f17433c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p f17434d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, InterfaceC2372d interfaceC2372d) {
            super(2, interfaceC2372d);
            this.f17434d = pVar;
        }

        @Override // w8.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, InterfaceC2372d interfaceC2372d) {
            return ((a) create(dVar, interfaceC2372d)).invokeSuspend(q.f43674a);
        }

        @Override // q8.AbstractC2642a
        public final InterfaceC2372d create(Object obj, InterfaceC2372d interfaceC2372d) {
            a aVar = new a(this.f17434d, interfaceC2372d);
            aVar.f17433c = obj;
            return aVar;
        }

        @Override // q8.AbstractC2642a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objD = AbstractC2512c.d();
            int i9 = this.f17432a;
            if (i9 != 0) {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1194a c1194a = (C1194a) this.f17433c;
                k.b(obj);
                return c1194a;
            }
            k.b(obj);
            C1194a c1194aC = ((d) this.f17433c).c();
            p pVar = this.f17434d;
            this.f17433c = c1194aC;
            this.f17432a = 1;
            return pVar.invoke(c1194aC, this) == objD ? objD : c1194aC;
        }
    }

    public static final Object a(Y.f fVar, p pVar, InterfaceC2372d interfaceC2372d) {
        return fVar.a(new a(pVar, null), interfaceC2372d);
    }
}
