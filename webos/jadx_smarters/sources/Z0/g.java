package Z0;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10791b;

    public g(String str, int i9) {
        this.f10790a = str;
        this.f10791b = i9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f10791b != gVar.f10791b) {
            return false;
        }
        return this.f10790a.equals(gVar.f10790a);
    }

    public int hashCode() {
        return (this.f10790a.hashCode() * 31) + this.f10791b;
    }
}
