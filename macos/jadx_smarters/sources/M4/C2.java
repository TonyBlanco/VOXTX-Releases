package M4;

/* JADX INFO: loaded from: classes3.dex */
public final class C2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4205a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f4207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f4208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ D2 f4209f;

    public C2(D2 d22, String str, String str2, String str3, long j9) {
        this.f4209f = d22;
        this.f4205a = str;
        this.f4206c = str2;
        this.f4207d = str3;
        this.f4208e = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f4205a;
        if (str == null) {
            this.f4209f.f4226a.w(this.f4206c, null);
        } else {
            this.f4209f.f4226a.w(this.f4206c, new A3(this.f4207d, str, this.f4208e));
        }
    }
}
