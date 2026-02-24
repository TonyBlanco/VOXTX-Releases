package v6;

import kotlin.jvm.internal.l;

/* JADX INFO: renamed from: v6.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2891e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f51439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f51440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f51441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f51442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f51443e;

    public C2891e(Boolean bool, Double d9, Integer num, Integer num2, Long l9) {
        this.f51439a = bool;
        this.f51440b = d9;
        this.f51441c = num;
        this.f51442d = num2;
        this.f51443e = l9;
    }

    public final Integer a() {
        return this.f51442d;
    }

    public final Long b() {
        return this.f51443e;
    }

    public final Boolean c() {
        return this.f51439a;
    }

    public final Integer d() {
        return this.f51441c;
    }

    public final Double e() {
        return this.f51440b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2891e)) {
            return false;
        }
        C2891e c2891e = (C2891e) obj;
        return l.a(this.f51439a, c2891e.f51439a) && l.a(this.f51440b, c2891e.f51440b) && l.a(this.f51441c, c2891e.f51441c) && l.a(this.f51442d, c2891e.f51442d) && l.a(this.f51443e, c2891e.f51443e);
    }

    public int hashCode() {
        Boolean bool = this.f51439a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d9 = this.f51440b;
        int iHashCode2 = (iHashCode + (d9 == null ? 0 : d9.hashCode())) * 31;
        Integer num = this.f51441c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f51442d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l9 = this.f51443e;
        return iHashCode4 + (l9 != null ? l9.hashCode() : 0);
    }

    public String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f51439a + ", sessionSamplingRate=" + this.f51440b + ", sessionRestartTimeout=" + this.f51441c + ", cacheDuration=" + this.f51442d + ", cacheUpdatedTime=" + this.f51443e + ')';
    }
}
