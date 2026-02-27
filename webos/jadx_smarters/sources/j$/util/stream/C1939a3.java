package j$.util.stream;

import j$.lang.Iterable;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
class C1939a3 extends AbstractC1950d implements Consumer, Iterable, Iterable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected Object[] f42582e = new Object[1 << 4];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Object[][] f42583f;

    C1939a3() {
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        long length;
        int i9 = this.f42604b;
        Object[] objArr = this.f42582e;
        if (i9 == objArr.length) {
            if (this.f42583f == null) {
                Object[][] objArr2 = new Object[8][];
                this.f42583f = objArr2;
                this.f42606d = new long[8];
                objArr2[0] = objArr;
            }
            int i10 = this.f42605c;
            int i11 = i10 + 1;
            Object[][] objArr3 = this.f42583f;
            if (i11 >= objArr3.length || objArr3[i11] == null) {
                if (i10 == 0) {
                    length = objArr.length;
                } else {
                    length = ((long) objArr3[i10].length) + this.f42606d[i10];
                }
                s(length + 1);
            }
            this.f42604b = 0;
            int i12 = this.f42605c + 1;
            this.f42605c = i12;
            this.f42582e = this.f42583f[i12];
        }
        Object[] objArr4 = this.f42582e;
        int i13 = this.f42604b;
        this.f42604b = i13 + 1;
        objArr4[i13] = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // j$.util.stream.AbstractC1950d
    public final void clear() {
        Object[][] objArr = this.f42583f;
        if (objArr != null) {
            this.f42582e = objArr[0];
            int i9 = 0;
            while (true) {
                Object[] objArr2 = this.f42582e;
                if (i9 >= objArr2.length) {
                    break;
                }
                objArr2[i9] = null;
                i9++;
            }
            this.f42583f = null;
            this.f42606d = null;
        } else {
            for (int i10 = 0; i10 < this.f42604b; i10++) {
                this.f42582e[i10] = null;
            }
        }
        this.f42604b = 0;
        this.f42605c = 0;
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public void forEach(Consumer consumer) {
        for (int i9 = 0; i9 < this.f42605c; i9++) {
            for (Object obj : this.f42583f[i9]) {
                consumer.accept(obj);
            }
        }
        for (int i10 = 0; i10 < this.f42604b; i10++) {
            consumer.accept(this.f42582e[i10]);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Spliterators.i(spliterator());
    }

    protected final void s(long j9) {
        int i9 = this.f42605c;
        long length = i9 == 0 ? this.f42582e.length : this.f42606d[i9] + ((long) this.f42583f[i9].length);
        if (j9 > length) {
            if (this.f42583f == null) {
                Object[][] objArr = new Object[8][];
                this.f42583f = objArr;
                this.f42606d = new long[8];
                objArr[0] = this.f42582e;
            }
            int i10 = i9 + 1;
            while (j9 > length) {
                Object[][] objArr2 = this.f42583f;
                if (i10 >= objArr2.length) {
                    int length2 = objArr2.length * 2;
                    this.f42583f = (Object[][]) Arrays.copyOf(objArr2, length2);
                    this.f42606d = Arrays.copyOf(this.f42606d, length2);
                }
                int iMin = this.f42603a;
                if (i10 != 0 && i10 != 1) {
                    iMin = Math.min((iMin + i10) - 1, 30);
                }
                int i11 = 1 << iMin;
                Object[][] objArr3 = this.f42583f;
                objArr3[i10] = new Object[i11];
                long[] jArr = this.f42606d;
                int i12 = i10 - 1;
                jArr[i10] = jArr[i12] + ((long) objArr3[i12].length);
                length += (long) i11;
                i10++;
            }
        }
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public Spliterator spliterator() {
        return new R2(this, 0, this.f42605c, 0, this.f42604b);
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Objects.requireNonNull(arrayList);
        forEach(new C1935a(arrayList, 10));
        return "SpinedBuffer:" + arrayList.toString();
    }
}
