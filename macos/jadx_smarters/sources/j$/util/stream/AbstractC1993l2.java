package j$.util.stream;

import j$.util.Objects;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1993l2 implements InterfaceC2013p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final InterfaceC2018q2 f42697a;

    public AbstractC1993l2(InterfaceC2018q2 interfaceC2018q2) {
        this.f42697a = (InterfaceC2018q2) Objects.requireNonNull(interfaceC2018q2);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void accept(double d9) {
        AbstractC2055y0.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void accept(int i9) {
        AbstractC2055y0.k();
        throw null;
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        k((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.g(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC2013p2
    public final /* synthetic */ void k(Long l9) {
        AbstractC2055y0.i(this, l9);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public void l() {
        this.f42697a.l();
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public void m(long j9) {
        this.f42697a.m(j9);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public boolean o() {
        return this.f42697a.o();
    }
}
