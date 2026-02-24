package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
abstract class L implements L3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f42464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f42465b;

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

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void q(Object obj) {
        if (this.f42464a) {
            return;
        }
        this.f42464a = true;
        this.f42465b = obj;
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
        return this.f42464a;
    }
}
