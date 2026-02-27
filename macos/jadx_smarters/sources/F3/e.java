package F3;

import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1962c;

    public e(String str, String str2, String str3) {
        this.f1960a = str;
        this.f1961b = str2;
        this.f1962c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return k0.c(this.f1960a, eVar.f1960a) && k0.c(this.f1961b, eVar.f1961b) && k0.c(this.f1962c, eVar.f1962c);
    }

    public int hashCode() {
        int iHashCode = this.f1960a.hashCode() * 31;
        String str = this.f1961b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1962c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
