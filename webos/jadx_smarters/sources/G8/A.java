package G8;

/* JADX INFO: loaded from: classes4.dex */
public final class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC0581l f2255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w8.l f2256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f2258e;

    public A(Object obj, AbstractC0581l abstractC0581l, w8.l lVar, Object obj2, Throwable th) {
        this.f2254a = obj;
        this.f2255b = abstractC0581l;
        this.f2256c = lVar;
        this.f2257d = obj2;
        this.f2258e = th;
    }

    public /* synthetic */ A(Object obj, AbstractC0581l abstractC0581l, w8.l lVar, Object obj2, Throwable th, int i9, kotlin.jvm.internal.g gVar) {
        this(obj, (i9 & 2) != 0 ? null : abstractC0581l, (i9 & 4) != 0 ? null : lVar, (i9 & 8) != 0 ? null : obj2, (i9 & 16) != 0 ? null : th);
    }

    public static /* synthetic */ A b(A a9, Object obj, AbstractC0581l abstractC0581l, w8.l lVar, Object obj2, Throwable th, int i9, Object obj3) {
        if ((i9 & 1) != 0) {
            obj = a9.f2254a;
        }
        if ((i9 & 2) != 0) {
            abstractC0581l = a9.f2255b;
        }
        AbstractC0581l abstractC0581l2 = abstractC0581l;
        if ((i9 & 4) != 0) {
            lVar = a9.f2256c;
        }
        w8.l lVar2 = lVar;
        if ((i9 & 8) != 0) {
            obj2 = a9.f2257d;
        }
        Object obj4 = obj2;
        if ((i9 & 16) != 0) {
            th = a9.f2258e;
        }
        return a9.a(obj, abstractC0581l2, lVar2, obj4, th);
    }

    public final A a(Object obj, AbstractC0581l abstractC0581l, w8.l lVar, Object obj2, Throwable th) {
        return new A(obj, abstractC0581l, lVar, obj2, th);
    }

    public final boolean c() {
        return this.f2258e != null;
    }

    public final void d(C0587o c0587o, Throwable th) {
        AbstractC0581l abstractC0581l = this.f2255b;
        if (abstractC0581l != null) {
            c0587o.j(abstractC0581l, th);
        }
        w8.l lVar = this.f2256c;
        if (lVar != null) {
            c0587o.l(lVar, th);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a9 = (A) obj;
        return kotlin.jvm.internal.l.a(this.f2254a, a9.f2254a) && kotlin.jvm.internal.l.a(this.f2255b, a9.f2255b) && kotlin.jvm.internal.l.a(this.f2256c, a9.f2256c) && kotlin.jvm.internal.l.a(this.f2257d, a9.f2257d) && kotlin.jvm.internal.l.a(this.f2258e, a9.f2258e);
    }

    public int hashCode() {
        Object obj = this.f2254a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC0581l abstractC0581l = this.f2255b;
        int iHashCode2 = (iHashCode + (abstractC0581l == null ? 0 : abstractC0581l.hashCode())) * 31;
        w8.l lVar = this.f2256c;
        int iHashCode3 = (iHashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.f2257d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.f2258e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f2254a + ", cancelHandler=" + this.f2255b + ", onCancellation=" + this.f2256c + ", idempotentResume=" + this.f2257d + ", cancelCause=" + this.f2258e + ')';
    }
}
