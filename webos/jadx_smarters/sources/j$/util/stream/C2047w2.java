package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import okhttp3.internal.http2.Http2;

/* JADX INFO: renamed from: j$.util.stream.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2047w2 extends AbstractC1981j0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final /* synthetic */ long f42780m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final /* synthetic */ long f42781n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2047w2(AbstractC1940b abstractC1940b, int i9, long j9, long j10) {
        super(abstractC1940b, i9, 0);
        this.f42780m = j9;
        this.f42781n = j10;
    }

    @Override // j$.util.stream.AbstractC1940b
    final K0 O(AbstractC1940b abstractC1940b, Spliterator spliterator, IntFunction intFunction) {
        long jMin;
        long j9;
        long jG = abstractC1940b.G(spliterator);
        if (jG > 0 && spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            return AbstractC2055y0.H(abstractC1940b, AbstractC2055y0.C(abstractC1940b.J(), spliterator, this.f42780m, this.f42781n), true);
        }
        if (EnumC1959e3.ORDERED.q(abstractC1940b.K())) {
            return (K0) new A2(this, abstractC1940b, spliterator, intFunction, this.f42780m, this.f42781n).invoke();
        }
        j$.util.K k9 = (j$.util.K) abstractC1940b.X(spliterator);
        long j10 = this.f42780m;
        long j11 = this.f42781n;
        if (j10 <= jG) {
            jMin = j11 >= 0 ? Math.min(j11, jG - j10) : jG - j10;
            j9 = 0;
        } else {
            jMin = j11;
            j9 = j10;
        }
        return AbstractC2055y0.H(this, new C3(k9, j9, jMin), true);
    }

    @Override // j$.util.stream.AbstractC1940b
    final Spliterator P(AbstractC1940b abstractC1940b, Spliterator spliterator) {
        long j9;
        long j10;
        long jG = abstractC1940b.G(spliterator);
        long j11 = this.f42781n;
        if (jG > 0 && spliterator.hasCharacteristics(Http2.INITIAL_MAX_FRAME_SIZE)) {
            j$.util.K k9 = (j$.util.K) abstractC1940b.X(spliterator);
            long j12 = this.f42780m;
            return new C2048w3(k9, j12, AbstractC2055y0.B(j12, j11));
        }
        if (EnumC1959e3.ORDERED.q(abstractC1940b.K())) {
            return ((K0) new A2(this, abstractC1940b, spliterator, new C1948c2(2), this.f42780m, this.f42781n).invoke()).spliterator();
        }
        j$.util.K k10 = (j$.util.K) abstractC1940b.X(spliterator);
        long j13 = this.f42780m;
        if (j13 <= jG) {
            long jMin = jG - j13;
            if (j11 >= 0) {
                jMin = Math.min(j11, jMin);
            }
            j9 = jMin;
            j10 = 0;
        } else {
            j9 = j11;
            j10 = j13;
        }
        return new C3(k10, j10, j9);
    }

    @Override // j$.util.stream.AbstractC1940b
    final InterfaceC2018q2 R(int i9, InterfaceC2018q2 interfaceC2018q2) {
        return new C2042v2(this, interfaceC2018q2);
    }
}
