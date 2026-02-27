package G8;

import o8.InterfaceC2372d;
import o8.InterfaceC2373e;
import o8.g;
import q8.InterfaceC2646e;

/* JADX INFO: loaded from: classes4.dex */
public abstract class G {

    public static final class a extends kotlin.jvm.internal.m implements w8.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f2286a = new a();

        public a() {
            super(2);
        }

        @Override // w8.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o8.g invoke(o8.g gVar, g.b bVar) {
            return gVar.V(bVar);
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements w8.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.B f2287a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f2288c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.jvm.internal.B b9, boolean z9) {
            super(2);
            this.f2287a = b9;
            this.f2288c = z9;
        }

        @Override // w8.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o8.g invoke(o8.g gVar, g.b bVar) {
            return gVar.V(bVar);
        }
    }

    public static final class c extends kotlin.jvm.internal.m implements w8.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f2289a = new c();

        public c() {
            super(2);
        }

        public final Boolean a(boolean z9, g.b bVar) {
            return Boolean.valueOf(z9);
        }

        @Override // w8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (g.b) obj2);
        }
    }

    public static final o8.g a(o8.g gVar, o8.g gVar2, boolean z9) {
        boolean zC = c(gVar);
        boolean zC2 = c(gVar2);
        if (!zC && !zC2) {
            return gVar.V(gVar2);
        }
        kotlin.jvm.internal.B b9 = new kotlin.jvm.internal.B();
        b9.f43676a = gVar2;
        o8.h hVar = o8.h.f46144a;
        o8.g gVar3 = (o8.g) gVar.l(hVar, new b(b9, z9));
        if (zC2) {
            b9.f43676a = ((o8.g) b9.f43676a).l(hVar, a.f2286a);
        }
        return gVar3.V((o8.g) b9.f43676a);
    }

    public static final String b(o8.g gVar) {
        return null;
    }

    public static final boolean c(o8.g gVar) {
        return ((Boolean) gVar.l(Boolean.FALSE, c.f2289a)).booleanValue();
    }

    public static final o8.g d(L l9, o8.g gVar) {
        o8.g gVarA = a(l9.t(), gVar, true);
        return (gVarA == C0562b0.a() || gVarA.a(InterfaceC2373e.f46141d0) != null) ? gVarA : gVarA.V(C0562b0.a());
    }

    public static final o8.g e(o8.g gVar, o8.g gVar2) {
        return !c(gVar2) ? gVar.V(gVar2) : a(gVar, gVar2, false);
    }

    public static final b1 f(InterfaceC2646e interfaceC2646e) {
        while (!(interfaceC2646e instanceof Y) && (interfaceC2646e = interfaceC2646e.getCallerFrame()) != null) {
            if (interfaceC2646e instanceof b1) {
                return (b1) interfaceC2646e;
            }
        }
        return null;
    }

    public static final b1 g(InterfaceC2372d interfaceC2372d, o8.g gVar, Object obj) {
        if (!(interfaceC2372d instanceof InterfaceC2646e) || gVar.a(c1.f2324a) == null) {
            return null;
        }
        b1 b1VarF = f((InterfaceC2646e) interfaceC2372d);
        if (b1VarF != null) {
            b1VarF.Q0(gVar, obj);
        }
        return b1VarF;
    }
}
