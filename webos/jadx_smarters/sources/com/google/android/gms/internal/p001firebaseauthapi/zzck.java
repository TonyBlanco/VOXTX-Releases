package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class zzck implements Comparable<zzck> {
    private final byte[] zza;

    private zzck(byte[] bArr) {
        this.zza = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzck zzckVar) {
        zzck zzckVar2 = zzckVar;
        byte[] bArr = this.zza;
        int length = bArr.length;
        byte[] bArr2 = zzckVar2.zza;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        int i9 = 0;
        while (true) {
            byte[] bArr3 = this.zza;
            if (i9 >= bArr3.length) {
                return 0;
            }
            byte b9 = bArr3[i9];
            byte b10 = zzckVar2.zza[i9];
            if (b9 != b10) {
                return b9 - b10;
            }
            i9++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzck) {
            return Arrays.equals(this.zza, ((zzck) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return zzxj.zza(this.zza);
    }
}
