package t4;

/* JADX INFO: loaded from: classes3.dex */
public final class M implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q f50664a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2778e f50665c;

    public M(P p9, Q q9, C2778e c2778e) {
        this.f50664a = q9;
        this.f50665c = c2778e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Q.o(this.f50664a, this.f50665c);
    }
}
