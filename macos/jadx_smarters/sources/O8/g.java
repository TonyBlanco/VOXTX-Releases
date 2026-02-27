package o8;

import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import o8.InterfaceC2373e;
import w8.p;

/* JADX INFO: loaded from: classes4.dex */
public interface g {

    public static final class a {

        /* JADX INFO: renamed from: o8.g$a$a, reason: collision with other inner class name */
        public static final class C0406a extends m implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0406a f46143a = new C0406a();

            public C0406a() {
                super(2);
            }

            @Override // w8.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g invoke(g acc, b element) {
                C2371c c2371c;
                l.e(acc, "acc");
                l.e(element, "element");
                g gVarW = acc.w(element.getKey());
                h hVar = h.f46144a;
                if (gVarW == hVar) {
                    return element;
                }
                InterfaceC2373e.b bVar = InterfaceC2373e.f46141d0;
                InterfaceC2373e interfaceC2373e = (InterfaceC2373e) gVarW.a(bVar);
                if (interfaceC2373e == null) {
                    c2371c = new C2371c(gVarW, element);
                } else {
                    g gVarW2 = gVarW.w(bVar);
                    if (gVarW2 == hVar) {
                        return new C2371c(element, interfaceC2373e);
                    }
                    c2371c = new C2371c(new C2371c(gVarW2, element), interfaceC2373e);
                }
                return c2371c;
            }
        }

        public static g a(g gVar, g context) {
            l.e(context, "context");
            return context == h.f46144a ? gVar : (g) context.l(gVar, C0406a.f46143a);
        }
    }

    public interface b extends g {

        public static final class a {
            public static Object a(b bVar, Object obj, p operation) {
                l.e(operation, "operation");
                return operation.invoke(obj, bVar);
            }

            public static b b(b bVar, c key) {
                l.e(key, "key");
                if (!l.a(bVar.getKey(), key)) {
                    return null;
                }
                l.c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static g c(b bVar, c key) {
                l.e(key, "key");
                return l.a(bVar.getKey(), key) ? h.f46144a : bVar;
            }

            public static g d(b bVar, g context) {
                l.e(context, "context");
                return a.a(bVar, context);
            }
        }

        @Override // o8.g
        b a(c cVar);

        c getKey();
    }

    public interface c {
    }

    g V(g gVar);

    b a(c cVar);

    Object l(Object obj, p pVar);

    g w(c cVar);
}
