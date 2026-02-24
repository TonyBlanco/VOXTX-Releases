package M4;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: M4.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC0811r2 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D2 f5041d;

    public CallableC0811r2(D2 d22, String str, String str2, String str3) {
        this.f5041d = d22;
        this.f5038a = str;
        this.f5039b = str2;
        this.f5040c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.f5041d.f4226a.e();
        return this.f5041d.f4226a.V().a0(this.f5038a, this.f5039b, this.f5040c);
    }
}
