package j$.util.stream;

import j$.util.Spliterators;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
class V2 extends Z2 implements IntConsumer {
    @Override // java.util.function.IntConsumer
    public void accept(int i9) {
        x();
        int[] iArr = (int[]) this.f42575e;
        int i10 = this.f42604b;
        this.f42604b = i10 + 1;
        iArr[i10] = i9;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }

    @Override // j$.util.stream.Z2
    public final Object c(int i9) {
        return new int[i9];
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            f((IntConsumer) consumer);
        } else {
            if (N3.f42490a) {
                N3.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            j$.util.A.b((U2) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.g(spliterator());
    }

    @Override // j$.util.stream.Z2
    protected final void s(Object obj, int i9, int i10, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i9 < i10) {
            intConsumer.accept(iArr[i9]);
            i9++;
        }
    }

    @Override // j$.util.stream.Z2
    protected final int t(Object obj) {
        return ((int[]) obj).length;
    }

    public final String toString() {
        int[] iArr = (int[]) e();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f42605c), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.f42605c), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }

    @Override // j$.util.stream.Z2
    protected final Object[] w() {
        return new int[8][];
    }

    @Override // j$.util.stream.Z2, java.lang.Iterable, j$.lang.Iterable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public j$.util.H spliterator() {
        return new U2(this, 0, this.f42605c, 0, this.f42604b);
    }
}
