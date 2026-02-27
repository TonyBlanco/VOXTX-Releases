package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzakn;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzne<KeyFormatProtoT extends zzakn, KeyProtoT extends zzakn> {
    private final Class<KeyFormatProtoT> zza;

    public zzne(Class<KeyFormatProtoT> cls) {
        this.zza = cls;
    }

    public abstract KeyFormatProtoT zza(zzahp zzahpVar) throws zzaji;

    public abstract KeyProtoT zza(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

    public abstract void zzb(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;
}
