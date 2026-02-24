package j$.util.stream;

import j$.util.Objects;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.k2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1988k2 implements InterfaceC2008o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final InterfaceC2018q2 f42690a;

    public AbstractC1988k2(InterfaceC2018q2 interfaceC2018q2) {
        this.f42690a = (InterfaceC2018q2) Objects.requireNonNull(interfaceC2018q2);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void accept(double d9) {
        AbstractC2055y0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2018q2, j$.util.stream.InterfaceC2013p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j9) {
        AbstractC2055y0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        n((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public void l() {
        this.f42690a.l();
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public void m(long j9) {
        this.f42690a.m(j9);
    }

    @Override // j$.util.stream.InterfaceC2008o2
    public final /* synthetic */ void n(Integer num) {
        AbstractC2055y0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public boolean o() {
        return this.f42690a.o();
    }
}
