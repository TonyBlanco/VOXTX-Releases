package t6;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f50806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f50807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f50808c;

    public f(d performance, d crashlytics, double d9) {
        kotlin.jvm.internal.l.e(performance, "performance");
        kotlin.jvm.internal.l.e(crashlytics, "crashlytics");
        this.f50806a = performance;
        this.f50807b = crashlytics;
        this.f50808c = d9;
    }

    public /* synthetic */ f(d dVar, d dVar2, double d9, int i9, kotlin.jvm.internal.g gVar) {
        this((i9 & 1) != 0 ? d.COLLECTION_SDK_NOT_INSTALLED : dVar, (i9 & 2) != 0 ? d.COLLECTION_SDK_NOT_INSTALLED : dVar2, (i9 & 4) != 0 ? 1.0d : d9);
    }

    public final d a() {
        return this.f50807b;
    }

    public final d b() {
        return this.f50806a;
    }

    public final double c() {
        return this.f50808c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f50806a == fVar.f50806a && this.f50807b == fVar.f50807b && kotlin.jvm.internal.l.a(Double.valueOf(this.f50808c), Double.valueOf(fVar.f50808c));
    }

    public int hashCode() {
        return (((this.f50806a.hashCode() * 31) + this.f50807b.hashCode()) * 31) + e.a(this.f50808c);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.f50806a + ", crashlytics=" + this.f50807b + ", sessionSamplingRate=" + this.f50808c + ')';
    }
}
