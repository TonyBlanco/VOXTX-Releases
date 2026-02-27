package G8;

/* JADX INFO: loaded from: classes4.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w8.l f2263b;

    public C(Object obj, w8.l lVar) {
        this.f2262a = obj;
        this.f2263b = lVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c9 = (C) obj;
        return kotlin.jvm.internal.l.a(this.f2262a, c9.f2262a) && kotlin.jvm.internal.l.a(this.f2263b, c9.f2263b);
    }

    public int hashCode() {
        Object obj = this.f2262a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f2263b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f2262a + ", onCancellation=" + this.f2263b + ')';
    }
}
