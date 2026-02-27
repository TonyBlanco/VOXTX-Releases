package j$.util.stream;

import j$.lang.Iterable;
import j$.util.Spliterator;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
abstract class Z2 extends AbstractC1950d implements Iterable, Iterable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f42575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Object[] f42576f;

    Z2() {
        this.f42575e = c(16);
    }

    Z2(int i9) {
        super(i9);
        this.f42575e = c(1 << this.f42603a);
    }

    public abstract Object c(int i9);

    @Override // j$.util.stream.AbstractC1950d
    public final void clear() {
        Object[] objArr = this.f42576f;
        if (objArr != null) {
            this.f42575e = objArr[0];
            this.f42576f = null;
            this.f42606d = null;
        }
        this.f42604b = 0;
        this.f42605c = 0;
    }

    public void d(Object obj, int i9) {
        long j9 = i9;
        long jCount = count() + j9;
        if (jCount > t(obj) || jCount < j9) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.f42605c == 0) {
            System.arraycopy(this.f42575e, 0, obj, i9, this.f42604b);
            return;
        }
        for (int i10 = 0; i10 < this.f42605c; i10++) {
            Object obj2 = this.f42576f[i10];
            System.arraycopy(obj2, 0, obj, i9, t(obj2));
            i9 += t(this.f42576f[i10]);
        }
        int i11 = this.f42604b;
        if (i11 > 0) {
            System.arraycopy(this.f42575e, 0, obj, i9, i11);
        }
    }

    public Object e() {
        long jCount = count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objC = c((int) jCount);
        d(objC, 0);
        return objC;
    }

    public void f(Object obj) {
        for (int i9 = 0; i9 < this.f42605c; i9++) {
            Object obj2 = this.f42576f[i9];
            s(obj2, 0, t(obj2), obj);
        }
        s(this.f42575e, 0, this.f42604b, obj);
    }

    protected abstract void s(Object obj, int i9, int i10, Object obj2);

    public abstract Spliterator spliterator();

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    protected abstract int t(Object obj);

    protected final int u(long j9) {
        if (this.f42605c == 0) {
            if (j9 < this.f42604b) {
                return 0;
            }
            throw new IndexOutOfBoundsException(Long.toString(j9));
        }
        if (j9 >= count()) {
            throw new IndexOutOfBoundsException(Long.toString(j9));
        }
        for (int i9 = 0; i9 <= this.f42605c; i9++) {
            if (j9 < this.f42606d[i9] + ((long) t(this.f42576f[i9]))) {
                return i9;
            }
        }
        throw new IndexOutOfBoundsException(Long.toString(j9));
    }

    protected final void v(long j9) {
        long jT;
        int i9 = this.f42605c;
        if (i9 == 0) {
            jT = t(this.f42575e);
        } else {
            jT = ((long) t(this.f42576f[i9])) + this.f42606d[i9];
        }
        if (j9 > jT) {
            if (this.f42576f == null) {
                Object[] objArrW = w();
                this.f42576f = objArrW;
                this.f42606d = new long[8];
                objArrW[0] = this.f42575e;
            }
            int i10 = this.f42605c + 1;
            while (j9 > jT) {
                Object[] objArr = this.f42576f;
                if (i10 >= objArr.length) {
                    int length = objArr.length * 2;
                    this.f42576f = Arrays.copyOf(objArr, length);
                    this.f42606d = Arrays.copyOf(this.f42606d, length);
                }
                int iMin = this.f42603a;
                if (i10 != 0 && i10 != 1) {
                    iMin = Math.min((iMin + i10) - 1, 30);
                }
                int i11 = 1 << iMin;
                this.f42576f[i10] = c(i11);
                long[] jArr = this.f42606d;
                int i12 = i10 - 1;
                jArr[i10] = jArr[i12] + ((long) t(this.f42576f[i12]));
                jT += (long) i11;
                i10++;
            }
        }
    }

    protected abstract Object[] w();

    protected final void x() {
        long jT;
        if (this.f42604b == t(this.f42575e)) {
            if (this.f42576f == null) {
                Object[] objArrW = w();
                this.f42576f = objArrW;
                this.f42606d = new long[8];
                objArrW[0] = this.f42575e;
            }
            int i9 = this.f42605c;
            int i10 = i9 + 1;
            Object[] objArr = this.f42576f;
            if (i10 >= objArr.length || objArr[i10] == null) {
                if (i9 == 0) {
                    jT = t(this.f42575e);
                } else {
                    jT = ((long) t(objArr[i9])) + this.f42606d[i9];
                }
                v(jT + 1);
            }
            this.f42604b = 0;
            int i11 = this.f42605c + 1;
            this.f42605c = i11;
            this.f42575e = this.f42576f[i11];
        }
    }
}
