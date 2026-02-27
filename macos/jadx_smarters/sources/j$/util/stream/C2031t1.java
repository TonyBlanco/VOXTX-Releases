package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2031t1 extends AbstractC2046w1 implements InterfaceC2008o2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f42751h;

    C2031t1(Spliterator spliterator, AbstractC1940b abstractC1940b, int[] iArr) {
        super(spliterator, abstractC1940b, iArr.length);
        this.f42751h = iArr;
    }

    C2031t1(C2031t1 c2031t1, Spliterator spliterator, long j9, long j10) {
        super(c2031t1, spliterator, j9, j10, c2031t1.f42751h.length);
        this.f42751h = c2031t1.f42751h;
    }

    @Override // j$.util.stream.AbstractC2046w1, j$.util.stream.InterfaceC2018q2
    public final void accept(int i9) {
        int i10 = this.f42778f;
        if (i10 >= this.f42779g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f42778f));
        }
        int[] iArr = this.f42751h;
        this.f42778f = i10 + 1;
        iArr[i10] = i9;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void q(Object obj) {
        n((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }

    @Override // j$.util.stream.AbstractC2046w1
    final AbstractC2046w1 b(Spliterator spliterator, long j9, long j10) {
        return new C2031t1(this, spliterator, j9, j10);
    }

    @Override // j$.util.stream.InterfaceC2008o2
    public final /* synthetic */ void n(Integer num) {
        AbstractC2055y0.g(this, num);
    }
}
