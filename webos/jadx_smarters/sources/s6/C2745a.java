package s6;

/* JADX INFO: renamed from: s6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2745a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f50165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f50166b;

    public C2745a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f50165a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f50166b = str2;
    }

    @Override // s6.f
    public String b() {
        return this.f50165a;
    }

    @Override // s6.f
    public String c() {
        return this.f50166b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f50165a.equals(fVar.b()) && this.f50166b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.f50165a.hashCode() ^ 1000003) * 1000003) ^ this.f50166b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f50165a + ", version=" + this.f50166b + "}";
    }
}
