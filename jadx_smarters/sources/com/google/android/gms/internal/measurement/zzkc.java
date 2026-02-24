package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes3.dex */
final class zzkc extends zzke {
    private final byte[] zzb;
    private int zzc;
    private int zzd;
    private int zze;

    public /* synthetic */ zzkc(byte[] bArr, int i9, int i10, boolean z9, zzkb zzkbVar) {
        super(null);
        this.zze = a.e.API_PRIORITY_OTHER;
        this.zzb = bArr;
        this.zzc = 0;
    }

    public final int zza(int i9) throws zzll {
        int i10 = this.zze;
        this.zze = 0;
        int i11 = this.zzc + this.zzd;
        this.zzc = i11;
        if (i11 > 0) {
            this.zzd = i11;
            this.zzc = 0;
        } else {
            this.zzd = 0;
        }
        return i10;
    }
}
