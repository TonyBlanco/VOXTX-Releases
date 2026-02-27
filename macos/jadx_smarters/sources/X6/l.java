package x6;

/* JADX INFO: loaded from: classes.dex */
public final class l extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f51970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f51971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f51972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f51973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f51974g;

    public l(byte[] bArr, int i9, int i10, int i11, int i12, int i13, int i14, boolean z9) {
        super(i13, i14);
        if (i11 + i13 > i9 || i12 + i14 > i10) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f51970c = bArr;
        this.f51971d = i9;
        this.f51972e = i10;
        this.f51973f = i11;
        this.f51974g = i12;
        if (z9) {
            h(i13, i14);
        }
    }

    @Override // x6.i
    public byte[] b() {
        int iD = d();
        int iA = a();
        int i9 = this.f51971d;
        if (iD == i9 && iA == this.f51972e) {
            return this.f51970c;
        }
        int i10 = iD * iA;
        byte[] bArr = new byte[i10];
        int i11 = (this.f51974g * i9) + this.f51973f;
        if (iD == i9) {
            System.arraycopy(this.f51970c, i11, bArr, 0, i10);
            return bArr;
        }
        for (int i12 = 0; i12 < iA; i12++) {
            System.arraycopy(this.f51970c, i11, bArr, i12 * iD, iD);
            i11 += this.f51971d;
        }
        return bArr;
    }

    @Override // x6.i
    public byte[] c(int i9, byte[] bArr) {
        if (i9 < 0 || i9 >= a()) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i9)));
        }
        int iD = d();
        if (bArr == null || bArr.length < iD) {
            bArr = new byte[iD];
        }
        System.arraycopy(this.f51970c, ((i9 + this.f51974g) * this.f51971d) + this.f51973f, bArr, 0, iD);
        return bArr;
    }

    public final void h(int i9, int i10) {
        byte[] bArr = this.f51970c;
        int i11 = (this.f51974g * this.f51971d) + this.f51973f;
        int i12 = 0;
        while (i12 < i10) {
            int i13 = (i9 / 2) + i11;
            int i14 = (i11 + i9) - 1;
            int i15 = i11;
            while (i15 < i13) {
                byte b9 = bArr[i15];
                bArr[i15] = bArr[i14];
                bArr[i14] = b9;
                i15++;
                i14--;
            }
            i12++;
            i11 += this.f51971d;
        }
    }
}
