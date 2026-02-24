package M4;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: M4.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC0817s2 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D2 f5057d;

    public CallableC0817s2(D2 d22, String str, String str2, String str3) {
        this.f5057d = d22;
        this.f5054a = str;
        this.f5055b = str2;
        this.f5056c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.f5057d.f4226a.e();
        return this.f5057d.f4226a.V().a0(this.f5054a, this.f5055b, this.f5056c);
    }
}
