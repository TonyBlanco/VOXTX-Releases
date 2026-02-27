package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzakn;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
final class zzmr<KeyFormatProtoT extends zzakn, KeyProtoT extends zzakn> {
    private final zzne<KeyFormatProtoT, KeyProtoT> zza;

    public zzmr(zzne<KeyFormatProtoT, KeyProtoT> zzneVar) {
        this.zza = zzneVar;
    }

    public final KeyProtoT zza(zzahp zzahpVar) throws GeneralSecurityException, zzaji {
        zzakn zzaknVarZza = this.zza.zza(zzahpVar);
        this.zza.zzb(zzaknVarZza);
        return (KeyProtoT) this.zza.zza(zzaknVarZza);
    }
}
