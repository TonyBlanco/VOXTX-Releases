package J2;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M2.a f3028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f3029b;

    public b(M2.a aVar, Map map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f3028a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f3029b = map;
    }

    @Override // J2.f
    public M2.a e() {
        return this.f3028a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f3028a.equals(fVar.e()) && this.f3029b.equals(fVar.h());
    }

    @Override // J2.f
    public Map h() {
        return this.f3029b;
    }

    public int hashCode() {
        return ((this.f3028a.hashCode() ^ 1000003) * 1000003) ^ this.f3029b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f3028a + ", values=" + this.f3029b + "}";
    }
}
