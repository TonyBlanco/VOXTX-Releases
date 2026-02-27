package t4;

/* JADX INFO: loaded from: classes3.dex */
public final class L implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Q f50662a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f50663c;

    public L(P p9, Q q9, int i9) {
        this.f50662a = q9;
        this.f50663c = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f50662a.f50678e.onApplicationDisconnected(this.f50663c);
    }
}
