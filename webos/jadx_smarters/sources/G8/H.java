package G8;

import kotlinx.coroutines.internal.C2165f;
import o8.AbstractC2369a;
import o8.AbstractC2370b;
import o8.InterfaceC2372d;
import o8.InterfaceC2373e;
import o8.g;

/* JADX INFO: loaded from: classes4.dex */
public abstract class H extends AbstractC2369a implements InterfaceC2373e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f2291c = new a(null);

    public static final class a extends AbstractC2370b {

        /* JADX INFO: renamed from: G8.H$a$a, reason: collision with other inner class name */
        public static final class C0039a extends kotlin.jvm.internal.m implements w8.l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0039a f2292a = new C0039a();

            public C0039a() {
                super(1);
            }

            @Override // w8.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final H invoke(g.b bVar) {
                if (bVar instanceof H) {
                    return (H) bVar;
                }
                return null;
            }
        }

        public a() {
            super(InterfaceC2373e.f46141d0, C0039a.f2292a);
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public H() {
        super(InterfaceC2373e.f46141d0);
    }

    @Override // o8.InterfaceC2373e
    public final void T(InterfaceC2372d interfaceC2372d) {
        ((C2165f) interfaceC2372d).n();
    }

    @Override // o8.AbstractC2369a, o8.g.b, o8.g
    public g.b a(g.c cVar) {
        return InterfaceC2373e.a.a(this, cVar);
    }

    public abstract void c0(o8.g gVar, Runnable runnable);

    public boolean d0(o8.g gVar) {
        return true;
    }

    public H e0(int i9) {
        kotlinx.coroutines.internal.j.a(i9);
        return new kotlinx.coroutines.internal.i(this, i9);
    }

    @Override // o8.InterfaceC2373e
    public final InterfaceC2372d o(InterfaceC2372d interfaceC2372d) {
        return new C2165f(this, interfaceC2372d);
    }

    public String toString() {
        return P.a(this) + '@' + P.b(this);
    }

    @Override // o8.AbstractC2369a, o8.g
    public o8.g w(g.c cVar) {
        return InterfaceC2373e.a.b(this, cVar);
    }
}
