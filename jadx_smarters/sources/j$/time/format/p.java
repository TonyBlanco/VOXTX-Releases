package j$.time.format;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j$.time.temporal.o f42085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DateTimeFormatter f42086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42087c;

    /* JADX WARN: Removed duplicated region for block: B:49:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    p(j$.time.temporal.o r10, j$.time.format.DateTimeFormatter r11) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.p.<init>(j$.time.temporal.o, j$.time.format.DateTimeFormatter):void");
    }

    final void a() {
        this.f42087c--;
    }

    final s b() {
        return this.f42086b.c();
    }

    final Locale c() {
        return this.f42086b.d();
    }

    final j$.time.temporal.o d() {
        return this.f42085a;
    }

    final Long e(j$.time.temporal.r rVar) {
        int i9 = this.f42087c;
        j$.time.temporal.o oVar = this.f42085a;
        if (i9 <= 0 || oVar.f(rVar)) {
            return Long.valueOf(oVar.q(rVar));
        }
        return null;
    }

    final Object f(a aVar) {
        j$.time.temporal.o oVar = this.f42085a;
        Object objT = oVar.t(aVar);
        if (objT != null || this.f42087c != 0) {
            return objT;
        }
        throw new j$.time.c("Unable to extract " + aVar + " from temporal " + oVar);
    }

    final void g() {
        this.f42087c++;
    }

    public final String toString() {
        return this.f42085a.toString();
    }
}
