package M4;

/* JADX INFO: loaded from: classes3.dex */
public final class Z2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4568a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f4571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0824t3 f4572f;

    public Z2(C0824t3 c0824t3, String str, String str2, Object obj, long j9) {
        this.f4572f = c0824t3;
        this.f4568a = str;
        this.f4569c = str2;
        this.f4570d = obj;
        this.f4571e = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4572f.M(this.f4568a, this.f4569c, this.f4570d, this.f4571e);
    }
}
