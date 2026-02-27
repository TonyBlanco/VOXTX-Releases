package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.u0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC2035u0 implements InterfaceC2018q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f42757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f42758b;

    AbstractC2035u0(EnumC2040v0 enumC2040v0) {
        this.f42758b = !enumC2040v0.f42765b;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public /* synthetic */ void accept(double d9) {
        AbstractC2055y0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public /* synthetic */ void accept(int i9) {
        AbstractC2055y0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2018q2, j$.util.stream.InterfaceC2013p2, java.util.function.LongConsumer
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
    public final /* synthetic */ void m(long j9) {
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final boolean o() {
        return this.f42757a;
    }
}
