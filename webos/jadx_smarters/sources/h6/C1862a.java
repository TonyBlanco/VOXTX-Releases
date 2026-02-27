package h6;

import java.util.List;

/* JADX INFO: renamed from: h6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1862a extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f41667b;

    public C1862a(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f41666a = str;
        if (list == null) {
            throw new NullPointerException("Null usedDates");
        }
        this.f41667b = list;
    }

    @Override // h6.l
    public List b() {
        return this.f41667b;
    }

    @Override // h6.l
    public String c() {
        return this.f41666a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f41666a.equals(lVar.c()) && this.f41667b.equals(lVar.b());
    }

    public int hashCode() {
        return ((this.f41666a.hashCode() ^ 1000003) * 1000003) ^ this.f41667b.hashCode();
    }

    public String toString() {
        return "HeartBeatResult{userAgent=" + this.f41666a + ", usedDates=" + this.f41667b + "}";
    }
}
