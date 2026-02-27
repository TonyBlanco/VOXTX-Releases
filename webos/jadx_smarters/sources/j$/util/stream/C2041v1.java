package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2041v1 extends AbstractC2046w1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object[] f42766h;

    C2041v1(Spliterator spliterator, AbstractC1940b abstractC1940b, Object[] objArr) {
        super(spliterator, abstractC1940b, objArr.length);
        this.f42766h = objArr;
    }

    C2041v1(C2041v1 c2041v1, Spliterator spliterator, long j9, long j10) {
        super(c2041v1, spliterator, j9, j10, c2041v1.f42766h.length);
        this.f42766h = c2041v1.f42766h;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i9 = this.f42778f;
        if (i9 >= this.f42779g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f42778f));
        }
        Object[] objArr = this.f42766h;
        this.f42778f = i9 + 1;
        objArr[i9] = obj;
    }

    @Override // j$.util.stream.AbstractC2046w1
    final AbstractC2046w1 b(Spliterator spliterator, long j9, long j10) {
        return new C2041v1(this, spliterator, j9, j10);
    }
}
