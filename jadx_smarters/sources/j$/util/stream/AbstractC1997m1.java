package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1997m1 extends AbstractC2007o1 implements j$.util.N {
    @Override // j$.util.N
    public final void forEachRemaining(Object obj) {
        if (this.f42720a == null) {
            return;
        }
        if (this.f42723d != null) {
            while (tryAdvance(obj)) {
            }
            return;
        }
        Spliterator spliterator = this.f42722c;
        if (spliterator != null) {
            ((j$.util.N) spliterator).forEachRemaining(obj);
            return;
        }
        ArrayDeque arrayDequeB = b();
        while (true) {
            J0 j02 = (J0) AbstractC2007o1.a(arrayDequeB);
            if (j02 == null) {
                this.f42720a = null;
                return;
            }
            j02.f(obj);
        }
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        forEachRemaining((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        forEachRemaining((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        forEachRemaining((Object) longConsumer);
    }

    @Override // j$.util.N
    public final boolean tryAdvance(Object obj) {
        J0 j02;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = ((j$.util.N) this.f42723d).tryAdvance(obj);
        if (!zTryAdvance) {
            if (this.f42722c == null && (j02 = (J0) AbstractC2007o1.a(this.f42724e)) != null) {
                j$.util.N nSpliterator = j02.spliterator();
                this.f42723d = nSpliterator;
                return nSpliterator.tryAdvance(obj);
            }
            this.f42720a = null;
        }
        return zTryAdvance;
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return tryAdvance((Object) doubleConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(IntConsumer intConsumer) {
        return tryAdvance((Object) intConsumer);
    }

    public /* bridge */ /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return tryAdvance((Object) longConsumer);
    }
}
