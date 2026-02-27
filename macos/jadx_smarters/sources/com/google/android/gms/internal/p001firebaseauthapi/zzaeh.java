package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes3.dex */
final class zzaeh extends zzafu {
    private final String zza;
    private final String zzb;

    public zzaeh(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzafu) {
            zzafu zzafuVar = (zzafu) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzafuVar.zzb()) : zzafuVar.zzb() == null) {
                String str2 = this.zzb;
                String strZza = zzafuVar.zza();
                if (str2 != null ? str2.equals(strZza) : strZza == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.zzb;
        return iHashCode ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "RecaptchaEnforcementState{provider=" + this.zza + ", enforcementState=" + this.zzb + "}";
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzafu
    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzafu
    public final String zzb() {
        return this.zza;
    }
}
