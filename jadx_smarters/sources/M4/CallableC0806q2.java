package M4;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: M4.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC0806q2 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f5018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f5019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D2 f5021d;

    public CallableC0806q2(D2 d22, String str, String str2, String str3) {
        this.f5021d = d22;
        this.f5018a = str;
        this.f5019b = str2;
        this.f5020c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.f5021d.f4226a.e();
        return this.f5021d.f4226a.V().d0(this.f5018a, this.f5019b, this.f5020c);
    }
}
