package F3;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1931c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1932d;

    public b(String str, String str2, int i9, int i10) {
        this.f1929a = str;
        this.f1930b = str2;
        this.f1931c = i9;
        this.f1932d = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1931c == bVar.f1931c && this.f1932d == bVar.f1932d && r5.j.a(this.f1929a, bVar.f1929a) && r5.j.a(this.f1930b, bVar.f1930b);
    }

    public int hashCode() {
        return r5.j.b(this.f1929a, this.f1930b, Integer.valueOf(this.f1931c), Integer.valueOf(this.f1932d));
    }
}
