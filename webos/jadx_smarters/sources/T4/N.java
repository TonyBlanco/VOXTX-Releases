package t4;

/* JADX INFO: loaded from: classes3.dex */
public final class N implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q f50666a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2776c f50667c;

    public N(P p9, Q q9, C2776c c2776c) {
        this.f50666a = q9;
        this.f50667c = c2776c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Q.n(this.f50666a, this.f50667c);
    }
}
