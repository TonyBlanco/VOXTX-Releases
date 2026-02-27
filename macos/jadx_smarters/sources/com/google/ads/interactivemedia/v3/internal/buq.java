package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class buq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f22582a = 0;

    public final int a() {
        return this.f22582a;
    }

    public final buq b(Object obj, Object obj2) {
        c(obj, obj2);
        return this;
    }

    public final void c(Object obj, Object obj2) {
        if (this.f22582a == 0 && obj != obj2) {
            if (obj == null) {
                this.f22582a = -1;
                return;
            }
            if (obj2 == null) {
                this.f22582a = 1;
                return;
            }
            if (!obj.getClass().isArray()) {
                this.f22582a = ((Comparable) obj).compareTo(obj2);
                return;
            }
            int i9 = 0;
            if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                if (this.f22582a == 0 && jArr != jArr2) {
                    int length = jArr.length;
                    int length2 = jArr2.length;
                    if (length != length2) {
                        this.f22582a = length >= length2 ? 1 : -1;
                        return;
                    }
                    while (i9 < jArr.length && this.f22582a == 0) {
                        this.f22582a = (jArr[i9] > jArr2[i9] ? 1 : (jArr[i9] == jArr2[i9] ? 0 : -1));
                        i9++;
                    }
                    return;
                }
                return;
            }
            if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                int[] iArr2 = (int[]) obj2;
                if (this.f22582a != 0 || iArr == iArr2) {
                    return;
                }
                int length3 = iArr.length;
                int length4 = iArr2.length;
                if (length3 != length4) {
                    this.f22582a = length3 >= length4 ? 1 : -1;
                    return;
                }
                for (int i10 = 0; i10 < iArr.length && this.f22582a == 0; i10++) {
                    int i11 = iArr[i10];
                    int i12 = iArr2[i10];
                    this.f22582a = i11 == i12 ? 0 : i11 < i12 ? -1 : 1;
                }
                return;
            }
            if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                short[] sArr2 = (short[]) obj2;
                if (this.f22582a != 0 || sArr == sArr2) {
                    return;
                }
                int length5 = sArr.length;
                int length6 = sArr2.length;
                if (length5 != length6) {
                    this.f22582a = length5 >= length6 ? 1 : -1;
                    return;
                }
                while (i9 < sArr.length && this.f22582a == 0) {
                    this.f22582a = sArr[i9] - sArr2[i9];
                    i9++;
                }
                return;
            }
            if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                char[] cArr2 = (char[]) obj2;
                if (this.f22582a != 0 || cArr == cArr2) {
                    return;
                }
                int length7 = cArr.length;
                int length8 = cArr2.length;
                if (length7 != length8) {
                    this.f22582a = length7 >= length8 ? 1 : -1;
                    return;
                }
                while (i9 < cArr.length && this.f22582a == 0) {
                    this.f22582a = cArr[i9] - cArr2[i9];
                    i9++;
                }
                return;
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (this.f22582a != 0 || bArr == bArr2) {
                    return;
                }
                int length9 = bArr.length;
                int length10 = bArr2.length;
                if (length9 != length10) {
                    this.f22582a = length9 >= length10 ? 1 : -1;
                    return;
                }
                while (i9 < bArr.length && this.f22582a == 0) {
                    this.f22582a = bArr[i9] - bArr2[i9];
                    i9++;
                }
                return;
            }
            if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                if (this.f22582a != 0 || dArr == dArr2) {
                    return;
                }
                int length11 = dArr.length;
                int length12 = dArr2.length;
                if (length11 != length12) {
                    this.f22582a = length11 >= length12 ? 1 : -1;
                    return;
                }
                while (i9 < dArr.length && this.f22582a == 0) {
                    this.f22582a = Double.compare(dArr[i9], dArr2[i9]);
                    i9++;
                }
                return;
            }
            if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                float[] fArr2 = (float[]) obj2;
                if (this.f22582a != 0 || fArr == fArr2) {
                    return;
                }
                int length13 = fArr.length;
                int length14 = fArr2.length;
                if (length13 != length14) {
                    this.f22582a = length13 >= length14 ? 1 : -1;
                    return;
                }
                while (i9 < fArr.length && this.f22582a == 0) {
                    this.f22582a = Float.compare(fArr[i9], fArr2[i9]);
                    i9++;
                }
                return;
            }
            if (!(obj instanceof boolean[])) {
                Object[] objArr = (Object[]) obj;
                Object[] objArr2 = (Object[]) obj2;
                if (this.f22582a != 0 || objArr == objArr2) {
                    return;
                }
                int length15 = objArr.length;
                int length16 = objArr2.length;
                if (length15 != length16) {
                    this.f22582a = length15 >= length16 ? 1 : -1;
                    return;
                }
                while (i9 < objArr.length && this.f22582a == 0) {
                    c(objArr[i9], objArr2[i9]);
                    i9++;
                }
                return;
            }
            boolean[] zArr = (boolean[]) obj;
            boolean[] zArr2 = (boolean[]) obj2;
            if (this.f22582a != 0 || zArr == zArr2) {
                return;
            }
            int length17 = zArr.length;
            int length18 = zArr2.length;
            if (length17 != length18) {
                this.f22582a = length17 >= length18 ? 1 : -1;
                return;
            }
            while (i9 < zArr.length && this.f22582a == 0) {
                boolean z9 = zArr[i9];
                if (z9 != zArr2[i9]) {
                    if (z9) {
                        this.f22582a = 1;
                    } else {
                        this.f22582a = -1;
                    }
                }
                i9++;
            }
        }
    }
}
