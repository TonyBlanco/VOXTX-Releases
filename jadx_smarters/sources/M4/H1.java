package M4;

/* JADX INFO: loaded from: classes3.dex */
public final class H1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f4263a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I1 f4264c;

    public H1(I1 i12, boolean z9) {
        this.f4264c = i12;
        this.f4263a = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4264c.f4270a.o(this.f4263a);
    }
}
