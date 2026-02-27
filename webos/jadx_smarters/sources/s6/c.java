package S6;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f9441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f9442b;

    public c(b bVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f9441a = bVar;
        int length = iArr.length;
        int i9 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f9442b = iArr;
            return;
        }
        while (i9 < length && iArr[i9] == 0) {
            i9++;
        }
        if (i9 == length) {
            this.f9442b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i9];
        this.f9442b = iArr2;
        System.arraycopy(iArr, i9, iArr2, 0, iArr2.length);
    }

    public c a(c cVar) {
        if (!this.f9441a.equals(cVar.f9441a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (e()) {
            return cVar;
        }
        if (cVar.e()) {
            return this;
        }
        int[] iArr = this.f9442b;
        int[] iArr2 = cVar.f9442b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i9 = length; i9 < iArr.length; i9++) {
            iArr3[i9] = this.f9441a.a(iArr2[i9 - length], iArr[i9]);
        }
        return new c(this.f9441a, iArr3);
    }

    public int b(int i9) {
        if (i9 == 0) {
            return c(0);
        }
        if (i9 == 1) {
            int iA = 0;
            for (int i10 : this.f9442b) {
                iA = this.f9441a.a(iA, i10);
            }
            return iA;
        }
        int[] iArr = this.f9442b;
        int iA2 = iArr[0];
        int length = iArr.length;
        for (int i11 = 1; i11 < length; i11++) {
            b bVar = this.f9441a;
            iA2 = bVar.a(bVar.i(i9, iA2), this.f9442b[i11]);
        }
        return iA2;
    }

    public int c(int i9) {
        return this.f9442b[(r0.length - 1) - i9];
    }

    public int d() {
        return this.f9442b.length - 1;
    }

    public boolean e() {
        return this.f9442b[0] == 0;
    }

    public c f(int i9) {
        if (i9 == 0) {
            return this.f9441a.f();
        }
        if (i9 == 1) {
            return this;
        }
        int length = this.f9442b.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = this.f9441a.i(this.f9442b[i10], i9);
        }
        return new c(this.f9441a, iArr);
    }

    public c g(c cVar) {
        if (!this.f9441a.equals(cVar.f9441a)) {
            throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
        }
        if (e() || cVar.e()) {
            return this.f9441a.f();
        }
        int[] iArr = this.f9442b;
        int length = iArr.length;
        int[] iArr2 = cVar.f9442b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = iArr[i9];
            for (int i11 = 0; i11 < length2; i11++) {
                int i12 = i9 + i11;
                b bVar = this.f9441a;
                iArr3[i12] = bVar.a(iArr3[i12], bVar.i(i10, iArr2[i11]));
            }
        }
        return new c(this.f9441a, iArr3);
    }

    public c h(int i9, int i10) {
        if (i9 < 0) {
            throw new IllegalArgumentException();
        }
        if (i10 == 0) {
            return this.f9441a.f();
        }
        int length = this.f9442b.length;
        int[] iArr = new int[i9 + length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = this.f9441a.i(this.f9442b[i11], i10);
        }
        return new c(this.f9441a, iArr);
    }

    public c i() {
        int length = this.f9442b.length;
        int[] iArr = new int[length];
        for (int i9 = 0; i9 < length; i9++) {
            iArr[i9] = this.f9441a.j(0, this.f9442b[i9]);
        }
        return new c(this.f9441a, iArr);
    }

    public c j(c cVar) {
        if (this.f9441a.equals(cVar.f9441a)) {
            return cVar.e() ? this : a(cVar.i());
        }
        throw new IllegalArgumentException("ModulusPolys do not have same ModulusGF field");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(d() * 8);
        for (int iD = d(); iD >= 0; iD--) {
            int iC = c(iD);
            if (iC != 0) {
                if (iC < 0) {
                    sb.append(" - ");
                    iC = -iC;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iD == 0 || iC != 1) {
                    sb.append(iC);
                }
                if (iD != 0) {
                    if (iD == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iD);
                    }
                }
            }
        }
        return sb.toString();
    }
}
