package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2019q3 implements InterfaceC2008o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntConsumer f42737b;

    public /* synthetic */ C2019q3(IntConsumer intConsumer, int i9) {
        this.f42736a = i9;
        this.f42737b = intConsumer;
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
        switch (this.f42736a) {
            case 0:
                AbstractC2055y0.a();
                throw null;
            default:
                AbstractC2055y0.a();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC2008o2, j$.util.stream.InterfaceC2018q2
    public final void accept(int i9) {
        switch (this.f42736a) {
            case 0:
                ((V2) this.f42737b).accept(i9);
                break;
            default:
                this.f42737b.accept(i9);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC2018q2, j$.util.stream.InterfaceC2013p2, java.util.function.LongConsumer
    public final /* synthetic */ void accept(long j9) {
        switch (this.f42736a) {
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
        switch (this.f42736a) {
            case 0:
                n((Integer) obj);
                break;
            default:
                n((Integer) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f42736a) {
        }
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.f42736a) {
        }
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void l() {
        int i9 = this.f42736a;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void m(long j9) {
        int i9 = this.f42736a;
    }

    @Override // j$.util.stream.InterfaceC2008o2
    public final /* synthetic */ void n(Integer num) {
        switch (this.f42736a) {
            case 0:
                AbstractC2055y0.g(this, num);
                break;
            default:
                AbstractC2055y0.g(this, num);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ boolean o() {
        switch (this.f42736a) {
        }
        return false;
    }
}
