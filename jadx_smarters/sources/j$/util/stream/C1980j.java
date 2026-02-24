package j$.util.stream;

import java.util.stream.Collector;

/* JADX INFO: renamed from: j$.util.stream.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1980j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Collector f42684a;

    private /* synthetic */ C1980j(Collector collector) {
        this.f42684a = collector;
    }

    public static /* synthetic */ C1980j a(Collector collector) {
        if (collector == null) {
            return null;
        }
        if (!(collector instanceof AbstractC1985k)) {
            return new C1980j(collector);
        }
        throw null;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        Collector collector = this.f42684a;
        if (obj instanceof C1980j) {
            obj = ((C1980j) obj).f42684a;
        }
        return collector.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.f42684a.hashCode();
    }
}
