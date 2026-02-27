package Q5;

import Q5.D;

/* JADX INFO: loaded from: classes3.dex */
public final class A extends D.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8041c;

    public A(String str, String str2, boolean z9) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f8039a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f8040b = str2;
        this.f8041c = z9;
    }

    @Override // Q5.D.c
    public boolean b() {
        return this.f8041c;
    }

    @Override // Q5.D.c
    public String c() {
        return this.f8040b;
    }

    @Override // Q5.D.c
    public String d() {
        return this.f8039a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D.c)) {
            return false;
        }
        D.c cVar = (D.c) obj;
        return this.f8039a.equals(cVar.d()) && this.f8040b.equals(cVar.c()) && this.f8041c == cVar.b();
    }

    public int hashCode() {
        return ((((this.f8039a.hashCode() ^ 1000003) * 1000003) ^ this.f8040b.hashCode()) * 1000003) ^ (this.f8041c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f8039a + ", osCodeName=" + this.f8040b + ", isRooted=" + this.f8041c + "}";
    }
}
