package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzae extends zzi<String> {
    final CharSequence zza;
    private final zzj zzb;
    private int zze;
    private int zzd = 0;
    private final boolean zzc = false;

    public zzae(zzab zzabVar, CharSequence charSequence) {
        this.zzb = zzabVar.zza;
        this.zze = zzabVar.zzd;
        this.zza = charSequence;
    }

    public abstract int zza(int i9);

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzi
    public final /* synthetic */ String zza() {
        int i9 = this.zzd;
        while (true) {
            int i10 = this.zzd;
            if (i10 == -1) {
                zzb();
                return null;
            }
            int iZzb = zzb(i10);
            if (iZzb == -1) {
                iZzb = this.zza.length();
                this.zzd = -1;
            } else {
                this.zzd = zza(iZzb);
            }
            int i11 = this.zzd;
            if (i11 != i9) {
                while (i9 < iZzb && this.zzb.zza(this.zza.charAt(i9))) {
                    i9++;
                }
                while (iZzb > i9 && this.zzb.zza(this.zza.charAt(iZzb - 1))) {
                    iZzb--;
                }
                int i12 = this.zze;
                if (i12 == 1) {
                    iZzb = this.zza.length();
                    this.zzd = -1;
                    while (iZzb > i9 && this.zzb.zza(this.zza.charAt(iZzb - 1))) {
                        iZzb--;
                    }
                } else {
                    this.zze = i12 - 1;
                }
                return this.zza.subSequence(i9, iZzb).toString();
            }
            int i13 = i11 + 1;
            this.zzd = i13;
            if (i13 > this.zza.length()) {
                this.zzd = -1;
            }
        }
    }

    public abstract int zzb(int i9);
}
