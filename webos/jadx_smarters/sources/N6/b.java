package N6;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5362b;

    public b(int i9, int i10) {
        this.f5361a = i9;
        this.f5362b = i10;
    }

    public final int a() {
        return this.f5362b;
    }

    public final int b() {
        return this.f5361a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5361a == bVar.f5361a && this.f5362b == bVar.f5362b;
    }

    public final int hashCode() {
        return this.f5361a ^ this.f5362b;
    }

    public final String toString() {
        return this.f5361a + "(" + this.f5362b + ')';
    }
}
