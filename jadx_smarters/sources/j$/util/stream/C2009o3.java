package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2009o3 implements InterfaceC2003n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DoubleConsumer f42726b;

    public /* synthetic */ C2009o3(DoubleConsumer doubleConsumer, int i9) {
        this.f42725a = i9;
        this.f42726b = doubleConsumer;
    }

    private final /* synthetic */ void b(long j9) {
    }

    private final /* synthetic */ void c(long j9) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    @Override // j$.util.stream.InterfaceC2003n2, j$.util.stream.InterfaceC2018q2
    public final void accept(double d9) {
        switch (this.f42725a) {
            case 0:
                ((T2) this.f42726b).accept(d9);
                break;
            default:
                this.f42726b.accept(d9);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void accept(int i9) {
        switch (this.f42725a) {
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
        switch (this.f42725a) {
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
    public final /* bridge */ /* synthetic */ void q(Object obj) {
        switch (this.f42725a) {
            case 0:
                q((Double) obj);
                break;
            default:
                q((Double) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f42725a) {
        }
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        switch (this.f42725a) {
        }
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void l() {
        int i9 = this.f42725a;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void m(long j9) {
        int i9 = this.f42725a;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ boolean o() {
        switch (this.f42725a) {
        }
        return false;
    }

    @Override // j$.util.stream.InterfaceC2003n2
    public final /* synthetic */ void q(Double d9) {
        switch (this.f42725a) {
            case 0:
                AbstractC2055y0.e(this, d9);
                break;
            default:
                AbstractC2055y0.e(this, d9);
                break;
        }
    }
}
