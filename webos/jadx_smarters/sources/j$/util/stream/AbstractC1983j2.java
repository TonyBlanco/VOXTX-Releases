package j$.util.stream;

import j$.util.Objects;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1983j2 implements InterfaceC2003n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final InterfaceC2018q2 f42686a;

    public AbstractC1983j2(InterfaceC2018q2 interfaceC2018q2) {
        this.f42686a = (InterfaceC2018q2) Objects.requireNonNull(interfaceC2018q2);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void accept(int i9) {
        AbstractC2055y0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2018q2, j$.util.stream.InterfaceC2013p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j9) {
        AbstractC2055y0.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        q((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public void l() {
        this.f42686a.l();
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public void m(long j9) {
        this.f42686a.m(j9);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public boolean o() {
        return this.f42686a.o();
    }

    @Override // j$.util.stream.InterfaceC2003n2
    public final /* synthetic */ void q(Double d9) {
        AbstractC2055y0.e(this, d9);
    }
}
