package F3;

import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f1976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1977e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f1973a = str;
        this.f1974b = str2;
        this.f1975c = str3;
        this.f1976d = str4;
        this.f1977e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k0.c(this.f1973a, hVar.f1973a) && k0.c(this.f1974b, hVar.f1974b) && k0.c(this.f1975c, hVar.f1975c) && k0.c(this.f1976d, hVar.f1976d) && k0.c(this.f1977e, hVar.f1977e);
    }

    public int hashCode() {
        String str = this.f1973a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1974b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f1975c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f1976d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f1977e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
