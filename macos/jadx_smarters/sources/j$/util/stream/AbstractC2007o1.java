package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;

/* JADX INFO: renamed from: j$.util.stream.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC2007o1 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    K0 f42720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f42721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Spliterator f42722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Spliterator f42723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayDeque f42724e;

    AbstractC2007o1(K0 k02) {
        this.f42720a = k02;
    }

    protected static K0 a(Deque deque) {
        while (true) {
            K0 k02 = (K0) deque.pollFirst();
            if (k02 == null) {
                return null;
            }
            if (k02.r() != 0) {
                for (int iR = k02.r() - 1; iR >= 0; iR--) {
                    deque.addFirst(k02.b(iR));
                }
            } else if (k02.count() > 0) {
                return k02;
            }
        }
    }

    protected final ArrayDeque b() {
        ArrayDeque arrayDeque = new ArrayDeque(8);
        int iR = this.f42720a.r();
        while (true) {
            iR--;
            if (iR < this.f42721b) {
                return arrayDeque;
            }
            arrayDeque.addFirst(this.f42720a.b(iR));
        }
    }

    protected final boolean c() {
        if (this.f42720a == null) {
            return false;
        }
        if (this.f42723d != null) {
            return true;
        }
        Spliterator spliterator = this.f42722c;
        if (spliterator == null) {
            ArrayDeque arrayDequeB = b();
            this.f42724e = arrayDequeB;
            K0 k0A = a(arrayDequeB);
            if (k0A == null) {
                this.f42720a = null;
                return false;
            }
            spliterator = k0A.spliterator();
        }
        this.f42723d = spliterator;
        return true;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        return 64;
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        long jCount = 0;
        if (this.f42720a == null) {
            return 0L;
        }
        Spliterator spliterator = this.f42722c;
        if (spliterator != null) {
            return spliterator.estimateSize();
        }
        for (int i9 = this.f42721b; i9 < this.f42720a.r(); i9++) {
            jCount += this.f42720a.b(i9).count();
        }
        return jCount;
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.util.A.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i9) {
        return j$.util.A.e(this, i9);
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.E trySplit() {
        return (j$.util.E) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.H trySplit() {
        return (j$.util.H) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.K trySplit() {
        return (j$.util.K) trySplit();
    }

    @Override // j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.N trySplit() {
        return (j$.util.N) trySplit();
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        K0 k02 = this.f42720a;
        if (k02 == null || this.f42723d != null) {
            return null;
        }
        Spliterator spliterator = this.f42722c;
        if (spliterator != null) {
            return spliterator.trySplit();
        }
        if (this.f42721b < k02.r() - 1) {
            K0 k03 = this.f42720a;
            int i9 = this.f42721b;
            this.f42721b = i9 + 1;
            return k03.b(i9).spliterator();
        }
        K0 k0B = this.f42720a.b(this.f42721b);
        this.f42720a = k0B;
        if (k0B.r() == 0) {
            Spliterator spliterator2 = this.f42720a.spliterator();
            this.f42722c = spliterator2;
            return spliterator2.trySplit();
        }
        K0 k04 = this.f42720a;
        this.f42721b = 1;
        return k04.b(0).spliterator();
    }
}
