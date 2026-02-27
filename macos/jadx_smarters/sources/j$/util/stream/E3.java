package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class E3 extends G3 implements Spliterator, Consumer {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object f42419f;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f42419f = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // j$.util.stream.G3
    protected final Spliterator c(Spliterator spliterator) {
        return new E3(spliterator, this);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C1994l3 c1994l3 = null;
        while (true) {
            F3 f3D = d();
            if (f3D == F3.NO_MORE) {
                return;
            }
            F3 f32 = F3.MAYBE_MORE;
            Spliterator spliterator = this.f42432a;
            if (f3D != f32) {
                spliterator.forEachRemaining(consumer);
                return;
            }
            int i9 = this.f42434c;
            if (c1994l3 == null) {
                c1994l3 = new C1994l3(i9);
            } else {
                c1994l3.f42709a = 0;
            }
            long j9 = 0;
            while (spliterator.tryAdvance(c1994l3)) {
                j9++;
                if (j9 >= i9) {
                    break;
                }
            }
            if (j9 == 0) {
                return;
            }
            long jB = b(j9);
            for (int i10 = 0; i10 < jB; i10++) {
                consumer.accept(c1994l3.f42698b[i10]);
            }
        }
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
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (d() != F3.NO_MORE && this.f42432a.tryAdvance(this)) {
            if (b(1L) == 1) {
                consumer.accept(this.f42419f);
                this.f42419f = null;
                return true;
            }
        }
        return false;
    }
}
