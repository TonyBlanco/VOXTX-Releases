package com.google.android.gms.internal.p001firebaseauthapi;

import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;

/* JADX INFO: loaded from: classes3.dex */
final class zzzc implements zzadk<zzagh> {
    private final /* synthetic */ zzacd zza;
    private final /* synthetic */ zzadl zzb;
    private final /* synthetic */ zzyj zzc;

    public zzzc(zzyj zzyjVar, zzacd zzacdVar, zzadl zzadlVar) {
        this.zzc = zzyjVar;
        this.zza = zzacdVar;
        this.zzb = zzadlVar;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadk
    public final /* synthetic */ void zza(zzagh zzaghVar) {
        zzagh zzaghVar2 = zzaghVar;
        this.zzc.zza(new zzafn(zzaghVar2.zzc(), zzaghVar2.zzb(), Long.valueOf(zzaghVar2.zza()), "Bearer"), null, CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, Boolean.FALSE, null, this.zza, this);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzadl
    public final void zza(String str) {
        this.zzb.zza(str);
    }
}
