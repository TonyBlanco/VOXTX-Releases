package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2026s1 extends AbstractC2046w1 implements InterfaceC2003n2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final double[] f42744h;

    C2026s1(Spliterator spliterator, AbstractC1940b abstractC1940b, double[] dArr) {
        super(spliterator, abstractC1940b, dArr.length);
        this.f42744h = dArr;
    }

    C2026s1(C2026s1 c2026s1, Spliterator spliterator, long j9, long j10) {
        super(c2026s1, spliterator, j9, j10, c2026s1.f42744h.length);
        this.f42744h = c2026s1.f42744h;
    }

    @Override // j$.util.stream.AbstractC2046w1, j$.util.stream.InterfaceC2018q2
    public final void accept(double d9) {
        int i9 = this.f42778f;
        if (i9 >= this.f42779g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f42778f));
        }
        double[] dArr = this.f42744h;
        this.f42778f = i9 + 1;
        dArr[i9] = d9;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void q(Object obj) {
        q((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.AbstractC2046w1
    final AbstractC2046w1 b(Spliterator spliterator, long j9, long j10) {
        return new C2026s1(this, spliterator, j9, j10);
    }

    @Override // j$.util.stream.InterfaceC2003n2
    public final /* synthetic */ void q(Double d9) {
        AbstractC2055y0.e(this, d9);
    }
}
