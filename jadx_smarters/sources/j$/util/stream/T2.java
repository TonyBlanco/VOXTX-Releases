package j$.util.stream;

import j$.util.Spliterators;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
class T2 extends Z2 implements DoubleConsumer {
    @Override // java.util.function.DoubleConsumer
    public void accept(double d9) {
        x();
        double[] dArr = (double[]) this.f42575e;
        int i9 = this.f42604b;
        this.f42604b = i9 + 1;
        dArr[i9] = d9;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.Z2
    public final Object c(int i9) {
        return new double[i9];
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            f((DoubleConsumer) consumer);
        } else {
            if (N3.f42490a) {
                N3.a(getClass(), "{0} calling SpinedBuffer.OfDouble.forEach(Consumer)");
                throw null;
            }
            j$.util.A.a((S2) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.f(spliterator());
    }

    @Override // j$.util.stream.Z2
    protected final void s(Object obj, int i9, int i10, Object obj2) {
        double[] dArr = (double[]) obj;
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj2;
        while (i9 < i10) {
            doubleConsumer.accept(dArr[i9]);
            i9++;
        }
    }

    @Override // j$.util.stream.Z2
    protected final int t(Object obj) {
        return ((double[]) obj).length;
    }

    public final String toString() {
        double[] dArr = (double[]) e();
        if (dArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f42605c), Arrays.toString(dArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(dArr.length), Integer.valueOf(this.f42605c), Arrays.toString(Arrays.copyOf(dArr, 200)));
    }

    @Override // j$.util.stream.Z2
    protected final Object[] w() {
        return new double[8][];
    }

    @Override // j$.util.stream.Z2, java.lang.Iterable, j$.lang.Iterable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public j$.util.E spliterator() {
        return new S2(this, 0, this.f42605c, 0, this.f42604b);
    }
}
