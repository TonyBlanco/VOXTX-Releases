package d4;

import java.util.Arrays;

/* JADX INFO: renamed from: d4.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1682C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f39646b;

    public C1682C() {
        this(32);
    }

    public C1682C(int i9) {
        this.f39646b = new long[i9];
    }

    public void a(long j9) {
        int i9 = this.f39645a;
        long[] jArr = this.f39646b;
        if (i9 == jArr.length) {
            this.f39646b = Arrays.copyOf(jArr, i9 * 2);
        }
        long[] jArr2 = this.f39646b;
        int i10 = this.f39645a;
        this.f39645a = i10 + 1;
        jArr2[i10] = j9;
    }

    public long b(int i9) {
        if (i9 >= 0 && i9 < this.f39645a) {
            return this.f39646b[i9];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i9 + ", size is " + this.f39645a);
    }

    public int c() {
        return this.f39645a;
    }

    public long[] d() {
        return Arrays.copyOf(this.f39646b, this.f39645a);
    }
}
