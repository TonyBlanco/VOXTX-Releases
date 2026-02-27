package Z0;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Long f10786b;

    public d(String str, long j9) {
        this.f10785a = str;
        this.f10786b = Long.valueOf(j9);
    }

    public d(String str, boolean z9) {
        this(str, z9 ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f10785a.equals(dVar.f10785a)) {
            return false;
        }
        Long l9 = this.f10786b;
        Long l10 = dVar.f10786b;
        return l9 != null ? l9.equals(l10) : l10 == null;
    }

    public int hashCode() {
        int iHashCode = this.f10785a.hashCode() * 31;
        Long l9 = this.f10786b;
        return iHashCode + (l9 != null ? l9.hashCode() : 0);
    }
}
