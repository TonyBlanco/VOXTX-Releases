package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzxt {
    private final byte[] zza;

    private zzxt(byte[] bArr, int i9, int i10) {
        byte[] bArr2 = new byte[i10];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i10);
    }

    public static zzxt zza(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("data must be non-null");
        }
        int length = bArr.length;
        if (length > bArr.length) {
            length = bArr.length;
        }
        return new zzxt(bArr, 0, length);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzxt) {
            return Arrays.equals(((zzxt) obj).zza, this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        return "Bytes(" + zzxj.zza(this.zza) + ")";
    }

    public final int zza() {
        return this.zza.length;
    }

    public final byte[] zzb() {
        byte[] bArr = this.zza;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }
}
