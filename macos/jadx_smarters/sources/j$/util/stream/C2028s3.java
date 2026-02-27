package j$.util.stream;

import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2028s3 implements InterfaceC2013p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LongConsumer f42748b;

    public /* synthetic */ C2028s3(LongConsumer longConsumer, int i9) {
        this.f42747a = i9;
        this.f42748b = longConsumer;
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
        switch (this.f42747a) {
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
        switch (this.f42747a) {
            case 0:
                AbstractC2055y0.k();
                throw null;
            default:
                AbstractC2055y0.k();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC2013p2, java.util.function.LongConsumer
    public final void accept(long j9) {
        switch (this.f42747a) {
            case 0:
                ((X2) this.f42748b).accept(j9);
                break;
            default:
                this.f42748b.accept(j9);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void q(Object obj) {
        switch (this.f42747a) {
            case 0:
                k((Long) obj);
                break;
            default:
                k((Long) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.f42747a) {
        }
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        switch (this.f42747a) {
        }
        return j$.com.android.tools.r8.a.g(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC2013p2
    public final /* synthetic */ void k(Long l9) {
        switch (this.f42747a) {
            case 0:
                AbstractC2055y0.i(this, l9);
                break;
            default:
                AbstractC2055y0.i(this, l9);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void l() {
        int i9 = this.f42747a;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ void m(long j9) {
        int i9 = this.f42747a;
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ boolean o() {
        switch (this.f42747a) {
        }
        return false;
    }
}
