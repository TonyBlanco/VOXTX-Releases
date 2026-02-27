package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
final class Z0 extends T2 implements E0, InterfaceC2060z0 {
    @Override // j$.util.stream.K0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ E0 i(long j9, long j10, IntFunction intFunction) {
        return AbstractC2055y0.t(this, j9, j10);
    }

    @Override // j$.util.stream.InterfaceC2060z0, j$.util.stream.C0
    public final E0 a() {
        return this;
    }

    @Override // j$.util.stream.C0
    public final K0 a() {
        return this;
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
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void q(Object obj) {
        q((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // j$.util.stream.J0, j$.util.stream.K0
    public final J0 b(int i9) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final /* bridge */ /* synthetic */ K0 b(int i9) {
        b(i9);
        throw null;
    }

    @Override // j$.util.stream.Z2, j$.util.stream.J0
    public final void d(Object obj, int i9) {
        super.d((double[]) obj, i9);
    }

    @Override // j$.util.stream.Z2, j$.util.stream.J0
    public final Object e() {
        return (double[]) super.e();
    }

    @Override // j$.util.stream.Z2, j$.util.stream.J0
    public final void f(Object obj) {
        super.f((DoubleConsumer) obj);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final void l() {
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        clear();
        v(j9);
    }

    @Override // j$.util.stream.InterfaceC2018q2
    public final /* synthetic */ boolean o() {
        return false;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ Object[] p(IntFunction intFunction) {
        return AbstractC2055y0.m(this, intFunction);
    }

    @Override // j$.util.stream.InterfaceC2003n2
    public final /* synthetic */ void q(Double d9) {
        AbstractC2055y0.e(this, d9);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int r() {
        return 0;
    }

    @Override // j$.util.stream.T2, j$.util.stream.Z2, java.lang.Iterable, j$.lang.Iterable
    public final j$.util.N spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.T2, j$.util.stream.Z2, java.lang.Iterable, j$.lang.Iterable
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.K0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void j(Double[] dArr, int i9) {
        AbstractC2055y0.n(this, dArr, i9);
    }
}
