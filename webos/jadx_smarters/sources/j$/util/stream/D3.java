package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
abstract class D3 extends G3 implements j$.util.N {
    protected abstract void e(Object obj);

    protected abstract AbstractC1989k3 f(int i9);

    @Override // j$.util.N
    public final void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
        AbstractC1989k3 abstractC1989k3F = null;
        while (true) {
            F3 f3D = d();
            if (f3D == F3.NO_MORE) {
                return;
            }
            F3 f32 = F3.MAYBE_MORE;
            Spliterator spliterator = this.f42432a;
            if (f3D != f32) {
                ((j$.util.N) spliterator).forEachRemaining(obj);
                return;
            }
            int i9 = this.f42434c;
            if (abstractC1989k3F == null) {
                abstractC1989k3F = f(i9);
            } else {
                abstractC1989k3F.f42691b = 0;
            }
            long j9 = 0;
            while (((j$.util.N) spliterator).tryAdvance(abstractC1989k3F)) {
                j9++;
                if (j9 >= i9) {
                    break;
                }
            }
            if (j9 == 0) {
                return;
            } else {
                abstractC1989k3F.b(obj, b(j9));
            }
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

    @Override // j$.util.N
    public final boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        while (d() != F3.NO_MORE && ((j$.util.N) this.f42432a).tryAdvance(this)) {
            if (b(1L) == 1) {
                e(obj);
                return true;
            }
        }
        return false;
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
