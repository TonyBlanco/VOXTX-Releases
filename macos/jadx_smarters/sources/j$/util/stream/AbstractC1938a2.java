package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1938a2 extends V1 implements U1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f42581b;

    public /* synthetic */ void accept(double d9) {
        AbstractC2055y0.a();
        throw null;
    }

    public /* synthetic */ void accept(int i9) {
        AbstractC2055y0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j9) {
        AbstractC2055y0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void l() {
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        this.f42581b = 0L;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ boolean o() {
        return false;
    }
}
