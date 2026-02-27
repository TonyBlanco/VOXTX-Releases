package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class H3 implements InterfaceC2018q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f42445b;

    public /* synthetic */ H3(Consumer consumer, int i9) {
        this.f42444a = i9;
        this.f42445b = consumer;
    }

    private final /* synthetic */ void b(long j9) {
    }

    private final /* synthetic */ void c(long j9) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void accept(double d9) {
        switch (this.f42444a) {
            case 0:
                AbstractC2055y0.a();
                throw null;
            default:
                AbstractC2055y0.a();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void accept(int i9) {
        switch (this.f42444a) {
            case 0:
                AbstractC2055y0.k();
                throw null;
            default:
                AbstractC2055y0.k();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC2018q2, j$.util.stream.InterfaceC2013p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j9) {
        switch (this.f42444a) {
            case 0:
                AbstractC2055y0.l();
                throw null;
            default:
                AbstractC2055y0.l();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void q(Object obj) {
        switch (this.f42444a) {
            case 0:
                ((C1939a3) this.f42445b).q(obj);
                break;
            default:
                this.f42445b.q(obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f42444a) {
        }
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void l() {
        int i9 = this.f42444a;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void m(long j9) {
        int i9 = this.f42444a;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ boolean o() {
        switch (this.f42444a) {
        }
        return false;
    }
}
