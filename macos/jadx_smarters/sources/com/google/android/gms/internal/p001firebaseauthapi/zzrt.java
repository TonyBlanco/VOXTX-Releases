package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
public final class zzrt {
    private ArrayList<zzrs> zza = new ArrayList<>();
    private zzrn zzb = zzrn.zza;
    private Integer zzc = null;

    public final zzrq zza() throws GeneralSecurityException {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        Integer num = this.zzc;
        if (num != null) {
            int iIntValue = num.intValue();
            ArrayList<zzrs> arrayList = this.zza;
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                zzrs zzrsVar = arrayList.get(i9);
                i9++;
                if (zzrsVar.zza() == iIntValue) {
                }
            }
            throw new GeneralSecurityException("primary key ID is not present in entries");
        }
        zzrq zzrqVar = new zzrq(this.zzb, Collections.unmodifiableList(this.zza), this.zzc);
        this.zza = null;
        return zzrqVar;
    }

    public final zzrt zza(int i9) {
        if (this.zza == null) {
            throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        }
        this.zzc = Integer.valueOf(i9);
        return this;
    }

    public final zzrt zza(zzbv zzbvVar, int i9, String str, String str2) {
        ArrayList<zzrs> arrayList = this.zza;
        if (arrayList == null) {
            throw new IllegalStateException("addEntry cannot be called after build()");
        }
        arrayList.add(new zzrs(zzbvVar, i9, str, str2));
        return this;
    }

    public final zzrt zza(zzrn zzrnVar) {
        if (this.zza == null) {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
        this.zzb = zzrnVar;
        return this;
    }
}
