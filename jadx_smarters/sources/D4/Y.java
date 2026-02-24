package d4;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f39744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f39745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39747d;

    public Y() {
        this(10);
    }

    public Y(int i9) {
        this.f39744a = new long[i9];
        this.f39745b = f(i9);
    }

    public static Object[] f(int i9) {
        return new Object[i9];
    }

    public synchronized void a(long j9, Object obj) {
        d(j9);
        e();
        b(j9, obj);
    }

    public final void b(long j9, Object obj) {
        int i9 = this.f39746c;
        int i10 = this.f39747d;
        Object[] objArr = this.f39745b;
        int length = (i9 + i10) % objArr.length;
        this.f39744a[length] = j9;
        objArr[length] = obj;
        this.f39747d = i10 + 1;
    }

    public synchronized void c() {
        this.f39746c = 0;
        this.f39747d = 0;
        Arrays.fill(this.f39745b, (Object) null);
    }

    public final void d(long j9) {
        if (this.f39747d > 0) {
            if (j9 <= this.f39744a[((this.f39746c + r0) - 1) % this.f39745b.length]) {
                c();
            }
        }
    }

    public final void e() {
        int length = this.f39745b.length;
        if (this.f39747d < length) {
            return;
        }
        int i9 = length * 2;
        long[] jArr = new long[i9];
        Object[] objArrF = f(i9);
        int i10 = this.f39746c;
        int i11 = length - i10;
        System.arraycopy(this.f39744a, i10, jArr, 0, i11);
        System.arraycopy(this.f39745b, this.f39746c, objArrF, 0, i11);
        int i12 = this.f39746c;
        if (i12 > 0) {
            System.arraycopy(this.f39744a, 0, jArr, i11, i12);
            System.arraycopy(this.f39745b, 0, objArrF, i11, this.f39746c);
        }
        this.f39744a = jArr;
        this.f39745b = objArrF;
        this.f39746c = 0;
    }

    public synchronized Object g(long j9) {
        return h(j9, false);
    }

    public final Object h(long j9, boolean z9) {
        Object objK = null;
        long j10 = Long.MAX_VALUE;
        while (this.f39747d > 0) {
            long j11 = j9 - this.f39744a[this.f39746c];
            if (j11 < 0 && (z9 || (-j11) >= j10)) {
                break;
            }
            objK = k();
            j10 = j11;
        }
        return objK;
    }

    public synchronized Object i() {
        return this.f39747d == 0 ? null : k();
    }

    public synchronized Object j(long j9) {
        return h(j9, true);
    }

    public final Object k() {
        AbstractC1684a.g(this.f39747d > 0);
        Object[] objArr = this.f39745b;
        int i9 = this.f39746c;
        Object obj = objArr[i9];
        objArr[i9] = null;
        this.f39746c = (i9 + 1) % objArr.length;
        this.f39747d--;
        return obj;
    }

    public synchronized int l() {
        return this.f39747d;
    }
}
