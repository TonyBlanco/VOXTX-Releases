package kotlinx.coroutines.internal;

import G8.K;
import java.lang.reflect.InvocationTargetException;
import k8.AbstractC2152a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class t {

    public static final class a extends kotlin.jvm.internal.m implements w8.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w8.l f43781a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f43782c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o8.g f43783d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w8.l lVar, Object obj, o8.g gVar) {
            super(1);
            this.f43781a = lVar;
            this.f43782c = obj;
            this.f43783d = gVar;
        }

        public final void a(Throwable th) throws IllegalAccessException, InvocationTargetException {
            t.b(this.f43781a, this.f43782c, this.f43783d);
        }

        @Override // w8.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
            a((Throwable) obj);
            return k8.q.f43674a;
        }
    }

    public static final w8.l a(w8.l lVar, Object obj, o8.g gVar) {
        return new a(lVar, obj, gVar);
    }

    public static final void b(w8.l lVar, Object obj, o8.g gVar) throws IllegalAccessException, InvocationTargetException {
        G gC = c(lVar, obj, null);
        if (gC != null) {
            K.a(gVar, gC);
        }
    }

    public static final G c(w8.l lVar, Object obj, G g9) throws IllegalAccessException, InvocationTargetException {
        try {
            lVar.invoke(obj);
        } catch (Throwable th) {
            if (g9 == null || g9.getCause() == th) {
                return new G("Exception in undelivered element handler for " + obj, th);
            }
            AbstractC2152a.a(g9, th);
        }
        return g9;
    }

    public static /* synthetic */ G d(w8.l lVar, Object obj, G g9, int i9, Object obj2) {
        if ((i9 & 2) != 0) {
            g9 = null;
        }
        return c(lVar, obj, g9);
    }
}
