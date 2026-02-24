package D6;

/* JADX INFO: loaded from: classes.dex */
public final class f extends i {
    @Override // D6.i
    public b c(b bVar, int i9, int i10, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23, float f24) {
        return d(bVar, i9, i10, k.b(f9, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, f21, f22, f23, f24));
    }

    @Override // D6.i
    public b d(b bVar, int i9, int i10, k kVar) throws x6.k {
        if (i9 <= 0 || i10 <= 0) {
            throw x6.k.a();
        }
        b bVar2 = new b(i9, i10);
        int i11 = i9 * 2;
        float[] fArr = new float[i11];
        for (int i12 = 0; i12 < i10; i12++) {
            float f9 = i12 + 0.5f;
            for (int i13 = 0; i13 < i11; i13 += 2) {
                fArr[i13] = (i13 / 2) + 0.5f;
                fArr[i13 + 1] = f9;
            }
            kVar.f(fArr);
            i.a(bVar, fArr);
            for (int i14 = 0; i14 < i11; i14 += 2) {
                try {
                    if (bVar.f((int) fArr[i14], (int) fArr[i14 + 1])) {
                        bVar2.n(i14 / 2, i12);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw x6.k.a();
                }
            }
        }
        return bVar2;
    }
}
