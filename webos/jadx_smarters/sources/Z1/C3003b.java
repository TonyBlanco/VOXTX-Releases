package z1;

/* JADX INFO: renamed from: z1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3003b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C3003b f52622b = new C3003b("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52623a;

    public C3003b(String str) {
        this.f52623a = str;
    }

    public static C3003b a(String str) {
        return new C3003b((String) x1.g.c(str, "key == null"));
    }

    public String b() {
        return this.f52623a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3003b) {
            return this.f52623a.equals(((C3003b) obj).f52623a);
        }
        return false;
    }

    public int hashCode() {
        return this.f52623a.hashCode();
    }

    public String toString() {
        return this.f52623a;
    }
}
