package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
abstract class S implements K3, L3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f42531a;

    protected S(boolean z9) {
        this.f42531a = z9;
    }

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

    @Override // j$.util.stream.K3
    public final int d() {
        if (this.f42531a) {
            return 0;
        }
        return EnumC1959e3.f42634r;
    }

    public final void e(AbstractC1940b abstractC1940b, Spliterator spliterator) {
        (this.f42531a ? new T(abstractC1940b, spliterator, this) : new U(abstractC1940b, spliterator, abstractC1940b.W(this))).invoke();
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void l() {
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void m(long j9) {
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ boolean o() {
        return false;
    }
}
