package com.google.android.gms.internal.firebase_messaging;

import c6.c;
import c6.d;
import c6.h;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzy implements h {
    private boolean zza = false;
    private boolean zzb = false;
    private d zzc;
    private final zzu zzd;

    public zzy(zzu zzuVar) {
        this.zzd = zzuVar;
    }

    private final void zzb() {
        if (this.zza) {
            throw new c("Cannot encode a second value in the ValueEncoderContext");
        }
        this.zza = true;
    }

    public final h add(double d9) throws IOException {
        zzb();
        this.zzd.zza(this.zzc, d9, this.zzb);
        return this;
    }

    public final h add(float f9) throws IOException {
        zzb();
        this.zzd.zzb(this.zzc, f9, this.zzb);
        return this;
    }

    public final h add(int i9) throws IOException {
        zzb();
        this.zzd.zzd(this.zzc, i9, this.zzb);
        return this;
    }

    public final h add(long j9) throws IOException {
        zzb();
        this.zzd.zze(this.zzc, j9, this.zzb);
        return this;
    }

    @Override // c6.h
    public final h add(String str) throws IOException {
        zzb();
        this.zzd.zzc(this.zzc, str, this.zzb);
        return this;
    }

    @Override // c6.h
    public final h add(boolean z9) throws IOException {
        zzb();
        this.zzd.zzd(this.zzc, z9 ? 1 : 0, this.zzb);
        return this;
    }

    public final h add(byte[] bArr) throws IOException {
        zzb();
        this.zzd.zzc(this.zzc, bArr, this.zzb);
        return this;
    }

    public final void zza(d dVar, boolean z9) {
        this.zza = false;
        this.zzc = dVar;
        this.zzb = z9;
    }
}
