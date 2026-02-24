package F6;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f2041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f2042b;

    public b(a aVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f2041a = aVar;
        int length = iArr.length;
        int i9 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f2042b = iArr;
            return;
        }
        while (i9 < length && iArr[i9] == 0) {
            i9++;
        }
        if (i9 == length) {
            this.f2042b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i9];
        this.f2042b = iArr2;
        System.arraycopy(iArr, i9, iArr2, 0, iArr2.length);
    }

    public b a(b bVar) {
        if (!this.f2041a.equals(bVar.f2041a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (g()) {
            return bVar;
        }
        if (bVar.g()) {
            return this;
        }
        int[] iArr = this.f2042b;
        int[] iArr2 = bVar.f2042b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i9 = length; i9 < iArr.length; i9++) {
            iArr3[i9] = a.a(iArr2[i9 - length], iArr[i9]);
        }
        return new b(this.f2041a, iArr3);
    }

    public b[] b(b bVar) {
        if (!this.f2041a.equals(bVar.f2041a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (bVar.g()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        b bVarG = this.f2041a.g();
        int iH = this.f2041a.h(bVar.d(bVar.f()));
        b bVarA = this;
        while (bVarA.f() >= bVar.f() && !bVarA.g()) {
            int iF = bVarA.f() - bVar.f();
            int iJ = this.f2041a.j(bVarA.d(bVarA.f()), iH);
            b bVarJ = bVar.j(iF, iJ);
            bVarG = bVarG.a(this.f2041a.b(iF, iJ));
            bVarA = bVarA.a(bVarJ);
        }
        return new b[]{bVarG, bVarA};
    }

    public int c(int i9) {
        if (i9 == 0) {
            return d(0);
        }
        if (i9 == 1) {
            int iA = 0;
            for (int i10 : this.f2042b) {
                iA = a.a(iA, i10);
            }
            return iA;
        }
        int[] iArr = this.f2042b;
        int iA2 = iArr[0];
        int length = iArr.length;
        for (int i11 = 1; i11 < length; i11++) {
            iA2 = a.a(this.f2041a.j(i9, iA2), this.f2042b[i11]);
        }
        return iA2;
    }

    public int d(int i9) {
        return this.f2042b[(r0.length - 1) - i9];
    }

    public int[] e() {
        return this.f2042b;
    }

    public int f() {
        return this.f2042b.length - 1;
    }

    public boolean g() {
        return this.f2042b[0] == 0;
    }

    public b h(int i9) {
        if (i9 == 0) {
            return this.f2041a.g();
        }
        if (i9 == 1) {
            return this;
        }
        int length = this.f2042b.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = this.f2041a.j(this.f2042b[i10], i9);
        }
        return new b(this.f2041a, iArr);
    }

    public b i(b bVar) {
        if (!this.f2041a.equals(bVar.f2041a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (g() || bVar.g()) {
            return this.f2041a.g();
        }
        int[] iArr = this.f2042b;
        int length = iArr.length;
        int[] iArr2 = bVar.f2042b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = iArr[i9];
            for (int i11 = 0; i11 < length2; i11++) {
                int i12 = i9 + i11;
                iArr3[i12] = a.a(iArr3[i12], this.f2041a.j(i10, iArr2[i11]));
            }
        }
        return new b(this.f2041a, iArr3);
    }

    public b j(int i9, int i10) {
        if (i9 < 0) {
            throw new IllegalArgumentException();
        }
        if (i10 == 0) {
            return this.f2041a.g();
        }
        int length = this.f2042b.length;
        int[] iArr = new int[i9 + length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = this.f2041a.j(this.f2042b[i11], i10);
        }
        return new b(this.f2041a, iArr);
    }

    public String toString() {
        char c9;
        if (g()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(f() * 8);
        int iF = f();
        while (iF >= 0) {
            int iD = d(iF);
            if (iD != 0) {
                if (iD < 0) {
                    sb.append(iF == f() ? "-" : " - ");
                    iD = -iD;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iF == 0 || iD != 1) {
                    int i9 = this.f2041a.i(iD);
                    if (i9 == 0) {
                        c9 = '1';
                    } else if (i9 == 1) {
                        c9 = 'a';
                    } else {
                        sb.append("a^");
                        sb.append(i9);
                    }
                    sb.append(c9);
                }
                if (iF != 0) {
                    if (iF == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iF);
                    }
                }
            }
            iF--;
        }
        return sb.toString();
    }
}
