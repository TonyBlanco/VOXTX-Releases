package M4;

/* JADX INFO: loaded from: classes3.dex */
public final class A4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4.e f4194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4195b;

    public A4(C4.e eVar) {
        com.google.android.gms.common.internal.r.m(eVar);
        this.f4194a = eVar;
    }

    public final void a() {
        this.f4195b = 0L;
    }

    public final void b() {
        this.f4195b = this.f4194a.b();
    }

    public final boolean c(long j9) {
        return this.f4195b == 0 || this.f4194a.b() - this.f4195b >= 3600000;
    }
}
