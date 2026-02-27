package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2036u1 extends AbstractC2046w1 implements InterfaceC2013p2 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long[] f42759h;

    C2036u1(Spliterator spliterator, AbstractC1940b abstractC1940b, long[] jArr) {
        super(spliterator, abstractC1940b, jArr.length);
        this.f42759h = jArr;
    }

    C2036u1(C2036u1 c2036u1, Spliterator spliterator, long j9, long j10) {
        super(c2036u1, spliterator, j9, j10, c2036u1.f42759h.length);
        this.f42759h = c2036u1.f42759h;
    }

    @Override // j$.util.stream.AbstractC2046w1, j$.util.stream.InterfaceC2018q2, j$.util.stream.InterfaceC2013p2, java.util.function.LongConsumer
    public final void accept(long j9) {
        int i9 = this.f42778f;
        if (i9 >= this.f42779g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f42778f));
        }
        long[] jArr = this.f42759h;
        this.f42778f = i9 + 1;
        jArr[i9] = j9;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void q(Object obj) {
        k((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.g(this, longConsumer);
    }

    @Override // j$.util.stream.AbstractC2046w1
    final AbstractC2046w1 b(Spliterator spliterator, long j9, long j10) {
        return new C2036u1(this, spliterator, j9, j10);
    }

    @Override // j$.util.stream.InterfaceC2013p2
    public final /* synthetic */ void k(Long l9) {
        AbstractC2055y0.i(this, l9);
    }
}
