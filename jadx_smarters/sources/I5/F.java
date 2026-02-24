package I5;

/* JADX INFO: loaded from: classes3.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f2851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f2852b;

    public @interface a {
    }

    public F(Class cls, Class cls2) {
        this.f2851a = cls;
        this.f2852b = cls2;
    }

    public static F a(Class cls, Class cls2) {
        return new F(cls, cls2);
    }

    public static F b(Class cls) {
        return new F(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F.class != obj.getClass()) {
            return false;
        }
        F f9 = (F) obj;
        if (this.f2852b.equals(f9.f2852b)) {
            return this.f2851a.equals(f9.f2851a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f2852b.hashCode() * 31) + this.f2851a.hashCode();
    }

    public String toString() {
        if (this.f2851a == a.class) {
            return this.f2852b.getName();
        }
        return "@" + this.f2851a.getName() + " " + this.f2852b.getName();
    }
}
