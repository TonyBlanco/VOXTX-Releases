package O;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5401b;

    public d(Object obj, Object obj2) {
        this.f5400a = obj;
        this.f5401b = obj2;
    }

    public static d a(Object obj, Object obj2) {
        return new d(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.a(dVar.f5400a, this.f5400a) && c.a(dVar.f5401b, this.f5401b);
    }

    public int hashCode() {
        Object obj = this.f5400a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f5401b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f5400a + " " + this.f5401b + "}";
    }
}
