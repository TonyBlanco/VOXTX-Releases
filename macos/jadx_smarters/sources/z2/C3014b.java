package z2;

/* JADX INFO: renamed from: z2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3014b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52660a;

    public C3014b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f52660a = str;
    }

    public static C3014b b(String str) {
        return new C3014b(str);
    }

    public String a() {
        return this.f52660a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3014b) {
            return this.f52660a.equals(((C3014b) obj).f52660a);
        }
        return false;
    }

    public int hashCode() {
        return this.f52660a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f52660a + "\"}";
    }
}
