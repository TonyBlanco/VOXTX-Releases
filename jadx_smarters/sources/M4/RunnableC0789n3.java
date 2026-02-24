package M4;

/* JADX INFO: renamed from: M4.n3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0789n3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Boolean f4952a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0824t3 f4953c;

    public RunnableC0789n3(C0824t3 c0824t3, Boolean bool) {
        this.f4953c = c0824t3;
        this.f4952a = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4953c.O(this.f4952a, true);
    }
}
