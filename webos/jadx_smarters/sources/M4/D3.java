package M4;

/* JADX INFO: loaded from: classes3.dex */
public final class D3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ A3 f4229a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ A3 f4230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f4231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f4232e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ I3 f4233f;

    public D3(I3 i32, A3 a32, A3 a33, long j9, boolean z9) {
        this.f4233f = i32;
        this.f4229a = a32;
        this.f4230c = a33;
        this.f4231d = j9;
        this.f4232e = z9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4233f.o(this.f4229a, this.f4230c, this.f4231d, this.f4232e, null);
    }
}
