package kotlinx.coroutines.internal;

import G8.T0;
import o8.g;

/* JADX INFO: loaded from: classes4.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f43730a = new y("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w8.p f43731b = a.f43734a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w8.p f43732c = b.f43735a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w8.p f43733d = c.f43736a;

    public static final class a extends kotlin.jvm.internal.m implements w8.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f43734a = new a();

        public a() {
            super(2);
        }

        @Override // w8.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, g.b bVar) {
            if (!(bVar instanceof T0)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int iIntValue = num != null ? num.intValue() : 1;
            return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
        }
    }

    public static final class b extends kotlin.jvm.internal.m implements w8.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f43735a = new b();

        public b() {
            super(2);
        }

        @Override // w8.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final T0 invoke(T0 t02, g.b bVar) {
            if (t02 != null) {
                return t02;
            }
            if (bVar instanceof T0) {
                return (T0) bVar;
            }
            return null;
        }
    }

    public static final class c extends kotlin.jvm.internal.m implements w8.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f43736a = new c();

        public c() {
            super(2);
        }

        @Override // w8.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final F invoke(F f9, g.b bVar) {
            if (bVar instanceof T0) {
                T0 t02 = (T0) bVar;
                f9.a(t02, t02.Y(f9.f43738a));
            }
            return f9;
        }
    }

    public static final void a(o8.g gVar, Object obj) {
        if (obj == f43730a) {
            return;
        }
        if (obj instanceof F) {
            ((F) obj).b(gVar);
            return;
        }
        Object objL = gVar.l(null, f43732c);
        if (objL == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
        ((T0) objL).b0(gVar, obj);
    }

    public static final Object b(o8.g gVar) {
        Object objL = gVar.l(0, f43731b);
        kotlin.jvm.internal.l.b(objL);
        return objL;
    }

    public static final Object c(o8.g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        return obj == 0 ? f43730a : obj instanceof Integer ? gVar.l(new F(gVar, ((Number) obj).intValue()), f43733d) : ((T0) obj).Y(gVar);
    }
}
