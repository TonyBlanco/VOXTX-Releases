package O5;

import O5.z;

/* JADX INFO: renamed from: O5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0939c extends z.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6561b;

    public C0939c(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f6560a = str;
        this.f6561b = str2;
    }

    @Override // O5.z.a
    public String c() {
        return this.f6560a;
    }

    @Override // O5.z.a
    public String d() {
        return this.f6561b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z.a)) {
            return false;
        }
        z.a aVar = (z.a) obj;
        if (this.f6560a.equals(aVar.c())) {
            String str = this.f6561b;
            String strD = aVar.d();
            if (str == null) {
                if (strD == null) {
                    return true;
                }
            } else if (str.equals(strD)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f6560a.hashCode() ^ 1000003) * 1000003;
        String str = this.f6561b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f6560a + ", firebaseInstallationId=" + this.f6561b + "}";
    }
}
