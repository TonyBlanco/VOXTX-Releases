package q2;

/* JADX INFO: renamed from: q2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2538g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class f46812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class f46813b;

    public C2538g() {
    }

    public C2538g(Class cls, Class cls2) {
        a(cls, cls2);
    }

    public void a(Class cls, Class cls2) {
        this.f46812a = cls;
        this.f46813b = cls2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2538g c2538g = (C2538g) obj;
        return this.f46812a.equals(c2538g.f46812a) && this.f46813b.equals(c2538g.f46813b);
    }

    public int hashCode() {
        return (this.f46812a.hashCode() * 31) + this.f46813b.hashCode();
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f46812a + ", second=" + this.f46813b + '}';
    }
}
