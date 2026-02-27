package com.google.android.gms.internal.firebase_messaging;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
final class zzp extends OutputStream {
    private long zza = 0;

    @Override // java.io.OutputStream
    public final void write(int i9) {
        this.zza++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.zza += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i9, int i10) {
        int length;
        int i11;
        if (i9 < 0 || i9 > (length = bArr.length) || i10 < 0 || (i11 = i9 + i10) > length || i11 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.zza += (long) i10;
    }

    public final long zza() {
        return this.zza;
    }
}
