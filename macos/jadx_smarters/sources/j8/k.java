package J8;

import G8.InterfaceC0605x0;
import kotlin.jvm.internal.m;
import kotlinx.coroutines.internal.x;
import o8.g;
import w8.p;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k {

    public static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f3414a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar) {
            super(2);
            this.f3414a = iVar;
        }

        public final Integer a(int i9, g.b bVar) {
            g.c key = bVar.getKey();
            g.b bVarA = this.f3414a.f3407c.a(key);
            if (key != InterfaceC0605x0.f2366b0) {
                return Integer.valueOf(bVar != bVarA ? Integer.MIN_VALUE : i9 + 1);
            }
            InterfaceC0605x0 interfaceC0605x0 = (InterfaceC0605x0) bVarA;
            InterfaceC0605x0 interfaceC0605x0B = k.b((InterfaceC0605x0) bVar, interfaceC0605x0);
            if (interfaceC0605x0B == interfaceC0605x0) {
                if (interfaceC0605x0 != null) {
                    i9++;
                }
                return Integer.valueOf(i9);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + interfaceC0605x0B + ", expected child of " + interfaceC0605x0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // w8.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (g.b) obj2);
        }
    }

    public static final void a(i iVar, o8.g gVar) {
        if (((Number) gVar.l(0, new a(iVar))).intValue() == iVar.f3408d) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + iVar.f3407c + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final InterfaceC0605x0 b(InterfaceC0605x0 interfaceC0605x0, InterfaceC0605x0 interfaceC0605x02) {
        while (interfaceC0605x0 != null) {
            if (interfaceC0605x0 == interfaceC0605x02 || !(interfaceC0605x0 instanceof x)) {
                return interfaceC0605x0;
            }
            interfaceC0605x0 = ((x) interfaceC0605x0).O0();
        }
        return null;
    }
}
