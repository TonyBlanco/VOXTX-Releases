package M4;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class A2 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f4186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D2 f4187b;

    public A2(D2 d22, String str) {
        this.f4187b = d22;
        this.f4186a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.f4187b.f4226a.e();
        return this.f4187b.f4226a.V().c0(this.f4186a);
    }
}
