package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzaq extends zzap {
    private final transient int zza;
    private final transient int zzb;
    private final /* synthetic */ zzap zzc;

    public zzaq(zzap zzapVar, int i9, int i10) {
        this.zzc = zzapVar;
        this.zza = i9;
        this.zzb = i10;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        zzy.zza(i9, this.zzb);
        return this.zzc.get(i9 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzap, java.util.List
    public final /* synthetic */ List subList(int i9, int i10) {
        return subList(i9, i10);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzak
    public final int zza() {
        return this.zzc.zzb() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzap
    /* JADX INFO: renamed from: zza */
    public final zzap subList(int i9, int i10) {
        zzy.zza(i9, i10, this.zzb);
        zzap zzapVar = this.zzc;
        int i11 = this.zza;
        return (zzap) zzapVar.subList(i9 + i11, i10 + i11);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzak
    public final int zzb() {
        return this.zzc.zzb() + this.zza;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzak
    public final boolean zze() {
        return true;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzak
    public final Object[] zzf() {
        return this.zzc.zzf();
    }
}
