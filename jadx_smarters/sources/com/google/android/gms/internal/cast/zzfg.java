package com.google.android.gms.internal.cast;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzfg extends zzfh {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzfh zzc;

    public zzfg(zzfh zzfhVar, int i9, int i10) {
        this.zzc = zzfhVar;
        this.zza = i9;
        this.zzb = i10;
    }

    @Override // java.util.List
    public final Object get(int i9) {
        zzeu.zza(i9, this.zzb, "index");
        return this.zzc.get(i9 + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.cast.zzfh, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i9, int i10) {
        return subList(i9, i10);
    }

    @Override // com.google.android.gms.internal.cast.zzfd
    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.android.gms.internal.cast.zzfd
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.cast.zzfd
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.cast.zzfd
    public final Object[] zzg() {
        return this.zzc.zzg();
    }

    @Override // com.google.android.gms.internal.cast.zzfh
    /* JADX INFO: renamed from: zzh */
    public final zzfh subList(int i9, int i10) {
        zzeu.zzd(i9, i10, this.zzb);
        zzfh zzfhVar = this.zzc;
        int i11 = this.zza;
        return zzfhVar.subList(i9 + i11, i10 + i11);
    }
}
