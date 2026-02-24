package J8;

import kotlin.jvm.internal.F;
import o8.InterfaceC2372d;
import w8.q;

/* JADX INFO: loaded from: classes4.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f3412a = (q) F.b(a.f3413d, 3);

    public /* synthetic */ class a extends kotlin.jvm.internal.j implements q {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f3413d = new a();

        public a() {
            super(3, kotlinx.coroutines.flow.c.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // w8.q
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object e(kotlinx.coroutines.flow.c cVar, Object obj, InterfaceC2372d interfaceC2372d) {
            return cVar.a(obj, interfaceC2372d);
        }
    }
}
