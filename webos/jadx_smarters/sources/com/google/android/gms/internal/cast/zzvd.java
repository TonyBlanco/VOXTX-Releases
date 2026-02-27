package com.google.android.gms.internal.cast;

/* JADX INFO: loaded from: classes3.dex */
final class zzvd extends zzvc {
    @Override // com.google.android.gms.internal.cast.zzvc
    public final int zza(int i9, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11 && bArr[i12] >= 0) {
            i12++;
        }
        if (i12 >= i11) {
            return 0;
        }
        while (i12 < i11) {
            int i13 = i12 + 1;
            byte b9 = bArr[i12];
            if (b9 < 0) {
                if (b9 < -32) {
                    if (i13 >= i11) {
                        return b9;
                    }
                    if (b9 >= -62) {
                        i12 += 2;
                        if (bArr[i13] > -65) {
                        }
                    }
                    return -1;
                }
                if (b9 >= -16) {
                    if (i13 >= i11 - 2) {
                        return zzvf.zza(bArr, i13, i11);
                    }
                    int i14 = i12 + 2;
                    byte b10 = bArr[i13];
                    if (b10 <= -65 && (((b9 << 28) + (b10 + 112)) >> 30) == 0) {
                        int i15 = i12 + 3;
                        if (bArr[i14] <= -65) {
                            i12 += 4;
                            if (bArr[i15] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i13 >= i11 - 1) {
                    return zzvf.zza(bArr, i13, i11);
                }
                int i16 = i12 + 2;
                byte b11 = bArr[i13];
                if (b11 <= -65 && ((b9 != -32 || b11 >= -96) && (b9 != -19 || b11 < -96))) {
                    i12 += 3;
                    if (bArr[i16] > -65) {
                    }
                }
                return -1;
            }
            i12 = i13;
        }
        return 0;
    }
}
