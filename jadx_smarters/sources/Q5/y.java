package Q5;

import Q5.D;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends D.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f8381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f8382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final L5.e f8383f;

    public y(String str, String str2, String str3, String str4, int i9, L5.e eVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f8378a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f8379b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f8380c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f8381d = str4;
        this.f8382e = i9;
        if (eVar == null) {
            throw new NullPointerException("Null developmentPlatformProvider");
        }
        this.f8383f = eVar;
    }

    @Override // Q5.D.a
    public String a() {
        return this.f8378a;
    }

    @Override // Q5.D.a
    public int c() {
        return this.f8382e;
    }

    @Override // Q5.D.a
    public L5.e d() {
        return this.f8383f;
    }

    @Override // Q5.D.a
    public String e() {
        return this.f8381d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof D.a)) {
            return false;
        }
        D.a aVar = (D.a) obj;
        return this.f8378a.equals(aVar.a()) && this.f8379b.equals(aVar.f()) && this.f8380c.equals(aVar.g()) && this.f8381d.equals(aVar.e()) && this.f8382e == aVar.c() && this.f8383f.equals(aVar.d());
    }

    @Override // Q5.D.a
    public String f() {
        return this.f8379b;
    }

    @Override // Q5.D.a
    public String g() {
        return this.f8380c;
    }

    public int hashCode() {
        return ((((((((((this.f8378a.hashCode() ^ 1000003) * 1000003) ^ this.f8379b.hashCode()) * 1000003) ^ this.f8380c.hashCode()) * 1000003) ^ this.f8381d.hashCode()) * 1000003) ^ this.f8382e) * 1000003) ^ this.f8383f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f8378a + ", versionCode=" + this.f8379b + ", versionName=" + this.f8380c + ", installUuid=" + this.f8381d + ", deliveryMechanism=" + this.f8382e + ", developmentPlatformProvider=" + this.f8383f + "}";
    }
}
