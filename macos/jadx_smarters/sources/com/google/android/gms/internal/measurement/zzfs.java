package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfs extends zzkx implements zzmj {
    private zzfs() {
        super(zzft.zza);
    }

    public /* synthetic */ zzfs(zzfk zzfkVar) {
        super(zzft.zza);
    }

    public final int zza() {
        return ((zzft) this.zza).zzb();
    }

    public final long zzb() {
        return ((zzft) this.zza).zzc();
    }

    public final long zzc() {
        return ((zzft) this.zza).zzd();
    }

    public final zzfs zzd(Iterable iterable) {
        zzaH();
        zzft.zzm((zzft) this.zza, iterable);
        return this;
    }

    public final zzfs zze(zzfw zzfwVar) {
        zzaH();
        zzft.zzk((zzft) this.zza, (zzfx) zzfwVar.zzaD());
        return this;
    }

    public final zzfs zzf(zzfx zzfxVar) {
        zzaH();
        zzft.zzk((zzft) this.zza, zzfxVar);
        return this;
    }

    public final zzfs zzg() {
        zzaH();
        ((zzft) this.zza).zze = zzlb.zzbH();
        return this;
    }

    public final zzfs zzh(int i9) {
        zzaH();
        zzft.zzo((zzft) this.zza, i9);
        return this;
    }

    public final zzfs zzi(String str) {
        zzaH();
        zzft.zzp((zzft) this.zza, str);
        return this;
    }

    public final zzfs zzj(int i9, zzfw zzfwVar) {
        zzaH();
        zzft.zzj((zzft) this.zza, i9, (zzfx) zzfwVar.zzaD());
        return this;
    }

    public final zzfs zzk(int i9, zzfx zzfxVar) {
        zzaH();
        zzft.zzj((zzft) this.zza, i9, zzfxVar);
        return this;
    }

    public final zzfs zzl(long j9) {
        zzaH();
        zzft.zzr((zzft) this.zza, j9);
        return this;
    }

    public final zzfs zzm(long j9) {
        zzaH();
        zzft.zzq((zzft) this.zza, j9);
        return this;
    }

    public final zzfx zzn(int i9) {
        return ((zzft) this.zza).zzg(i9);
    }

    public final String zzo() {
        return ((zzft) this.zza).zzh();
    }

    public final List zzp() {
        return Collections.unmodifiableList(((zzft) this.zza).zzi());
    }

    public final boolean zzq() {
        return ((zzft) this.zza).zzu();
    }
}
