package j$.util.stream;

import j$.util.Objects;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.m2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1998m2 implements InterfaceC2018q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final InterfaceC2018q2 f42708a;

    public AbstractC1998m2(InterfaceC2018q2 interfaceC2018q2) {
        this.f42708a = (InterfaceC2018q2) Objects.requireNonNull(interfaceC2018q2);
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

    @Override // j$.util.stream.InterfaceC2018q2, j$.util.stream.InterfaceC2013p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j9) {
        AbstractC2055y0.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public void l() {
        this.f42708a.l();
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public void m(long j9) {
        this.f42708a.m(j9);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public boolean o() {
        return this.f42708a.o();
    }
}
