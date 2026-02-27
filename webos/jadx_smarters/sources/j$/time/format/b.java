package j$.time.format;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Comparator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Comparator f42049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f42050c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ r f42051a;

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
        f42049b = new q();
    }

    b(r rVar) {
        this.f42051a = rVar;
    }

    public final String b(j$.time.chrono.n nVar, j$.time.temporal.r rVar, long j9, v vVar, Locale locale) {
        return this.f42051a.a(j9, vVar);
    }

    public final String c(j$.time.temporal.r rVar, long j9, v vVar, Locale locale) {
        return this.f42051a.a(j9, vVar);
    }
}
