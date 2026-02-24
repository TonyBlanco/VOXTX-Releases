package d3;

import d4.AbstractC1684a;

/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f39623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f39625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39626d;

    public y(byte[] bArr) {
        this.f39623a = bArr;
        this.f39624b = bArr.length;
    }

    public final void a() {
        int i9;
        int i10 = this.f39625c;
        AbstractC1684a.g(i10 >= 0 && (i10 < (i9 = this.f39624b) || (i10 == i9 && this.f39626d == 0)));
    }

    public int b() {
        return (this.f39625c * 8) + this.f39626d;
    }

    public boolean c() {
        boolean z9 = (((this.f39623a[this.f39625c] & 255) >> this.f39626d) & 1) == 1;
        e(1);
        return z9;
    }

    public int d(int i9) {
        int i10 = this.f39625c;
        int iMin = Math.min(i9, 8 - this.f39626d);
        int i11 = i10 + 1;
        int i12 = ((this.f39623a[i10] & 255) >> this.f39626d) & (255 >> (8 - iMin));
        while (iMin < i9) {
            i12 |= (this.f39623a[i11] & 255) << iMin;
            iMin += 8;
            i11++;
        }
        int i13 = i12 & ((-1) >>> (32 - i9));
        e(i9);
        return i13;
    }

    public void e(int i9) {
        int i10 = i9 / 8;
        int i11 = this.f39625c + i10;
        this.f39625c = i11;
        int i12 = this.f39626d + (i9 - (i10 * 8));
        this.f39626d = i12;
        if (i12 > 7) {
            this.f39625c = i11 + 1;
            this.f39626d = i12 - 8;
        }
        a();
    }
}
