package M4;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: M4.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC0800p2 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4988b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4989c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D2 f4990d;

    public CallableC0800p2(D2 d22, String str, String str2, String str3) {
        this.f4990d = d22;
        this.f4987a = str;
        this.f4988b = str2;
        this.f4989c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.f4990d.f4226a.e();
        return this.f4990d.f4226a.V().d0(this.f4987a, this.f4988b, this.f4989c);
    }
}
