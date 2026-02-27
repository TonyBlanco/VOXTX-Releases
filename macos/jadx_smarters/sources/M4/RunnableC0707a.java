package M4;

/* JADX INFO: renamed from: M4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0707a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4578a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f4579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ E0 f4580d;

    public RunnableC0707a(E0 e02, String str, long j9) {
        this.f4580d = e02;
        this.f4578a = str;
        this.f4579c = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        E0.i(this.f4580d, this.f4578a, this.f4579c);
    }
}
